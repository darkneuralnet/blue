package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC24507p;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\r0\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006 "}, m28432d2 = {"LX86;", "LcE;", "Lf96;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/p;", "", "a5", "e", "Lf96;", "N6", "()Lf96;", "t8", "(Lf96;)V", "presenter", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/c;", "containerOrderIdSubject", "<init>", "()V", "g", C17296a.f69688o, "b", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderScanBottomSheet.kt\nco/bird/android/vehiclescanner/transferorder/TransferOrderScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,87:1\n64#2:88\n*S KotlinDebug\n*F\n+ 1 TransferOrderScanBottomSheet.kt\nco/bird/android/vehiclescanner/transferorder/TransferOrderScanBottomSheet\n*L\n48#1:88\n*E\n"})
/* renamed from: X86 */
/* loaded from: classes4.dex */
public final class X86 extends AbstractC13474cE<C40775f96> {

    /* renamed from: g */
    public static final C9330a f42725g = new C9330a(null);

    /* renamed from: e */
    public C40775f96 f42726e;

    /* renamed from: f */
    public final C24556c<String> f42727f;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LX86$a;", "", "", "instructions", "LX86;", C17296a.f69688o, "INSTRUCTIONS", "Ljava/lang/String;", "TAG", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: X86$a */
    /* loaded from: classes4.dex */
    public static final class C9330a {
        public /* synthetic */ C9330a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final X86 m77287a(String instructions) {
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            X86 x86 = new X86();
            Bundle bundle = new Bundle();
            bundle.putString("instructions", instructions);
            x86.setArguments(bundle);
            return x86;
        }

        private C9330a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LX86$b;", "", "LX86;", "fragment", "", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: X86$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC9331b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JR\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0013"}, m28432d2 = {"LX86$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf00;", "binding", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/c;", "", "containerOrderIdSubject", "Ldm5;", "navigator", "LX86$b;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: X86$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC9332a {
            /* renamed from: a */
            InterfaceC9331b mo39479a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C40679f00 c40679f00, @BindsInstance DialogInterface dialogInterface, @BindsInstance C24556c<String> c24556c, @BindsInstance InterfaceC39953dm5 interfaceC39953dm5);
        }

        /* renamed from: a */
        void mo39478a(X86 x86);
    }

    public X86() {
        C24556c<String> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<String>()");
        this.f42727f = m31906k0;
    }

    @Override // p000.AbstractC13474cE
    /* renamed from: N6 */
    public C40775f96 getPresenter() {
        C40775f96 c40775f96 = this.f42726e;
        if (c40775f96 != null) {
            return c40775f96;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: a5 */
    public final AbstractC24507p<String> m77289a5() {
        AbstractC24507p<String> m32070E = this.f42727f.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "containerOrderIdSubject.hide()");
        return m32070E;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f42727f.onComplete();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        C40679f00 m42293a = C40679f00.m42293a(view);
        Intrinsics.checkNotNullExpressionValue(m42293a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC9331b.InterfaceC9332a m39480a = C41525gR0.m39480a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m39480a.mo39479a(m21419a, baseActivity, m45195i, m42293a, dialog, this.f42727f, this).mo39478a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("instructions");
        } else {
            str = null;
        }
        AbstractC23170iE.onCreate$default(getPresenter(), str, null, 2, null);
    }

    /* renamed from: t8 */
    public void setPresenter(C40775f96 c40775f96) {
        Intrinsics.checkNotNullParameter(c40775f96, "<set-?>");
        this.f42726e = c40775f96;
    }
}
