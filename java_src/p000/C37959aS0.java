package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C44972mE6;
/* renamed from: aS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37959aS0 {

    /* renamed from: aS0$a */
    /* loaded from: classes3.dex */
    public static final class C10713a implements C44972mE6.InterfaceC26019b.InterfaceC26020a {
        @Override // p000.C44972mE6.InterfaceC26019b.InterfaceC26020a
        /* renamed from: a */
        public C44972mE6.InterfaceC26019b mo25867a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C44972mE6 c44972mE6, DialogInterface dialogInterface, C49604u31 c49604u31, AbstractC24569h<DialogResponse> abstractC24569h) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c44972mE6);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(c49604u31);
            C51679xZ3.m5005b(abstractC24569h);
            return new C10714b(interfaceC44393lG2, baseActivity, scopeProvider, c44972mE6, dialogInterface, c49604u31, abstractC24569h);
        }

        private C10713a() {
        }
    }

    /* renamed from: aS0$b */
    /* loaded from: classes3.dex */
    public static final class C10714b implements C44972mE6.InterfaceC26019b {

        /* renamed from: a */
        public final BaseActivity f50488a;

        /* renamed from: b */
        public final DialogInterface f50489b;

        /* renamed from: c */
        public final C49604u31 f50490c;

        /* renamed from: d */
        public final ScopeProvider f50491d;

        /* renamed from: e */
        public final AbstractC24569h<DialogResponse> f50492e;

        /* renamed from: f */
        public final C10714b f50493f;

        @Override // p000.C44972mE6.InterfaceC26019b
        /* renamed from: a */
        public void mo25868a(C44972mE6 c44972mE6) {
            m71356b(c44972mE6);
        }

        /* renamed from: b */
        public final C44972mE6 m71356b(C44972mE6 c44972mE6) {
            C45565nE6.m24110c(c44972mE6, m71354d());
            C45565nE6.m24111b(c44972mE6, m71355c());
            return c44972mE6;
        }

        /* renamed from: c */
        public final C47937rE6 m71355c() {
            return new C47937rE6(m71354d(), this.f50491d, this.f50492e);
        }

        /* renamed from: d */
        public final C50307vE6 m71354d() {
            return new C50307vE6(this.f50488a, this.f50489b, this.f50490c);
        }

        public C10714b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C44972mE6 c44972mE6, DialogInterface dialogInterface, C49604u31 c49604u31, AbstractC24569h<DialogResponse> abstractC24569h) {
            this.f50493f = this;
            this.f50488a = baseActivity;
            this.f50489b = dialogInterface;
            this.f50490c = c49604u31;
            this.f50491d = scopeProvider;
            this.f50492e = abstractC24569h;
        }
    }

    private C37959aS0() {
    }

    /* renamed from: a */
    public static C44972mE6.InterfaceC26019b.InterfaceC26020a m71357a() {
        return new C10713a();
    }
}
