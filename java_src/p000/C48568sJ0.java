package p000;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C53032zq1;
/* renamed from: sJ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48568sJ0 {

    /* renamed from: sJ0$a */
    /* loaded from: classes3.dex */
    public static final class C28256a implements C53032zq1.InterfaceC31518b.InterfaceC31519a {
        @Override // p000.C53032zq1.InterfaceC31518b.InterfaceC31519a
        /* renamed from: a */
        public C53032zq1.InterfaceC31518b mo391a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, C41254fy1 c41254fy1) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            C51679xZ3.m5005b(c41254fy1);
            return new C28257b(interfaceC44393lG2, baseActivity, scopeProvider, fragmentManager, abstractC11719f, c41254fy1);
        }

        private C28256a() {
        }
    }

    /* renamed from: sJ0$b */
    /* loaded from: classes3.dex */
    public static final class C28257b implements C53032zq1.InterfaceC31518b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f108570a;

        /* renamed from: b */
        public final BaseActivity f108571b;

        /* renamed from: c */
        public final C41254fy1 f108572c;

        /* renamed from: d */
        public final ScopeProvider f108573d;

        /* renamed from: e */
        public final C28257b f108574e;

        @Override // p000.C53032zq1.InterfaceC31518b
        /* renamed from: a */
        public void mo392a(C53032zq1 c53032zq1) {
            m14449e(c53032zq1);
        }

        /* renamed from: b */
        public final C47104pq1 m14452b() {
            return new C47104pq1((C36207Tq4) C51679xZ3.m5003d(this.f108570a.mo27595B1()));
        }

        /* renamed from: c */
        public final C37374Yq1 m14451c() {
            return new C37374Yq1((InterfaceC31992Bq1) C51679xZ3.m5003d(this.f108570a.mo27496l1()), (InterfaceC46545ot5) C51679xZ3.m5003d(this.f108570a.mo27501k0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f108570a.mo27519d0()), new MZ3(), m14452b(), new C47687qp1(), (C36207Tq4) C51679xZ3.m5003d(this.f108570a.mo27595B1()), m14450d(), this.f108573d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f108570a.mo27461w2()));
        }

        /* renamed from: d */
        public final C49485tr1 m14450d() {
            return new C49485tr1(this.f108571b, this.f108572c);
        }

        /* renamed from: e */
        public final C53032zq1 m14449e(C53032zq1 c53032zq1) {
            C31758Aq1.m115119b(c53032zq1, m14451c());
            return c53032zq1;
        }

        public C28257b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, C41254fy1 c41254fy1) {
            this.f108574e = this;
            this.f108570a = interfaceC44393lG2;
            this.f108571b = baseActivity;
            this.f108572c = c41254fy1;
            this.f108573d = scopeProvider;
        }
    }

    private C48568sJ0() {
    }

    /* renamed from: a */
    public static C53032zq1.InterfaceC31518b.InterfaceC31519a m14453a() {
        return new C28256a();
    }
}
