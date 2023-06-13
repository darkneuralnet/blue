package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24567g;
import p000.C52471yt3;
/* renamed from: ZM0 */
/* loaded from: classes4.dex */
public final class ZM0 {

    /* renamed from: ZM0$a */
    /* loaded from: classes4.dex */
    public static final class C10241a implements C52471yt3.InterfaceC30766b.InterfaceC30767a {
        @Override // p000.C52471yt3.InterfaceC30766b.InterfaceC30767a
        /* renamed from: a */
        public C52471yt3.InterfaceC30766b mo2326a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C24567g<WireBird> c24567g, C40679f00 c40679f00, DialogInterface dialogInterface, InterfaceC39953dm5 interfaceC39953dm5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c24567g);
            C51679xZ3.m5005b(c40679f00);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(interfaceC39953dm5);
            return new C10242b(interfaceC44393lG2, baseActivity, scopeProvider, c24567g, c40679f00, dialogInterface, interfaceC39953dm5);
        }

        private C10241a() {
        }
    }

    /* renamed from: ZM0$b */
    /* loaded from: classes4.dex */
    public static final class C10242b implements C52471yt3.InterfaceC30766b {

        /* renamed from: a */
        public final BaseActivity f48383a;

        /* renamed from: b */
        public final C40679f00 f48384b;

        /* renamed from: c */
        public final DialogInterface f48385c;

        /* renamed from: d */
        public final InterfaceC39953dm5 f48386d;

        /* renamed from: e */
        public final ScopeProvider f48387e;

        /* renamed from: f */
        public final InterfaceC44393lG2 f48388f;

        /* renamed from: g */
        public final C24567g<WireBird> f48389g;

        /* renamed from: h */
        public final C10242b f48390h;

        @Override // p000.C52471yt3.InterfaceC30766b
        /* renamed from: a */
        public void mo2327a(C52471yt3 c52471yt3) {
            m73242c(c52471yt3);
        }

        /* renamed from: b */
        public final C24739jE m73243b() {
            return new C24739jE(this.f48383a, this.f48384b, this.f48385c);
        }

        /* renamed from: c */
        public final C52471yt3 m73242c(C52471yt3 c52471yt3) {
            C53064zt3.m165b(c52471yt3, m73241d());
            return c52471yt3;
        }

        /* renamed from: d */
        public final C32723Et3 m73241d() {
            return new C32723Et3(m73243b(), this.f48386d, this.f48387e, (C36207Tq4) C51679xZ3.m5003d(this.f48388f.mo27595B1()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f48388f.mo27584F0()), this.f48389g);
        }

        public C10242b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C24567g<WireBird> c24567g, C40679f00 c40679f00, DialogInterface dialogInterface, InterfaceC39953dm5 interfaceC39953dm5) {
            this.f48390h = this;
            this.f48383a = baseActivity;
            this.f48384b = c40679f00;
            this.f48385c = dialogInterface;
            this.f48386d = interfaceC39953dm5;
            this.f48387e = scopeProvider;
            this.f48388f = interfaceC44393lG2;
            this.f48389g = c24567g;
        }
    }

    private ZM0() {
    }

    /* renamed from: a */
    public static C52471yt3.InterfaceC30766b.InterfaceC30767a m73244a() {
        return new C10241a();
    }
}
