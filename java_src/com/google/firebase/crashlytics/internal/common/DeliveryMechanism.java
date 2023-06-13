package com.google.firebase.crashlytics.internal.common;
/* loaded from: classes6.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f74244id;

    DeliveryMechanism(int i) {
        this.f74244id = i;
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f74244id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f74244id);
    }
}
