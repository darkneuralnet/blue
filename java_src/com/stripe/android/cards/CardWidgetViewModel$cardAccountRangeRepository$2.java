package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class CardWidgetViewModel$cardAccountRangeRepository$2 extends Lambda implements Function0<CardAccountRangeRepository> {
    final /* synthetic */ CardAccountRangeRepository.Factory $cardAccountRangeRepositoryFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$cardAccountRangeRepository$2(CardAccountRangeRepository.Factory factory) {
        super(0);
        this.$cardAccountRangeRepositoryFactory = factory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CardAccountRangeRepository invoke() {
        return this.$cardAccountRangeRepositoryFactory.create();
    }
}
