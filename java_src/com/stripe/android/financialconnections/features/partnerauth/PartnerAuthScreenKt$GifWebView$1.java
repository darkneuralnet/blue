package com.stripe.android.financialconnections.features.partnerauth;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$GifWebView$1 extends Lambda implements Function1<WebView, Unit> {
    public static final PartnerAuthScreenKt$GifWebView$1 INSTANCE = new PartnerAuthScreenKt$GifWebView$1();

    public PartnerAuthScreenKt$GifWebView$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WebView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setVerticalScrollBarEnabled(false);
        it.setVerticalFadingEdgeEnabled(false);
    }
}
