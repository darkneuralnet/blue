package p000;

import java.io.IOException;
/* renamed from: fu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41221fu8 extends C32179Ck8<C41221fu8> implements Cloneable {

    /* renamed from: f */
    public static volatile C41221fu8[] f81049f;

    /* renamed from: d */
    public String f81050d = "";

    /* renamed from: e */
    public String f81051e = "";

    public C41221fu8() {
        this.f4623c = null;
        this.f30878b = -1;
    }

    /* renamed from: k */
    public static C41221fu8[] m40564k() {
        if (f81049f == null) {
            synchronized (C32422Dl8.f6297c) {
                if (f81049f == null) {
                    f81049f = new C41221fu8[0];
                }
            }
        }
        return f81049f;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: d */
    public final void mo40568d(C39325ck8 c39325ck8) throws IOException {
        String str = this.f81050d;
        if (str != null && !str.equals("")) {
            c39325ck8.m60967b(1, this.f81050d);
        }
        String str2 = this.f81051e;
        if (str2 != null && !str2.equals("")) {
            c39325ck8.m60967b(2, this.f81051e);
        }
        super.mo40568d(c39325ck8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41221fu8) {
            C41221fu8 c41221fu8 = (C41221fu8) obj;
            String str = this.f81050d;
            if (str == null) {
                if (c41221fu8.f81050d != null) {
                    return false;
                }
            } else if (!str.equals(c41221fu8.f81050d)) {
                return false;
            }
            String str2 = this.f81051e;
            if (str2 == null) {
                if (c41221fu8.f81051e != null) {
                    return false;
                }
            } else if (!str2.equals(c41221fu8.f81051e)) {
                return false;
            }
            C39335cl8 c39335cl8 = this.f4623c;
            if (c39335cl8 == null || c39335cl8.m60897d()) {
                C39335cl8 c39335cl82 = c41221fu8.f4623c;
                return c39335cl82 == null || c39335cl82.m60897d();
            }
            return this.f4623c.equals(c41221fu8.f4623c);
        }
        return false;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: g */
    public final int mo40567g() {
        int mo40567g = super.mo40567g();
        String str = this.f81050d;
        if (str != null && !str.equals("")) {
            mo40567g += C39325ck8.m60962g(1, this.f81050d);
        }
        String str2 = this.f81051e;
        return (str2 == null || str2.equals("")) ? mo40567g : mo40567g + C39325ck8.m60962g(2, this.f81051e);
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: h */
    public final /* synthetic */ C35464Ql8 mo40566h() throws CloneNotSupportedException {
        return (C41221fu8) clone();
    }

    public final int hashCode() {
        int hashCode = (C41221fu8.class.getName().hashCode() + 527) * 31;
        String str = this.f81050d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81051e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C39335cl8 c39335cl8 = this.f4623c;
        if (c39335cl8 != null && !c39335cl8.m60897d()) {
            i = this.f4623c.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // p000.C32179Ck8
    /* renamed from: j */
    public final /* synthetic */ C41221fu8 mo40565j() throws CloneNotSupportedException {
        return (C41221fu8) clone();
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: l */
    public final C41221fu8 clone() {
        try {
            return (C41221fu8) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
