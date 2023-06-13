package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0017J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00150\u00150\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LCh3;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/content/DialogInterface;", "dialog", "", "onDismiss", "", "getTheme", "view", "onViewCreated", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "N6", "LSZ;", "b", "LSZ;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "response", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "one-flow-onboarding_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneFlowOnboardingBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFlowOnboardingBottomSheet.kt\nco/bird/android/feature/oneflowonboarding/bottomsheet/OneFlowOnboardingBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,70:1\n64#2:71\n180#3:72\n*S KotlinDebug\n*F\n+ 1 OneFlowOnboardingBottomSheet.kt\nco/bird/android/feature/oneflowonboarding/bottomsheet/OneFlowOnboardingBottomSheet\n*L\n61#1:71\n61#1:72\n*E\n"})
/* renamed from: Ch3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32147Ch3 extends AbstractC38056ac5 {

    /* renamed from: d */
    public static final C1129a f4487d = new C1129a(null);

    /* renamed from: e */
    public static C32147Ch3 f4488e;

    /* renamed from: b */
    public C7475SZ f4489b;

    /* renamed from: c */
    public final C24558d<DialogResponse> f4490c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LCh3$a;", "", "LCh3;", C17296a.f69688o, "()LCh3;", "INSTANCE", "", "TAG", "Ljava/lang/String;", "instance", "LCh3;", "<init>", "()V", "one-flow-onboarding_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneFlowOnboardingBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFlowOnboardingBottomSheet.kt\nco/bird/android/feature/oneflowonboarding/bottomsheet/OneFlowOnboardingBottomSheet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
    /* renamed from: Ch3$a */
    /* loaded from: classes3.dex */
    public static final class C1129a {
        public /* synthetic */ C1129a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32147Ch3 m111871a() {
            boolean z;
            C32147Ch3 c32147Ch3 = C32147Ch3.f4488e;
            if (c32147Ch3 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c32147Ch3 = null;
            }
            if (c32147Ch3 == null) {
                C32147Ch3 c32147Ch32 = new C32147Ch3();
                C32147Ch3.f4488e = c32147Ch32;
                return c32147Ch32;
            }
            return c32147Ch3;
        }

        private C1129a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ch3$b */
    /* loaded from: classes3.dex */
    public static final class C1130b extends Lambda implements Function1<Unit, Unit> {
        public C1130b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32147Ch3.this.f4490c.onNext(DialogResponse.OK);
            C32147Ch3.this.dismiss();
        }
    }

    public C32147Ch3() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f4490c = m31902e;
    }

    public static final void onViewCreated$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N6 */
    public final AbstractC23442F<DialogResponse> m111873N6() {
        AbstractC23442F<DialogResponse> firstOrError = this.f4490c.hide().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "response.hide().firstOrError()");
        return firstOrError;
    }

    @Override // p000.AbstractC38056ac5, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32418Dl4.OneFlowOnboardingBottomSheet;
    }

    @Override // p000.AbstractC38056ac5, com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), C32418Dl4.OneFlowOnboardingBottomSheet);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C7475SZ.m85290c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f4490c.onNext(DialogResponse.DISMISS);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        C7475SZ m85292a = C7475SZ.m85292a(view);
        Intrinsics.checkNotNullExpressionValue(m85292a, "bind(view)");
        this.f4489b = m85292a;
        if (m85292a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m85292a = null;
        }
        Button button = m85292a.f33883c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Object m33094as = clicksThrottle$default.m33094as(AutoDispose.m45239a(m45195i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1130b c1130b = new C1130b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Bh3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32147Ch3.onViewCreated$lambda$0(Function1.this, obj);
            }
        });
    }
}
