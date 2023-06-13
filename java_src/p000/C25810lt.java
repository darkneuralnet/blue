package p000;

import android.graphics.Bitmap;
import p000.C4448KT;
/* renamed from: lt */
/* loaded from: classes.dex */
public final class C25810lt extends C4448KT.AbstractC4449a {

    /* renamed from: a */
    public final MD3<Bitmap> f96855a;

    /* renamed from: b */
    public final int f96856b;

    public C25810lt(MD3<Bitmap> md3, int i) {
        if (md3 != null) {
            this.f96855a = md3;
            this.f96856b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // p000.C4448KT.AbstractC4449a
    /* renamed from: a */
    public int mo26706a() {
        return this.f96856b;
    }

    @Override // p000.C4448KT.AbstractC4449a
    /* renamed from: b */
    public MD3<Bitmap> mo26705b() {
        return this.f96855a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4448KT.AbstractC4449a)) {
            return false;
        }
        C4448KT.AbstractC4449a abstractC4449a = (C4448KT.AbstractC4449a) obj;
        if (this.f96855a.equals(abstractC4449a.mo26705b()) && this.f96856b == abstractC4449a.mo26706a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f96855a.hashCode() ^ 1000003) * 1000003) ^ this.f96856b;
    }

    public String toString() {
        return "In{packet=" + this.f96855a + ", jpegQuality=" + this.f96856b + "}";
    }
}
