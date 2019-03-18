package io.jochimsen.cahframework.message.response;

import io.jochimsen.cahframework.message.MessageCode;
import io.jochimsen.collo.protocol.ResponseMessage;

public class WaitForGameResponse extends ResponseMessage {

    @Override
    public int getMessageId() {
        return MessageCode.WAIT_FOR_GAME_RS;
    }
}
