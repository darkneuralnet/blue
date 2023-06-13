package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import p000.C37739a42;
/* renamed from: aL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37896aL0 {

    /* renamed from: aL0$a */
    /* loaded from: classes3.dex */
    public static final class C10633a implements C37739a42.InterfaceC10564b.InterfaceC10565a {
        @Override // p000.C37739a42.InterfaceC10564b.InterfaceC10565a
        /* renamed from: a */
        public C37739a42.InterfaceC10564b mo71622a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button, Button button2, AbstractC24569h<DialogResponse> abstractC24569h, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(button2);
            C51679xZ3.m5005b(abstractC24569h);
            C51679xZ3.m5005b(dialogInterface);
            return new C10634b(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView, button, button2, abstractC24569h, dialogInterface);
        }

        private C10633a() {
        }
    }

    /* renamed from: aL0$b */
    /* loaded from: classes3.dex */
    public static final class C10634b implements C37739a42.InterfaceC10564b {

        /* renamed from: a */
        public final AbstractC24569h<DialogResponse> f50306a;

        /* renamed from: b */
        public final InterfaceC44393lG2 f50307b;

        /* renamed from: c */
        public final BaseActivity f50308c;

        /* renamed from: d */
        public final Button f50309d;

        /* renamed from: e */
        public final Button f50310e;

        /* renamed from: f */
        public final RecyclerView f50311f;

        /* renamed from: g */
        public final DialogInterface f50312g;

        /* renamed from: h */
        public final ScopeProvider f50313h;

        /* renamed from: i */
        public final C10634b f50314i;

        @Override // p000.C37739a42.InterfaceC10564b
        /* renamed from: a */
        public void mo71621a(C37739a42 c37739a42) {
            m71620b(c37739a42);
        }

        /* renamed from: b */
        public final C37739a42 m71620b(C37739a42 c37739a42) {
            C38332b42.m65005b(c37739a42, m71618d());
            return c37739a42;
        }

        /* renamed from: c */
        public final C38925c42 m71619c() {
            return new C38925c42((Context) C51679xZ3.m5003d(this.f50307b.mo27552R1()));
        }

        /* renamed from: d */
        public final C43093j42 m71618d() {
            return new C43093j42(this.f50306a, m71619c(), m71617e(), this.f50313h);
        }

        /* renamed from: e */
        public final C43686k42 m71617e() {
            return new C43686k42(this.f50308c, this.f50309d, this.f50310e, this.f50311f, this.f50312g);
        }

        public C10634b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, Button button, Button button2, AbstractC24569h<DialogResponse> abstractC24569h, DialogInterface dialogInterface) {
            this.f50314i = this;
            this.f50306a = abstractC24569h;
            this.f50307b = interfaceC44393lG2;
            this.f50308c = baseActivity;
            this.f50309d = button;
            this.f50310e = button2;
            this.f50311f = recyclerView;
            this.f50312g = dialogInterface;
            this.f50313h = scopeProvider;
        }
    }

    private C37896aL0() {
    }

    /* renamed from: a */
    public static C37739a42.InterfaceC10564b.InterfaceC10565a m71623a() {
        return new C10633a();
    }
}
