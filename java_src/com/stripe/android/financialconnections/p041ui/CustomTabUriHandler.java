package com.stripe.android.financialconnections.p041ui;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.presentation.CreateBrowserIntentForUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;", "LDf6;", "", "uri", "", "openUri", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.CustomTabUriHandler */
/* loaded from: classes7.dex */
public final class CustomTabUriHandler implements InterfaceC32366Df6 {
    private final Context context;

    public CustomTabUriHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // p000.InterfaceC32366Df6
    public void openUri(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = this.context;
        CreateBrowserIntentForUrl createBrowserIntentForUrl = CreateBrowserIntentForUrl.INSTANCE;
        Uri parse = Uri.parse(uri);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(uri)");
        context.startActivity(createBrowserIntentForUrl.invoke(context, parse));
    }
}
