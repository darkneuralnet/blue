package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.IssueType;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0003#\u0014\u001dB\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00110\u00110\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LNF6;", "Lni;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onStart", "Landroid/app/Dialog;", "onCreateDialog", "Lio/reactivex/Observable;", "", "a5", "LQF6;", "b", "LQF6;", "N6", "()LQF6;", "setPresenter", "(LQF6;)V", "presenter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "clickSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderIssuesUncheckConfirmationDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationDialogFragment.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationDialogFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,120:1\n64#2:121\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationDialogFragment.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationDialogFragment\n*L\n58#1:121\n*E\n"})
/* renamed from: NF6 */
/* loaded from: classes3.dex */
public final class NF6 extends C26572ni {

    /* renamed from: d */
    public static final C5529a f24352d = new C5529a(null);

    /* renamed from: b */
    public QF6 f24353b;

    /* renamed from: c */
    public C24552a<Boolean> f24354c;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LNF6$a;", "", "", "Lco/bird/android/model/IssueType;", "issues", "LNF6;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderIssuesUncheckConfirmationDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationDialogFragment.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationDialogFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    /* renamed from: NF6$a */
    /* loaded from: classes3.dex */
    public static final class C5529a {
        public /* synthetic */ C5529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NF6 m94126a(List<IssueType> issues) {
            Intrinsics.checkNotNullParameter(issues, "issues");
            NF6 nf6 = new NF6();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("issues", C44691lm0.m26849a(issues));
            nf6.setArguments(bundle);
            return nf6;
        }

        private C5529a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LNF6$b;", "", "LNF6;", "appCompatDialogFragment", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC5532c.class})
    /* renamed from: NF6$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5530b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"LNF6$b$a;", "", "LlG2;", "mainComponent", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lni;", "appCompatDialogFragment", "LHy1;", "binding", "LNF6$b;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: NF6$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC5531a {
            /* renamed from: a */
            InterfaceC5530b mo44256a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C26572ni c26572ni, @BindsInstance C33468Hy1 c33468Hy1);
        }

        /* renamed from: a */
        void mo44255a(NF6 nf6);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"LNF6$c;", "", "LYF6;", "impl", "LXF6;", C17296a.f69688o, "LVF6;", "LQF6;", "c", "LLF6;", "LJF6;", "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: NF6$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5532c {
        @Binds
        /* renamed from: a */
        XF6 m94125a(YF6 yf6);

        @Binds
        /* renamed from: b */
        JF6 m94124b(LF6 lf6);

        @Binds
        /* renamed from: c */
        QF6 m94123c(VF6 vf6);
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"NF6$d", "Landroid/app/Dialog;", "", "onBackPressed", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF6$d */
    /* loaded from: classes3.dex */
    public static final class DialogC5533d extends Dialog {
        public DialogC5533d(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            NF6.this.m94128N6().mo80140a(NF6.this.f24354c);
        }
    }

    public NF6() {
        C24552a<Boolean> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Boolean>()");
        this.f24354c = m31922e;
    }

    /* renamed from: N6 */
    public final QF6 m94128N6() {
        QF6 qf6 = this.f24353b;
        if (qf6 != null) {
            return qf6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final Observable<Boolean> m94127a5() {
        Observable<Boolean> hide = this.f24354c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "clickSubject.hide()");
        return hide;
    }

    @Override // p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        return new DialogC5533d(context, getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C33468Hy1.m103149c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        Display display;
        int i;
        Window window;
        Activity ownerActivity;
        Resources resources;
        Activity ownerActivity2;
        Resources resources2;
        Window window2;
        WindowManager windowManager;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null && (windowManager = window2.getWindowManager()) != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        int i2 = point.x;
        Dialog dialog2 = getDialog();
        int i3 = 0;
        if (dialog2 != null && (ownerActivity2 = dialog2.getOwnerActivity()) != null && (resources2 = ownerActivity2.getResources()) != null) {
            i = resources2.getDimensionPixelSize(C37044Xf4.work_order_issues_uncheck_dialog_padding_horizontal) * 2;
        } else {
            i = 0;
        }
        int i4 = i2 - i;
        int i5 = point.y;
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (ownerActivity = dialog3.getOwnerActivity()) != null && (resources = ownerActivity.getResources()) != null) {
            i3 = resources.getDimensionPixelSize(C37044Xf4.work_order_issues_uncheck_dialog_padding_vertical) * 2;
        }
        int i6 = i5 - i3;
        Dialog dialog4 = getDialog();
        if (dialog4 != null && (window = dialog4.getWindow()) != null) {
            window.setLayout(i4, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        List<IssueType> list = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        C33468Hy1 m103151a = C33468Hy1.m103151a(view);
        Intrinsics.checkNotNullExpressionValue(m103151a, "bind(view)");
        Bundle arguments = getArguments();
        if (arguments != null) {
            list = arguments.getParcelableArrayList("issues");
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        InterfaceC5530b.InterfaceC5531a m44257a = C39756dS0.m44257a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        m44257a.mo44256a(m21419a, m45195i, this, m103151a).mo44255a(this);
        m94128N6().mo80139b(list, this.f24354c);
    }
}
