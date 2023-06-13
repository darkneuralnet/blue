package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u000fB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lzq1;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "LYq1;", "b", "LYq1;", "a5", "()LYq1;", "setPresenter", "(LYq1;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusFragment.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,91:1\n64#2:92\n*S KotlinDebug\n*F\n+ 1 FleetStatusFragment.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusFragment\n*L\n53#1:92\n*E\n"})
/* renamed from: zq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53032zq1 extends Fragment {

    /* renamed from: c */
    public static final C31517a f122302c = new C31517a(null);

    /* renamed from: b */
    public C37374Yq1 f122303b;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lzq1$a;", "", "", "fleetId", "fleetName", "Lzq1;", C17296a.f69688o, "FLEET_NAME", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zq1$a */
    /* loaded from: classes3.dex */
    public static final class C31517a {
        public /* synthetic */ C31517a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C53032zq1 m393a(String fleetId, String str) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            C53032zq1 c53032zq1 = new C53032zq1();
            Bundle bundle = new Bundle();
            bundle.putString("fleet_id", fleetId);
            bundle.putString("fleet_name", str);
            c53032zq1.setArguments(bundle);
            return c53032zq1;
        }

        private C31517a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lzq1$b;", "", "Lzq1;", "fragment", "", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: zq1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC31518b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lzq1$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "Lfy1;", "binding", "Lzq1$b;", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: zq1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC31519a {
            /* renamed from: a */
            InterfaceC31518b mo391a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f, @BindsInstance C41254fy1 c41254fy1);
        }

        /* renamed from: a */
        void mo392a(C53032zq1 c53032zq1);
    }

    /* renamed from: a5 */
    public final C37374Yq1 m394a5() {
        C37374Yq1 c37374Yq1 = this.f122303b;
        if (c37374Yq1 != null) {
            return c37374Yq1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C41254fy1.m40400c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String string;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("fleet_id")) != null) {
            m394a5().m74169E(string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        C41254fy1 m40402a = C41254fy1.m40402a(view);
        Intrinsics.checkNotNullExpressionValue(m40402a, "bind(view)");
        FragmentActivity activity = getActivity();
        String str = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC31518b.InterfaceC31519a m14453a = C48568sJ0.m14453a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        AbstractC11719f lifecycle = baseActivity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "activity.lifecycle");
        m14453a.mo391a(m21419a, baseActivity, m45195i, supportFragmentManager, lifecycle, m40402a).mo392a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("fleet_name");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("fleet_id")) != null) {
            m394a5().m74136u(string, str);
        }
    }
}
