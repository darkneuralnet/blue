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
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002\u0006\u0017B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0017R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, m28432d2 = {"Lrd4;", "Lcom/google/android/material/bottomsheet/b;", "LZg3;", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "", C17296a.f69688o, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "onResume", "", "getTheme", "Lwd4;", "b", "Lwd4;", "a5", "()Lwd4;", "setPresenter", "(Lwd4;)V", "presenter", "c", "LZg3;", "onPaymentMethodSelectedListener", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "paymentMethodExclusions", "<init>", "()V", "e", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickPaymentBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,103:1\n64#2:104\n*S KotlinDebug\n*F\n+ 1 QuickPaymentBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentBottomSheetDialog\n*L\n66#1:104\n*E\n"})
/* renamed from: rd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48163rd4 extends C17714b implements InterfaceC37520Zg3 {

    /* renamed from: e */
    public static final C27955a f107339e = new C27955a(null);

    /* renamed from: b */
    public C51126wd4 f107340b;

    /* renamed from: c */
    public InterfaceC37520Zg3 f107341c;

    /* renamed from: d */
    public final Map<PaymentMethod, String> f107342d = new LinkedHashMap();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lrd4$a;", "", "LZg3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lco/bird/android/model/constant/PaymentMethod;", "", "excludePaymentMethods", "Lrd4;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rd4$a */
    /* loaded from: classes3.dex */
    public static final class C27955a {
        public /* synthetic */ C27955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C48163rd4 newInstance$default(C27955a c27955a, InterfaceC37520Zg3 interfaceC37520Zg3, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            return c27955a.m15686a(interfaceC37520Zg3, map);
        }

        /* renamed from: a */
        public final C48163rd4 m15686a(InterfaceC37520Zg3 listener, Map<PaymentMethod, String> excludePaymentMethods) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(excludePaymentMethods, "excludePaymentMethods");
            C48163rd4 c48163rd4 = new C48163rd4();
            c48163rd4.f107341c = listener;
            c48163rd4.f107342d.clear();
            c48163rd4.f107342d.putAll(excludePaymentMethods);
            return c48163rd4;
        }

        private C27955a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lrd4$b;", "", "Lrd4;", "dialog", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: rd4$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC27956b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lrd4$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/base/BaseCoreActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lc00;", "binding", "LZg3;", "onPaymentMethodSelectedListener", "Lrd4$b;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: rd4$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC27957a {
            /* renamed from: a */
            InterfaceC27956b mo1437a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseCoreActivity baseCoreActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C38883c00 c38883c00, @BindsInstance InterfaceC37520Zg3 interfaceC37520Zg3);
        }

        /* renamed from: a */
        void mo1436a(C48163rd4 c48163rd4);
    }

    @Override // p000.InterfaceC37520Zg3
    /* renamed from: a */
    public void mo15688a(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        InterfaceC37520Zg3 interfaceC37520Zg3 = this.f107341c;
        if (interfaceC37520Zg3 != null) {
            interfaceC37520Zg3.mo15688a(paymentMethod);
        }
        dismiss();
    }

    /* renamed from: a5 */
    public final C51126wd4 m15687a5() {
        C51126wd4 c51126wd4 = this.f107340b;
        if (c51126wd4 != null) {
            return c51126wd4;
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
        return C38883c00.m62048c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m15687a5().m6583d(this.f107342d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseCoreActivity baseCoreActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C38883c00 m62050a = C38883c00.m62050a(view);
        Intrinsics.checkNotNullExpressionValue(m62050a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseCoreActivity) {
            baseCoreActivity = (BaseCoreActivity) activity;
        } else {
            baseCoreActivity = null;
        }
        BaseCoreActivity baseCoreActivity2 = baseCoreActivity;
        if (baseCoreActivity2 == null) {
            return;
        }
        InterfaceC27956b.InterfaceC27957a m1438a = C52763zO0.m1438a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireContext().applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        m1438a.mo1437a(m21419a, baseCoreActivity2, m45195i, m62050a, this).mo1436a(this);
    }
}
