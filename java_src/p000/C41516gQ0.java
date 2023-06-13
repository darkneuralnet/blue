package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C50634vn5;
/* renamed from: gQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41516gQ0 {

    /* renamed from: gQ0$a */
    /* loaded from: classes3.dex */
    public static final class C20845a implements C50634vn5.InterfaceC29639b.InterfaceC29640a {
        @Override // p000.C50634vn5.InterfaceC29639b.InterfaceC29640a
        /* renamed from: a */
        public C50634vn5.InterfaceC29639b mo8029a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Button button, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(dialogInterface);
            return new C20846b(interfaceC44393lG2, baseActivity, scopeProvider, button, dialogInterface);
        }

        private C20845a() {
        }
    }

    /* renamed from: gQ0$b */
    /* loaded from: classes3.dex */
    public static final class C20846b implements C50634vn5.InterfaceC29639b {

        /* renamed from: a */
        public final BaseActivity f82138a;

        /* renamed from: b */
        public final Button f82139b;

        /* renamed from: c */
        public final DialogInterface f82140c;

        /* renamed from: d */
        public final ScopeProvider f82141d;

        /* renamed from: e */
        public final InterfaceC44393lG2 f82142e;

        /* renamed from: f */
        public final C20846b f82143f;

        @Override // p000.C50634vn5.InterfaceC29639b
        /* renamed from: a */
        public void mo8030a(C50634vn5 c50634vn5) {
            m39497b(c50634vn5);
        }

        /* renamed from: b */
        public final C50634vn5 m39497b(C50634vn5 c50634vn5) {
            C51227wn5.m6319b(c50634vn5, m39496c());
            return c50634vn5;
        }

        /* renamed from: c */
        public final C53006zn5 m39496c() {
            return new C53006zn5(m39495d(), this.f82141d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f82142e.mo27461w2()));
        }

        /* renamed from: d */
        public final C31969Bn5 m39495d() {
            return new C31969Bn5(this.f82138a, this.f82139b, this.f82140c);
        }

        public C20846b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Button button, DialogInterface dialogInterface) {
            this.f82143f = this;
            this.f82138a = baseActivity;
            this.f82139b = button;
            this.f82140c = dialogInterface;
            this.f82141d = scopeProvider;
            this.f82142e = interfaceC44393lG2;
        }
    }

    private C41516gQ0() {
    }

    /* renamed from: a */
    public static C50634vn5.InterfaceC29639b.InterfaceC29640a m39498a() {
        return new C20845a();
    }
}
