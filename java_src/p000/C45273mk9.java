package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: mk9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45273mk9 {

    /* renamed from: a */
    public final Object f98662a;

    /* renamed from: b */
    public final int f98663b;

    public C45273mk9(Object obj, int i) {
        this.f98662a = obj;
        this.f98663b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C45273mk9)) {
            return false;
        }
        C45273mk9 c45273mk9 = (C45273mk9) obj;
        if (this.f98662a != c45273mk9.f98662a || this.f98663b != c45273mk9.f98663b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f98662a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f98663b;
    }
}
