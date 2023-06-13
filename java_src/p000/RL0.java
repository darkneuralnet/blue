package p000;

import android.content.Intent;
import p000.InterfaceC36709Vu2;
/* renamed from: RL0 */
/* loaded from: classes3.dex */
public final class RL0 {

    /* renamed from: RL0$a */
    /* loaded from: classes3.dex */
    public static final class C7151a implements InterfaceC36709Vu2.InterfaceC8812a {
        @Override // p000.InterfaceC36709Vu2.InterfaceC8812a
        /* renamed from: a */
        public InterfaceC36709Vu2 mo79243a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C7152b(interfaceC44393lG2);
        }

        private C7151a() {
        }
    }

    /* renamed from: RL0$b */
    /* loaded from: classes3.dex */
    public static final class C7152b implements InterfaceC36709Vu2 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f31911a;

        /* renamed from: b */
        public final C7152b f31912b;

        @Override // p000.InterfaceC36709Vu2
        /* renamed from: a */
        public void mo79244a(C36241Tu2 c36241Tu2) {
            m86840b(c36241Tu2);
        }

        /* renamed from: b */
        public final C36241Tu2 m86840b(C36241Tu2 c36241Tu2) {
            C36475Uu2.m80644a(c36241Tu2, (Intent) C51679xZ3.m5003d(this.f31911a.mo27477r1()));
            C36475Uu2.m80642c(c36241Tu2, m86839c());
            return c36241Tu2;
        }

        /* renamed from: c */
        public final C38836bv2 m86839c() {
            return new C38836bv2((C22454gl) C51679xZ3.m5003d(this.f31911a.mo27479r()));
        }

        public C7152b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f31912b = this;
            this.f31911a = interfaceC44393lG2;
        }
    }

    private RL0() {
    }

    /* renamed from: a */
    public static InterfaceC36709Vu2.InterfaceC8812a m86841a() {
        return new C7151a();
    }
}
