package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0003*\u0014\u001cB\u0007¢\u0006\u0004\b'\u0010(J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, m28432d2 = {"LmE6;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "a5", "LsE6;", "b", "LsE6;", "getUi", "()LsE6;", "setUi", "(LsE6;)V", "ui", "LoE6;", "c", "LoE6;", "N6", "()LoE6;", "setPresenter", "(LoE6;)V", "presenter", "Lio/reactivex/subjects/h;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/h;", "responseSubject", "<init>", "()V", "e", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionDisputeBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionDisputeBottomSheetDialog.kt\nco/bird/android/feature/workorders/inspection/dialog/dispute/WorkOrderInspectionDisputeBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n64#2:109\n1#3:110\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionDisputeBottomSheetDialog.kt\nco/bird/android/feature/workorders/inspection/dialog/dispute/WorkOrderInspectionDisputeBottomSheetDialog\n*L\n58#1:109\n*E\n"})
/* renamed from: mE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44972mE6 extends C17714b {

    /* renamed from: e */
    public static final C26018a f97697e = new C26018a(null);

    /* renamed from: b */
    public InterfaceC48529sE6 f97698b;

    /* renamed from: c */
    public InterfaceC46158oE6 f97699c;

    /* renamed from: d */
    public final AbstractC24569h<DialogResponse> f97700d;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LmE6$a;", "", "Lco/bird/android/model/Issue;", "issue", "LmE6;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mE6$a */
    /* loaded from: classes3.dex */
    public static final class C26018a {
        public /* synthetic */ C26018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C44972mE6 m25869a(Issue issue) {
            Intrinsics.checkNotNullParameter(issue, "issue");
            C44972mE6 c44972mE6 = new C44972mE6();
            Bundle bundle = new Bundle();
            bundle.putParcelable("issue", issue);
            c44972mE6.setArguments(bundle);
            return c44972mE6;
        }

        private C26018a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LmE6$b;", "", "LmE6;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC26021c.class})
    /* renamed from: mE6$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC26019b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JR\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0013"}, m28432d2 = {"LmE6$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LmE6;", "fragment", "Landroid/content/DialogInterface;", "dialog", "Lu31;", "binding", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "LmE6$b;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: mE6$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC26020a {
            /* renamed from: a */
            InterfaceC26019b mo25867a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C44972mE6 c44972mE6, @BindsInstance DialogInterface dialogInterface, @BindsInstance C49604u31 c49604u31, @BindsInstance AbstractC24569h<DialogResponse> abstractC24569h);
        }

        /* renamed from: a */
        void mo25868a(C44972mE6 c44972mE6);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"LmE6$c;", "", "LvE6;", "impl", "LsE6;", "b", "LrE6;", "LoE6;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: mE6$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC26021c {
        @Binds
        /* renamed from: a */
        InterfaceC46158oE6 m25866a(C47937rE6 c47937rE6);

        @Binds
        /* renamed from: b */
        InterfaceC48529sE6 m25865b(C50307vE6 c50307vE6);
    }

    public C44972mE6() {
        C24558d m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f97700d = m31902e;
    }

    /* renamed from: N6 */
    public final InterfaceC46158oE6 m25871N6() {
        InterfaceC46158oE6 interfaceC46158oE6 = this.f97699c;
        if (interfaceC46158oE6 != null) {
            return interfaceC46158oE6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final Observable<DialogResponse> m25870a5() {
        Observable<DialogResponse> hide = this.f97700d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "responseSubject.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C49604u31.m10933c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f97700d.onNext(DialogResponse.DISMISS);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Issue issue;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        C49604u31 m10935a = C49604u31.m10935a(view);
        Intrinsics.checkNotNullExpressionValue(m10935a, "bind(view)");
        InterfaceC26019b.InterfaceC26020a m71357a = C37959aS0.m71357a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m71357a.mo25867a(m21419a, baseActivity, m45195i, this, dialog, m10935a, this.f97700d).mo25868a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (issue = (Issue) arguments.getParcelable("issue")) != null) {
            m25871N6().mo16168a(issue);
        }
    }
}
