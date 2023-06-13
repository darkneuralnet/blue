package co.bird.android.core.mrp;

import android.app.Activity;
import co.bird.android.core.mrp.BaseActivityLite;
/* renamed from: co.bird.android.core.mrp.a */
/* loaded from: classes2.dex */
public final class C14456a {

    /* renamed from: co.bird.android.core.mrp.a$a */
    /* loaded from: classes2.dex */
    public static final class C14457a implements BaseActivityLite.InterfaceC14454a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63094a;

        /* renamed from: b */
        public final C14457a f63095b;

        /* renamed from: c */
        public Y94<Activity> f63096c;

        /* renamed from: d */
        public Y94<C22454gl> f63097d;

        /* renamed from: e */
        public Y94<InterfaceC1880Ea> f63098e;

        /* renamed from: f */
        public Y94<DQ3> f63099f;

        /* renamed from: co.bird.android.core.mrp.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C14458a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63100a;

            public C14458a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63100a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63100a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.core.mrp.a$a$b */
        /* loaded from: classes2.dex */
        public static final class C14459b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63101a;

            public C14459b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63101a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f63101a.mo27479r());
            }
        }

        @Override // co.bird.android.core.mrp.BaseActivityLite.InterfaceC14454a
        /* renamed from: a */
        public DQ3 mo58984a() {
            return this.f63099f.get();
        }

        @Override // co.bird.android.core.mrp.BaseActivityLite.InterfaceC14454a
        /* renamed from: b */
        public void mo58983b(BaseActivityLite baseActivityLite) {
            m58981d(baseActivityLite);
        }

        /* renamed from: c */
        public final void m58982c(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            this.f63096c = C39546d52.m44621a(activity);
            this.f63097d = new C14459b(interfaceC44393lG2);
            C14458a c14458a = new C14458a(interfaceC44393lG2);
            this.f63098e = c14458a;
            this.f63099f = V51.m80429b(EQ3.m109028a(this.f63096c, this.f63097d, c14458a));
        }

        /* renamed from: d */
        public final BaseActivityLite m58981d(BaseActivityLite baseActivityLite) {
            C4650Ky.m98043b(baseActivityLite, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63094a.mo27461w2()));
            C4650Ky.m98042c(baseActivityLite, (C22454gl) C51679xZ3.m5003d(this.f63094a.mo27479r()));
            C4650Ky.m98041d(baseActivityLite, (C36207Tq4) C51679xZ3.m5003d(this.f63094a.mo27595B1()));
            return baseActivityLite;
        }

        public C14457a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            this.f63095b = this;
            this.f63094a = interfaceC44393lG2;
            m58982c(interfaceC44393lG2, activity);
        }
    }

    /* renamed from: co.bird.android.core.mrp.a$b */
    /* loaded from: classes2.dex */
    public static final class C14460b implements BaseActivityLite.InterfaceC14454a.InterfaceC14455a {
        @Override // co.bird.android.core.mrp.BaseActivityLite.InterfaceC14454a.InterfaceC14455a
        /* renamed from: a */
        public BaseActivityLite.InterfaceC14454a mo58978a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            return new C14457a(interfaceC44393lG2, activity);
        }

        private C14460b() {
        }
    }

    private C14456a() {
    }

    /* renamed from: a */
    public static BaseActivityLite.InterfaceC14454a.InterfaceC14455a m58985a() {
        return new C14460b();
    }
}
