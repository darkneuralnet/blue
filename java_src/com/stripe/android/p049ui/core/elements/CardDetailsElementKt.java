package com.stripe.android.p049ui.core.elements;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.stripe.android.uicore.elements.ConvertTo4DigitDateKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, m28432d2 = {"createExpiryDateFormFieldValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "entry", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsElementKt */
/* loaded from: classes7.dex */
public final class CardDetailsElementKt {
    public static final Map<IdentifierSpec, FormFieldEntry> createExpiryDateFormFieldValues(FormFieldEntry entry) {
        int i;
        String padStart;
        Map<IdentifierSpec, FormFieldEntry> mapOf;
        String take;
        Integer intOrNull;
        String takeLast;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(entry, "entry");
        String value = entry.getValue();
        int i2 = -1;
        if (value != null) {
            String convertTo4DigitDate = ConvertTo4DigitDateKt.convertTo4DigitDate(value);
            if (convertTo4DigitDate.length() == 4) {
                take = StringsKt___StringsKt.take(convertTo4DigitDate, 2);
                intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(take);
                if (intOrNull != null) {
                    i2 = intOrNull.intValue();
                    takeLast = StringsKt___StringsKt.takeLast(convertTo4DigitDate, 2);
                    intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(takeLast);
                    if (intOrNull2 != null) {
                        i = intOrNull2.intValue() + CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
                        padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), 2, '0');
                        FormFieldEntry copy$default = FormFieldEntry.copy$default(entry, padStart, false, 2, null);
                        FormFieldEntry copy$default2 = FormFieldEntry.copy$default(entry, String.valueOf(i), false, 2, null);
                        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
                        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(companion.getCardExpMonth(), copy$default), TuplesKt.m28425to(companion.getCardExpYear(), copy$default2));
                        return mapOf;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        i = -1;
        padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), 2, '0');
        FormFieldEntry copy$default3 = FormFieldEntry.copy$default(entry, padStart, false, 2, null);
        FormFieldEntry copy$default22 = FormFieldEntry.copy$default(entry, String.valueOf(i), false, 2, null);
        IdentifierSpec.Companion companion2 = IdentifierSpec.Companion;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(companion2.getCardExpMonth(), copy$default3), TuplesKt.m28425to(companion2.getCardExpYear(), copy$default22));
        return mapOf;
    }
}
