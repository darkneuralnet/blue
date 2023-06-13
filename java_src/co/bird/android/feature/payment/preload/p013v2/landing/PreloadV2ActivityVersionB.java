package co.bird.android.feature.payment.preload.p013v2.landing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2ActivityVersionB;
import co.bird.android.feature.payment.views.SupportedPaymentBrandsView;
import co.bird.android.model.constant.PaymentMethod;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bG\u0010HJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016J#\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016J\u0012\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000eH\u0002J\u001e\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0014H\u0002R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010\t0\t098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R.\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f :*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LQ04;", "LMN3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "LG10;", "m1", "Lco/bird/android/buava/Optional;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "G1", "", "g8", "", "preAuthAmount", "Ljava/util/Currency;", "currency", "", "J2", "(Ljava/lang/Long;Ljava/util/Currency;)Ljava/lang/String;", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lz04;", TransferTable.COLUMN_STATE, "h0", "d0", "paymentMethodNonce", "i", "payPerRideSelected", "b0", "LZg3;", "onPaymentMethodSelectedListener", "", "Lco/bird/android/model/constant/PaymentMethod;", "excludePaymentMethods", "f0", "token", "U", "LP04;", "j", "LP04;", "X", "()LP04;", "setPresenter", "(LP04;)V", "presenter", "LQ4;", "k", "LQ4;", "binding", "Lma4;", "kotlin.jvm.PlatformType", "l", "Lma4;", "braintreeFragmentRelay", "m", "braintreePaymentNonce", "La94;", "n", "La94;", "payPerRideSelectedRelay", "o", "Z", "isLoading", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2ActivityVersionB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2ActivityVersionB.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1#2:206\n1855#3,2:207\n*S KotlinDebug\n*F\n+ 1 PreloadV2ActivityVersionB.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB\n*L\n180#1:207,2\n*E\n"})
/* renamed from: co.bird.android.feature.payment.preload.v2.landing.PreloadV2ActivityVersionB */
/* loaded from: classes3.dex */
public final class PreloadV2ActivityVersionB extends BaseActivityLite implements Q04, MN3 {

    /* renamed from: j */
    public P04 f64426j;

    /* renamed from: k */
    public C6669Q4 f64427k;

    /* renamed from: l */
    public final C45168ma4<G10> f64428l;

    /* renamed from: m */
    public final C45168ma4<Optional<PaymentMethodNonce>> f64429m;

    /* renamed from: n */
    public final C37791a94<Boolean> f64430n;

    /* renamed from: o */
    public boolean f64431o;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.payment.preload.v2.landing.PreloadV2ActivityVersionB$a */
    /* loaded from: classes3.dex */
    public static final class C15096a extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C15096a f64432g = new C15096a();

