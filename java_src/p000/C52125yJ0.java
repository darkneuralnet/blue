package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.fleetstatus.common.FleetActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C34341Lr1;
/* renamed from: yJ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52125yJ0 {

    /* renamed from: yJ0$a */
    /* loaded from: classes3.dex */
    public static final class C30552a implements C34341Lr1.InterfaceC5098b.InterfaceC5099a {
        @Override // p000.C34341Lr1.InterfaceC5098b.InterfaceC5099a
        /* renamed from: a */
        public C34341Lr1.InterfaceC5098b mo3683a(InterfaceC44393lG2 interfaceC44393lG2, FleetActivity.InterfaceC14793a interfaceC14793a, BaseActivity baseActivity, ScopeProvider scopeProvider, C42440hy1 c42440hy1, EnumC45315mp1 enumC45315mp1) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC14793a);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c42440hy1);
            C51679xZ3.m5005b(enumC45315mp1);
            return new C30553b(interfaceC44393lG2, interfaceC14793a, baseActivity, scopeProvider, c42440hy1, enumC45315mp1);
        }

        private C30552a() {
        }
    }

    /* renamed from: yJ0$b */
    /* loaded from: classes3.dex */
    public static final class C30553b implements C34341Lr1.InterfaceC5098b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f119331a;

        /* renamed from: b */
        public final FleetActivity.InterfaceC14793a f119332b;

        /* renamed from: c */
        public final BaseActivity f119333c;

        /* renamed from: d */
        public final C42440hy1 f119334d;

        /* renamed from: e */
        public final ScopeProvider f119335e;

        /* renamed from: f */
        public final EnumC45315mp1 f119336f;

        /* renamed from: g */
        public final C30553b f119337g;

        @Override // p000.C34341Lr1.InterfaceC5098b
        /* renamed from: a */
        public void mo3682a(C34341Lr1 c34341Lr1) {
            m3679d(c34341Lr1);
        }

        /* renamed from: b */
        public final C36213Tr1 m3681b() {
            return new C36213Tr1((InterfaceC31992Bq1) C51679xZ3.m5003d(this.f119331a.mo27496l1()), (C44129kp1) C51679xZ3.m5003d(this.f119332b.mo58219a()), new C34107Kr1(), m3680c(), this.f119335e, this.f119336f);
        }

        /* renamed from: c */
        public final C36447Ur1 m3680c() {
            return new C36447Ur1(this.f119333c, this.f119334d);
        }

        /* renamed from: d */
        public final C34341Lr1 m3679d(C34341Lr1 c34341Lr1) {
            C34575Mr1.m94676b(c34341Lr1, m3681b());
            return c34341Lr1;
        }

        public C30553b(InterfaceC44393lG2 interfaceC44393lG2, FleetActivity.InterfaceC14793a interfaceC14793a, BaseActivity baseActivity, ScopeProvider scopeProvider, C42440hy1 c42440hy1, EnumC45315mp1 enumC45315mp1) {
            this.f119337g = this;
            this.f119331a = interfaceC44393lG2;
            this.f119332b = interfaceC14793a;
            this.f119333c = baseActivity;
            this.f119334d = c42440hy1;
            this.f119335e = scopeProvider;
            this.f119336f = enumC45315mp1;
        }
    }

    private C52125yJ0() {
    }

    /* renamed from: a */
    public static C34341Lr1.InterfaceC5098b.InterfaceC5099a m3684a() {
        return new C30552a();
    }
}
