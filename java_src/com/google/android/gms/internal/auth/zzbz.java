package com.google.android.gms.internal.auth;

import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;
/* loaded from: classes5.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            Log.e("AUTH", "Error serializing object.", e);
            return null;
        }
    }
}
