package p000;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import p000.InterfaceC32001Br1;
/* renamed from: vJ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50346vJ0 {

    /* renamed from: vJ0$a */
    /* loaded from: classes3.dex */
    public static final class C29477a implements InterfaceC32001Br1.InterfaceC0753a {
        @Override // p000.InterfaceC32001Br1.InterfaceC0753a
        /* renamed from: a */
        public InterfaceC32001Br1 mo8915a(InterfaceC44393lG2 interfaceC44393lG2, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            return new C29478b(interfaceC44393lG2, fragmentManager, abstractC11719f);
        }

        private C29477a() {
        }
    }

    /* renamed from: vJ0$b */
    /* loaded from: classes3.dex */
    public static final class C29478b implements InterfaceC32001Br1 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f113820a;

        /* renamed from: b */
        public final FragmentManager f113821b;

        /* renamed from: c */
        public final AbstractC11719f f113822c;

        /* renamed from: d */
        public final C29478b f113823d;

        @Override // p000.InterfaceC32001Br1
        /* renamed from: a */
        public void mo8914a(C53042zr1 c53042zr1) {
            m8911d(c53042zr1);
        }

        /* renamed from: b */
        public final C31767Ar1 m8913b() {
            return new C31767Ar1(this.f113821b, this.f113822c);
        }

        /* renamed from: c */
        public final C33171Gr1 m8912c() {
            return new C33171Gr1((InterfaceC48872sp1) C51679xZ3.m5003d(this.f113820a.mo27575J1()));
        }

        /* renamed from: d */
        public final C53042zr1 m8911d(C53042zr1 c53042zr1) {
            C32235Cr1.m111409c(c53042zr1, m8912c());
            C32235Cr1.m111411a(c53042zr1, m8913b());
            return c53042zr1;
        }

        public C29478b(InterfaceC44393lG2 interfaceC44393lG2, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            this.f113823d = this;
            this.f113820a = interfaceC44393lG2;
            this.f113821b = fragmentManager;
            this.f113822c = abstractC11719f;
        }
    }

    private C50346vJ0() {
    }

    /* renamed from: a */
    public static InterfaceC32001Br1.InterfaceC0753a m8916a() {
        return new C29477a();
    }
}