        public C15096a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            return invoke2((Pair<Unit, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.payment.preload.v2.landing.PreloadV2ActivityVersionB$b */
    /* loaded from: classes3.dex */
    public static final class C15097b extends Lambda implements Function1<View, Unit> {
        public C15097b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            PreloadV2ActivityVersionB.this.f64430n.accept(Boolean.FALSE);
            PreloadV2ActivityVersionB preloadV2ActivityVersionB = PreloadV2ActivityVersionB.this;
            preloadV2ActivityVersionB.m57748b0(((Boolean) preloadV2ActivityVersionB.f64430n.getValue()).booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.payment.preload.v2.landing.PreloadV2ActivityVersionB$c */
    /* loaded from: classes3.dex */
    public static final class C15098c extends Lambda implements Function1<View, Unit> {
        public C15098c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            PreloadV2ActivityVersionB.this.f64430n.accept(Boolean.TRUE);
            PreloadV2ActivityVersionB preloadV2ActivityVersionB = PreloadV2ActivityVersionB.this;
            preloadV2ActivityVersionB.m57748b0(((Boolean) preloadV2ActivityVersionB.f64430n.getValue()).booleanValue());
        }
    }

    public PreloadV2ActivityVersionB() {
        C45168ma4<G10> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<BraintreeFragment>()");
        this.f64428l = m25409g;
        C45168ma4<Optional<PaymentMethodNonce>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Optional<PaymentMethodNonce>>()");
        this.f64429m = m25409g2;
        this.f64430n = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
    }

    /* renamed from: S */
    public static final Boolean m57753S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m57750Y(PreloadV2ActivityVersionB this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57751X().m91112B();
    }

    /* renamed from: Z */
    public static final void m57749Z(PreloadV2ActivityVersionB this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57751X().m91092V();
    }

    @Override // p000.Q04
    /* renamed from: G1 */
    public Observable<Optional<PaymentMethodNonce>> mo57758G1() {
        Observable<Optional<PaymentMethodNonce>> hide = this.f64429m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "braintreePaymentNonce.hide()");
        return hide;
    }

    @Override // p000.Q04
    /* renamed from: J2 */
    public String mo57757J2(Long l, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (l != null) {
            return getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(l.longValue(), currency, EnumC36501Ux1.SHOW_IF_NON_ZERO));
        }
        return null;
    }

    /* renamed from: U */
    public final void m57752U(String str) {
        try {
            C45168ma4<G10> c45168ma4 = this.f64428l;
            G10 m105957sa = G10.m105957sa(this, str);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.braintreepayments.api.interfaces.BraintreeListener");
            m105957sa.m105971I9(this);
            c45168ma4.accept(m105957sa);
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
        }
    }

    /* renamed from: X */
    public final P04 m57751X() {
        P04 p04 = this.f64426j;
        if (p04 != null) {
            return p04;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: b0 */
    public final void m57748b0(boolean z) {
        C6669Q4 c6669q4 = this.f64427k;
        C6669Q4 c6669q42 = null;
        if (c6669q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6669q4 = null;
        }
        ImageView imageView = c6669q4.f29767i.f12201e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.preloadOption.selectedIndicator");
        C49520tu6.m11232s(imageView, !z, 4);
        C6669Q4 c6669q43 = this.f64427k;
        if (c6669q43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6669q43 = null;
        }
        c6669q43.f29767i.f12198b.setSelected(!z);
        C6669Q4 c6669q44 = this.f64427k;
        if (c6669q44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6669q44 = null;
        }
        ImageView imageView2 = c6669q44.f29765g.f13683d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.payPerRideOption.selectedIndicator");
        C49520tu6.m11232s(imageView2, z, 4);
        C6669Q4 c6669q45 = this.f64427k;
        if (c6669q45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c6669q42 = c6669q45;
        }
        c6669q42.f29765g.f13681b.setSelected(z);
    }

    /* renamed from: d0 */
    public Observable<Boolean> m57747d0() {
        Observable<Boolean> hide = this.f64430n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "payPerRideSelectedRelay.hide()");
        return hide;
    }

    /* renamed from: f0 */
    public final void m57746f0(InterfaceC37520Zg3 interfaceC37520Zg3, Set<? extends PaymentMethod> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PaymentMethod paymentMethod : set) {
            String string = getString(C45871nl4.pay_after_ride_not_supported);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.pay_after_ride_not_supported)");
            linkedHashMap.put(paymentMethod, string);
        }
        C48163rd4.f107339e.m15686a(interfaceC37520Zg3, linkedHashMap).show(getSupportFragmentManager(), "QuickPaymentBottomSheetDialog");
    }

