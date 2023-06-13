package p000;

import androidx.camera.core.C11164h;
import p000.C37060Xh2;
/* renamed from: Jt */
/* loaded from: classes.dex */
public final class C4273Jt extends C37060Xh2.AbstractC9447a {

    /* renamed from: a */
    public final MD3<byte[]> f18397a;

    /* renamed from: b */
    public final C11164h.C11180n f18398b;

    public C4273Jt(MD3<byte[]> md3, C11164h.C11180n c11180n) {
        if (md3 != null) {
            this.f18397a = md3;
            if (c11180n != null) {
                this.f18398b = c11180n;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }

    @Override // p000.C37060Xh2.AbstractC9447a
    /* renamed from: a */
    public C11164h.C11180n mo76588a() {
        return this.f18398b;
    }

    @Override // p000.C37060Xh2.AbstractC9447a
    /* renamed from: b */
    public MD3<byte[]> mo76587b() {
        return this.f18397a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C37060Xh2.AbstractC9447a)) {
            return false;
        }
        C37060Xh2.AbstractC9447a abstractC9447a = (C37060Xh2.AbstractC9447a) obj;
        if (this.f18397a.equals(abstractC9447a.mo76587b()) && this.f18398b.equals(abstractC9447a.mo76588a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18397a.hashCode() ^ 1000003) * 1000003) ^ this.f18398b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f18397a + ", outputFileOptions=" + this.f18398b + "}";
    }
}
