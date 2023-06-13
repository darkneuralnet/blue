package com.stripe.android.financialconnections.p041ui.sdui;

import android.text.Html;
import android.text.Spanned;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m28432d2 = {"fromHtml", "Landroid/text/Spanned;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt */
/* loaded from: classes7.dex */
public final class ServerDrivenUiKt {
    public static final Spanned fromHtml(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Spanned fromHtml = Html.fromHtml(source, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n        Html.fromHtml(…M_HTML_MODE_LEGACY)\n    }");
        return fromHtml;
    }
}
