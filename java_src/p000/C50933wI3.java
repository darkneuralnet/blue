package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC23442F;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002$\u0015B\u0007¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LwI3;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "N6", "LBI3;", "b", "LBI3;", "a5", "()LBI3;", "setPresenter", "(LBI3;)V", "presenter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/g;", "responseSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartSwapBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartSwapBottomSheet.kt\nco/bird/android/feature/repair/v3/issues/dialogs/partswap/PartSwapBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n64#2:96\n1#3:97\n*S KotlinDebug\n*F\n+ 1 PartSwapBottomSheet.kt\nco/bird/android/feature/repair/v3/issues/dialogs/partswap/PartSwapBottomSheet\n*L\n55#1:96\n*E\n"})
/* renamed from: wI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50933wI3 extends C17714b {

    /* renamed from: d */
    public static final C29856a f115770d = new C29856a(null);

    /* renamed from: b */
    public BI3 f115771b;

    /* renamed from: c */
    public final C24567g<DialogResponse> f115772c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LwI3$a;", "", "Lco/bird/android/model/wire/WirePart;", "part", "LwI3;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wI3$a */
    /* loaded from: classes3.dex */
    public static final class C29856a {
        public /* synthetic */ C29856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50933wI3 m7032a(WirePart part) {
            Intrinsics.checkNotNullParameter(part, "part");
            C50933wI3 c50933wI3 = new C50933wI3();
            Bundle bundle = new Bundle();
            bundle.putParcelable("part", part);
            c50933wI3.setArguments(bundle);
            return c50933wI3;
        }

        private C29856a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LwI3$b;", "", "LwI3;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: wI3$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC29857b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JH\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0011"}, m28432d2 = {"LwI3$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lb00;", "binding", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "LwI3$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: wI3$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC29858a {
            /* renamed from: a */
            InterfaceC29857b mo7030a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C38290b00 c38290b00, @BindsInstance DialogInterface dialogInterface, @BindsInstance C24567g<DialogResponse> c24567g);
        }

        /* renamed from: a */
        void mo7031a(C50933wI3 c50933wI3);
    }

    public C50933wI3() {
        C24567g<DialogResponse> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<DialogResponse>()");
        this.f115772c = m31882w0;
    }

    /* renamed from: N6 */
    public final AbstractC23442F<DialogResponse> m7034N6() {
        AbstractC23442F<DialogResponse> m33160F = this.f115772c.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "responseSubject.hide()");
        return m33160F;
    }

    /* renamed from: a5 */
    public final BI3 m7033a5() {
        BI3 bi3 = this.f115771b;
        if (bi3 != null) {
            return bi3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C38290b00.m65138c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f115772c.onSuccess(DialogResponse.DISMISS);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m7033a5().m114124e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        WirePart wirePart;
        Intrinsics.checkNotNullParameter(view, "view");
        C38290b00 m65140a = C38290b00.m65140a(view);
        Intrinsics.checkNotNullExpressionValue(m65140a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        BaseActivity baseActivity2 = baseActivity;
        if (baseActivity2 == null) {
            return;
        }
        InterfaceC29857b.InterfaceC29858a m14262a = C48604sN0.m14262a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity2.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m14262a.mo7030a(m21419a, baseActivity2, m45195i, m65140a, dialog, this.f115772c).mo7031a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (wirePart = (WirePart) arguments.getParcelable("part")) != null) {
            m7033a5().m114125d(wirePart);
        }
    }
}
