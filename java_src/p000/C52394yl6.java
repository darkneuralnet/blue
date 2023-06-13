package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u000f\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lyl6;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "LAl6;", "b", "LAl6;", "a5", "()LAl6;", "setPresenter", "(LAl6;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInfoFragment.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n64#2:107\n1#3:108\n*S KotlinDebug\n*F\n+ 1 VehicleInfoFragment.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoFragment\n*L\n55#1:107\n*E\n"})
/* renamed from: yl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52394yl6 extends Fragment {

    /* renamed from: c */
    public static final C30693a f120141c = new C30693a(null);

    /* renamed from: b */
    public InterfaceC31718Al6 f120142b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lyl6$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "Lyl6;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yl6$a */
    /* loaded from: classes3.dex */
    public static final class C30693a {
        public /* synthetic */ C30693a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C52394yl6 m2641a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C52394yl6 c52394yl6 = new C52394yl6();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            c52394yl6.setArguments(bundle);
            return c52394yl6;
        }

        private C30693a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lyl6$b;", "", "Lyl6;", "fragment", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC30696c.class})
    /* renamed from: yl6$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC30694b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lyl6$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lyl6$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: yl6$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC30695a {
            /* renamed from: a */
            InterfaceC30694b mo2639a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RecyclerView recyclerView);
        }

        /* renamed from: a */
        void mo2640a(C52394yl6 c52394yl6);
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0013"}, m28432d2 = {"Lyl6$c;", "", "LKl6;", "impl", "LJl6;", "e", "LHl6;", "LAl6;", DateTokenConverter.CONVERTER_KEY, "Lxl6;", "Lvl6;", "c", "LAo0;", "Luo0;", C17296a.f69688o, "Llp0;", "b", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: yl6$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC30696c {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC50047uo0 m2638a(C31739Ao0 c31739Ao0);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC44721lp0 m2637b(C34058Kl6 c34058Kl6);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC50615vl6 m2636c(C51801xl6 c51801xl6);

        @Binds
        /* renamed from: d */
        public abstract InterfaceC31718Al6 m2635d(C33356Hl6 c33356Hl6);

        @Binds
        /* renamed from: e */
        public abstract InterfaceC33824Jl6 m2634e(C34058Kl6 c34058Kl6);
    }

    /* renamed from: a5 */
    public final InterfaceC31718Al6 m2642a5() {
        InterfaceC31718Al6 interfaceC31718Al6 = this.f120142b;
        if (interfaceC31718Al6 != null) {
            return interfaceC31718Al6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C32634Ej4.fragment_repair_v2_vehicle_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m2642a5().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        WireBird wireBird;
        String id;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC30694b.InterfaceC30695a m8675a = C50418vR0.m8675a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "baseActivity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C35658Rh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerView)");
        m8675a.mo2639a(m21419a, baseActivity, m45195i, (RecyclerView) findViewById).mo2640a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wireBird = (WireBird) arguments.getParcelable("bird")) != null && (id = wireBird.getId()) != null) {
            m2642a5().mo9731u1(id);
        }
    }
}
