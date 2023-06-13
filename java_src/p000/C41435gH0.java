package p000;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.model.DialogResponse;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.C24567g;
import p000.C30619yZ;
/* renamed from: gH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41435gH0 {

    /* renamed from: gH0$a */
    /* loaded from: classes2.dex */
    public static final class C20793a implements C30619yZ.InterfaceC30620a {

        /* renamed from: a */
        public final C24567g<DialogResponse> f81876a;

        /* renamed from: b */
        public final Activity f81877b;

        /* renamed from: c */
        public final ConstraintLayout f81878c;

        /* renamed from: d */
        public final DialogInterface f81879d;

        /* renamed from: e */
        public final ScopeProvider f81880e;

        /* renamed from: f */
        public final C20793a f81881f;

        @Override // p000.C30619yZ.InterfaceC30620a
        /* renamed from: a */
        public void mo3264a(C30619yZ c30619yZ) {
            m39763d(c30619yZ);
        }

        /* renamed from: b */
        public final C1865EZ m39765b() {
            return new C1865EZ(this.f81876a, m39764c(), this.f81880e);
        }

        /* renamed from: c */
        public final C2356FZ m39764c() {
            return new C2356FZ(this.f81877b, this.f81878c, this.f81879d);
        }

        /* renamed from: d */
        public final C30619yZ m39763d(C30619yZ c30619yZ) {
            C31039zZ.m1116b(c30619yZ, m39765b());
            return c30619yZ;
        }

        public C20793a(Activity activity, ConstraintLayout constraintLayout, ScopeProvider scopeProvider, C24567g<DialogResponse> c24567g, DialogInterface dialogInterface) {
            this.f81881f = this;
            this.f81876a = c24567g;
            this.f81877b = activity;
            this.f81878c = constraintLayout;
            this.f81879d = dialogInterface;
            this.f81880e = scopeProvider;
        }
    }

    /* renamed from: gH0$b */
    /* loaded from: classes2.dex */
    public static final class C20794b implements C30619yZ.InterfaceC30620a.InterfaceC30621a {
        @Override // p000.C30619yZ.InterfaceC30620a.InterfaceC30621a
        /* renamed from: a */
        public C30619yZ.InterfaceC30620a mo3263a(Activity activity, ConstraintLayout constraintLayout, ScopeProvider scopeProvider, C24567g<DialogResponse> c24567g, DialogInterface dialogInterface) {
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(constraintLayout);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c24567g);
            C51679xZ3.m5005b(dialogInterface);
            return new C20793a(activity, constraintLayout, scopeProvider, c24567g, dialogInterface);
        }

        private C20794b() {
        }
    }

    private C41435gH0() {
    }

    /* renamed from: a */
    public static C30619yZ.InterfaceC30620a.InterfaceC30621a m39766a() {
        return new C20794b();
    }
}
