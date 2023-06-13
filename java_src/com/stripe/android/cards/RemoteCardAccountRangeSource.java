package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/cards/RemoteCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "", "onCardMetadataMissingRange", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "cardAccountRangeStore", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "LGX2;", "", "_loading", "LGX2;", "LEu1;", "getLoading", "()LEu1;", "loading", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class RemoteCardAccountRangeSource implements CardAccountRangeSource {
    private final GX2<Boolean> _loading;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final CardAccountRangeStore cardAccountRangeStore;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    public RemoteCardAccountRangeSource(StripeRepository stripeRepository, ApiRequest.Options requestOptions, CardAccountRangeStore cardAccountRangeStore, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(cardAccountRangeStore, "cardAccountRangeStore");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.stripeRepository = stripeRepository;
        this.requestOptions = requestOptions;
        this.cardAccountRangeStore = cardAccountRangeStore;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this._loading = C50405vP5.m8742a(Boolean.FALSE);
    }

    private final void onCardMetadataMissingRange() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 30, null));
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.cards.CardAccountRangeSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        RemoteCardAccountRangeSource$getAccountRanges$1 remoteCardAccountRangeSource$getAccountRanges$1;
        Object coroutine_suspended;
        int i;
        CardNumber.Unvalidated unvalidated2;
        Bin bin;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource;
        CardMetadata cardMetadata;
        List<AccountRange> list;
        if (continuation instanceof RemoteCardAccountRangeSource$getAccountRanges$1) {
            remoteCardAccountRangeSource$getAccountRanges$1 = (RemoteCardAccountRangeSource$getAccountRanges$1) continuation;
            int i2 = remoteCardAccountRangeSource$getAccountRanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteCardAccountRangeSource$getAccountRanges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteCardAccountRangeSource$getAccountRanges$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = remoteCardAccountRangeSource$getAccountRanges$1.label;
                if (i == 0) {
                    if (i == 1) {
                        bin = (Bin) remoteCardAccountRangeSource$getAccountRanges$1.L$2;
                        unvalidated2 = (CardNumber.Unvalidated) remoteCardAccountRangeSource$getAccountRanges$1.L$1;
                        remoteCardAccountRangeSource = (RemoteCardAccountRangeSource) remoteCardAccountRangeSource$getAccountRanges$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Bin bin2 = unvalidated.getBin();
                    if (bin2 == null) {
                        return null;
                    }
                    this._loading.setValue(Boxing.boxBoolean(true));
                    StripeRepository stripeRepository = this.stripeRepository;
                    ApiRequest.Options options = this.requestOptions;
                    remoteCardAccountRangeSource$getAccountRanges$1.L$0 = this;
                    remoteCardAccountRangeSource$getAccountRanges$1.L$1 = unvalidated;
                    remoteCardAccountRangeSource$getAccountRanges$1.L$2 = bin2;
                    remoteCardAccountRangeSource$getAccountRanges$1.label = 1;
                    Object cardMetadata$payments_core_release = stripeRepository.getCardMetadata$payments_core_release(bin2, options, remoteCardAccountRangeSource$getAccountRanges$1);
                    if (cardMetadata$payments_core_release == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unvalidated2 = unvalidated;
                    bin = bin2;
                    obj = cardMetadata$payments_core_release;
                    remoteCardAccountRangeSource = this;
                }
                cardMetadata = (CardMetadata) obj;
                if (cardMetadata == null) {
                    list = cardMetadata.getAccountRanges();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                remoteCardAccountRangeSource.cardAccountRangeStore.save(bin, list);
                remoteCardAccountRangeSource._loading.setValue(Boxing.boxBoolean(false));
                if (!list.isEmpty()) {
                    return null;
                }
                if (unvalidated2.isValidLuhn()) {
                    remoteCardAccountRangeSource.onCardMetadataMissingRange();
                }
                return list;
            }
        }
        remoteCardAccountRangeSource$getAccountRanges$1 = new RemoteCardAccountRangeSource$getAccountRanges$1(this, continuation);
        Object obj2 = remoteCardAccountRangeSource$getAccountRanges$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remoteCardAccountRangeSource$getAccountRanges$1.label;
        if (i == 0) {
        }
        cardMetadata = (CardMetadata) obj2;
        if (cardMetadata == null) {
        }
        if (list == null) {
        }
        remoteCardAccountRangeSource.cardAccountRangeStore.save(bin, list);
        remoteCardAccountRangeSource._loading.setValue(Boxing.boxBoolean(false));
        if (!list.isEmpty()) {
        }
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public InterfaceC32730Eu1<Boolean> getLoading() {
        return this._loading;
    }
}
