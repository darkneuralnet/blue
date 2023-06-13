package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00061"}, m28432d2 = {"Lcom/stripe/android/cards/CardAccountRangeService;", "", "Lcom/stripe/android/model/AccountRange;", "accountRange", "", "shouldQueryRepository", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "shouldQueryAccountRange", "", "onCardNumberChanged", "queryAccountRangeRepository", "cancelAccountRangeRepositoryJob", "newAccountRange", "updateAccountRangeResult", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "getStaticCardAccountRanges", "()Lcom/stripe/android/cards/StaticCardAccountRanges;", "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "accountRangeResultListener", "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "LEu1;", "isLoading", "LEu1;", "()LEu1;", "<set-?>", "Lcom/stripe/android/model/AccountRange;", "getAccountRange", "()Lcom/stripe/android/model/AccountRange;", "Lzh2;", "accountRangeRepositoryJob", "Lzh2;", "getAccountRangeRepositoryJob", "()Lzh2;", "setAccountRangeRepositoryJob", "(Lzh2;)V", "getAccountRangeRepositoryJob$annotations", "()V", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;)V", "AccountRangeResultListener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CardAccountRangeService {
    public static final int $stable = 8;
    private AccountRange accountRange;
    private InterfaceC52943zh2 accountRangeRepositoryJob;
    private final AccountRangeResultListener accountRangeResultListener;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private final InterfaceC32730Eu1<Boolean> isLoading;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "", "onAccountRangeResult", "", "newAccountRange", "Lcom/stripe/android/model/AccountRange;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface AccountRangeResultListener {
        void onAccountRangeResult(AccountRange accountRange);
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.UnionPay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardAccountRangeService(CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext workContext, StaticCardAccountRanges staticCardAccountRanges, AccountRangeResultListener accountRangeResultListener) {
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(accountRangeResultListener, "accountRangeResultListener");
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.workContext = workContext;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.accountRangeResultListener = accountRangeResultListener;
        this.isLoading = cardAccountRangeRepository.getLoading();
    }

    public static /* synthetic */ void getAccountRangeRepositoryJob$annotations() {
    }

    private final boolean shouldQueryAccountRange(CardNumber.Unvalidated unvalidated) {
        boolean z;
        BinRange binRange;
        if (this.accountRange == null || unvalidated.getBin() == null) {
            return true;
        }
        AccountRange accountRange = this.accountRange;
        if (accountRange != null && (binRange = accountRange.getBinRange()) != null && !binRange.matches(unvalidated)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    private final boolean shouldQueryRepository(AccountRange accountRange) {
        int i = WhenMappings.$EnumSwitchMapping$0[accountRange.getBrand().ordinal()];
        return i == 1 || i == 2;
    }

    public final void cancelAccountRangeRepositoryJob() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.accountRangeRepositoryJob;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public final AccountRange getAccountRange() {
        return this.accountRange;
    }

    public final InterfaceC52943zh2 getAccountRangeRepositoryJob() {
        return this.accountRangeRepositoryJob;
    }

    public final StaticCardAccountRanges getStaticCardAccountRanges() {
        return this.staticCardAccountRanges;
    }

    public final InterfaceC32730Eu1<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void onCardNumberChanged(CardNumber.Unvalidated cardNumber) {
        AccountRange accountRange;
        Object first;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        List<AccountRange> filter = this.staticCardAccountRanges.filter(cardNumber);
        if (filter.size() == 1) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) filter);
            accountRange = (AccountRange) first;
        } else {
            accountRange = null;
        }
        if (accountRange != null && !shouldQueryRepository(accountRange)) {
            updateAccountRangeResult(accountRange);
        } else {
            queryAccountRangeRepository(cardNumber);
        }
    }

    public final /* synthetic */ void queryAccountRangeRepository(CardNumber.Unvalidated cardNumber) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (shouldQueryAccountRange(cardNumber)) {
            cancelAccountRangeRepositoryJob();
            this.accountRange = null;
            m73800d = Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new CardAccountRangeService$queryAccountRangeRepository$1(cardNumber, this, null), 3, null);
            this.accountRangeRepositoryJob = m73800d;
        }
    }

    public final void setAccountRangeRepositoryJob(InterfaceC52943zh2 interfaceC52943zh2) {
        this.accountRangeRepositoryJob = interfaceC52943zh2;
    }

    public final /* synthetic */ void updateAccountRangeResult(AccountRange accountRange) {
        this.accountRange = accountRange;
        this.accountRangeResultListener.onAccountRangeResult(accountRange);
    }
}
