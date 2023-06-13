package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.CD4;
/* renamed from: cP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39118cP0 {

    /* renamed from: cP0$a */
    /* loaded from: classes3.dex */
    public static final class C13538a implements CD4.InterfaceC0926b.InterfaceC0927a {
        @Override // p000.CD4.InterfaceC0926b.InterfaceC0927a
        /* renamed from: a */
        public CD4.InterfaceC0926b mo61437a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, RecyclerView recyclerView, Button button) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(button);
            return new C13539b(interfaceC44393lG2, baseActivity, scopeProvider, dialogInterface, recyclerView, button);
        }

        private C13538a() {
        }
    }

    /* renamed from: cP0$b */
    /* loaded from: classes3.dex */
    public static final class C13539b implements CD4.InterfaceC0926b {

        /* renamed from: a */
        public final ScopeProvider f60533a;

        /* renamed from: b */
        public final BaseActivity f60534b;

        /* renamed from: c */
        public final RecyclerView f60535c;

        /* renamed from: d */
        public final Button f60536d;

        /* renamed from: e */
        public final DialogInterface f60537e;

        /* renamed from: f */
        public final InterfaceC44393lG2 f60538f;

        /* renamed from: g */
        public final C13539b f60539g;

        @Override // p000.CD4.InterfaceC0926b
        /* renamed from: a */
        public void mo61436a(CD4 cd4) {
            m61435b(cd4);
        }

        /* renamed from: b */
        public final CD4 m61435b(CD4 cd4) {
            DD4.m110668b(cd4, m61433d());
            return cd4;
        }

        /* renamed from: c */
        public final GD4 m61434c() {
            return new GD4((Context) C51679xZ3.m5003d(this.f60538f.mo27552R1()));
        }

        /* renamed from: d */
        public final MD4 m61433d() {
            return new MD4(this.f60533a, m61432e(), m61434c());
        }

        /* renamed from: e */
        public final QD4 m61432e() {
            return new QD4(this.f60534b, this.f60535c, this.f60536d, this.f60537e);
        }

        public C13539b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, DialogInterface dialogInterface, RecyclerView recyclerView, Button button) {
            this.f60539g = this;
            this.f60533a = scopeProvider;
            this.f60534b = baseActivity;
            this.f60535c = recyclerView;
            this.f60536d = button;
            this.f60537e = dialogInterface;
            this.f60538f = interfaceC44393lG2;
        }
    }

    private C39118cP0() {
    }

    /* renamed from: a */
    public static CD4.InterfaceC0926b.InterfaceC0927a m61438a() {
        return new C13538a();
    }
}
