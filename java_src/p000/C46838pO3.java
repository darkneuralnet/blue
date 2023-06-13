package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Integer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: pO3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46838pO3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pO3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27284a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.BANCONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.GIROPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.GOOGLE_PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.IDEAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.PAYPAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.SOFORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Integer m19355a(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        switch (C27284a.$EnumSwitchMapping$0[paymentMethod.ordinal()]) {
            case 1:
                return Integer.valueOf(C48193rg4.ic_bancontact_brand);
            case 2:
                return Integer.valueOf(C48193rg4.ic_payment);
            case 3:
                return Integer.valueOf(C48193rg4.ic_giropay_brand);
            case 4:
                return Integer.valueOf(C48193rg4.ic_google_pay);
            case 5:
                return Integer.valueOf(C48193rg4.ic_ideal);
            case 6:
                return Integer.valueOf(C48193rg4.ic_paypal_brand);
            case 7:
                return Integer.valueOf(C48193rg4.ic_klarna_brand);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static final String m19354b(PaymentMethod paymentMethod, Context context) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C27284a.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i != 2) {
            if (i != 5) {
                if (i != 7) {
                    return paymentMethod.label();
                }
                String string = context.getString(C47650ql4.sofort_label);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.sofort_label)");
                return string;
            }
            String string2 = context.getString(C47650ql4.ideal_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.ideal_label)");
            return string2;
        }
        String string3 = context.getString(C45871nl4.payment_credit_card);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.payment_credit_card)");
        return string3;
    }
}
