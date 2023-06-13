package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0003'\u0018\u001fB\u0007¢\u0006\u0004\b$\u0010%J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0017J.\u0010\u0015\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010 \u0014*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00130\u00130\u0012H\u0016J\u0016\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u0012H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR:\u0010!\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010 \u0014*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00130\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006("}, m28432d2 = {"LB13;", "Lcom/google/android/material/bottomsheet/b;", "LR13;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "", "getTheme", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "a5", "N6", "LD13;", "b", "LD13;", "getPresenter", "()LD13;", "setPresenter", "(LD13;)V", "presenter", "c", "Lio/reactivex/subjects/d;", "signalFilterSubject", DateTokenConverter.CONVERTER_KEY, "updateFrequencySubject", "<init>", "()V", "e", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsFilterDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsFilterDialog.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,105:1\n64#2:106\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsFilterDialog.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterDialog\n*L\n47#1:106\n*E\n"})
/* renamed from: B13 */
/* loaded from: classes2.dex */
public final class B13 extends C17714b implements R13 {

    /* renamed from: e */
    public static final C0372a f1537e = new C0372a(null);

    /* renamed from: f */
    public static final int f1538f = 8;

    /* renamed from: b */
    public D13 f1539b;

    /* renamed from: c */
    public final C24558d<Pair<Integer, Integer>> f1540c;

    /* renamed from: d */
    public final C24558d<Integer> f1541d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LB13$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B13$a */
    /* loaded from: classes2.dex */
    public static final class C0372a {
        public /* synthetic */ C0372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0372a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LB13$b;", "", "LB13;", "dialog", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC0375c.class})
    /* renamed from: B13$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0373b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JZ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u001a\b\u0001\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\nH&¨\u0006\u0011"}, m28432d2 = {"LB13$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ly31;", "binding", "Lio/reactivex/subjects/h;", "Lkotlin/Pair;", "", "signalFilterSubject", "updateFrequencySubject", "LB13$b;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: B13$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC0374a {
            /* renamed from: a */
            InterfaceC0373b mo17600a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C51975y31 c51975y31, @BindsInstance AbstractC24569h<Pair<Integer, Integer>> abstractC24569h, @BindsInstance AbstractC24569h<Integer> abstractC24569h2);
        }

        /* renamed from: a */
        void mo17599a(B13 b13);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"LB13$c;", "", "LP13;", "impl", "LM13;", C17296a.f69688o, "LK13;", "LD13;", "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: B13$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC0375c {
        @Binds
        /* renamed from: a */
        M13 m114789a(P13 p13);

        @Binds
        /* renamed from: b */
        D13 m114788b(K13 k13);
    }

    public B13() {
        C24558d<Pair<Integer, Integer>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Int, Int>>()");
        this.f1540c = m31902e;
        C24558d<Integer> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Int>()");
        this.f1541d = m31902e2;
    }

    @Override // p000.R13
    /* renamed from: N6 */
    public C24558d<Integer> updateFrequencyChanges() {
        return this.f1541d;
    }

    @Override // p000.R13
    /* renamed from: a5 */
    public C24558d<Pair<Integer, Integer>> signalFilterChanges() {
        return this.f1540c;
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
        ConstraintLayout root = C51975y31.m4217c(inflater, viewGroup, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, container, false).root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C51975y31 m4219a = C51975y31.m4219a(view);
        Intrinsics.checkNotNullExpressionValue(m4219a, "bind(view)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        InterfaceC0373b.InterfaceC0374a m17601a = C47410qM0.m17601a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        m17601a.mo17600a(m21419a, baseActivity, m45195i, m4219a, this.f1540c, this.f1541d).mo17599a(this);
    }
}
