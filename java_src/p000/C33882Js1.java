package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC34116Ks1;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010+\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\f0\f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, m28432d2 = {"LJs1;", "Landroidx/fragment/app/c;", "LOs1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "LPs1;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/Observable;", "", "G8", "Lio/reactivex/h;", "T0", "Lio/reactivex/F;", "a5", "LNs1;", "b", "LNs1;", "N6", "()LNs1;", "setPresenter", "(LNs1;)V", "presenter", "LF31;", "c", "LF31;", "binding", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/g;", "dismissSubject", "<init>", "()V", "e", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetQuickCaptureReadyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetQuickCaptureReadyFragment.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,86:1\n1#2:87\n64#3:88\n*S KotlinDebug\n*F\n+ 1 FlightSheetQuickCaptureReadyFragment.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyFragment\n*L\n70#1:88\n*E\n"})
/* renamed from: Js1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33882Js1 extends DialogInterface$OnCancelListenerC11663c implements InterfaceC35052Os1 {

    /* renamed from: e */
    public static final C4271a f18366e = new C4271a(null);

    /* renamed from: b */
    public C34818Ns1 f18367b;

    /* renamed from: c */
    public F31 f18368c;

    /* renamed from: d */
    public final C24567g<Unit> f18369d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJs1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Js1$a */
    /* loaded from: classes3.dex */
    public static final class C4271a {
        public /* synthetic */ C4271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4271a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Js1$b */
    /* loaded from: classes3.dex */
    public static final class C4272b extends Lambda implements Function1<View, Unit> {
        public C4272b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Dialog dialog = C33882Js1.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public C33882Js1() {
        C24567g<Unit> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<Unit>()");
        this.f18369d = m31882w0;
    }

    @Override // p000.InterfaceC35052Os1
    /* renamed from: G8 */
    public Observable<Boolean> mo91273G8() {
        F31 f31 = this.f18368c;
        if (f31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f31 = null;
        }
        SwitchCompat switchCompat = f31.f8510e;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.dontShowAgainSwitch");
        return C34228Le5.m96513a(switchCompat);
    }

    /* renamed from: N6 */
    public final C34818Ns1 m99618N6() {
        C34818Ns1 c34818Ns1 = this.f18367b;
        if (c34818Ns1 != null) {
            return c34818Ns1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final AbstractC23442F<Unit> m99617a5() {
        AbstractC23442F<Unit> m33160F = this.f18369d.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "dismissSubject.hide()");
        return m33160F;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        F31 it = F31.m108058c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f18368c = it;
        ConstraintLayout root = it.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…inding = it }\n      .root");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f18369d.onSuccess(Unit.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC34116Ks1.InterfaceC4606a m100715a = JJ0.m100715a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        m100715a.mo98215a(c46172oG2.m21419a(application)).mo98216a(this);
        F31 f31 = this.f18368c;
        if (f31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f31 = null;
        }
        Button button = f31.f8507b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        C34585Ms2.m94661j(button, new C4272b());
        m99618N6().consume(this);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(C35286Ps1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        F31 f31 = this.f18368c;
        if (f31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f31 = null;
        }
        f31.f8510e.setChecked(state.m89668b());
    }
}
