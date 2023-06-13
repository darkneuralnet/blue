package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzbm {
    public static ApiException zza(VolleyError volleyError) {
        int i;
        String valueOf;
        if (volleyError instanceof NetworkError) {
            i = 7;
        } else if (volleyError instanceof TimeoutError) {
            i = 15;
        } else if (!(volleyError instanceof ServerError) && !(volleyError instanceof ParseError)) {
            if (volleyError instanceof AuthFailureError) {
                i = PlacesStatusCodes.REQUEST_DENIED;
            } else {
                i = 13;
            }
        } else {
            i = 8;
        }
        O73 o73 = volleyError.f68612b;
        if (o73 == null) {
            valueOf = "N/A";
        } else {
            valueOf = String.valueOf(o73.f25918a);
        }
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", valueOf, volleyError)));
    }
}
