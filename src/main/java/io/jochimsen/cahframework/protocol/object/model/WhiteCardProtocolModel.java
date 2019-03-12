package io.jochimsen.cahframework.protocol.object.model;

import io.jochimsen.cahframework.protocol.ProtocolObject;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.io.Serializable;

@Value
@EqualsAndHashCode(callSuper = false)
public class WhiteCardProtocolModel extends ProtocolObject {
    private final long whiteCardsId;
}
