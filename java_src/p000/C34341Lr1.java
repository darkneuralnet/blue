package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.fleetstatus.common.FleetActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u0012B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LLr1;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "", "hidden", "onHiddenChanged", "LTr1;", "b", "LTr1;", "a5", "()LTr1;", "setPresenter", "(LTr1;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetsOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewFragment.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,89:1\n64#2:90\n6#3:91\n1#4:92\n13#5,2:93\n15#5,2:97\n1109#6,2:95\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewFragment.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewFragment\n*L\n52#1:90\n54#1:91\n54#1:92\n54#1:93,2\n54#1:97,2\n54#1:95,2\n*E\n"})
/* renamed from: Lr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34341Lr1 extends Fragment {

    /* renamed from: c */
    public static final C5097a f22118c = new C5097a(null);

    /* renamed from: b */
    public C36213Tr1 f22119b;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LLr1$a;", "", "Lmp1;", "purpose", "LLr1;", C17296a.f69688o, "", "FLEET_OVERVIEW_PURPOSE", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Lr1$a */
    /* loaded from: classes3.dex */
    public static final class C5097a {
        public /* synthetic */ C5097a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C34341Lr1 m96297a(EnumC45315mp1 purpose) {
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            C34341Lr1 c34341Lr1 = new C34341Lr1();
            Bundle bundle = new Bundle();
            C40749f70.m42020a(bundle, "fleet_overview_purpose", purpose);
            c34341Lr1.setArguments(bundle);
            return c34341Lr1;
        }

        private C5097a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LLr1$b;", "", "LLr1;", "activity", "", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, FleetActivity.InterfaceC14793a.class})
    /* renamed from: Lr1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5098b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"LLr1$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", "fleetActivityComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lhy1;", "binding", "Lmp1;", "purpose", "LLr1$b;", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Lr1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC5099a {
            /* renamed from: a */
            InterfaceC5098b mo3683a(InterfaceC44393lG2 interfaceC44393lG2, FleetActivity.InterfaceC14793a interfaceC14793a, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C42440hy1 c42440hy1, @BindsInstance EnumC45315mp1 enumC45315mp1);
        }

        /* renamed from: a */
        void mo3682a(C34341Lr1 c34341Lr1);
    }

    /* renamed from: a5 */
    public final C36213Tr1 m96298a5() {
        C36213Tr1 c36213Tr1 = this.f22119b;
        if (c36213Tr1 != null) {
            return c36213Tr1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C42440hy1.m35440c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            m96298a5().m82358k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m96298a5().m82362g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        FleetActivity fleetActivity;
        EnumC45315mp1 enumC45315mp1;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        C42440hy1 m35442a = C42440hy1.m35442a(view);
        Intrinsics.checkNotNullExpressionValue(m35442a, "bind(view)");
        FragmentActivity activity = getActivity();
        Enum r5 = null;
        if (activity instanceof FleetActivity) {
            fleetActivity = (FleetActivity) activity;
        } else {
            fleetActivity = null;
        }
        if (fleetActivity == null) {
            return;
        }
        InterfaceC5098b.InterfaceC5099a m3684a = C52125yJ0.m3684a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = fleetActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        FleetActivity.InterfaceC14793a m58225j0 = fleetActivity.m58225j0();
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("fleet_overview_purpose");
            if (string != null) {
                try {
                    Object[] enumConstants = EnumC45315mp1.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r5 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = EnumC45315mp1.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        Enum r12 = (Enum) obj2;
                        if (Intrinsics.areEqual(r12.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            r5 = r12;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            EnumC45315mp1 enumC45315mp12 = (EnumC45315mp1) r5;
            if (enumC45315mp12 != null) {
                enumC45315mp1 = enumC45315mp12;
                m3684a.mo3683a(m21419a, m58225j0, fleetActivity, m45195i, m35442a, enumC45315mp1).mo3682a(this);
            }
        }
        enumC45315mp1 = EnumC45315mp1.FLEET_STATUS;
        m3684a.mo3683a(m21419a, m58225j0, fleetActivity, m45195i, m35442a, enumC45315mp1).mo3682a(this);
    }
}
