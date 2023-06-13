package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.BirdPayment;
import co.bird.android.widget.PaymentButton;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J(\u0010\u000f\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LRx0;", "LxA;", "Lio/reactivex/Observable;", "", "f", "Pl", "dismiss", "Lco/bird/android/model/BirdPayment;", "defaultPayment", "Rl", "", "Lkotlin/Pair;", "", "lineItems", "totalAmountText", "Ql", "", "loading", "Sl", "LLZ;", "c", "LLZ;", "binding", "Landroid/content/DialogInterface;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/base/BaseCoreActivity;", "activity", "<init>", "(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfirmPurchaseDialogUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPurchaseDialogUi.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1855#2,2:66\n*S KotlinDebug\n*F\n+ 1 ConfirmPurchaseDialogUi.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogUi\n*L\n51#1:66,2\n*E\n"})
/* renamed from: Rx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35798Rx0 extends AbstractC30055xA {

    /* renamed from: c */
    public final C5029LZ f32934c;

    /* renamed from: d */
    public final DialogInterface f32935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35798Rx0(BaseCoreActivity activity, C5029LZ binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f32934c = binding;
        this.f32935d = dialog;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m86178Pl() {
        PaymentButton paymentButton = this.f32934c.f21667e;
        Intrinsics.checkNotNullExpressionValue(paymentButton, "binding.defaultPayment");
        return C44626lf5.clicksThrottle$default(paymentButton, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final void m86177Ql(List<Pair<String, String>> lineItems, String totalAmountText) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(totalAmountText, "totalAmountText");
        this.f32934c.f21678p.setText(totalAmountText);
        this.f32934c.f21670h.removeAllViews();
        Iterator<T> it = lineItems.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C43417jd2 m30189c = C43417jd2.m30189c(getActivity().getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(m30189c, "inflate(activity.layoutInflater)");
            m30189c.f93035c.setText((CharSequence) pair.getFirst());
            m30189c.f93034b.setText((CharSequence) pair.getSecond());
            this.f32934c.f21670h.addView(m30189c.getRoot());
        }
    }

    /* renamed from: Rl */
    public final void m86176Rl(BirdPayment defaultPayment) {
        Intrinsics.checkNotNullParameter(defaultPayment, "defaultPayment");
        String str = "";
        if (defaultPayment.isAdyen()) {
            PaymentButton paymentButton = this.f32934c.f21667e;
            boolean isGooglePay = defaultPayment.isGooglePay();
            String brand = defaultPayment.getBrand();
            if (brand == null) {
                brand = "";
            }
            String lastCardNumbers = defaultPayment.getLastCardNumbers();
            if (lastCardNumbers != null) {
                str = lastCardNumbers;
            }
            paymentButton.setAdyenCard(isGooglePay, brand, str);
        } else if (defaultPayment.isStripeCard()) {
            PaymentButton paymentButton2 = this.f32934c.f21667e;
            Card stripeCard = defaultPayment.getStripeCard();
            Intrinsics.checkNotNull(stripeCard);
            paymentButton2.setStripeCard(stripeCard);
        } else if (defaultPayment.isStripePaymentMethod()) {
            PaymentButton paymentButton3 = this.f32934c.f21667e;
            PaymentMethod stripePaymentMethod = defaultPayment.getStripePaymentMethod();
            Intrinsics.checkNotNull(stripePaymentMethod);
            paymentButton3.setStripePaymentMethod(stripePaymentMethod);
        } else if (defaultPayment.isPaypal()) {
            PaymentButton paymentButton4 = this.f32934c.f21667e;
            String paypalEmail = defaultPayment.getPaypalEmail();
            if (paypalEmail != null) {
                str = paypalEmail;
            }
            paymentButton4.setPaypal(str);
        }
    }

    /* renamed from: Sl */
    public final void m86175Sl(boolean z) {
        Group group = this.f32934c.f21673k;
        Intrinsics.checkNotNullExpressionValue(group, "binding.loadingViews");
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    public final void dismiss() {
        this.f32935d.dismiss();
    }

    /* renamed from: f */
    public final Observable<Unit> m86174f() {
        Button button = this.f32934c.f21674l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.payButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
