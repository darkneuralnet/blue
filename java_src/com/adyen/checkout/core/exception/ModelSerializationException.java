package com.adyen.checkout.core.exception;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import org.json.JSONException;
/* loaded from: classes.dex */
public class ModelSerializationException extends CheckoutException {
    private static final long serialVersionUID = -241916181048458214L;

    public ModelSerializationException(Class cls, JSONException jSONException) {
        super("Unexpected exception while serializing " + cls.getSimpleName() + InstructionFileId.DOT, jSONException);
    }
}
