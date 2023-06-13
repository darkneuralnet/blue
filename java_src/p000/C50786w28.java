package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: w28  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50786w28 {

    /* renamed from: a */
    public final Object f115197a;

    /* renamed from: b */
    public final int f115198b;

    public C50786w28(Object obj, int i) {
        this.f115197a = obj;
        this.f115198b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C50786w28)) {
            return false;
        }
        C50786w28 c50786w28 = (C50786w28) obj;
        if (this.f115197a != c50786w28.f115197a || this.f115198b != c50786w28.f115198b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f115197a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f115198b;
    }
}
