package p000;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.widget.PaymentButton;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.CP3;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J0\u0010%\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0012\u0010)\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bH\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\bH\u0016J\u0010\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH\u0016J\u0018\u00104\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020\"H\u0016J\u0010\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u000205H\u0016J\u0012\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u0014\u0010S\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010NR\u0014\u0010U\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010KR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010KR\u0014\u0010]\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010NR\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010NR\u0014\u0010e\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010XR\u0014\u0010g\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010NR\u0014\u0010i\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010XR\u0014\u0010k\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010NR\u0014\u0010m\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010NR\u0014\u0010o\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010`R\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010KR\u0014\u0010w\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010KR\u0014\u0010y\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010NR\u0014\u0010{\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010GR\u0014\u0010}\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010KR\u0016\u0010\u007f\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010~R\u0017\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\rR\u0017\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010\u0081\u0001R\u0018\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0081\u0001R\u0018\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0081\u0001¨\u0006\u008b\u0001"}, m28432d2 = {"LDP3;", "LxE;", "LCP3;", "", "Pl", "", "Rl", "Landroid/widget/TextView;", "", "show", "Sl", "Tl", "Lio/reactivex/Observable;", "J", "LAO3;", "presenter", "Ql", "Lco/bird/android/model/BirdPayment;", "payment", "L2", "aa", "w7", "Lkotlin/Function1;", "callback", "o4", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/wire/WireCoupon;", "coupon", "hf", "", "balance", "Ljava/util/Currency;", "currency", "couponV2", "", "coupons", "preloadV2Enabled", "uf", "pricing", "kl", "charge", "Y7", "permissionGranted", "B0", "F", "showAutoPay", "pg", "showGooglePay", "y", "activated", "S7", "hiddenState", "showProgress", "LCP3$a;", TransferTable.COLUMN_STATE, "U4", "token", "LG10;", "R", "S", "A", "s4", "Uj", "F5", "pa", "J6", "fb", "Zb", "s7", "Landroid/view/View;", "b", "Landroid/view/View;", "fullScreenProgressBar", "Lco/bird/android/widget/PaymentButton;", "c", "Lco/bird/android/widget/PaymentButton;", "enterCode", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "promoLabel", "e", "enterCard", "f", "supportLabel", "g", "refundAccountBalanceButton", "Landroid/view/ViewGroup;", "h", "Landroid/view/ViewGroup;", "defaultCardContainer", "i", "defaultCard", "j", "balanceAndFreeRideText", "Landroid/widget/Button;", "k", "Landroid/widget/Button;", "preloadMoneyButton", "l", "title", "m", "autoPayContainer", "n", "autoReloadV2ToggleLabel", "o", "pricingContainer", "p", "bottomPricing", "q", "preauthText", "r", "turnOnButton", "Landroid/widget/RelativeLayout;", "s", "Landroid/widget/RelativeLayout;", "googlePayButton", "t", "paypalButton", "u", "cashpayButton", "v", "vehiclePricingHeader", "w", "vehiclePricingSeparator", "x", "vehiclePricingButton", "Ljava/util/Currency;", "balanceCurrency", "z", "Z", "B", "I", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "autoPayVisible", "D", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DP3 */
/* loaded from: classes2.dex */
public final class DP3 extends AbstractC30071xE implements CP3 {

    /* renamed from: A */
    public boolean f5610A;

    /* renamed from: B */
    public int f5611B;

    /* renamed from: C */
    public boolean f5612C;

    /* renamed from: D */
    public boolean f5613D;

    /* renamed from: b */
    public final View f5614b;

    /* renamed from: c */
    public final PaymentButton f5615c;

    /* renamed from: d */
    public final TextView f5616d;

    /* renamed from: e */
    public final PaymentButton f5617e;

    /* renamed from: f */
    public final TextView f5618f;

    /* renamed from: g */
    public final PaymentButton f5619g;

    /* renamed from: h */
    public final ViewGroup f5620h;

    /* renamed from: i */
    public final PaymentButton f5621i;

    /* renamed from: j */
    public final TextView f5622j;

    /* renamed from: k */
    public final Button f5623k;

    /* renamed from: l */
    public final TextView f5624l;

    /* renamed from: m */
    public final ViewGroup f5625m;

    /* renamed from: n */
    public final TextView f5626n;

    /* renamed from: o */
    public final ViewGroup f5627o;

    /* renamed from: p */
    public final TextView f5628p;

    /* renamed from: q */
    public final TextView f5629q;

    /* renamed from: r */
    public final Button f5630r;

    /* renamed from: s */
    public final RelativeLayout f5631s;

    /* renamed from: t */
    public final PaymentButton f5632t;

    /* renamed from: u */
    public final PaymentButton f5633u;

    /* renamed from: v */
    public final TextView f5634v;

    /* renamed from: w */
    public final View f5635w;

    /* renamed from: x */
    public final PaymentButton f5636x;

    /* renamed from: y */
    public Currency f5637y;

    /* renamed from: z */
    public long f5638z;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DP3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1459a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CP3.EnumC1023a.values().length];
            try {
                iArr[CP3.EnumC1023a.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CP3.EnumC1023a.LOADED_SHOW_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CP3.EnumC1023a.LOADED_HIDE_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DP3$b */
    /* loaded from: classes2.dex */
    public static final class C1460b extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AO3 f5639g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1460b(AO3 ao3) {
            super(1);
            this.f5639g = ao3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            this.f5639g.mo21161f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DP3$c */
    /* loaded from: classes2.dex */
    public static final class C1461c extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AO3 f5640g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1461c(AO3 ao3) {
            super(1);
            this.f5640g = ao3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            this.f5640g.mo21159g();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DP3$d */
    /* loaded from: classes2.dex */
    public static final class C1462d extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AO3 f5641g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1462d(AO3 ao3) {
            super(1);
            this.f5641g = ao3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            this.f5641g.mo21163e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "input", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DP3$e */
    /* loaded from: classes2.dex */
    public static final class C1463e extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<String, Unit> f5642g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1463e(Function1<? super String, Unit> function1) {
            super(2);
            this.f5642g = function1;
        }

        /* renamed from: a */
        public final void m110499a(MaterialDialog materialDialog, CharSequence input) {
            Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(input, "input");
            this.f5642g.invoke(input.toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
            m110499a(materialDialog, charSequence);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DP3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5614b = C40788fB0.m41779c(activity, C36585Vg4.fullScreenProgressBar);
        this.f5615c = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.enterCode);
        this.f5616d = (TextView) C40788fB0.m41779c(activity, C36585Vg4.promoLabel);
        this.f5617e = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.enterCard);
        this.f5618f = (TextView) C40788fB0.m41779c(activity, C36585Vg4.supportLabel);
        this.f5619g = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.refundAccountBalance);
        this.f5620h = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.defaultCardContainer);
        this.f5621i = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.defaultCard);
        TextView textView = (TextView) C40788fB0.m41779c(activity, C36585Vg4.balanceAndFreeRides);
        this.f5622j = textView;
        this.f5623k = (Button) C40788fB0.m41779c(activity, C36585Vg4.preloadMoneyButton);
        this.f5624l = (TextView) C40788fB0.m41779c(activity, C36585Vg4.title);
        this.f5625m = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.autopay);
        this.f5626n = (TextView) C40788fB0.m41779c(activity, C36585Vg4.endLabel);
        this.f5627o = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.pricing);
        this.f5628p = (TextView) C40788fB0.m41779c(activity, C36585Vg4.pricingBottom);
        this.f5629q = (TextView) C40788fB0.m41779c(activity, C36585Vg4.preauthText);
        this.f5630r = (Button) C40788fB0.m41779c(activity, C36585Vg4.turnOn);
        this.f5631s = (RelativeLayout) C40788fB0.m41779c(activity, C36585Vg4.googlePayButton);
        this.f5632t = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.paypalButton);
        this.f5633u = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.cashpayButton);
        this.f5634v = (TextView) C40788fB0.m41779c(activity, C36585Vg4.vehiclePricing);
        this.f5635w = C40788fB0.m41779c(activity, C36585Vg4.vehiclePricingSeparator);
        this.f5636x = (PaymentButton) C40788fB0.m41779c(activity, C36585Vg4.vehiclePricingButton);
        Currency currency = Currency.getInstance("USD");
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(\"USD\")");
        this.f5637y = currency;
        m110517Sl(textView, true);
        mo110505pg(false);
    }

    @Override // p000.CP3
    /* renamed from: A */
    public Observable<Unit> mo110530A() {
        return C44626lf5.clicksThrottle$default(this.f5632t, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: B0 */
    public void mo110529B0(boolean z) {
        if (z) {
            this.f5628p.setText(getActivity().getString(C45871nl4.pricing_turn_on_location));
        } else {
            this.f5628p.setText(getActivity().getString(C45871nl4.pricing_turn_on_permission));
        }
        C49520tu6.show$default(this.f5628p, true, 0, 2, null);
        C49520tu6.show$default(this.f5630r, true, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: F */
    public Observable<Unit> mo110528F() {
        return C44626lf5.clicksThrottle$default(this.f5630r, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: F5 */
    public void mo110527F5(boolean z) {
        C49520tu6.show$default(this.f5634v, z, 0, 2, null);
        C49520tu6.show$default(this.f5635w, z, 0, 2, null);
        C49520tu6.show$default(this.f5636x, z, 0, 2, null);
        C49520tu6.show$default(this.f5627o, !z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: J */
    public Observable<Unit> mo110526J() {
        return C44626lf5.clicksThrottle$default(this.f5631s, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: J6 */
    public Observable<Unit> mo110525J6() {
        return C44626lf5.clicksThrottle$default(this.f5623k, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: L2 */
    public void mo110524L2(BirdPayment birdPayment) {
        if (birdPayment != null) {
            m110516Tl(true);
            String str = "";
            if (birdPayment.isAdyen()) {
                PaymentButton paymentButton = this.f5621i;
                boolean isGooglePay = birdPayment.isGooglePay();
                String brand = birdPayment.getBrand();
                if (brand == null) {
                    brand = "";
                }
                String lastCardNumbers = birdPayment.getLastCardNumbers();
                if (lastCardNumbers != null) {
                    str = lastCardNumbers;
                }
                paymentButton.setAdyenCard(isGooglePay, brand, str);
            } else if (birdPayment.isStripeCard()) {
                PaymentButton paymentButton2 = this.f5621i;
                Card stripeCard = birdPayment.getStripeCard();
                Intrinsics.checkNotNull(stripeCard);
                paymentButton2.setStripeCard(stripeCard);
            } else if (birdPayment.isStripePaymentMethod()) {
                PaymentButton paymentButton3 = this.f5621i;
                PaymentMethod stripePaymentMethod = birdPayment.getStripePaymentMethod();
                Intrinsics.checkNotNull(stripePaymentMethod);
                paymentButton3.setStripePaymentMethod(stripePaymentMethod);
            } else if (birdPayment.isPaypal()) {
                PaymentButton paymentButton4 = this.f5621i;
                String paypalEmail = birdPayment.getPaypalEmail();
                if (paypalEmail != null) {
                    str = paypalEmail;
                }
                paymentButton4.setPaypal(str);
            } else {
                C41318g46.m40160d("BirdPayment neither stripe nor PayPal when setting default bird.", new Object[0]);
            }
            this.f5621i.setDefaultFromPaymentLanding();
            return;
        }
        m110516Tl(false);
    }

    /* renamed from: Pl */
    public final void m110523Pl() {
        boolean z;
        int i;
        boolean z2 = this.f5612C;
        if (!z2 && !this.f5610A) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f5638z < 0 && !z2) {
                i = C32364Df4.mechanicRed;
            } else {
                i = C32364Df4.birdESBlue;
            }
            this.f5622j.setBackgroundColor(C40788fB0.m41776f(getActivity(), i));
            C49520tu6.m11233r(this.f5622j);
            this.f5622j.setText(m110520Rl());
        } else {
            C49520tu6.m11239l(this.f5622j);
        }
        C49520tu6.m11231t(this.f5624l, C51916xx1.currency$default(C51916xx1.f118396a, this.f5638z, this.f5637y, null, 4, null));
        C49520tu6.show$default(this.f5623k, this.f5613D, 0, 2, null);
    }

    /* renamed from: Ql */
    public void m110522Ql(AO3 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        C34585Ms2.m94661j(this.f5615c, new C1460b(presenter));
        C34585Ms2.m94661j(this.f5617e, new C1461c(presenter));
        C34585Ms2.m94661j(this.f5621i, new C1462d(presenter));
    }

    @Override // p000.CP3
    /* renamed from: R */
    public G10 mo110521R(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            return G10.m105957sa(getActivity(), token);
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
            return null;
        }
    }

    /* renamed from: Rl */
    public final String m110520Rl() {
        StringBuilder sb = new StringBuilder();
        if (this.f5638z != 0) {
            sb.append(getActivity().getResources().getString(C45871nl4.payment_balance, C51916xx1.currency$default(C51916xx1.f118396a, this.f5638z, this.f5637y, null, 4, null)));
        } else {
            m110517Sl(this.f5622j, false);
        }
        if (this.f5638z != 0 && this.f5611B != 0) {
            sb.append(" · ");
        }
        if (this.f5611B != 0) {
            sb.append(getActivity().getResources().getString(C45871nl4.payment_freeride, Integer.valueOf(this.f5611B)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "balanceAndFreeRidesStringBuilder.toString()");
        return sb2;
    }

    @Override // p000.CP3
    /* renamed from: S */
    public void mo110519S(boolean z) {
        C49520tu6.show$default(this.f5632t, z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: S7 */
    public void mo110518S7(boolean z) {
        int i;
        TextView textView = this.f5626n;
        if (z) {
            i = C45871nl4.on_off_option_on;
        } else {
            i = C45871nl4.on_off_option_off;
        }
        textView.setText(getString(i, new Object[0]));
    }

    /* renamed from: Sl */
    public final void m110517Sl(TextView textView, boolean z) {
        Drawable m8248b = C29611vi.m8248b(getActivity(), C48193rg4.ic_payment_white);
        if (!z) {
            m8248b = null;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m8248b, (Drawable) null);
    }

    /* renamed from: Tl */
    public final void m110516Tl(boolean z) {
        C49520tu6.show$default(this.f5620h, z, 0, 2, null);
        C49520tu6.show$default(this.f5621i, z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: U4 */
    public void mo110515U4(CP3.EnumC1023a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = C1459a.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C49520tu6.show$default(this.f5614b, false, 0, 2, null);
                    C49520tu6.show$default(getContentView(), false, 0, 2, null);
                    return;
                }
                return;
            }
            C49520tu6.show$default(this.f5614b, false, 0, 2, null);
            C49520tu6.show$default(getContentView(), true, 0, 2, null);
            return;
        }
        C49520tu6.show$default(this.f5614b, true, 0, 2, null);
        C49520tu6.show$default(getContentView(), false, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: Uj */
    public Observable<Unit> mo110514Uj() {
        return C44626lf5.clicksThrottle$default(this.f5633u, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: Y7 */
    public void mo110513Y7(String str) {
        boolean z;
        if (str != null) {
            this.f5629q.setText(str);
        }
        TextView textView = this.f5629q;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: Zb */
    public Observable<Unit> mo110512Zb() {
        return C44626lf5.clicksThrottle$default(this.f5619g, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: aa */
    public void mo110511aa() {
        m110516Tl(true);
        this.f5621i.m54507a();
        this.f5621i.m54506b(C45871nl4.payment_select_default_payment);
    }

    @Override // p000.CP3
    /* renamed from: fb */
    public Observable<Unit> mo110510fb() {
        return C44626lf5.clicksThrottle$default(this.f5625m, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: hf */
    public void mo110509hf(String code, WireCoupon coupon) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        if (!getActivity().isFinishing()) {
            C51916xx1.f118396a.m4408d(coupon.getMaxAmount(), C45097mS5.m25591o(coupon.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
            MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(C45871nl4.credit_confirm_promo_dialog_title), null, 2, null), Integer.valueOf(C45871nl4.ride_ended_coupon), null, null, 6, null), Integer.valueOf(C45871nl4.credit_confirm_promo_dialog_ok), null, null, 6, null).show();
        }
    }

    @Override // p000.CP3
    /* renamed from: kl */
    public void mo110508kl(String pricing) {
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f5628p.setText(pricing);
        C49520tu6.show$default(this.f5628p, true, 0, 2, null);
        C49520tu6.show$default(this.f5630r, false, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: o4 */
    public void mo110507o4(Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!getActivity().isFinishing()) {
            DialogInputExtKt.input$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(C45871nl4.credit_promo_code_dialog_title), null, 2, null), null, Integer.valueOf(C45871nl4.credit_promo_code_dialog_hint), null, Integer.valueOf(C46464ol4.empty), 1, null, false, false, new C1463e(callback), 101, null).show();
        }
    }

    @Override // p000.CP3
    /* renamed from: pa */
    public Observable<Unit> mo110506pa() {
        return C44626lf5.clicksThrottle$default(this.f5636x, 0L, 1, null);
    }

    @Override // p000.CP3
    /* renamed from: pg */
    public void mo110505pg(boolean z) {
        this.f5612C = z;
        C49520tu6.show$default(this.f5625m, z, 0, 2, null);
        this.f5625m.setClickable(z);
        if (z) {
            this.f5624l.setTypeface(Typeface.DEFAULT);
        } else {
            this.f5624l.setTypeface(Typeface.DEFAULT_BOLD);
        }
        m110523Pl();
    }

    @Override // p000.CP3
    /* renamed from: s4 */
    public void mo110504s4(boolean z) {
        C49520tu6.show$default(this.f5633u, z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: s7 */
    public void mo110503s7(boolean z) {
        C49520tu6.show$default(this.f5618f, z, 0, 2, null);
        C49520tu6.show$default(this.f5619g, z, 0, 2, null);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        super.showProgress(z, 4);
    }

    @Override // p000.CP3
    /* renamed from: uf */
    public void mo110502uf(long j, Currency currency, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f5637y = currency;
        this.f5638z = j;
        this.f5610A = z;
        this.f5611B = i;
        this.f5613D = z2;
        m110523Pl();
    }

    @Override // p000.CP3
    /* renamed from: w7 */
    public void mo110501w7(boolean z) {
        C49520tu6.show$default(this.f5616d, z, 0, 2, null);
        C49520tu6.show$default(this.f5615c, z, 0, 2, null);
    }

    @Override // p000.CP3
    /* renamed from: y */
    public void mo110500y(boolean z) {
        C49520tu6.show$default(this.f5631s, z, 0, 2, null);
    }
}
