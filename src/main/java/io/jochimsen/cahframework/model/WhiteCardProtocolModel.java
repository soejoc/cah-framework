package io.jochimsen.cahframework.model;

import io.jochimsen.collo.protocol.ProtocolObject;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class WhiteCardProtocolModel extends ProtocolObject {
    private final long whiteCardsId;
}
