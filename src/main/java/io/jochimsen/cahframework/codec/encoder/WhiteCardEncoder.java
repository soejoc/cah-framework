package io.jochimsen.cahframework.codec.encoder;

import io.jochimsen.cahframework.protocol.object.model.WhiteCardModel;
import io.jochimsen.cahframework.util.ProtocolOutputStream;

import java.io.IOException;

public class WhiteCardEncoder extends EncoderBase<WhiteCardModel> {
    public WhiteCardEncoder(final WhiteCardModel protocolObject) {
        super(protocolObject);
    }

    @Override
    protected void serialize(final ProtocolOutputStream stream) throws IOException {
        stream.write(protocolObject.whiteCardId);
    }
}
