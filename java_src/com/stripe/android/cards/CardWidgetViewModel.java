package com.stripe.android.cards;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/cards/CardWidgetViewModel;", "Lie;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository$delegate", "Lkotlin/Lazy;", "getCardAccountRangeRepository", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Landroid/app/Application;", "application", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "cardAccountRangeRepositoryFactory", "<init>", "(Landroid/app/Application;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V", "(Landroid/app/Application;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CardWidgetViewModel extends C23294ie {
    private final Lazy cardAccountRangeRepository$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        super(application);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        lazy = LazyKt__LazyJVMKt.lazy(new CardWidgetViewModel$cardAccountRangeRepository$2(cardAccountRangeRepositoryFactory));
        this.cardAccountRangeRepository$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardAccountRangeRepository getCardAccountRangeRepository() {
        return (CardAccountRangeRepository) this.cardAccountRangeRepository$delegate.getValue();
    }

    public final LiveData<AccountRange> getAccountRange(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        return WC0.m78736b(null, 0L, new CardWidgetViewModel$getAccountRange$1(this, cardNumber, null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application) {
        this(application, new DefaultCardAccountRangeRepositoryFactory(application));
        Intrinsics.checkNotNullParameter(application, "application");
    }
}
