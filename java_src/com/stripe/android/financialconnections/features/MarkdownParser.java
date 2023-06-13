package com.stripe.android.financialconnections.features;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/MarkdownParser;", "", "()V", "REGEX_BOLD_ASTERISKS", "", "REGEX_BOLD_UNDERSCORES", "REGEX_LINK", "markDownToHtmlRegex", "", "Lkotlin/Pair;", "Lkotlin/text/Regex;", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "", "toHtml", "string", "toHtml$financial_connections_release", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMarkdownParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownParser.kt\ncom/stripe/android/financialconnections/features/MarkdownParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1855#2,2:28\n*S KotlinDebug\n*F\n+ 1 MarkdownParser.kt\ncom/stripe/android/financialconnections/features/MarkdownParser\n*L\n21#1:28,2\n*E\n"})
/* loaded from: classes7.dex */
public final class MarkdownParser {
    public static final MarkdownParser INSTANCE = new MarkdownParser();
    private static final String REGEX_BOLD_ASTERISKS = "\\*\\*(.*?)\\*\\*";
    private static final String REGEX_BOLD_UNDERSCORES = "__([^_]+)__";
    private static final String REGEX_LINK = "\\[([^]]+)]\\(([^)]+)\\)";
    private static final List<Pair<Regex, Function1<MatchResult, CharSequence>>> markDownToHtmlRegex;

    static {
        List<Pair<Regex, Function1<MatchResult, CharSequence>>> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(new Regex(REGEX_BOLD_ASTERISKS), MarkdownParser$markDownToHtmlRegex$1.INSTANCE), TuplesKt.m28425to(new Regex(REGEX_BOLD_UNDERSCORES), MarkdownParser$markDownToHtmlRegex$2.INSTANCE), TuplesKt.m28425to(new Regex(REGEX_LINK), MarkdownParser$markDownToHtmlRegex$3.INSTANCE)});
        markDownToHtmlRegex = listOf;
    }

    private MarkdownParser() {
    }

    public final String toHtml$financial_connections_release(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Iterator<T> it = markDownToHtmlRegex.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            string = ((Regex) pair.component1()).replace(string, (Function1) pair.component2());
        }
        return string;
    }
}
