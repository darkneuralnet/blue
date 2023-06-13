package p000;

import okhttp3.internal.http2.Settings;
/* renamed from: IQ8 */
/* loaded from: classes5.dex */
public final class IQ8 {

    /* renamed from: a */
    public final Object f15471a;

    /* renamed from: b */
    public final int f15472b;

    public IQ8(Object obj, int i) {
        this.f15471a = obj;
        this.f15472b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IQ8)) {
            return false;
        }
        IQ8 iq8 = (IQ8) obj;
        if (this.f15471a != iq8.f15471a || this.f15472b != iq8.f15472b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15471a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f15472b;
    }
}
