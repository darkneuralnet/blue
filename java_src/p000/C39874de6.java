package p000;

import p000.IS0;
import p000.WU2;
/* renamed from: de6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39874de6<Model> implements WU2<Model, Model> {

    /* renamed from: a */
    public static final C39874de6<?> f76991a = new C39874de6<>();

    /* renamed from: de6$a */
    /* loaded from: classes5.dex */
    public static class C19829a<Model> implements XU2<Model, Model> {

        /* renamed from: a */
        public static final C19829a<?> f76992a = new C19829a<>();

        /* renamed from: a */
        public static <T> C19829a<T> m43952a() {
            return (C19829a<T>) f76992a;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Model, Model> mo19945b(QW2 qw2) {
            return C39874de6.m43953c();
        }
    }

    /* renamed from: de6$b */
    /* loaded from: classes5.dex */
    public static class C19830b<Model> implements IS0<Model> {

        /* renamed from: b */
        public final Model f76993b;

        public C19830b(Model model) {
            this.f76993b = model;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<Model> mo6834a() {
            return (Class<Model>) this.f76993b.getClass();
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return ZS0.LOCAL;
        }

        @Override // p000.IS0
        public void cancel() {
        }

        @Override // p000.IS0
        public void cleanup() {
        }

        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super Model> interfaceC3534a) {
            interfaceC3534a.mo77098c((Model) this.f76993b);
        }
    }

    /* renamed from: c */
    public static <T> C39874de6<T> m43953c() {
        return (C39874de6<T>) f76991a;
    }

    @Override // p000.WU2
    /* renamed from: a */
    public boolean mo19952a(Model model) {
        return true;
    }

    @Override // p000.WU2
    /* renamed from: b */
    public WU2.C9060a<Model> mo19951b(Model model, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(model), new C19830b(model));
    }
}
