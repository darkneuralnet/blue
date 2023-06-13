package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: F89 */
/* loaded from: classes5.dex */
public final class F89 {

    /* renamed from: a */
    public final Object f8841a;

    /* renamed from: b */
    public final int f8842b;

    public F89(Object obj, int i) {
        this.f8841a = obj;
        this.f8842b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F89)) {
            return false;
        }
        F89 f89 = (F89) obj;
        if (this.f8841a != f89.f8841a || this.f8842b != f89.f8842b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8841a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f8842b;
    }
}
