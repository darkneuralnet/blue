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
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0003&\u0017 B\u0007¢\u0006\u0004\b#\u0010$J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0017J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u000b0\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LRD6;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "", "getTheme", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/Observable;", "N6", "LXD6;", "b", "LXD6;", "a5", "()LXD6;", "setPresenter", "(LXD6;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "dismissSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionCompleteBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompleteBottomSheetDialog.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/WorkOrderInspectionCompleteBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n64#2:133\n6#3:134\n1#4:135\n13#5,2:136\n15#5,2:140\n1109#6,2:138\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompleteBottomSheetDialog.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/WorkOrderInspectionCompleteBottomSheetDialog\n*L\n68#1:133\n77#1:134\n77#1:135\n77#1:136,2\n77#1:140,2\n77#1:138,2\n*E\n"})
/* renamed from: RD6 */
/* loaded from: classes3.dex */
public final class RD6 extends C17714b {

    /* renamed from: d */
    public static final C7093a f31748d = new C7093a(null);

    /* renamed from: b */
    public XD6 f31749b;

    /* renamed from: c */
    public final C24558d<Unit> f31750c;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, m28432d2 = {"LRD6$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "LRD6;", C17296a.f69688o, "", "SERVICE_CENTER_ROUTE", "Ljava/lang/String;", "TAG", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: RD6$a */
    /* loaded from: classes3.dex */
    public static final class C7093a {
        public /* synthetic */ C7093a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final RD6 m87023a(WireBird bird, WorkOrder workOrder, ServiceCenterRoute serviceCenterRoute) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            RD6 rd6 = new RD6();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            bundle.putParcelable("work_order", workOrder);
            C40749f70.m42020a(bundle, "service_center_route", serviceCenterRoute);
            rd6.setArguments(bundle);
            return rd6;
        }

        private C7093a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LRD6$b;", "", "LRD6;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC7096c.class})
    /* renamed from: RD6$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7094b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"LRD6$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LRD6;", "fragment", "Landroid/content/DialogInterface;", "dialog", "Lt31;", "binding", "LRD6$b;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: RD6$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC7095a {
            /* renamed from: a */
            InterfaceC7094b mo77017a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RD6 rd6, @BindsInstance DialogInterface dialogInterface, @BindsInstance C49011t31 c49011t31);
        }

        /* renamed from: a */
        void mo77016a(RD6 rd6);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"LRD6$c;", "", "LdE6;", "impl", "LcE6;", C17296a.f69688o, "LbE6;", "LXD6;", "b", "LVD6;", "LTD6;", "c", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: RD6$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7096c {
        @Binds
        /* renamed from: a */
        InterfaceC39025cE6 m87022a(C39636dE6 c39636dE6);

        @Binds
        /* renamed from: b */
        XD6 m87021b(C38432bE6 c38432bE6);

        @Binds
        /* renamed from: c */
        TD6 m87020c(VD6 vd6);
    }

    public RD6() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f31750c = m31902e;
    }

    /* renamed from: N6 */
    public final Observable<Unit> m87025N6() {
        Observable<Unit> hide = this.f31750c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dismissSubject.hide()");
        return hide;
    }

    /* renamed from: a5 */
    public final XD6 m87024a5() {
        XD6 xd6 = this.f31749b;
        if (xd6 != null) {
            return xd6;
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
        return C49011t31.m13191c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f31750c.onNext(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Enum] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        WireBird wireBird;
        WorkOrder workOrder;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        C49011t31 m13193a = C49011t31.m13193a(view);
        Intrinsics.checkNotNullExpressionValue(m13193a, "bind(view)");
        InterfaceC7094b.InterfaceC7095a m77018a = XR0.m77018a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m77018a.mo77017a(m21419a, baseActivity, m45195i, this, dialog, m13193a).mo77016a(this);
        Bundle arguments = getArguments();
        ServiceCenterRoute serviceCenterRoute = null;
        if (arguments != null) {
            wireBird = (WireBird) arguments.getParcelable("bird");
        } else {
            wireBird = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            workOrder = (WorkOrder) arguments2.getParcelable("work_order");
        } else {
            workOrder = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            String string = arguments3.getString("service_center_route");
            if (string != null) {
                try {
                    Object[] enumConstants = ServiceCenterRoute.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            serviceCenterRoute = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = ServiceCenterRoute.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        ?? r5 = (Enum) obj2;
                        if (Intrinsics.areEqual(r5.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            serviceCenterRoute = r5;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            serviceCenterRoute = serviceCenterRoute;
        }
        if (wireBird != null) {
            m87024a5().mo64773a(wireBird, workOrder, serviceCenterRoute);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