    @Override // p000.Q04
    /* renamed from: g8 */
    public Observable<Boolean> mo57745g8() {
        C6669Q4 c6669q4 = this.f64427k;
        if (c6669q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6669q4 = null;
        }
        Button button = c6669q4.f29760b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        Observable m31950a = C24527f.m31950a(C44626lf5.clicksThrottle$default(button, 0L, 1, null), m57747d0());
        final C15096a c15096a = C15096a.f64432g;
        Observable<Boolean> map = m31950a.map(new InterfaceC23492o() { // from class: o04
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m57753S;
                m57753S = PreloadV2ActivityVersionB.m57753S(Function1.this, obj);
                return m57753S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.continueButton.c…       payPerRide\n      }");
        return map;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: h0 */
    public void render(InterfaceC52541z04 state) {
        Unit unit;
        List<String> emptyList;
        List<String> emptyList2;
        Intrinsics.checkNotNullParameter(state, "state");
        C6669Q4 c6669q4 = null;
        if (state instanceof C32681Eo6) {
            C6669Q4 c6669q42 = this.f64427k;
            if (c6669q42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q42 = null;
            }
            C32681Eo6 c32681Eo6 = (C32681Eo6) state;
            c6669q42.f29770l.setText(c32681Eo6.m108346b());
            String m108341g = c32681Eo6.m108341g();
            if (m108341g != null) {
                C6669Q4 c6669q43 = this.f64427k;
                if (c6669q43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6669q43 = null;
                }
                TextView textView = c6669q43.f29767i.f12200d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.preloadOption.promoText");
                C49520tu6.m11233r(textView);
                C6669Q4 c6669q44 = this.f64427k;
                if (c6669q44 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6669q44 = null;
                }
                c6669q44.f29767i.f12200d.setText(m108341g);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C6669Q4 c6669q45 = this.f64427k;
                if (c6669q45 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6669q45 = null;
                }
                TextView textView2 = c6669q45.f29767i.f12200d;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.preloadOption.promoText");
                C49520tu6.m11239l(textView2);
            }
            String m108342f = c32681Eo6.m108342f();
            if (m108342f != null) {
                C6669Q4 c6669q46 = this.f64427k;
                if (c6669q46 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6669q46 = null;
                }
                c6669q46.f29767i.f12202f.setText(m108342f);
            }
            C6669Q4 c6669q47 = this.f64427k;
            if (c6669q47 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q47 = null;
            }
            TextView textView3 = c6669q47.f29766h;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.paymentTerms");
            C49520tu6.setTextAndVisibility$default(textView3, c32681Eo6.m108345c(), 0, 2, null);
            C6669Q4 c6669q48 = this.f64427k;
            if (c6669q48 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q48 = null;
            }
            SupportedPaymentBrandsView supportedPaymentBrandsView = c6669q48.f29767i.f12203g;
            List<PaymentMethod> m108343e = c32681Eo6.m108343e();
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            supportedPaymentBrandsView.setPaymentMethods(m108343e, emptyList);
            C6669Q4 c6669q49 = this.f64427k;
            if (c6669q49 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q49 = null;
            }
            SupportedPaymentBrandsView supportedPaymentBrandsView2 = c6669q49.f29765g.f13685f;
            List<PaymentMethod> m108344d = c32681Eo6.m108344d();
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            supportedPaymentBrandsView2.setPaymentMethods(m108344d, emptyList2);
            m57748b0(this.f64430n.getValue().booleanValue());
            C6669Q4 c6669q410 = this.f64427k;
            if (c6669q410 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q410 = null;
            }
            ConstraintLayout constraintLayout = c6669q410.f29767i.f12198b;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.preloadOption.contentContainer");
            C34585Ms2.m94661j(constraintLayout, new C15097b());
            C6669Q4 c6669q411 = this.f64427k;
            if (c6669q411 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c6669q4 = c6669q411;
            }
            ConstraintLayout constraintLayout2 = c6669q4.f29765g.f13681b;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.payPerRideOption.contentContainer");
            C34585Ms2.m94661j(constraintLayout2, new C15098c());
        } else if (state instanceof T84) {
            T84 t84 = (T84) state;
            m57746f0(t84.m84273c(), t84.m84274b());
        } else if (state instanceof C33424Ht2) {
            C33424Ht2 c33424Ht2 = (C33424Ht2) state;
            this.f64431o = c33424Ht2.m103242b();
            C6669Q4 c6669q412 = this.f64427k;
            if (c6669q412 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6669q412 = null;
            }
            Group group = c6669q412.f29764f;
            Intrinsics.checkNotNullExpressionValue(group, "binding.loadingViews");
            C49520tu6.show$default(group, c33424Ht2.m103242b(), 0, 2, null);
        } else if (state instanceof C42260hg1) {
            m58990F().error(((C42260hg1) state).m36102b());
        } else if (state instanceof C47004pg1) {
            m58990F().error(((C47004pg1) state).m18999b());
        } else if (state instanceof C52673zE0) {
            m57752U(((C52673zE0) state).m1620b());
        }
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        this.f64429m.accept(Optional.f63040c.m59033b(paymentMethodNonce));
    }

    @Override // p000.Q04
    /* renamed from: m1 */
    public Observable<G10> mo57743m1() {
        Observable<G10> hide = this.f64428l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "braintreeFragmentRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10030) {
            if (i != 10069) {
                if (i != 10074) {
                    super.onActivityResult(i, i2, intent);
                    return;
                } else if (i2 == -1) {
                    new Handler().postDelayed(new Runnable() { // from class: n04
                        @Override // java.lang.Runnable
                        public final void run() {
                            PreloadV2ActivityVersionB.m57749Z(PreloadV2ActivityVersionB.this);
                        }
                    }, 500L);
                    return;
                } else {
                    return;
                }
            } else if (i2 == -1) {
                new Handler().postDelayed(new Runnable() { // from class: m04
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreloadV2ActivityVersionB.m57750Y(PreloadV2ActivityVersionB.this);
                    }
                }, 500L);
                return;
            } else {
                render(new C33424Ht2(false));
                return;
            }
        }
        m57751X().m91103K(i2, intent);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58977D();
        C39720dO0.m44334a().mo9390a(m58989H()).mo9392b(this);
        C6669Q4 m88983c = C6669Q4.m88983c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m88983c, "inflate(layoutInflater)");
        this.f64427k = m88983c;
        if (m88983c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m88983c = null;
        }
        setContentView(m88983c.getRoot());
        m57751X().consume(this);
    }
}
