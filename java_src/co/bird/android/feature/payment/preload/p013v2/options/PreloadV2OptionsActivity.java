package co.bird.android.feature.payment.preload.p013v2.options;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.UnderlineSpan;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.payment.preload.p013v2.options.PreloadV2OptionsActivity;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.api.response.ReloadOption;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.H31;
@Metadata(m28433d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002yzB\u0007¢\u0006\u0004\bw\u0010xJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002JG\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J6\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u00180\tH\u0002J&\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\fH\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0012\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0014J\"\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0014J\b\u0010.\u001a\u00020\u0004H\u0014J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000403H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020503H\u0016J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080703H\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020(H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\f03H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\f03H\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0703H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000403H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000403H\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\u0012\u0010D\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u000108H\u0016R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010i\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u000105050e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR.\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000208 f*\n\u0012\u0004\u0012\u000208\u0018\u000107070e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010hR\"\u0010m\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010\u00040\u00040e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010hR\"\u0010o\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010\f0\f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010hR\"\u0010q\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010\f0\f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010hR\u0016\u0010s\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010HR\u0016\u0010v\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006{"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LK14;", "LMN3;", "", "k0", "U", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "options", "", "includePayPerRidePlan", "includeAutoReloadSection", "autoReloadMandatory", "optionIdSelected", "m0", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V", "disclaimers", "X", "", "", "metadata", "Lkotlin/Pair;", "", "lineItems", "Y", "LZg3;", "onPaymentMethodSelectedListener", "", "Lco/bird/android/model/constant/PaymentMethod;", "excludePaymentMethods", "autoReloadToggled", "i0", "token", "R", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "LL14;", TransferTable.COLUMN_STATE, "j0", "onBackPressed", "Lio/reactivex/Observable;", "J0", "LG10;", "m1", "Lco/bird/android/buava/Optional;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "G1", "stringId", "u5", "x8", "m6", "LS04;", "E1", AbstractC26684u0.f100690q, "O0", "S", "paymentMethodNonce", "i", "LY04;", "j", "LY04;", "Z", "()LY04;", "setConverter", "(LY04;)V", "converter", "LJ14;", "k", "LJ14;", "d0", "()LJ14;", "setPresenter", "(LJ14;)V", "presenter", "La14;", "l", "La14;", "b0", "()La14;", "setPaymentIntentDelegate", "(La14;)V", "paymentIntentDelegate", "LU2;", "m", "LU2;", "binding", "LW04;", "n", "LW04;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "o", "Lma4;", "braintreeFragmentRelay", "p", "braintreePaymentNonce", "q", "continueSubject", "r", "includePayPerRidePlanRelay", "s", "includeAutoReloadSectionRelay", "t", "isLoading", "U7", "()Ljava/lang/Boolean;", "autoReloadToggleEnabled", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2OptionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsActivity.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n44#2:360\n1#3:361\n199#4:362\n1855#5,2:363\n1855#5,2:365\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsActivity.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity\n*L\n75#1:360\n239#1:362\n270#1:363,2\n309#1:365,2\n*E\n"})
/* renamed from: co.bird.android.feature.payment.preload.v2.options.PreloadV2OptionsActivity */
/* loaded from: classes3.dex */
public final class PreloadV2OptionsActivity extends BaseActivityLite implements K14, MN3 {

    /* renamed from: j */
    public Y04 f64435j;

    /* renamed from: k */
    public J14 f64436k;

    /* renamed from: l */
    public InterfaceC37711a14 f64437l;

    /* renamed from: m */
    public C8176U2 f64438m;

    /* renamed from: n */
    public final W04 f64439n = new W04();

    /* renamed from: o */
    public final C45168ma4<G10> f64440o;

    /* renamed from: p */
    public final C45168ma4<Optional<PaymentMethodNonce>> f64441p;

    /* renamed from: q */
    public final C45168ma4<Unit> f64442q;

    /* renamed from: r */
    public final C45168ma4<Boolean> f64443r;

    /* renamed from: s */
    public final C45168ma4<Boolean> f64444s;

    /* renamed from: t */
    public boolean f64445t;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a;", "", "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15101b.class})
    /* renamed from: co.bird.android.feature.payment.preload.v2.options.PreloadV2OptionsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15099a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LU2;", "binding", "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.payment.preload.v2.options.PreloadV2OptionsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15100a {
            /* renamed from: a */
            InterfaceC15099a mo57711a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance PreloadV2OptionsActivity preloadV2OptionsActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C8176U2 c8176u2);
        }

        /* renamed from: a */
        void mo57710a(PreloadV2OptionsActivity preloadV2OptionsActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$b;", "", "Lm14;", "impl", "La14;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.payment.preload.v2.options.PreloadV2OptionsActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15101b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC37711a14 m57715a(C44844m14 c44844m14);
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, m28432d2 = {"co/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c", "LTx0;", "", "", "", "metadata", "Lio/reactivex/p;", "", "b", "", "success", "c", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.payment.preload.v2.options.PreloadV2OptionsActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15102c implements InterfaceC36266Tx0 {
        public C15102c() {
        }

        @Override // p000.InterfaceC36266Tx0
        /* renamed from: b */
        public AbstractC24507p<Unit> mo57714b(Map<String, ? extends Object> metadata) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return PreloadV2OptionsActivity.this.m57728d0().mo57714b(metadata);
        }

        @Override // p000.InterfaceC36266Tx0
        /* renamed from: c */
        public void mo57713c(boolean z) {
            PreloadV2OptionsActivity.this.m57728d0().mo57713c(z);
        }
    }

    public PreloadV2OptionsActivity() {
        C45168ma4<G10> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<BraintreeFragment>()");
        this.f64440o = m25409g;
        C45168ma4<Optional<PaymentMethodNonce>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Optional<PaymentMethodNonce>>()");
        this.f64441p = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f64442q = m25409g3;
        C45168ma4<Boolean> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Boolean>()");
        this.f64443r = m25409g4;
        C45168ma4<Boolean> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<Boolean>()");
        this.f64444s = m25409g5;
    }

    /* renamed from: f0 */
    public static final void m57727f0(PreloadV2OptionsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f64442q.accept(Unit.INSTANCE);
    }

    /* renamed from: h0 */
    public static final void m57726h0(PreloadV2OptionsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f64442q.accept(Unit.INSTANCE);
    }

    @Override // p000.K14
    /* renamed from: E1 */
    public Observable<Optional<S04>> mo57742E1() {
        return this.f64439n.m78961w();
    }

    @Override // p000.K14
    /* renamed from: G1 */
    public Observable<Optional<PaymentMethodNonce>> mo57741G1() {
        Observable<Optional<PaymentMethodNonce>> hide = this.f64441p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "braintreePaymentNonce.hide()");
        return hide;
    }

    @Override // p000.K14
    /* renamed from: J0 */
    public Observable<Unit> mo57740J0() {
        return this.f64439n.m78963J0();
    }

    @Override // p000.K14
    /* renamed from: O0 */
    public Observable<Unit> mo57739O0() {
        C8176U2 c8176u2 = this.f64438m;
        if (c8176u2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u2 = null;
        }
        TextView textView = c8176u2.f36740g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.paymentTerms");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    /* renamed from: R */
    public final void m57736R(String str) {
        try {
            C45168ma4<G10> c45168ma4 = this.f64440o;
            G10 m105957sa = G10.m105957sa(this, str);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.braintreepayments.api.interfaces.BraintreeListener");
            m105957sa.m105971I9(this);
            c45168ma4.accept(m105957sa);
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
        }
    }

    /* renamed from: S */
    public void m57735S() {
        C33458Hx0 c33458Hx0;
        Fragment m67322m0 = getSupportFragmentManager().m67322m0("ConfirmPurchaseBottomSheetDialog");
        if (m67322m0 instanceof C33458Hx0) {
            c33458Hx0 = (C33458Hx0) m67322m0;
        } else {
            c33458Hx0 = null;
        }
        if (c33458Hx0 != null) {
            c33458Hx0.dismiss();
        }
    }

    /* renamed from: U */
    public final void m57734U() {
        Object m33135e = H31.C3014a.birdDialog$default(m58990F(), C1219Cs.f4819d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    @Override // p000.K14
    /* renamed from: U7 */
    public Boolean mo57733U7() {
        if (this.f64439n.getItemCount() == 0) {
            return null;
        }
        return this.f64439n.m78962v();
    }

    /* renamed from: X */
    public final void m57732X(List<String> list) {
        String string = getString(C45871nl4.subject_to_bird_payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.subject_to_bird_payment_terms)");
        C8176U2 c8176u2 = null;
        if (list.isEmpty()) {
            C8176U2 c8176u22 = this.f64438m;
            if (c8176u22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c8176u2 = c8176u22;
            }
            c8176u2.f36740g.setText(C45097mS5.m25592n(string, string, new UnderlineSpan()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        for (String str : list) {
            sb.append("\n");
            sb.append(str);
        }
        C8176U2 c8176u23 = this.f64438m;
        if (c8176u23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8176u2 = c8176u23;
        }
        TextView textView = c8176u2.f36740g;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        textView.setText(C45097mS5.m25592n(sb2, string, new UnderlineSpan()));
    }

    /* renamed from: Y */
    public final void m57731Y(Map<String, ? extends Object> map, List<Pair<String, Long>> list) {
        C33458Hx0.f14202g.m103202a(map, new C15102c(), list).show(getSupportFragmentManager(), "ConfirmPurchaseBottomSheetDialog");
    }

    /* renamed from: Z */
    public final Y04 m57730Z() {
        Y04 y04 = this.f64435j;
        if (y04 != null) {
            return y04;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: b0 */
    public final InterfaceC37711a14 m57729b0() {
        InterfaceC37711a14 interfaceC37711a14 = this.f64437l;
        if (interfaceC37711a14 != null) {
            return interfaceC37711a14;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentIntentDelegate");
        return null;
    }

    /* renamed from: d0 */
    public final J14 m57728d0() {
        J14 j14 = this.f64436k;
        if (j14 != null) {
            return j14;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        this.f64441p.accept(Optional.f63040c.m59033b(paymentMethodNonce));
    }

    /* renamed from: i0 */
    public final void m57724i0(InterfaceC37520Zg3 interfaceC37520Zg3, Set<? extends PaymentMethod> set, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            for (PaymentMethod paymentMethod : set) {
                String string = getString(C45871nl4.auto_reload_not_supported);
                Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.auto_reload_not_supported)");
                linkedHashMap.put(paymentMethod, string);
            }
        }
        C48163rd4.f107339e.m15686a(interfaceC37520Zg3, linkedHashMap).show(getSupportFragmentManager(), "QuickPaymentBottomSheetDialog");
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: j0 */
    public void render(L14 state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        C8176U2 c8176u2 = null;
        if (state instanceof C42462i04) {
            C42462i04 c42462i04 = (C42462i04) state;
            m57721m0(c42462i04.m35401c(), c42462i04.m35397g(), c42462i04.m35399e(), c42462i04.m35400d(), c42462i04.m35402b(), c42462i04.m35398f());
            C8176U2 c8176u22 = this.f64438m;
            if (c8176u22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c8176u2 = c8176u22;
            }
            Button button = c8176u2.f36735b;
            if (Intrinsics.areEqual(c42462i04.m35402b(), Boolean.TRUE) && c42462i04.m35400d()) {
                i = C45871nl4.continue_and_agree_to_auto_reload_titlecased;
            } else {
                i = C45871nl4.general_continue;
            }
            button.setText(getString(i));
        } else if (state instanceof U84) {
            U84 u84 = (U84) state;
            m57731Y(u84.m81918c(), u84.m81919b());
        } else if (state instanceof V84) {
            Throwable m80320b = ((V84) state).m80320b();
            if (m80320b != null) {
                m58990F().error(m80320b);
            }
            m57735S();
        } else if (state instanceof C42853ig1) {
            m58990F().error(((C42853ig1) state).m33603b());
        } else if (state instanceof C47597qg1) {
            m58990F().error(((C47597qg1) state).m17254b());
        } else if (state instanceof C51153wg1) {
            m58990F().error(((C51153wg1) state).m6505b());
        } else if (state instanceof C33658It2) {
            C33658It2 c33658It2 = (C33658It2) state;
            this.f64445t = c33658It2.m101566b();
            C8176U2 c8176u23 = this.f64438m;
            if (c8176u23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c8176u23 = null;
            }
            Group group = c8176u23.f36739f;
            Intrinsics.checkNotNullExpressionValue(group, "binding.loadingViews");
            C49520tu6.show$default(group, c33658It2.m101566b(), 0, 2, null);
        } else if (state instanceof C52080yE0) {
            m57736R(((C52080yE0) state).m3801b());
        } else if (state instanceof S84) {
            S84 s84 = (S84) state;
            m57724i0(s84.m85904d(), s84.m85905c(), s84.m85906b());
        } else if (state instanceof V41) {
            m57734U();
        }
    }

    /* renamed from: k0 */
    public final void m57722k0() {
        String string = getString(C45871nl4.subject_to_bird_payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.subject_to_bird_payment_terms)");
        C8176U2 c8176u2 = this.f64438m;
        if (c8176u2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u2 = null;
        }
        c8176u2.f36740g.setText(C45097mS5.m25592n(string, string, new UnderlineSpan()));
    }

    /* renamed from: m0 */
    public final void m57721m0(String str, List<ReloadOption> list, boolean z, boolean z2, Boolean bool, String str2) {
        Pair<List<C3023H6>, List<String>> m75864a = m57730Z().m75864a(str, list, z, z2, bool, str2);
        this.f64439n.mo24871u(m75864a.component1());
        m57732X(m75864a.component2());
    }

    @Override // p000.K14
    /* renamed from: m1 */
    public Observable<G10> mo57720m1() {
        Observable<G10> hide = this.f64440o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "braintreeFragmentRelay.hide()");
        return hide;
    }

    @Override // p000.K14
    /* renamed from: m6 */
    public Observable<Boolean> mo57719m6() {
        Observable<Boolean> hide = this.f64443r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "includePayPerRidePlanRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        m57729b0().onActivityResult(i, i2, intent);
        if (i != 10030) {
            if (i != 10063) {
                if (i != 10069) {
                    render(new C33658It2(false));
                    super.onActivityResult(i, i2, intent);
                } else if (i2 == -1) {
                    new Handler().postDelayed(new Runnable() { // from class: U04
                        @Override // java.lang.Runnable
                        public final void run() {
                            PreloadV2OptionsActivity.m57726h0(PreloadV2OptionsActivity.this);
                        }
                    }, 500L);
                } else {
                    render(new C33658It2(false));
                }
            } else if (i2 == -1) {
                new Handler().postDelayed(new Runnable() { // from class: T04
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreloadV2OptionsActivity.m57727f0(PreloadV2OptionsActivity.this);
                    }
                }, 500L);
            } else {
                render(new C33658It2(false));
            }
        } else if (i2 == -1) {
            m57728d0().m101346R(i2, intent);
        } else {
            render(new C33658It2(false));
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f64445t) {
            super.onBackPressed();
            m57728d0().m101340X();
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58977D();
        C8176U2 m82055c = C8176U2.m82055c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m82055c, "inflate(layoutInflater)");
        this.f64438m = m82055c;
        C8176U2 c8176u2 = null;
        if (m82055c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m82055c = null;
        }
        setContentView(m82055c.getRoot());
        InterfaceC15099a.InterfaceC15100a m57712a = C15103a.m57712a();
        InterfaceC44393lG2 m58989H = m58989H();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C8176U2 c8176u22 = this.f64438m;
        if (c8176u22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u22 = null;
        }
        m57712a.mo57711a(m58989H, this, m45197b, c8176u22).mo57710a(this);
        C8176U2 c8176u23 = this.f64438m;
        if (c8176u23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u23 = null;
        }
        c8176u23.f36735b.setText(getString(C45871nl4.general_continue));
        C8176U2 c8176u24 = this.f64438m;
        if (c8176u24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u24 = null;
        }
        c8176u24.f36741h.setAdapter(this.f64439n);
        C8176U2 c8176u25 = this.f64438m;
        if (c8176u25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c8176u2 = c8176u25;
        }
        c8176u2.f36741h.addItemDecoration(new Z04());
        m57722k0();
        J14 m57728d0 = m57728d0();
        String stringExtra = getIntent().getStringExtra("co.bird.android.context");
        if (stringExtra == null) {
            stringExtra = "unknown";
        }
        m57728d0.m101332f0(stringExtra);
        m57728d0().consume(this);
        this.f64443r.accept(Boolean.valueOf(getIntent().getBooleanExtra("include_pay_per_ride_option", false)));
        this.f64444s.accept(Boolean.valueOf(getIntent().getBooleanExtra("include_auto_reload_section", true)));
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        render(new C33658It2(false));
    }

    @Override // p000.K14
    /* renamed from: u0 */
    public Observable<Unit> mo57718u0() {
        C8176U2 c8176u2 = this.f64438m;
        if (c8176u2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c8176u2 = null;
        }
        Button button = c8176u2.f36735b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.action");
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(button, 0L, 1, null), this.f64442q);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(binding.action.cli…ottle(), continueSubject)");
        return merge;
    }

    @Override // p000.K14
    /* renamed from: u5 */
    public String mo57717u5(int i) {
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(stringId)");
        return string;
    }

    @Override // p000.K14
    /* renamed from: x8 */
    public Observable<Boolean> mo57716x8() {
        Observable<Boolean> hide = this.f64444s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "includeAutoReloadSectionRelay.hide()");
        return hide;
    }
}
