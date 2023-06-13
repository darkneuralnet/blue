package com.stripe.android.p049ui.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.FieldValuesToParamsMapConverter$Companion$getKeys$1 */
/* loaded from: classes7.dex */
public final class FieldValuesToParamsMapConverter$Companion$getKeys$1 extends Lambda implements Function1<MatchResult, List<? extends String>> {
    public static final FieldValuesToParamsMapConverter$Companion$getKeys$1 INSTANCE = new FieldValuesToParamsMapConverter$Companion$getKeys$1();

    public FieldValuesToParamsMapConverter$Companion$getKeys$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<String> invoke(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues();
    }
}
