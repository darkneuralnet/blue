package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/cards/StaticCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "accountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "LEu1;", "", "loading", "LEu1;", "getLoading", "()LEu1;", "<init>", "(Lcom/stripe/android/cards/StaticCardAccountRanges;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class StaticCardAccountRangeSource implements CardAccountRangeSource {
    public static final int $stable = 8;
    private final StaticCardAccountRanges accountRanges;
    private final InterfaceC32730Eu1<Boolean> loading;

    public StaticCardAccountRangeSource() {
        this(null, 1, null);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        return this.accountRanges.filter(unvalidated);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public InterfaceC32730Eu1<Boolean> getLoading() {
        return this.loading;
    }

    public StaticCardAccountRangeSource(StaticCardAccountRanges accountRanges) {
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.loading = C36708Vu1.m79281G(Boolean.FALSE);
    }

    public /* synthetic */ StaticCardAccountRangeSource(StaticCardAccountRanges staticCardAccountRanges, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges);
    }
}
