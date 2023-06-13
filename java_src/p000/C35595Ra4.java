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
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.WorkOrder;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC23442F;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0003%\u0016\u001fB\u0007¢\u0006\u0004\b\"\u0010#J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0017J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR.\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u001e*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LRa4;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "", "getTheme", "Lio/reactivex/F;", "", "Lco/bird/android/model/QCAutoCheck;", "N6", "LXa4;", "b", "LXa4;", "a5", "()LXa4;", "setPresenter", "(LXa4;)V", "presenter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "qcAutoChecksSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQCAutoChecksBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QCAutoChecksBottomSheetDialog.kt\nco/bird/android/qualitycontrol/autocheck/QCAutoChecksBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n64#2:118\n1#3:119\n*S KotlinDebug\n*F\n+ 1 QCAutoChecksBottomSheetDialog.kt\nco/bird/android/qualitycontrol/autocheck/QCAutoChecksBottomSheetDialog\n*L\n62#1:118\n*E\n"})
/* renamed from: Ra4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35595Ra4 extends C17714b {

    /* renamed from: d */
    public static final C7206a f32243d = new C7206a(null);

    /* renamed from: b */
    public InterfaceC36999Xa4 f32244b;

    /* renamed from: c */
    public final C24552a<List<QCAutoCheck>> f32245c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LRa4$a;", "", "Lco/bird/android/model/WorkOrder;", "workOrder", "LRa4;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ra4$a */
    /* loaded from: classes4.dex */
    public static final class C7206a {
        public /* synthetic */ C7206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C35595Ra4 m86607a(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            C35595Ra4 c35595Ra4 = new C35595Ra4();
            Bundle bundle = new Bundle();
            bundle.putParcelable("work_order", workOrder);
            c35595Ra4.setArguments(bundle);
            return c35595Ra4;
        }

        private C7206a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LRa4$b;", "", "LRa4;", "activity", "", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC7209c.class})
    /* renamed from: Ra4$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC7207b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JX\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH&¨\u0006\u0014"}, m28432d2 = {"LRa4$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LRa4;", "fragment", "LE31;", "binding", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/h;", "", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecksSubject", "LRa4$b;", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Ra4$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC7208a {
            /* renamed from: a */
            InterfaceC7207b mo17578a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C35595Ra4 c35595Ra4, @BindsInstance E31 e31, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24569h<List<QCAutoCheck>> abstractC24569h);
        }

        /* renamed from: a */
        void mo17577a(C35595Ra4 c35595Ra4);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"LRa4$c;", "", "Lib4;", "impl", "Lhb4;", C17296a.f69688o, "Lgb4;", "LXa4;", "b", "LVa4;", "LTa4;", "c", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Ra4$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC7209c {
        @Binds
        /* renamed from: a */
        InterfaceC42213hb4 m86606a(C42806ib4 c42806ib4);

        @Binds
        /* renamed from: b */
        InterfaceC36999Xa4 m86605b(C41620gb4 c41620gb4);

        @Binds
        /* renamed from: c */
        InterfaceC36063Ta4 m86604c(C36531Va4 c36531Va4);
    }

    public C35595Ra4() {
        C24552a<List<QCAutoCheck>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<QCAutoCheck>>()");
        this.f32245c = m31922e;
    }

    /* renamed from: N6 */
    public final AbstractC23442F<List<QCAutoCheck>> m86609N6() {
        AbstractC23442F<List<QCAutoCheck>> firstOrError = this.f32245c.hide().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "qcAutoChecksSubject.hide().firstOrError()");
        return firstOrError;
    }

    /* renamed from: a5 */
    public final InterfaceC36999Xa4 m86608a5() {
        InterfaceC36999Xa4 interfaceC36999Xa4 = this.f32244b;
        if (interfaceC36999Xa4 != null) {
            return interfaceC36999Xa4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32184Cl4.RoundedBottomSheet;
    }

    @Override // com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), C32184Cl4.RoundedBottomSheet);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return E31.m109469c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        WorkOrder workOrder;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        E31 m109471a = E31.m109471a(view);
        Intrinsics.checkNotNullExpressionValue(m109471a, "bind(view)");
        InterfaceC7207b.InterfaceC7208a m17579a = C47428qO0.m17579a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m17579a.mo17578a(m21419a, baseActivity, m45195i, this, m109471a, dialog, this.f32245c).mo17577a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (workOrder = (WorkOrder) arguments.getParcelable("work_order")) != null) {
            m86608a5().mo39108a(workOrder);
        }
    }
}
