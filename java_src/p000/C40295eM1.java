package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScanMode;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"LeM1;", "LcE;", "LvM1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onResume", "e", "LvM1;", "a5", "()LvM1;", "N6", "(LvM1;)V", "presenter", "<init>", "()V", "f", C17296a.f69688o, "b", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHibernationScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanBottomSheet.kt\nco/bird/android/feature/hibernationscan/HibernationScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,71:1\n64#2:72\n*S KotlinDebug\n*F\n+ 1 HibernationScanBottomSheet.kt\nco/bird/android/feature/hibernationscan/HibernationScanBottomSheet\n*L\n38#1:72\n*E\n"})
/* renamed from: eM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40295eM1 extends AbstractC13474cE<C50374vM1> {

    /* renamed from: f */
    public static final C20008a f78255f = new C20008a(null);

    /* renamed from: e */
    public C50374vM1 f78256e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LeM1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: eM1$a */
    /* loaded from: classes3.dex */
    public static final class C20008a {
        public /* synthetic */ C20008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20008a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LeM1$b;", "", "LeM1;", "bottomSheet", "", C17296a.f69688o, "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: eM1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC20009b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"LeM1$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf00;", "binding", "Landroid/content/DialogInterface;", "dialog", "Ldm5;", "scannerNavigator", "LeM1$b;", C17296a.f69688o, "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: eM1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC20010a {
            /* renamed from: a */
            InterfaceC20009b mo43004a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C40679f00 c40679f00, @BindsInstance DialogInterface dialogInterface, @BindsInstance InterfaceC39953dm5 interfaceC39953dm5);
        }

        /* renamed from: a */
        void mo43005a(C40295eM1 c40295eM1);
    }

    /* renamed from: N6 */
    public void setPresenter(C50374vM1 c50374vM1) {
        Intrinsics.checkNotNullParameter(c50374vM1, "<set-?>");
        this.f78256e = c50374vM1;
    }

    @Override // p000.AbstractC13474cE
    /* renamed from: a5 */
    public C50374vM1 getPresenter() {
        C50374vM1 c50374vM1 = this.f78256e;
        if (c50374vM1 != null) {
            return c50374vM1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.AbstractC13474cE, p000.AbstractC45245mi1, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getPresenter().m8863V(ScanMode.ADMIN, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
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
        C40679f00 m42293a = C40679f00.m42293a(view);
        Intrinsics.checkNotNullExpressionValue(m42293a, "bind(view)");
        InterfaceC20009b.InterfaceC20010a m112342a = CK0.m112342a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m112342a.mo43004a(m21419a, baseActivity, m45195i, m42293a, dialog, this).mo43005a(this);
        AbstractC23170iE.onCreate$default(getPresenter(), null, null, 2, null);
    }
}
