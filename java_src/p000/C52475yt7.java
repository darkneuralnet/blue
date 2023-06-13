package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: yt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52475yt7 {

    /* renamed from: a */
    public final Object f120374a;

    /* renamed from: b */
    public final int f120375b;

    public C52475yt7(Object obj, int i) {
        this.f120374a = obj;
        this.f120375b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C52475yt7)) {
            return false;
        }
        C52475yt7 c52475yt7 = (C52475yt7) obj;
        if (this.f120374a != c52475yt7.f120374a || this.f120375b != c52475yt7.f120375b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f120374a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f120375b;
    }
}
