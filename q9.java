public class Greeting implements AggregateBehavior<GreetingCommand, GreetingState> {
	@Override
	public GreetingState initialState(final String id) {
		return GreetingState.identifiedBy(id);
	}

	@Override
	public CommandHandlers<GreetingCommand, GreetingState> commandHandlers() {
		return CommandHandlers.handle(
			commandsOf(CreateGreeting.class).with((cmd, state) -> new GreetingCreated(state.id, "Hello,", cmd.personName)),
			commandsOf(ChangeSalutation.class).with((cmd, state) -> new SalutationChanged(state.id, cmd.salutation)));
	}

	@Override
	public EventHandlers<GreetingState> eventHandlers() {
		return EventHandlers.handle(
			eventsOf(GreetingCreated.class)
				.with((event, state) -> new GreetingState(event.id, event.salutation, event.personName)),
			eventsOf(SalutationChanged.class)
				.with((event, state) -> new GreetingState(event.id, event.salutation, state.personName)));
	}
}
public final class GreetingState {
    public final String id;
    public final String salutation;
    public final String personName;

    public static GreetingState identifiedBy(final String id) {
        return new GreetingState(id, "", "");
    }

    public GreetingState(final String id, final String salutation, final String personName) {
        this.id = id;
        this.salutation = salutation;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "GreetingState [id=" + id + ", salutation=" + salutation + ", personName=" + personName + "]";
    }
    
    // hashCode() and equals() omitted for brevity
}
public class CreateGreeting implements GreetingCommand{
    public final String personName;

    public CreateGreeting(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "CreateGreeting [personName=" + personName + "]";
    }
}
public final class GreetingCreated extends IdentifiedDomainEvent {
    public final String id;
    public final String salutation;
    public final String personName;

    public GreetingCreated(final String id, final String salutation, String personName) {
        super(SemanticVersion.from("1.0.0").toValue());
        this.id = id;
        this.salutation = salutation;
        this.personName = personName;
    }

    @Override
    public String identity() {
        return id;
    }

    @Override
    public String toString() {
        return "GreetingCreated [id=" + id + ", salutation=" + salutation + ", personName=" + personName + "]";
    }
}