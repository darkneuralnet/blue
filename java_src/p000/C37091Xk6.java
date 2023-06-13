package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001f\u0011\u0019B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"LXk6;", "Landroidx/fragment/app/Fragment;", "Lut4;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "refresh", "Lal6;", "b", "Lal6;", "a5", "()Lal6;", "setPresenter", "(Lal6;)V", "presenter", "Lkn0;", "c", "Lkn0;", "commandCenterComponent", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsFragment.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n64#2:119\n1#3:120\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsFragment.kt\nco/bird/android/feature/commandcenter/vehicledetails/VehicleDetailsFragment\n*L\n62#1:119\n*E\n"})
/* renamed from: Xk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37091Xk6 extends Fragment implements InterfaceC50101ut4 {

    /* renamed from: d */
    public static final C9483a f43789d = new C9483a(null);

    /* renamed from: b */
    public InterfaceC38147al6 f43790b;

    /* renamed from: c */
    public InterfaceC44108kn0 f43791c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"LXk6$a;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "LXk6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xk6$a */
    /* loaded from: classes3.dex */
    public static final class C9483a {
        public /* synthetic */ C9483a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37091Xk6 m76473a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C37091Xk6 c37091Xk6 = new C37091Xk6();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            c37091Xk6.setArguments(bundle);
            return c37091Xk6;
        }

        private C9483a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LXk6$b;", "", "LXk6;", "activity", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC44108kn0.class}, modules = {InterfaceC9486c.class})
    /* renamed from: Xk6$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9484b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"LXk6$b$a;", "", "LlG2;", "mainComponent", "Lkn0;", "commandCenterComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDy1;", "binding", "LXk6$b;", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Xk6$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC9485a {
            /* renamed from: a */
            InterfaceC9484b mo14213a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C32532Dy1 c32532Dy1);
        }

        /* renamed from: a */
        void mo14212a(C37091Xk6 c37091Xk6);
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0011"}, m28432d2 = {"LXk6$c;", "", "Lql6;", "impl", "Lpl6;", "e", "Lml6;", "Lal6;", DateTokenConverter.CONVERTER_KEY, "LVk6;", "LTk6;", "c", "LAo0;", "Luo0;", C17296a.f69688o, "Llp0;", "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Xk6$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9486c {
        @Binds
        /* renamed from: a */
        InterfaceC50047uo0 m76472a(C31739Ao0 c31739Ao0);

        @Binds
        /* renamed from: b */
        InterfaceC44721lp0 m76471b(C47652ql6 c47652ql6);

        @Binds
        /* renamed from: c */
        InterfaceC36155Tk6 m76470c(C36623Vk6 c36623Vk6);

        @Binds
        /* renamed from: d */
        InterfaceC38147al6 m76469d(C45280ml6 c45280ml6);

        @Binds
        /* renamed from: e */
        InterfaceC47059pl6 m76468e(C47652ql6 c47652ql6);
    }

    /* renamed from: a5 */
    public final InterfaceC38147al6 m76474a5() {
        InterfaceC38147al6 interfaceC38147al6 = this.f43790b;
        if (interfaceC38147al6 != null) {
            return interfaceC38147al6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C32532Dy1.m109572d(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m76474a5().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        InterfaceC44108kn0 interfaceC44108kn0;
        WireBird wireBird;
        String id;
        Intrinsics.checkNotNullParameter(view, "view");
        C32532Dy1 m109575a = C32532Dy1.m109575a(view);
        Intrinsics.checkNotNullExpressionValue(m109575a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        C50037un0 c50037un0 = C50037un0.f112910a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        this.f43791c = c50037un0.m9778a(application);
        InterfaceC9484b.InterfaceC9485a m14214a = C48640sR0.m14214a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC44108kn0 interfaceC44108kn02 = this.f43791c;
        if (interfaceC44108kn02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commandCenterComponent");
            interfaceC44108kn0 = null;
        } else {
            interfaceC44108kn0 = interfaceC44108kn02;
        }
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        m14214a.mo14213a(m21419a, interfaceC44108kn0, baseActivity, m45195i, m109575a).mo14212a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wireBird = (WireBird) arguments.getParcelable("bird")) != null && (id = wireBird.getId()) != null) {
            m76474a5().mo9731u1(id);
        }
    }

    @Override // p000.InterfaceC50101ut4
    public void refresh() {
        m76474a5().refresh();
    }
}
