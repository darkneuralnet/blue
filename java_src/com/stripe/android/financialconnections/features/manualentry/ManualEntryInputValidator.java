package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.C18634R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\f\u0010\u000f\u001a\u00020\u0010*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;", "", "()V", "ACCOUNT_NUMBER_MAX_LENGTH", "", "ROUTING_NUMBER_LENGTH", "getAccountConfirmIdOrNull", "accountInput", "", "accountConfirmInput", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "getAccountErrorIdOrNull", "input", "(Ljava/lang/String;)Ljava/lang/Integer;", "getRoutingErrorIdOrNull", "isUSRoutingNumber", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nManualEntryInputValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryInputValidator.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,51:1\n1128#2,4:52\n*S KotlinDebug\n*F\n+ 1 ManualEntryInputValidator.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator\n*L\n39#1:52,4\n*E\n"})
/* loaded from: classes7.dex */
public final class ManualEntryInputValidator {
    private static final int ACCOUNT_NUMBER_MAX_LENGTH = 17;
    public static final ManualEntryInputValidator INSTANCE = new ManualEntryInputValidator();
    private static final int ROUTING_NUMBER_LENGTH = 9;

    private ManualEntryInputValidator() {
    }

    private final boolean isUSRoutingNumber(String str) {
        int digitToInt;
        ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1 manualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1 = ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1.INSTANCE;
        if (!new Regex("^\\d{9}$").matches(str)) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            digitToInt = CharsKt__CharKt.digitToInt(str.charAt(i), 10);
            i2 += digitToInt * manualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1.invoke((ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1) Integer.valueOf(i3)).intValue();
            i++;
            i3++;
        }
        if (i2 % 10 != 0) {
            return false;
        }
        return true;
    }

    public final Integer getAccountConfirmIdOrNull(String accountInput, String accountConfirmInput) {
        Intrinsics.checkNotNullParameter(accountInput, "accountInput");
        Intrinsics.checkNotNullParameter(accountConfirmInput, "accountConfirmInput");
        if (getAccountErrorIdOrNull(accountInput) == null && !Intrinsics.areEqual(accountInput, accountConfirmInput)) {
            return Integer.valueOf(C18634R.string.stripe_validation_account_confirm_mismatch);
        }
        return null;
    }

    public final Integer getAccountErrorIdOrNull(String input) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Integer.valueOf(C18634R.string.stripe_validation_account_required);
        }
        if (input.length() > 17) {
            return Integer.valueOf(C18634R.string.stripe_validation_account_too_long);
        }
        return null;
    }

    public final Integer getRoutingErrorIdOrNull(String input) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Integer.valueOf(C18634R.string.stripe_validation_routing_required);
        }
        if (input.length() != 9) {
            return Integer.valueOf(C18634R.string.stripe_validation_routing_too_short);
        }
        if (!isUSRoutingNumber(input)) {
            return Integer.valueOf(C18634R.string.stripe_validation_no_us_routing);
        }
        return null;
    }
}
