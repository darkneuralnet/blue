package com.android.volley;

import android.content.Intent;
/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: d */
    public Intent f68611d;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f68611d != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public AuthFailureError(O73 o73) {
        super(o73);
    }
}
