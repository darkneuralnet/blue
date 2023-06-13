package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
/* loaded from: classes6.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: b */
    public final EnumC18342a f74266b;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    /* loaded from: classes6.dex */
    public enum EnumC18342a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC18342a enumC18342a) {
        this.f74266b = enumC18342a;
    }

    public FirebaseInstallationsException(String str, EnumC18342a enumC18342a) {
        super(str);
        this.f74266b = enumC18342a;
    }
}
