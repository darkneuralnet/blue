package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C49052t72;
/* renamed from: dL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39693dL0 {

    /* renamed from: dL0$a */
    /* loaded from: classes3.dex */
    public static final class C19729a implements C49052t72.InterfaceC28530a.InterfaceC28531a {
        @Override // p000.C49052t72.InterfaceC28530a.InterfaceC28531a
        /* renamed from: a */
        public C49052t72.InterfaceC28530a mo13037a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8538V3 c8538v3, C52993zm2 c52993zm2, C35935Sm2 c35935Sm2, C36169Tm2 c36169Tm2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c8538v3);
            C51679xZ3.m5005b(c52993zm2);
            C51679xZ3.m5005b(c35935Sm2);
            C51679xZ3.m5005b(c36169Tm2);
            return new C19730b(interfaceC44393lG2, baseActivity, scopeProvider, c8538v3, c52993zm2, c35935Sm2, c36169Tm2);
        }

        private C19729a() {
        }
    }

    /* renamed from: dL0$b */
    /* loaded from: classes3.dex */
    public static final class C19730b implements C49052t72.InterfaceC28530a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f76456a;

        /* renamed from: b */
        public final ScopeProvider f76457b;

        /* renamed from: c */
        public final BaseActivity f76458c;

        /* renamed from: d */
        public final C8538V3 f76459d;

        /* renamed from: e */
        public final C52993zm2 f76460e;

        /* renamed from: f */
        public final C35935Sm2 f76461f;

        /* renamed from: g */
        public final C36169Tm2 f76462g;

        /* renamed from: h */
        public final C19730b f76463h;

        @Override // p000.C49052t72.InterfaceC28530a
        /* renamed from: a */
        public void mo13038a(C49052t72 c49052t72) {
            m44389b(c49052t72);
        }

        /* renamed from: b */
        public final C49052t72 m44389b(C49052t72 c49052t72) {
            C49645u72.m10845b(c49052t72, m44388c());
            return c49052t72;
        }

        /* renamed from: c */
        public final P72 m44388c() {
            return new P72((InterfaceC37097Xl3) C51679xZ3.m5003d(this.f76456a.mo27542V2()), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f76456a.mo27459x1()), this.f76457b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f76456a.mo27461w2()), m44387d(), new C48459s72(), new L82());
        }

        /* renamed from: d */
        public final S72 m44387d() {
            return new S72(this.f76458c, this.f76459d, this.f76460e, this.f76461f, this.f76462g);
        }

        public C19730b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8538V3 c8538v3, C52993zm2 c52993zm2, C35935Sm2 c35935Sm2, C36169Tm2 c36169Tm2) {
            this.f76463h = this;
            this.f76456a = interfaceC44393lG2;
            this.f76457b = scopeProvider;
            this.f76458c = baseActivity;
            this.f76459d = c8538v3;
            this.f76460e = c52993zm2;
            this.f76461f = c35935Sm2;
            this.f76462g = c36169Tm2;
        }
    }

    private C39693dL0() {
    }

    /* renamed from: a */
    public static C49052t72.InterfaceC28530a.InterfaceC28531a m44390a() {
        return new C19729a();
    }
}
