package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lkotlin/text/Regex;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.UpiConfig$upiPattern$2 */
/* loaded from: classes7.dex */
public final class UpiConfig$upiPattern$2 extends Lambda implements Function0<Regex> {
    public static final UpiConfig$upiPattern$2 INSTANCE = new UpiConfig$upiPattern$2();

    public UpiConfig$upiPattern$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Regex invoke() {
        return new Regex("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
    }
}
