package com.stripe.android.view;

import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/PostalCodeValidator;", "", "()V", "isValid", "", "postalCode", "", "countryCode", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "isValid$payments_core_release", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PostalCodeValidator {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Map<String, Pattern> POSTAL_CODE_PATTERNS;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R*\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/PostalCodeValidator$Companion;", "", "()V", "POSTAL_CODE_PATTERNS", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isPostalCodeNotRequired", "", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPostalCodeNotRequired(List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2) {
            ShippingInfoWidget.CustomizableShippingField customizableShippingField = ShippingInfoWidget.CustomizableShippingField.PostalCode;
            if (!list.contains(customizableShippingField) && !list2.contains(customizableShippingField)) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    static {
        Map<String, Pattern> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));
        POSTAL_CODE_PATTERNS = mapOf;
    }

    public final boolean isValid(String postalCode, String countryCode) {
        boolean isBlank;
        Matcher matcher;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Pattern pattern = POSTAL_CODE_PATTERNS.get(countryCode);
        if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
            return matcher.matches();
        }
        if (CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode)) {
            isBlank = StringsKt__StringsJVMKt.isBlank(postalCode);
            if (!(!isBlank)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isValid$payments_core_release(String postalCode, String str, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
        boolean isBlank;
        boolean isBlank2;
        Matcher matcher;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (str == null) {
            return false;
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(postalCode);
        if (!isBlank || !Companion.isPostalCodeNotRequired(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            Pattern pattern = POSTAL_CODE_PATTERNS.get(str);
            if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
                return matcher.matches();
            }
            if (CountryUtils.INSTANCE.doesCountryUsePostalCode(str)) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(postalCode);
                if (!(!isBlank2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
