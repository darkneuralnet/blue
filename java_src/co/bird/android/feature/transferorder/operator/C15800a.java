package co.bird.android.feature.transferorder.operator;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.transferorder.operator.InterfaceC15803b;
/* renamed from: co.bird.android.feature.transferorder.operator.a */
/* loaded from: classes3.dex */
public final class C15800a {

    /* renamed from: co.bird.android.feature.transferorder.operator.a$a */
    /* loaded from: classes3.dex */
    public static final class C15801a implements InterfaceC15803b.InterfaceC15804a {
        @Override // co.bird.android.feature.transferorder.operator.InterfaceC15803b.InterfaceC15804a
        /* renamed from: a */
        public InterfaceC15803b mo56523a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, FragmentManager fragmentManager, int i) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC14454a);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(Integer.valueOf(i));
            return new C15802b(interfaceC44393lG2, interfaceC14454a, fragmentManager, Integer.valueOf(i));
        }

        private C15801a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.operator.a$b */
    /* loaded from: classes3.dex */
    public static final class C15802b implements InterfaceC15803b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65699a;

        /* renamed from: b */
        public final BaseActivityLite.InterfaceC14454a f65700b;

        /* renamed from: c */
        public final C15802b f65701c;

        /* renamed from: d */
        public Y94<FragmentManager> f65702d;

        /* renamed from: e */
        public Y94<Integer> f65703e;

        /* renamed from: f */
        public Y94<C33155Gp3> f65704f;

        @Override // co.bird.android.feature.transferorder.operator.InterfaceC15803b
        /* renamed from: a */
        public void mo56527a(OperatorOrderActivity operatorOrderActivity) {
            m56534h(operatorOrderActivity);
        }

        @Override // co.bird.android.feature.transferorder.operator.InterfaceC15803b
        /* renamed from: b */
        public void mo56526b(C48282rp3 c48282rp3) {
            m56532j(c48282rp3);
        }

        @Override // co.bird.android.feature.transferorder.operator.InterfaceC15803b
        /* renamed from: c */
        public void mo56525c(C10571a7 c10571a7) {
            m56535g(c10571a7);
        }

        @Override // co.bird.android.feature.transferorder.operator.InterfaceC15803b
        /* renamed from: d */
        public void mo56524d(C33614Io3 c33614Io3) {
            m56533i(c33614Io3);
        }

        /* renamed from: e */
        public final C24711j7 m56537e() {
            return new C24711j7((O86) C51679xZ3.m5003d(this.f65699a.mo27485p()), (C36207Tq4) C51679xZ3.m5003d(this.f65699a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65699a.mo27461w2()));
        }

        /* renamed from: f */
        public final void m56536f(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, FragmentManager fragmentManager, Integer num) {
            this.f65702d = C39546d52.m44621a(fragmentManager);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(num);
            this.f65703e = m44621a;
            this.f65704f = V51.m80429b(C33389Hp3.m103414a(this.f65702d, m44621a));
        }

        /* renamed from: g */
        public final C10571a7 m56535g(C10571a7 c10571a7) {
            C12295b7.m64958b(c10571a7, m56537e());
            return c10571a7;
        }

        /* renamed from: h */
        public final OperatorOrderActivity m56534h(OperatorOrderActivity operatorOrderActivity) {
            C4650Ky.m98043b(operatorOrderActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65699a.mo27461w2()));
            C4650Ky.m98042c(operatorOrderActivity, (C22454gl) C51679xZ3.m5003d(this.f65699a.mo27479r()));
            C4650Ky.m98041d(operatorOrderActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65699a.mo27595B1()));
            C52421yo3.m2564c(operatorOrderActivity, m56528n());
            C52421yo3.m2565b(operatorOrderActivity, this.f65704f.get());
            return operatorOrderActivity;
        }

        /* renamed from: i */
        public final C33614Io3 m56533i(C33614Io3 c33614Io3) {
            C34082Ko3.m98274c(c33614Io3, m56530l());
            C34082Ko3.m98276a(c33614Io3, m56531k());
            return c33614Io3;
        }

        /* renamed from: j */
        public final C48282rp3 m56532j(C48282rp3 c48282rp3) {
            C48874sp3.m13600b(c48282rp3, m56529m());
            return c48282rp3;
        }

        /* renamed from: k */
        public final C33146Go3 m56531k() {
            return new C33146Go3((Context) C51679xZ3.m5003d(this.f65699a.mo27552R1()));
        }

        /* renamed from: l */
        public final C42352hp3 m56530l() {
            return new C42352hp3((O86) C51679xZ3.m5003d(this.f65699a.mo27485p()), (DQ3) C51679xZ3.m5003d(this.f65700b.mo58984a()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65699a.mo27461w2()));
        }

        /* renamed from: m */
        public final C32219Cp3 m56529m() {
            return new C32219Cp3((O86) C51679xZ3.m5003d(this.f65699a.mo27485p()), this.f65704f.get());
        }

        /* renamed from: n */
        public final C34559Mp3 m56528n() {
            return new C34559Mp3((O86) C51679xZ3.m5003d(this.f65699a.mo27485p()), this.f65704f.get());
        }

        public C15802b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, FragmentManager fragmentManager, Integer num) {
            this.f65701c = this;
            this.f65699a = interfaceC44393lG2;
            this.f65700b = interfaceC14454a;
            m56536f(interfaceC44393lG2, interfaceC14454a, fragmentManager, num);
        }
    }

    private C15800a() {
    }

    /* renamed from: a */
    public static InterfaceC15803b.InterfaceC15804a m56538a() {
        return new C15801a();
    }
}
