package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u0013\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0017R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lan0;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "onResume", "", "getTheme", "LNo0;", "b", "LNo0;", "a5", "()LNo0;", "setPresenter", "(LNo0;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandBottomSheetDialog.kt\nco/bird/android/command/bottomsheet/CommandBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,142:1\n64#2:143\n*S KotlinDebug\n*F\n+ 1 CommandBottomSheetDialog.kt\nco/bird/android/command/bottomsheet/CommandBottomSheetDialog\n*L\n75#1:143\n*E\n"})
/* renamed from: an0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38161an0 extends C17714b {

    /* renamed from: c */
    public static final C10859c f51230c = new C10859c(null);

    /* renamed from: b */
    public InterfaceC34781No0 f51231b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lan0$a;", "", "Lan0;", "dialog", "", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC10858b.class})
    /* renamed from: an0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC10856a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lan0$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LKZ;", "binding", "Lan0$a;", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: an0$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC10857a {
            /* renamed from: a */
            InterfaceC10856a mo70746a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C4490KZ c4490kz);
        }

        /* renamed from: a */
        void mo70747a(C38161an0 c38161an0);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lan0$b;", "", "Lmp0;", "impl", "Llp0;", DateTokenConverter.CONVERTER_KEY, "LQo0;", "LNo0;", "b", "LAo0;", "Luo0;", C17296a.f69688o, "LLo0;", "LJo0;", "c", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: an0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC10858b {
        @Binds
        /* renamed from: a */
        InterfaceC50047uo0 m70745a(C31739Ao0 c31739Ao0);

        @Binds
        /* renamed from: b */
        InterfaceC34781No0 m70744b(C35483Qo0 c35483Qo0);

        @Binds
        /* renamed from: c */
        InterfaceC33845Jo0 m70743c(C34313Lo0 c34313Lo0);

        @Binds
        /* renamed from: d */
        InterfaceC44721lp0 m70742d(C45314mp0 c45314mp0);
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lan0$c;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "showLockCommand", "showAlarmCommand", "showWakeCommand", "Lan0;", C17296a.f69688o, "", "SHOW_ALARM", "Ljava/lang/String;", "SHOW_LOCK", "SHOW_WAKE", "TAG", "<init>", "()V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: an0$c */
    /* loaded from: classes2.dex */
    public static final class C10859c {
        public /* synthetic */ C10859c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C38161an0 newInstance$default(C10859c c10859c, WireBird wireBird, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            return c10859c.m70741a(wireBird, z, z2, z3);
        }

        /* renamed from: a */
        public final C38161an0 m70741a(WireBird bird, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C38161an0 c38161an0 = new C38161an0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("bird", bird);
            bundle.putBoolean("show_lock", z);
            bundle.putBoolean("show_alarm", z2);
            bundle.putBoolean("show_wake", z3);
            c38161an0.setArguments(bundle);
            return c38161an0;
        }

        private C10859c() {
        }
    }

    /* renamed from: a5 */
    public final InterfaceC34781No0 m70748a5() {
        InterfaceC34781No0 interfaceC34781No0 = this.f51231b;
        if (interfaceC34781No0 != null) {
            return interfaceC34781No0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32184Cl4.RoundedBottomSheet;
    }

    @Override // com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    @SuppressLint({"ResourceType"})
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C4490KZ.m98757c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m70748a5().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        boolean z;
        boolean z2;
        WireBird wireBird;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C4490KZ m98759a = C4490KZ.m98759a(view);
        Intrinsics.checkNotNullExpressionValue(m98759a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC10856a.InterfaceC10857a m90525a = PH0.m90525a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context!!.applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        m90525a.mo70746a(m21419a, baseActivity, m45195i, m98759a).mo70747a(this);
        Bundle arguments = getArguments();
        boolean z3 = true;
        if (arguments != null) {
            z = arguments.getBoolean("show_lock");
        } else {
            z = true;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("show_alarm");
        } else {
            z2 = true;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z3 = arguments3.getBoolean("show_wake");
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (wireBird = (WireBird) arguments4.getParcelable("bird")) != null) {
            m70748a5().mo87910e(z, z2, z3);
            m70748a5().mo9731u1(wireBird.getId());
        }
    }
}
