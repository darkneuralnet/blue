package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;
/* loaded from: classes6.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: b */
    public final EnumC18375a f74407b;

    /* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a */
    /* loaded from: classes6.dex */
    public enum EnumC18375a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        

        /* renamed from: b */
        public final int f74414b;

        EnumC18375a(int i) {
            this.f74414b = i;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f74407b = EnumC18375a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f74407b = EnumC18375a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, EnumC18375a enumC18375a) {
        super(str);
        this.f74407b = enumC18375a;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, EnumC18375a enumC18375a) {
        super(str, th);
        this.f74407b = enumC18375a;
    }
}
