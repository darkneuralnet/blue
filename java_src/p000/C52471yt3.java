package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\"\u0010\u0019\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00110\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, m28432d2 = {"Lyt3;", "LcE;", "LEt3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "N6", "e", "LEt3;", "a5", "()LEt3;", "t8", "(LEt3;)V", "presenter", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/g;", "resultSubject", "<init>", "()V", "g", C17296a.f69688o, "b", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSingleScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSingleScanBottomSheet.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n64#2:127\n1#3:128\n*S KotlinDebug\n*F\n+ 1 OperatorSingleScanBottomSheet.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanBottomSheet\n*L\n73#1:127\n*E\n"})
/* renamed from: yt3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52471yt3 extends AbstractC13474cE<C32723Et3> {

    /* renamed from: g */
    public static final C30765a f120367g = new C30765a(null);

    /* renamed from: e */
    public C32723Et3 f120368e;

    /* renamed from: f */
    public final C24567g<WireBird> f120369f;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, m28432d2 = {"Lyt3$a;", "", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "", "instruction", "instruction2", "", "showCodeInput", "requiredVehicleId", "Lyt3;", C17296a.f69688o, "REQUIRED_VEHICLE_ID", "Ljava/lang/String;", "SCAN_INSTRUCTIONS", "SCAN_INSTRUCTIONS_2", "SCAN_INTENTION", "SCAN_MODE", "SHOW_CODE_INPUT", "TAG", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorSingleScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSingleScanBottomSheet.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanBottomSheet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    /* renamed from: yt3$a */
    /* loaded from: classes4.dex */
    public static final class C30765a {
        public /* synthetic */ C30765a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C52471yt3 newInstance$default(C30765a c30765a, ScanMode scanMode, ScanIntention scanIntention, String str, String str2, boolean z, String str3, int i, Object obj) {
            return c30765a.m2328a(scanMode, scanIntention, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : str3);
        }

        /* renamed from: a */
        public final C52471yt3 m2328a(ScanMode mode, ScanIntention scanIntention, String str, String str2, boolean z, String str3) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            C52471yt3 c52471yt3 = new C52471yt3();
            Bundle bundle = new Bundle();
            bundle.putString("scan_mode", mode.name());
            if (scanIntention != null) {
                bundle.putParcelable("scan_intention", scanIntention);
            }
            bundle.putString("scan_instructions", str);
            bundle.putString("scan_instructions_2", str2);
            bundle.putBoolean("show_code_input", z);
            bundle.putString("required_vehicle_id", str3);
            c52471yt3.setArguments(bundle);
            return c52471yt3;
        }

        private C30765a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lyt3$b;", "", "Lyt3;", "activity", "", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: yt3$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC30766b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JR\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0013"}, m28432d2 = {"Lyt3$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/wire/WireBird;", "resultSubject", "Lf00;", "binding", "Landroid/content/DialogInterface;", "dialog", "Ldm5;", "navigator", "Lyt3$b;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: yt3$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC30767a {
            /* renamed from: a */
            InterfaceC30766b mo2326a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C24567g<WireBird> c24567g, @BindsInstance C40679f00 c40679f00, @BindsInstance DialogInterface dialogInterface, @BindsInstance InterfaceC39953dm5 interfaceC39953dm5);
        }

        /* renamed from: a */
        void mo2327a(C52471yt3 c52471yt3);
    }

    public C52471yt3() {
        C24567g<WireBird> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<WireBird>()");
        this.f120369f = m31882w0;
    }

    /* renamed from: N6 */
    public final AbstractC23442F<WireBird> m2331N6() {
        AbstractC23442F<WireBird> m33160F = this.f120369f.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "resultSubject.hide()");
        return m33160F;
    }

    @Override // p000.AbstractC13474cE
    /* renamed from: a5 */
    public C32723Et3 getPresenter() {
        C32723Et3 c32723Et3 = this.f120368e;
        if (c32723Et3 != null) {
            return c32723Et3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        super.onActivityResult(i, i2, intent);
        if (i == 10000 && i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null) {
            getPresenter().m108261L(wireBird);
        }
    }

    @Override // p000.AbstractC13474cE, p000.AbstractC45245mi1, androidx.fragment.app.Fragment
    public void onResume() {
        String string;
        ScanMode valueOf;
        ScanIntention scanIntention;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("scan_mode")) != null && (valueOf = ScanMode.valueOf(string)) != null) {
            Bundle arguments2 = getArguments();
            String str = null;
            if (arguments2 != null) {
                scanIntention = (ScanIntention) arguments2.getParcelable("scan_intention");
            } else {
                scanIntention = null;
            }
            Bundle arguments3 = getArguments();
            boolean z = true;
            if (arguments3 != null) {
                z = arguments3.getBoolean("show_code_input", true);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                str = arguments4.getString("required_vehicle_id");
            }
            getPresenter().m108260M(valueOf, scanIntention, z, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        String str2 = null;
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
        InterfaceC30766b.InterfaceC30767a m73244a = ZM0.m73244a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C24567g<WireBird> c24567g = this.f120369f;
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m73244a.mo2326a(m21419a, baseActivity, m45195i, c24567g, m42293a, dialog, this).mo2327a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("scan_instructions");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("scan_instructions_2");
        }
        getPresenter().mo34311f(str, str2);
    }

    /* renamed from: t8 */
    public void setPresenter(C32723Et3 c32723Et3) {
        Intrinsics.checkNotNullParameter(c32723Et3, "<set-?>");
        this.f120368e = c32723Et3;
    }
}
