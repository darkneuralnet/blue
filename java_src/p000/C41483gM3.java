package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantSiteKt;
import co.bird.android.widget.CountdownView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010t\u001a\u00020s¢\u0006\u0004\bu\u0010vJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0016J*\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00107\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00109\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010;\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00102R\u0014\u0010C\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00102R\u0014\u0010E\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00102R\u0014\u0010G\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00102R\u0014\u0010I\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010$R\u0014\u0010K\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00102R\u0014\u0010M\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010$R\u0014\u0010O\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00102R\u0014\u0010Q\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010$R\u0014\u0010S\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00102R\u0014\u0010U\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010$R\u0014\u0010W\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010$R\u0014\u0010Y\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010.R\u0014\u0010[\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010$R\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010$R\u0014\u0010_\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010$R\u0014\u0010a\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010$R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010g\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u00102R\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006w"}, m28432d2 = {"LgM3;", "LcM3;", "LxE;", "Lio/reactivex/Observable;", "", "Nd", "", "toColor", "W1", "", "isNewPayment", "L8", "zf", "Ed", "M8", "show", "tg", "", "transactionAmount", "amountBilled", "Wd", "tip", "Kc", "date", "time", "e8", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Pj", "va", "amountOff", "amountPaidByBird", "r4", "Landroid/view/View;", "b", "Landroid/view/View;", "root", "c", "containerLayout", "Lco/bird/android/widget/CountdownView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/CountdownView;", "timeAgoView", "Landroidx/constraintlayout/widget/Group;", "e", "Landroidx/constraintlayout/widget/Group;", "newTransactionGroup", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "transactionAmountText", "g", "amountLabel", "h", "dateLabel", "i", "paymentProofLabel", "j", "paymentPlusTipLabel", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "merchantImage", "l", "merchantName", "m", "merchantStreetAddress", "n", "reportIssueLabel", "o", "amountOffText", "p", "paidByBirdContainer", "q", "paidByBirdAmount", "r", "discountContainer", "s", "discountAmount", "t", "tipContainer", "u", "tipAmount", "v", "fullReceiptContainer", "w", "showHideReceiptContainer", "x", "hideReceiptGroup", "y", "hideFullReceiptView", "z", "showFullReceiptView", "A", "nonWinnerContainer", "B", "winnerContainer", "Landroid/widget/FrameLayout;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/widget/FrameLayout;", "confettiView", "D", "amountBilledText", "", "E", "[I", "confettiColors", "F", "I", "defaultBackgroundColor", "Landroid/animation/AnimatorSet;", "G", "Landroid/animation/AnimatorSet;", "backgroundColorAnimator", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentConfirmationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentConfirmationUi.kt\nco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationUiImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,200:1\n262#2,2:201\n262#2,2:203\n180#3:205\n*S KotlinDebug\n*F\n+ 1 PaymentConfirmationUi.kt\nco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationUiImpl\n*L\n157#1:201,2\n188#1:203,2\n194#1:205\n*E\n"})
/* renamed from: gM3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41483gM3 extends AbstractC30071xE implements InterfaceC39094cM3 {

    /* renamed from: A */
    public final View f82023A;

    /* renamed from: B */
    public final View f82024B;

    /* renamed from: C */
    public final FrameLayout f82025C;

    /* renamed from: D */
    public final TextView f82026D;

    /* renamed from: E */
    public final int[] f82027E;

    /* renamed from: F */
    public final int f82028F;

    /* renamed from: G */
    public AnimatorSet f82029G;

    /* renamed from: b */
    public final View f82030b;

    /* renamed from: c */
    public final View f82031c;

    /* renamed from: d */
    public final CountdownView f82032d;

    /* renamed from: e */
    public final Group f82033e;

    /* renamed from: f */
    public final TextView f82034f;

    /* renamed from: g */
    public final TextView f82035g;

    /* renamed from: h */
    public final TextView f82036h;

    /* renamed from: i */
    public final TextView f82037i;

    /* renamed from: j */
    public final TextView f82038j;

    /* renamed from: k */
    public final ImageView f82039k;

    /* renamed from: l */
    public final TextView f82040l;

    /* renamed from: m */
    public final TextView f82041m;

    /* renamed from: n */
    public final TextView f82042n;

    /* renamed from: o */
    public final TextView f82043o;

    /* renamed from: p */
    public final View f82044p;

    /* renamed from: q */
    public final TextView f82045q;

    /* renamed from: r */
    public final View f82046r;

    /* renamed from: s */
    public final TextView f82047s;

    /* renamed from: t */
    public final View f82048t;

    /* renamed from: u */
    public final TextView f82049u;

    /* renamed from: v */
    public final View f82050v;

    /* renamed from: w */
    public final View f82051w;

    /* renamed from: x */
    public final Group f82052x;

    /* renamed from: y */
    public final View f82053y;

    /* renamed from: z */
    public final View f82054z;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gM3$a */
    /* loaded from: classes3.dex */
    public static final class C20833a extends Lambda implements Function1<Unit, Unit> {
        public C20833a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48279rp0.m15321e(C41483gM3.this.f82025C, C41483gM3.this.f82027E).m15322d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41483gM3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f82030b = C40788fB0.m41779c(activity, C36360Uh4.root);
        this.f82031c = C40788fB0.m41779c(activity, C36360Uh4.container_layout);
        this.f82032d = (CountdownView) C40788fB0.m41779c(activity, C36360Uh4.timeView);
        this.f82033e = (Group) C40788fB0.m41779c(activity, C36360Uh4.newTransactionGroup);
        this.f82034f = (TextView) C40788fB0.m41779c(activity, C36360Uh4.transactionAmount);
        this.f82035g = (TextView) C40788fB0.m41779c(activity, C36360Uh4.paymentAmount);
        this.f82036h = (TextView) C40788fB0.m41779c(activity, C36360Uh4.paymentDate);
        this.f82037i = (TextView) C40788fB0.m41779c(activity, C36360Uh4.showToMerchantLabel);
        this.f82038j = (TextView) C40788fB0.m41779c(activity, C36360Uh4.plusTipLabel);
        this.f82039k = (ImageView) C40788fB0.m41779c(activity, C36360Uh4.merchantInfoPhoto);
        this.f82040l = (TextView) C40788fB0.m41779c(activity, C36360Uh4.merchantInfoName);
        this.f82041m = (TextView) C40788fB0.m41779c(activity, C36360Uh4.merchantInfoStreetAddress);
        this.f82042n = (TextView) C40788fB0.m41779c(activity, C36360Uh4.supportReportIssue);
        this.f82043o = (TextView) C40788fB0.m41779c(activity, C36360Uh4.winnerDiscountAmountLabel);
        this.f82044p = C40788fB0.m41779c(activity, C36360Uh4.paidByBirdContainer);
        this.f82045q = (TextView) C40788fB0.m41779c(activity, C36360Uh4.paidByBirdAmount);
        this.f82046r = C40788fB0.m41779c(activity, C36360Uh4.discountContainer);
        this.f82047s = (TextView) C40788fB0.m41779c(activity, C36360Uh4.discountAmount);
        this.f82048t = C40788fB0.m41779c(activity, C36360Uh4.tipContainer);
        this.f82049u = (TextView) C40788fB0.m41779c(activity, C36360Uh4.tipAmount);
        this.f82050v = C40788fB0.m41779c(activity, C36360Uh4.fullReceiptContainer);
        this.f82051w = C40788fB0.m41779c(activity, C36360Uh4.showHideReceiptContainer);
        this.f82052x = (Group) C40788fB0.m41779c(activity, C36360Uh4.hideFullReceiptGroup);
        this.f82053y = C40788fB0.m41779c(activity, C36360Uh4.hideFullReceipt);
        this.f82054z = C40788fB0.m41779c(activity, C36360Uh4.showFullReceipt);
        this.f82023A = C40788fB0.m41779c(activity, C36360Uh4.nonWinnerContainer);
        this.f82024B = C40788fB0.m41779c(activity, C36360Uh4.winnerContainer);
        this.f82025C = (FrameLayout) C40788fB0.m41779c(activity, C36360Uh4.confettiView);
        this.f82026D = (TextView) C40788fB0.m41779c(activity, C36360Uh4.amountBilled);
        this.f82027E = new int[]{C40788fB0.m41776f(activity, C32364Df4.birdBlue), C40788fB0.m41776f(activity, C32364Df4.birdGold), C40788fB0.m41776f(activity, C32364Df4.birdMint), C40788fB0.m41776f(activity, C32364Df4.birdRed), C40788fB0.m41776f(activity, C32364Df4.birdTeal), C40788fB0.m41776f(activity, C32364Df4.birdViolet)};
        this.f82028F = C40788fB0.m41776f(activity, C32364Df4.birdESBlue);
    }

    /* renamed from: Sl */
    public static final void m39585Sl(C41483gM3 this$0, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animator, "animator");
        View view = this$0.f82030b;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    /* renamed from: Tl */
    public static final void m39584Tl(C41483gM3 this$0, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animator, "animator");
        View view = this$0.f82030b;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    /* renamed from: Ul */
    public static final void m39583Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: Ed */
    public Observable<Unit> mo39594Ed() {
        return C44626lf5.clicksThrottle$default(this.f82054z, 0L, 1, null);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: Kc */
    public void mo39593Kc(String str) {
        boolean z;
        View view = this.f82048t;
        int i = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(true ^ z)) {
            i = 8;
        }
        view.setVisibility(i);
        this.f82049u.setText(str);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: L8 */
    public void mo39592L8(boolean z) {
        C49520tu6.show$default(this.f82037i, z, 0, 2, null);
        C49520tu6.show$default(this.f82051w, z, 0, 2, null);
        C49520tu6.show$default(this.f82050v, !z, 0, 2, null);
        C49520tu6.show$default(this.f82033e, z, 0, 2, null);
        if (z) {
            CountdownView.setupStopwatch$default(this.f82032d, getActivity(), null, 2, null);
        }
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: M8 */
    public Observable<Unit> mo39591M8() {
        return C44626lf5.m27017c(this.f82042n, 2000L);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: Nd */
    public Observable<Unit> mo39590Nd() {
        return C44626lf5.clicksThrottle$default(this.f82031c, 0L, 1, null);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: Pj */
    public void mo39589Pj(WireMerchantSite merchantSite, String address) {
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f82040l.setText(merchantSite.getMerchant().getName());
        this.f82041m.setText(address);
        String photoUrl = WireMerchantSiteKt.photoUrl(merchantSite);
        if (photoUrl != null) {
            this.f82039k.setVisibility(0);
            ComponentCallbacks2C17096a.m53137u(this.f82039k).m81653k(photoUrl).m16096R0(this.f82039k);
        }
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: W1 */
    public void mo39582W1(int i) {
        AnimatorSet animatorSet = this.f82029G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Drawable background = this.f82030b.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        ValueAnimator ofArgb = ValueAnimator.ofArgb(((ColorDrawable) background).getColor(), i);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eM3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C41483gM3.m39585Sl(C41483gM3.this, valueAnimator);
            }
        });
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(i, this.f82028F);
        ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fM3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C41483gM3.m39584Tl(C41483gM3.this, valueAnimator);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f82029G = animatorSet2;
        animatorSet2.playSequentially(ofArgb, ofArgb2);
        AnimatorSet animatorSet3 = this.f82029G;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: Wd */
    public void mo39581Wd(String transactionAmount, String amountBilled) {
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(amountBilled, "amountBilled");
        this.f82035g.setText(transactionAmount);
        this.f82034f.setText(transactionAmount);
        this.f82026D.setText(amountBilled);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: e8 */
    public void mo39580e8(String date, String time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        TextView textView = this.f82036h;
        textView.setText(date + " " + time);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: r4 */
    public void mo39579r4(String amountBilled, String amountOff, String amountPaidByBird, String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(amountBilled, "amountBilled");
        Intrinsics.checkNotNullParameter(amountOff, "amountOff");
        Intrinsics.checkNotNullParameter(amountPaidByBird, "amountPaidByBird");
        int i = 0;
        C49520tu6.show$default(this.f82023A, false, 0, 2, null);
        C49520tu6.m11233r(this.f82024B);
        this.f82026D.setText(amountBilled);
        C49520tu6.m11233r(this.f82044p);
        this.f82043o.setText(getActivity().getString(C45871nl4.merchant_payment_confirmation_winner_amount_off, amountOff));
        this.f82045q.setText(amountPaidByBird);
        View view = this.f82048t;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z)) {
            i = 8;
        }
        view.setVisibility(i);
        this.f82049u.setText(str);
        Observable<Unit> observeOn = C45219mf5.m25212c(this.f82025C).take(2L).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "confettiView.globalLayou…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(getActivity()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20833a c20833a = new C20833a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dM3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41483gM3.m39583Ul(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: tg */
    public void mo39578tg(boolean z) {
        C49520tu6.show$default(this.f82050v, z, 0, 2, null);
        C49520tu6.show$default(this.f82052x, z, 0, 2, null);
        C49520tu6.show$default(this.f82054z, !z, 0, 2, null);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: va */
    public void mo39577va(boolean z) {
        C49520tu6.show$default(this.f82038j, z, 0, 2, null);
    }

    @Override // p000.InterfaceC39094cM3
    /* renamed from: zf */
    public Observable<Unit> mo39576zf() {
        return C44626lf5.clicksThrottle$default(this.f82053y, 0L, 1, null);
    }
}
