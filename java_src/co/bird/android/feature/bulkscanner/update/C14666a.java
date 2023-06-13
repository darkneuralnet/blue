package co.bird.android.feature.bulkscanner.update;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.update.BulkUpdateActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.bulkscanner.update.a */
/* loaded from: classes3.dex */
public final class C14666a {

    /* renamed from: co.bird.android.feature.bulkscanner.update.a$a */
    /* loaded from: classes3.dex */
    public static final class C14667a implements BulkUpdateActivity.InterfaceC14664a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63572a;

        /* renamed from: b */
        public final ScopeProvider f63573b;

        /* renamed from: c */
        public final BaseActivity f63574c;

        /* renamed from: d */
        public final C29751w4 f63575d;

        /* renamed from: e */
        public final C14667a f63576e;

        @Override // co.bird.android.feature.bulkscanner.update.BulkUpdateActivity.InterfaceC14664a
        /* renamed from: a */
        public void mo58540a(BulkUpdateActivity bulkUpdateActivity) {
            m58537d(bulkUpdateActivity);
        }

        /* renamed from: b */
        public final V60 m58539b() {
            return new V60((InterfaceC46473om3) C51679xZ3.m5003d(this.f63572a.mo27584F0()), (C36207Tq4) C51679xZ3.m5003d(this.f63572a.mo27595B1()), this.f63573b, m58538c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63572a.mo27461w2()), new N60());
        }

        /* renamed from: c */
        public final Y60 m58538c() {
            return new Y60(this.f63574c, this.f63575d);
        }

        /* renamed from: d */
        public final BulkUpdateActivity m58537d(BulkUpdateActivity bulkUpdateActivity) {
            C5135Ly.m96068n(bulkUpdateActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63572a.mo27461w2()));
            C5135Ly.m96066p(bulkUpdateActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63572a.mo27595B1()));
            C5135Ly.m96071k(bulkUpdateActivity, (Handler) C51679xZ3.m5003d(this.f63572a.mo27535X2()));
            C5135Ly.m96067o(bulkUpdateActivity, (C22454gl) C51679xZ3.m5003d(this.f63572a.mo27479r()));
            C5135Ly.m96080b(bulkUpdateActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63572a.mo27519d0()));
            C5135Ly.m96075g(bulkUpdateActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63572a.mo27453z2()));
            C5135Ly.m96064r(bulkUpdateActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63572a.mo27459x1()));
            C5135Ly.m96081a(bulkUpdateActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63572a.mo27474s()));
            C5135Ly.m96073i(bulkUpdateActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63572a.mo27558P0()));
            C5135Ly.m96074h(bulkUpdateActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63572a.mo27598A0()));
            C5135Ly.m96077e(bulkUpdateActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63572a.mo27507i0()));
            C5135Ly.m96070l(bulkUpdateActivity, (FO2) C51679xZ3.m5003d(this.f63572a.mo27456y2()));
            C5135Ly.m96065q(bulkUpdateActivity, (YR4) C51679xZ3.m5003d(this.f63572a.mo27525b0()));
            C5135Ly.m96079c(bulkUpdateActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63572a.mo27460x()));
            C5135Ly.m96078d(bulkUpdateActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63572a.mo27517d3()));
            C5135Ly.m96072j(bulkUpdateActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63572a.mo27482q()));
            C5135Ly.m96076f(bulkUpdateActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63572a.mo27483p3()));
            K60.m99236b(bulkUpdateActivity, m58539b());
            return bulkUpdateActivity;
        }

        public C14667a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29751w4 c29751w4) {
            this.f63576e = this;
            this.f63572a = interfaceC44393lG2;
            this.f63573b = scopeProvider;
            this.f63574c = baseActivity;
            this.f63575d = c29751w4;
        }
    }

    /* renamed from: co.bird.android.feature.bulkscanner.update.a$b */
    /* loaded from: classes3.dex */
    public static final class C14668b implements BulkUpdateActivity.InterfaceC14664a.InterfaceC14665a {
        @Override // co.bird.android.feature.bulkscanner.update.BulkUpdateActivity.InterfaceC14664a.InterfaceC14665a
        /* renamed from: a */
        public BulkUpdateActivity.InterfaceC14664a mo58536a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29751w4 c29751w4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c29751w4);
            return new C14667a(interfaceC44393lG2, baseActivity, scopeProvider, c29751w4);
        }

        private C14668b() {
        }
    }

    private C14666a() {
    }

    /* renamed from: a */
    public static BulkUpdateActivity.InterfaceC14664a.InterfaceC14665a m58541a() {
        return new C14668b();
    }
}
