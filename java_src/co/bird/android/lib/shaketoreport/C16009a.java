package co.bird.android.lib.shaketoreport;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.lib.shaketoreport.BugReportActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.lib.shaketoreport.a */
/* loaded from: classes3.dex */
public final class C16009a {

    /* renamed from: co.bird.android.lib.shaketoreport.a$a */
    /* loaded from: classes3.dex */
    public static final class C16010a implements BugReportActivity.InterfaceC16007a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66051a;

        /* renamed from: b */
        public final BaseActivity f66052b;

        /* renamed from: c */
        public final ImageView f66053c;

        /* renamed from: d */
        public final EditText f66054d;

        /* renamed from: e */
        public final Button f66055e;

        /* renamed from: f */
        public final ScopeProvider f66056f;

        /* renamed from: g */
        public final C16010a f66057g;

        @Override // co.bird.android.lib.shaketoreport.BugReportActivity.InterfaceC16007a
        /* renamed from: a */
        public void mo56106a(BugReportActivity bugReportActivity) {
            m56103d(bugReportActivity);
        }

        /* renamed from: b */
        public final M30 m56105b() {
            return new M30((InterfaceC47825r30) C51679xZ3.m5003d(this.f66051a.mo27503j2()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f66051a.mo27461w2()), m56104c(), this.f66056f, (C45254mj0) C51679xZ3.m5003d(this.f66051a.mo27553R0()), (Context) C51679xZ3.m5003d(this.f66051a.mo27552R1()));
        }

        /* renamed from: c */
        public final R30 m56104c() {
            return new R30(this.f66052b, this.f66053c, this.f66054d, this.f66055e);
        }

        /* renamed from: d */
        public final BugReportActivity m56103d(BugReportActivity bugReportActivity) {
            C5135Ly.m96068n(bugReportActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66051a.mo27461w2()));
            C5135Ly.m96066p(bugReportActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66051a.mo27595B1()));
            C5135Ly.m96071k(bugReportActivity, (Handler) C51679xZ3.m5003d(this.f66051a.mo27535X2()));
            C5135Ly.m96067o(bugReportActivity, (C22454gl) C51679xZ3.m5003d(this.f66051a.mo27479r()));
            C5135Ly.m96080b(bugReportActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66051a.mo27519d0()));
            C5135Ly.m96075g(bugReportActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66051a.mo27453z2()));
            C5135Ly.m96064r(bugReportActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66051a.mo27459x1()));
            C5135Ly.m96081a(bugReportActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66051a.mo27474s()));
            C5135Ly.m96073i(bugReportActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66051a.mo27558P0()));
            C5135Ly.m96074h(bugReportActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66051a.mo27598A0()));
            C5135Ly.m96077e(bugReportActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66051a.mo27507i0()));
            C5135Ly.m96070l(bugReportActivity, (FO2) C51679xZ3.m5003d(this.f66051a.mo27456y2()));
            C5135Ly.m96065q(bugReportActivity, (YR4) C51679xZ3.m5003d(this.f66051a.mo27525b0()));
            C5135Ly.m96079c(bugReportActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66051a.mo27460x()));
            C5135Ly.m96078d(bugReportActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66051a.mo27517d3()));
            C5135Ly.m96072j(bugReportActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66051a.mo27482q()));
            C5135Ly.m96076f(bugReportActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66051a.mo27483p3()));
            C46639p30.m20015b(bugReportActivity, m56105b());
            return bugReportActivity;
        }

        public C16010a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, EditText editText, Button button) {
            this.f66057g = this;
            this.f66051a = interfaceC44393lG2;
            this.f66052b = baseActivity;
            this.f66053c = imageView;
            this.f66054d = editText;
            this.f66055e = button;
            this.f66056f = scopeProvider;
        }
    }

    /* renamed from: co.bird.android.lib.shaketoreport.a$b */
    /* loaded from: classes3.dex */
    public static final class C16011b implements BugReportActivity.InterfaceC16007a.InterfaceC16008a {
        @Override // co.bird.android.lib.shaketoreport.BugReportActivity.InterfaceC16007a.InterfaceC16008a
        /* renamed from: a */
        public BugReportActivity.InterfaceC16007a mo56102a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, EditText editText, Button button) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(imageView);
            C51679xZ3.m5005b(editText);
            C51679xZ3.m5005b(button);
            return new C16010a(interfaceC44393lG2, baseActivity, scopeProvider, imageView, editText, button);
        }

        private C16011b() {
        }
    }

    private C16009a() {
    }

    /* renamed from: a */
    public static BugReportActivity.InterfaceC16007a.InterfaceC16008a m56107a() {
        return new C16011b();
    }
}
