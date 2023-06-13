package com.fasterxml.jackson.core.util;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.IOException;
import java.io.Serializable;
/* loaded from: classes5.dex */
public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    public RequestPayload(byte[] bArr, String str) {
        if (bArr != null) {
            this._payloadAsBytes = bArr;
            this._charset = (str == null || str.isEmpty()) ? Constants.DEFAULT_ENCODING : str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public Object getRawPayload() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr != null) {
            return bArr;
        }
        return this._payloadAsText;
    }

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr != null) {
            try {
                return new String(bArr, this._charset);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this._payloadAsText.toString();
    }

    public RequestPayload(CharSequence charSequence) {
        if (charSequence != null) {
            this._payloadAsText = charSequence;
            return;
        }
        throw new IllegalArgumentException();
    }
}
