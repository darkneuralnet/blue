package p000;

import p000.K96;
/* renamed from: K96 */
/* loaded from: classes5.dex */
public abstract class K96<CHILD extends K96<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    public I96<? super TranscodeType> f19200b = C83.m112744c();

    /* renamed from: d */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public final I96<? super TranscodeType> m99116e() {
        return this.f19200b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof K96) {
            return C47029pi6.m18922d(this.f19200b, ((K96) obj).f19200b);
        }
        return false;
    }

    /* renamed from: f */
    public final CHILD m99115f() {
        return this;
    }

    /* renamed from: g */
    public final CHILD m99114g(I96<? super TranscodeType> i96) {
        this.f19200b = (I96) C52865zZ3.m1111d(i96);
        return m99115f();
    }

    public int hashCode() {
        I96<? super TranscodeType> i96 = this.f19200b;
        if (i96 != null) {
            return i96.hashCode();
        }
        return 0;
    }
}
