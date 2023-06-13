package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: Na7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34662Na7 {

    /* renamed from: a */
    public final Object f24824a;

    /* renamed from: b */
    public final int f24825b;

    public C34662Na7(Object obj, int i) {
        this.f24824a = obj;
        this.f24825b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34662Na7)) {
            return false;
        }
        C34662Na7 c34662Na7 = (C34662Na7) obj;
        if (this.f24824a != c34662Na7.f24824a || this.f24825b != c34662Na7.f24825b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f24824a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f24825b;
    }
}
