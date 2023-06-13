package com.stripe.android.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "", "companyName", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BecsDebitMandateAcceptanceTextFactory {
    public static final int $stable = 8;
    private final Context context;

    public BecsDebitMandateAcceptanceTextFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final CharSequence create(String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        String string = this.context.getString(C18606R.string.becs_mandate_acceptance, companyName);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …    companyName\n        )");
        Spanned fromHtml = Html.fromHtml(string, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n            Html.fromH…ML_MODE_LEGACY)\n        }");
        return fromHtml;
    }
}
