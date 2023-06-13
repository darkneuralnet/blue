package com.stripe.android.financialconnections.features;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class MarkdownParser$markDownToHtmlRegex$2 extends Lambda implements Function1<MatchResult, String> {
    public static final MarkdownParser$markDownToHtmlRegex$2 INSTANCE = new MarkdownParser$markDownToHtmlRegex$2();

    public MarkdownParser$markDownToHtmlRegex$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it.getGroupValues().get(1);
        return "<b>" + ((Object) str) + "</b>";
    }
}
