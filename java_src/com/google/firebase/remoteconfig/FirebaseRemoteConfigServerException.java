package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
/* loaded from: classes6.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: c */
    public final int f74416c;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f74416c = i;
    }

    /* renamed from: a */
    public int m47025a() {
        return this.f74416c;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th) {
        super(str, th);
        this.f74416c = i;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.EnumC18375a enumC18375a) {
        super(str, enumC18375a);
        this.f74416c = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigException.EnumC18375a enumC18375a) {
        super(str, enumC18375a);
        this.f74416c = i;
    }
}
