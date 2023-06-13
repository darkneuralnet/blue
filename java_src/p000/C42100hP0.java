package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24567g;
import p000.C38430bE4;
/* renamed from: hP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42100hP0 {

    /* renamed from: hP0$a */
    /* loaded from: classes3.dex */
    public static final class C22637a implements C38430bE4.InterfaceC12328b.InterfaceC12329a {
        @Override // p000.C38430bE4.InterfaceC12328b.InterfaceC12329a
        /* renamed from: a */
        public C38430bE4.InterfaceC12328b mo36459a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40086e00 c40086e00, C24567g<DialogResponse> c24567g, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c40086e00);
            C51679xZ3.m5005b(c24567g);
            C51679xZ3.m5005b(dialogInterface);
            return new C22638b(interfaceC44393lG2, baseActivity, scopeProvider, c40086e00, c24567g, dialogInterface);
        }

        private C22637a() {
        }
    }

    /* renamed from: hP0$b */
    /* loaded from: classes3.dex */
    public static final class C22638b implements C38430bE4.InterfaceC12328b {

        /* renamed from: a */
        public final C24567g<DialogResponse> f85149a;

        /* renamed from: b */
        public final BaseActivity f85150b;

        /* renamed from: c */
        public final C40086e00 f85151c;

        /* renamed from: d */
        public final DialogInterface f85152d;

        /* renamed from: e */
        public final ScopeProvider f85153e;

        /* renamed from: f */
        public final C22638b f85154f;

        @Override // p000.C38430bE4.InterfaceC12328b
        /* renamed from: a */
        public void mo36458a(C38430bE4 c38430bE4) {
            m36457b(c38430bE4);
        }

        /* renamed from: b */
        public final C38430bE4 m36457b(C38430bE4 c38430bE4) {
            C39023cE4.m61650b(c38430bE4, m36456c());
            return c38430bE4;
        }

        /* renamed from: c */
        public final C41412gE4 m36456c() {
            return new C41412gE4(this.f85149a, m36455d(), this.f85153e);
        }

        /* renamed from: d */
        public final C42005hE4 m36455d() {
            return new C42005hE4(this.f85150b, this.f85151c, this.f85152d);
        }

        public C22638b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C40086e00 c40086e00, C24567g<DialogResponse> c24567g, DialogInterface dialogInterface) {
            this.f85154f = this;
            this.f85149a = c24567g;
            this.f85150b = baseActivity;
            this.f85151c = c40086e00;
            this.f85152d = dialogInterface;
            this.f85153e = scopeProvider;
        }
    }

    private C42100hP0() {
    }

    /* renamed from: a */
    public static C38430bE4.InterfaceC12328b.InterfaceC12329a m36460a() {
        return new C22637a();
    }
}
