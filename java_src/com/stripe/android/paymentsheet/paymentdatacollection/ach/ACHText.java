package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.C19159R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/ACHText;", "", "()V", "getContinueMandateText", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ACHText {
    public static final ACHText INSTANCE = new ACHText();

    private ACHText() {
    }

    public final String getContinueMandateText(Context context) {
        String replace$default;
        String replace$default2;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C19159R.string.stripe_paymentsheet_ach_continue_mandate);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ontinue_mandate\n        )");
        replace$default = StringsKt__StringsJVMKt.replace$default(string, "<terms>", "<a href=\"https://stripe.com/ach-payments/authorization\">", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "</terms>", "</a>", false, 4, (Object) null);
        return replace$default2;
    }
}
