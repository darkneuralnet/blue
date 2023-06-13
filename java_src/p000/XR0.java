package p000;

import android.content.Context;
import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.RD6;
/* renamed from: XR0 */
/* loaded from: classes3.dex */
public final class XR0 {

    /* renamed from: XR0$a */
    /* loaded from: classes3.dex */
    public static final class C9414a implements RD6.InterfaceC7094b.InterfaceC7095a {
        @Override // p000.RD6.InterfaceC7094b.InterfaceC7095a
        /* renamed from: a */
        public RD6.InterfaceC7094b mo77017a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RD6 rd6, DialogInterface dialogInterface, C49011t31 c49011t31) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(rd6);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(c49011t31);
            return new C9415b(interfaceC44393lG2, baseActivity, scopeProvider, rd6, dialogInterface, c49011t31);
        }

        private C9414a() {
        }
    }

    /* renamed from: XR0$b */
    /* loaded from: classes3.dex */
    public static final class C9415b implements RD6.InterfaceC7094b {

        /* renamed from: a */
        public final BaseActivity f43218a;

        /* renamed from: b */
        public final DialogInterface f43219b;

        /* renamed from: c */
        public final C49011t31 f43220c;

        /* renamed from: d */
        public final ScopeProvider f43221d;

        /* renamed from: e */
        public final InterfaceC44393lG2 f43222e;

        /* renamed from: f */
        public final C9415b f43223f;

        @Override // p000.RD6.InterfaceC7094b
        /* renamed from: a */
        public void mo77016a(RD6 rd6) {
            m77015b(rd6);
        }

        /* renamed from: b */
        public final RD6 m77015b(RD6 rd6) {
            SD6.m85821b(rd6, m77013d());
            return rd6;
        }

        /* renamed from: c */
        public final VD6 m77014c() {
            return new VD6((Context) C51679xZ3.m5003d(this.f43222e.mo27552R1()));
        }

        /* renamed from: d */
        public final C38432bE6 m77013d() {
            return new C38432bE6(m77012e(), this.f43221d, m77014c());
        }

        /* renamed from: e */
        public final C39636dE6 m77012e() {
            return new C39636dE6(this.f43218a, this.f43219b, this.f43220c);
        }

        public C9415b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RD6 rd6, DialogInterface dialogInterface, C49011t31 c49011t31) {
            this.f43223f = this;
            this.f43218a = baseActivity;
            this.f43219b = dialogInterface;
            this.f43220c = c49011t31;
            this.f43221d = scopeProvider;
            this.f43222e = interfaceC44393lG2;
        }
    }

    private XR0() {
    }

    /* renamed from: a */
    public static RD6.InterfaceC7094b.InterfaceC7095a m77018a() {
        return new C9414a();
    }
}
