package com.appboy.p027ui.widget;

import com.appboy.models.cards.Card;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "Lcom/appboy/models/cards/Card;", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
/* renamed from: com.appboy.ui.widget.BaseCardView$handleCardClick$1 */
/* loaded from: classes.dex */
public final class BaseCardView$handleCardClick$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Card $card;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView$handleCardClick$1(Card card) {
        super(0);
        this.$card = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Intrinsics.stringPlus("Handling card click for card: ", this.$card);
    }
}
