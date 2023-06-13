package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Pair;
import p000.C38664be0;
/* renamed from: CH0 */
/* loaded from: classes3.dex */
public final class CH0 {

    /* renamed from: CH0$a */
    /* loaded from: classes3.dex */
    public static final class C0980a implements C38664be0.InterfaceC12461a {

        /* renamed from: a */
        public final BaseActivity f3817a;

        /* renamed from: b */
        public final TextView f3818b;

        /* renamed from: c */
        public final RecyclerView f3819c;

        /* renamed from: d */
        public final DialogInterface f3820d;

        /* renamed from: e */
        public final ScopeProvider f3821e;

        /* renamed from: f */
        public final AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> f3822f;

        /* renamed from: g */
        public final InterfaceC44393lG2 f3823g;

        /* renamed from: h */
        public final C0980a f3824h;

        @Override // p000.C38664be0.InterfaceC12461a
        /* renamed from: a */
        public void mo64232a(C38664be0 c38664be0) {
            m112464e(c38664be0);
        }

        /* renamed from: b */
        public final C40460ee0 m112467b() {
            return new C40460ee0((Context) C51679xZ3.m5003d(this.f3823g.mo27552R1()));
        }

        /* renamed from: c */
        public final C43425je0 m112466c() {
            return new C43425je0(m112465d(), this.f3821e, this.f3822f, m112467b());
        }

        /* renamed from: d */
        public final C44611le0 m112465d() {
            return new C44611le0(this.f3817a, this.f3818b, this.f3819c, this.f3820d);
        }

        /* renamed from: e */
        public final C38664be0 m112464e(C38664be0 c38664be0) {
            C39257ce0.m61104b(c38664be0, m112466c());
            return c38664be0;
        }

        public C0980a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C38664be0 c38664be0, DialogInterface dialogInterface, AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> abstractC24569h, TextView textView, RecyclerView recyclerView) {
            this.f3824h = this;
            this.f3817a = baseActivity;
            this.f3818b = textView;
            this.f3819c = recyclerView;
            this.f3820d = dialogInterface;
            this.f3821e = scopeProvider;
            this.f3822f = abstractC24569h;
            this.f3823g = interfaceC44393lG2;
        }
    }

    /* renamed from: CH0$b */
    /* loaded from: classes3.dex */
    public static final class C0981b implements C38664be0.InterfaceC12461a.InterfaceC12462a {
        @Override // p000.C38664be0.InterfaceC12461a.InterfaceC12462a
        /* renamed from: a */
        public C38664be0.InterfaceC12461a mo64231a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C38664be0 c38664be0, DialogInterface dialogInterface, AbstractC24569h<Pair<IssueStatus, IssueStatusReason>> abstractC24569h, TextView textView, RecyclerView recyclerView) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c38664be0);
            C51679xZ3.m5005b(dialogInterface);
            C51679xZ3.m5005b(abstractC24569h);
            C51679xZ3.m5005b(textView);
            C51679xZ3.m5005b(recyclerView);
            return new C0980a(interfaceC44393lG2, baseActivity, scopeProvider, c38664be0, dialogInterface, abstractC24569h, textView, recyclerView);
        }

        private C0981b() {
        }
    }

    private CH0() {
    }

    /* renamed from: a */
    public static C38664be0.InterfaceC12461a.InterfaceC12462a m112468a() {
        return new C0981b();
    }
}
