package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.IbanConfig$isIbanValid$1 */
/* loaded from: classes7.dex */
public final class IbanConfig$isIbanValid$1 extends Lambda implements Function1<MatchResult, CharSequence> {
    public static final IbanConfig$isIbanValid$1 INSTANCE = new IbanConfig$isIbanValid$1();

    public IbanConfig$isIbanValid$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult it) {
        char first;
        Intrinsics.checkNotNullParameter(it, "it");
        first = StringsKt___StringsKt.first(it.getValue());
        return String.valueOf((first - 'A') + 10);
    }
}
