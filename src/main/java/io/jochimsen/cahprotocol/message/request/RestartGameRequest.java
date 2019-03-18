package io.jochimsen.cahprotocol.message.request;

import io.jochimsen.cahprotocol.message.MessageCode;
import io.jochimsen.collo.protocol.RequestMessage;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@EqualsAndHashCode(callSuper = false)
public class RestartGameRequest extends RequestMessage {
    private final UUID sessionKey;

    @Override
    public int getMessageId() {
        return MessageCode.RESTART_GAME_RQ;
    }
}
