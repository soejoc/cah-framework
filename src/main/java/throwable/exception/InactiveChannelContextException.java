package throwable.exception;

public class InactiveChannelContextException extends RuntimeException {
    public InactiveChannelContextException() {
        super("The channel is inactive");
    }
}
