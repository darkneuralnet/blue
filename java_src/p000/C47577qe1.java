package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.text.Editable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.DrawableView;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.CardView;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b=\u0010>J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00101\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010:\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00030\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006?"}, m28432d2 = {"Lqe1;", "LxE;", "Lpe1;", "LCf0;", "zh", "", "r3", "Vb", "Lio/reactivex/Observable;", "V4", "Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "paymentMethod", "", "ck", "", "showCardScan", "pe", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "B5", "reset", "he", "showZipOverride", "fl", "si", "forceZipOverride", "ql", "visible", "K9", "kg", "token", "LG10;", "R", "Lcom/stripe/android/view/CardInputListener$FocusField;", "focusField", "Rl", "LO2;", "b", "LO2;", "binding", "Landroid/animation/Animator;", "c", "Landroid/animation/Animator;", "Pl", "()Landroid/animation/Animator;", "flipBack", DateTokenConverter.CONVERTER_KEY, "Ql", "flipFront", "Lcj1;", "e", "Lcj1;", "face", "LAG;", "kotlin.jvm.PlatformType", "f", "LAG;", "adyenCardComponentRelay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LO2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qe1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47577qe1 extends AbstractC30071xE implements InterfaceC46984pe1 {

    /* renamed from: b */
    public final C5816O2 f105540b;

    /* renamed from: c */
    public final Animator f105541c;

    /* renamed from: d */
    public final Animator f105542d;

    /* renamed from: e */
    public EnumC39308cj1 f105543e;

    /* renamed from: f */
    public final C0058AG<C32126Cf0> f105544f;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"qe1$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qe1$a */
    /* loaded from: classes2.dex */
    public static final class C27641a extends AnimatorListenerAdapter {
        public C27641a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            C47577qe1.this.f105540b.f25543c.setImageResource(C52342yg4.ic_card_back);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"qe1$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qe1$b */
    /* loaded from: classes2.dex */
    public static final class C27642b extends AnimatorListenerAdapter {
        public C27642b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            C47577qe1.this.f105540b.f25543c.setImageResource(C52342yg4.ic_card_front);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "hasFocus", "", C17296a.f69688o, "(Landroid/view/View;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qe1$c */
    /* loaded from: classes2.dex */
    public static final class C27643c extends Lambda implements Function2<View, Boolean, Unit> {
        public C27643c() {
            super(2);
        }

        /* renamed from: a */
        public final void m17290a(View view, boolean z) {
            String str;
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            TextInputEditText textInputEditText = C47577qe1.this.f105540b.f25544d;
            if (z) {
                str = C47577qe1.this.getString(C45871nl4.birthday_or_corporate_reg_placeholder, new Object[0]);
            } else {
                str = null;
            }
            textInputEditText.setHint(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
            m17290a(view, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "hasFocus", "", C17296a.f69688o, "(Landroid/view/View;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qe1$d */
    /* loaded from: classes2.dex */
    public static final class C27644d extends Lambda implements Function2<View, Boolean, Unit> {
        public C27644d() {
            super(2);
        }

        /* renamed from: a */
        public final void m17289a(View view, boolean z) {
            String str;
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            TextInputEditText textInputEditText = C47577qe1.this.f105540b.f25546f;
            if (z) {
                str = "12";
            } else {
                str = null;
            }
            textInputEditText.setHint(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
            m17289a(view, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qe1$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C27645e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInputListener.FocusField.values().length];
            try {
                iArr[CardInputListener.FocusField.CardNumber.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardInputListener.FocusField.ExpiryDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardInputListener.FocusField.Cvc.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, m28432d2 = {"LCf0;", "kotlin.jvm.PlatformType", "event", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qe1$f */
    /* loaded from: classes2.dex */
    public static final class C27646f implements InterfaceC41056fe3<C32126Cf0> {
        public C27646f() {
        }

        @Override // p000.InterfaceC41056fe3
        /* renamed from: a */
        public final void onChanged(C32126Cf0 c32126Cf0) {
            C47577qe1.this.f105544f.accept(c32126Cf0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"qe1$g", "Lcom/stripe/android/view/CardInputListener;", "Lcom/stripe/android/view/CardInputListener$FocusField;", "focusField", "", "onFocusChange", "onPostalCodeComplete", "onCardComplete", "onExpirationComplete", "onCvcComplete", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qe1$g */
    /* loaded from: classes2.dex */
    public static final class C27647g implements CardInputListener {
        public C27647g() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onCardComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onCvcComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onExpirationComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onFocusChange(CardInputListener.FocusField focusField) {
            Intrinsics.checkNotNullParameter(focusField, "focusField");
            C47577qe1.this.m17302Rl(focusField);
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onPostalCodeComplete() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47577qe1(BaseActivity activity, C5816O2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f105540b = binding;
        Animator loadAnimator = AnimatorInflater.loadAnimator(activity, C40474ef4.card_flip_left_in);
        Intrinsics.checkNotNullExpressionValue(loadAnimator, "loadAnimator(activity, c…imator.card_flip_left_in)");
        this.f105541c = loadAnimator;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(activity, C40474ef4.card_flip_right_in);
        Intrinsics.checkNotNullExpressionValue(loadAnimator2, "loadAnimator(activity, c…mator.card_flip_right_in)");
        this.f105542d = loadAnimator2;
        this.f105543e = EnumC39308cj1.FRONT;
        C0058AG<C32126Cf0> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<CardComponentState>()");
        this.f105544f = m115951g;
        loadAnimator.addListener(new C27641a());
        loadAnimator2.addListener(new C27642b());
        loadAnimator.setTarget(binding.f25543c);
        loadAnimator2.setTarget(binding.f25543c);
        TextInputEditText textInputEditText = binding.f25544d;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.dobEditText");
        C34585Ms2.m94656o(textInputEditText, new C27643c());
        TextInputEditText textInputEditText2 = binding.f25546f;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.passwordEditText");
        C34585Ms2.m94656o(textInputEditText2, new C27644d());
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: B5 */
    public PaymentMethodCreateParams mo17307B5() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PaymentMethodCreateParams copy;
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        if (this.f105540b.f25553m.isShown() && this.f105540b.f25553m.validateAllFields()) {
            ShippingInformation shippingInformation = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation != null && (address6 = shippingInformation.getAddress()) != null) {
                str = address6.getLine1();
            } else {
                str = null;
            }
            ShippingInformation shippingInformation2 = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation2 != null && (address5 = shippingInformation2.getAddress()) != null) {
                str2 = address5.getLine2();
            } else {
                str2 = null;
            }
            ShippingInformation shippingInformation3 = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation3 != null && (address4 = shippingInformation3.getAddress()) != null) {
                str3 = address4.getCity();
            } else {
                str3 = null;
            }
            ShippingInformation shippingInformation4 = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation4 != null && (address3 = shippingInformation4.getAddress()) != null) {
                str4 = address3.getState();
            } else {
                str4 = null;
            }
            ShippingInformation shippingInformation5 = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation5 != null && (address2 = shippingInformation5.getAddress()) != null) {
                str5 = address2.getPostalCode();
            } else {
                str5 = null;
            }
            ShippingInformation shippingInformation6 = this.f105540b.f25553m.getShippingInformation();
            if (shippingInformation6 != null && (address = shippingInformation6.getAddress()) != null) {
                str6 = address.getCountry();
            } else {
                str6 = null;
            }
            Address address7 = new Address(str3, str6, str, str2, str5, str4);
            PaymentMethodCreateParams paymentMethodCreateParams = this.f105540b.f25551k.getPaymentMethodCreateParams();
            if (paymentMethodCreateParams == null) {
                return null;
            }
            copy = paymentMethodCreateParams.copy((r36 & 1) != 0 ? paymentMethodCreateParams.code : null, (r36 & 2) != 0 ? paymentMethodCreateParams.requiresMandate : false, (r36 & 4) != 0 ? paymentMethodCreateParams.card : null, (r36 & 8) != 0 ? paymentMethodCreateParams.ideal : null, (r36 & 16) != 0 ? paymentMethodCreateParams.fpx : null, (r36 & 32) != 0 ? paymentMethodCreateParams.sepaDebit : null, (r36 & 64) != 0 ? paymentMethodCreateParams.auBecsDebit : null, (r36 & 128) != 0 ? paymentMethodCreateParams.bacsDebit : null, (r36 & 256) != 0 ? paymentMethodCreateParams.sofort : null, (r36 & 512) != 0 ? paymentMethodCreateParams.upi : null, (r36 & 1024) != 0 ? paymentMethodCreateParams.netbanking : null, (r36 & 2048) != 0 ? paymentMethodCreateParams.usBankAccount : null, (r36 & 4096) != 0 ? paymentMethodCreateParams.link : null, (r36 & 8192) != 0 ? paymentMethodCreateParams.cashAppPay : null, (r36 & 16384) != 0 ? paymentMethodCreateParams.billingDetails : new PaymentMethod.BillingDetails(address7, null, null, null, 14, null), (r36 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? paymentMethodCreateParams.metadata : null, (r36 & 65536) != 0 ? paymentMethodCreateParams.productUsage : null, (r36 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? paymentMethodCreateParams.overrideParamMap : null);
            return copy;
        } else if (this.f105540b.f25552l.isShown()) {
            return this.f105540b.f25552l.getPaymentMethodCreateParams();
        } else {
            return this.f105540b.f25551k.getPaymentMethodCreateParams();
        }
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: K9 */
    public void mo17306K9(boolean z) {
        TextInputLayout textInputLayout = this.f105540b.f25545e;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.dobTextInputLayout");
        C49520tu6.show$default(textInputLayout, z, 0, 2, null);
    }

    /* renamed from: Pl */
    public final Animator m17305Pl() {
        return this.f105541c;
    }

    /* renamed from: Ql */
    public final Animator m17304Ql() {
        return this.f105542d;
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: R */
    public G10 mo17303R(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            return G10.m105957sa(getActivity(), token);
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
            return null;
        }
    }

    /* renamed from: Rl */
    public final void m17302Rl(CardInputListener.FocusField focusField) {
        EnumC39308cj1 enumC39308cj1;
        int i = C27645e.$EnumSwitchMapping$0[focusField.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && (enumC39308cj1 = this.f105543e) == EnumC39308cj1.FRONT) {
                this.f105543e = enumC39308cj1.mo61023b(this);
                return;
            }
            return;
        }
        EnumC39308cj1 enumC39308cj12 = this.f105543e;
        if (enumC39308cj12 == EnumC39308cj1.BACK) {
            this.f105543e = enumC39308cj12.mo61023b(this);
        }
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: V4 */
    public Observable<C32126Cf0> mo17301V4() {
        Observable<C32126Cf0> hide = this.f105544f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "adyenCardComponentRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: Vb */
    public String mo17300Vb() {
        Editable text = this.f105540b.f25546f.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: ck */
    public void mo17299ck(CardConfiguration cardConfiguration, com.adyen.checkout.components.model.paymentmethods.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        C52328yf0 mo92402a = C52328yf0.f119932m.m3014a().mo92402a(getActivity(), paymentMethod, cardConfiguration);
        Intrinsics.checkNotNullExpressionValue(mo92402a, "CardComponent.PROVIDER.g…ethod, cardConfiguration)");
        C52328yf0 c52328yf0 = mo92402a;
        this.f105540b.f25542b.m53585c(c52328yf0, getActivity());
        this.f105540b.f25542b.requestFocus();
        c52328yf0.m10663o(getActivity(), new C27646f());
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: fl */
    public void mo17298fl(boolean z) {
        CardInputWidget cardInputWidget = this.f105540b.f25551k;
        Intrinsics.checkNotNullExpressionValue(cardInputWidget, "binding.stripeCardInput");
        C49520tu6.show$default(cardInputWidget, !z, 0, 2, null);
        CardMultilineWidget cardMultilineWidget = this.f105540b.f25552l;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "binding.stripeCardZipInput");
        C49520tu6.show$default(cardMultilineWidget, z, 0, 2, null);
        ShippingInfoWidget shippingInfoWidget = this.f105540b.f25553m;
        Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "binding.stripeFullAddress");
        C49520tu6.show$default(shippingInfoWidget, false, 0, 2, null);
        this.f105540b.f25552l.setPostalCodeRequired(z);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: he */
    public Observable<Unit> mo17297he() {
        TextView textView = this.f105540b.f25549i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanCard");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: kg */
    public void mo17296kg(boolean z) {
        TextInputLayout textInputLayout = this.f105540b.f25547g;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.passwordTextInputLayout");
        C49520tu6.show$default(textInputLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: pe */
    public void mo17295pe(boolean z) {
        List<? extends ShippingInfoWidget.CustomizableShippingField> listOf;
        DrawableView drawableView = this.f105540b.f25543c;
        Intrinsics.checkNotNullExpressionValue(drawableView, "binding.cardImage");
        C49520tu6.m11233r(drawableView);
        TextView textView = this.f105540b.f25549i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanCard");
        C49520tu6.show$default(textView, z, 0, 2, null);
        RelativeLayout relativeLayout = this.f105540b.f25550j;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.scanCardRow");
        C49520tu6.m11233r(relativeLayout);
        ShippingInfoWidget shippingInfoWidget = this.f105540b.f25553m;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(ShippingInfoWidget.CustomizableShippingField.Phone);
        shippingInfoWidget.setHiddenFields(listOf);
        this.f105540b.f25552l.setShouldShowPostalCode(true);
        C27647g c27647g = new C27647g();
        this.f105540b.f25551k.setCardInputListener(c27647g);
        this.f105540b.f25552l.setCardInputListener(c27647g);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: ql */
    public void mo17294ql(boolean z) {
        CardInputWidget cardInputWidget = this.f105540b.f25551k;
        Intrinsics.checkNotNullExpressionValue(cardInputWidget, "binding.stripeCardInput");
        C49520tu6.show$default(cardInputWidget, true, 0, 2, null);
        ShippingInfoWidget shippingInfoWidget = this.f105540b.f25553m;
        Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "binding.stripeFullAddress");
        C49520tu6.show$default(shippingInfoWidget, true, 0, 2, null);
        CardMultilineWidget cardMultilineWidget = this.f105540b.f25552l;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "binding.stripeCardZipInput");
        C49520tu6.show$default(cardMultilineWidget, false, 0, 2, null);
        this.f105540b.f25552l.setPostalCodeRequired(z);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: r3 */
    public String mo17293r3() {
        Editable text = this.f105540b.f25544d.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // p000.InterfaceC46984pe1
    public void reset() {
        DrawableView drawableView = this.f105540b.f25543c;
        Intrinsics.checkNotNullExpressionValue(drawableView, "binding.cardImage");
        C49520tu6.m11239l(drawableView);
        TextView textView = this.f105540b.f25549i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanCard");
        C49520tu6.m11239l(textView);
        RelativeLayout relativeLayout = this.f105540b.f25550j;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.scanCardRow");
        C49520tu6.m11239l(relativeLayout);
        CardView cardView = this.f105540b.f25542b;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.adyenCardView");
        C49520tu6.m11239l(cardView);
        CardInputWidget cardInputWidget = this.f105540b.f25551k;
        Intrinsics.checkNotNullExpressionValue(cardInputWidget, "binding.stripeCardInput");
        C49520tu6.m11239l(cardInputWidget);
        CardMultilineWidget cardMultilineWidget = this.f105540b.f25552l;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "binding.stripeCardZipInput");
        C49520tu6.m11239l(cardMultilineWidget);
        ShippingInfoWidget shippingInfoWidget = this.f105540b.f25553m;
        Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "binding.stripeFullAddress");
        C49520tu6.m11239l(shippingInfoWidget);
        TextInputLayout textInputLayout = this.f105540b.f25545e;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "binding.dobTextInputLayout");
        C49520tu6.m11239l(textInputLayout);
        TextInputLayout textInputLayout2 = this.f105540b.f25547g;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "binding.passwordTextInputLayout");
        C49520tu6.m11239l(textInputLayout2);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: si */
    public void mo17292si() {
        CardMultilineWidget cardMultilineWidget = this.f105540b.f25552l;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "binding.stripeCardZipInput");
        C49520tu6.show$default(cardMultilineWidget, true, 0, 2, null);
        CardInputWidget cardInputWidget = this.f105540b.f25551k;
        Intrinsics.checkNotNullExpressionValue(cardInputWidget, "binding.stripeCardInput");
        C49520tu6.show$default(cardInputWidget, false, 0, 2, null);
        ShippingInfoWidget shippingInfoWidget = this.f105540b.f25553m;
        Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "binding.stripeFullAddress");
        C49520tu6.show$default(shippingInfoWidget, false, 0, 2, null);
        this.f105540b.f25552l.setPostalCodeRequired(true);
    }

    @Override // p000.InterfaceC46984pe1
    /* renamed from: zh */
    public C32126Cf0 mo17291zh() {
        return this.f105544f.getValue();
    }
}
