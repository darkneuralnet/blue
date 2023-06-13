package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.C18606R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "", C17296a.f69688o, "", "b", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: xf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51735xf0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xf0$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C30266a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.AmericanExpress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardBrand.MasterCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardBrand.Discover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardBrand.JCB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardBrand.DinersClub.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardBrand.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m4898a(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        switch (C30266a.$EnumSwitchMapping$0[brand.ordinal()]) {
            case 1:
                return C18606R.C18607drawable.stripe_ic_visa;
            case 2:
                return C18606R.C18607drawable.stripe_ic_amex;
            case 3:
                return C18606R.C18607drawable.stripe_ic_mastercard;
            case 4:
                return C18606R.C18607drawable.stripe_ic_discover;
            case 5:
                return C18606R.C18607drawable.stripe_ic_jcb;
            case 6:
                return C18606R.C18607drawable.stripe_ic_diners;
            case 7:
                return C18606R.C18607drawable.stripe_ic_unknown;
            default:
                return C18606R.C18607drawable.stripe_ic_unknown;
        }
    }

    /* renamed from: b */
    public static final int m4897b(String brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        String lowerCase = brand.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        String lowerCase2 = CardBrand.AmericanExpress.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
            return C18606R.C18607drawable.stripe_ic_amex;
        }
        String lowerCase3 = CardBrand.DinersClub.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase3)) {
            return C18606R.C18607drawable.stripe_ic_diners;
        }
        String lowerCase4 = CardBrand.Discover.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase4)) {
            return C18606R.C18607drawable.stripe_ic_discover;
        }
        String lowerCase5 = CardBrand.JCB.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase5)) {
            return C18606R.C18607drawable.stripe_ic_jcb;
        }
        String lowerCase6 = CardBrand.MasterCard.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase6)) {
            return C18606R.C18607drawable.stripe_ic_mastercard;
        }
        String lowerCase7 = CardBrand.Visa.getCode().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual(lowerCase, lowerCase7)) {
            return C18606R.C18607drawable.stripe_ic_visa;
        }
        return C18606R.C18607drawable.stripe_ic_unknown;
    }
}
