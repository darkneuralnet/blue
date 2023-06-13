package com.stripe.android.cards;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "(Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "appContext", "kotlin.jvm.PlatformType", "create", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "createRemoteCardAccountRangeSource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "createWithStripeRepository", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", "fireAnalyticsEvent", "", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "NullCardAccountRangeSource", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Context appContext;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory$NullCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEu1;", "", "loading", "LEu1;", "getLoading", "()LEu1;", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class NullCardAccountRangeSource implements CardAccountRangeSource {
        private final InterfaceC32730Eu1<Boolean> loading = C36708Vu1.m79281G(Boolean.FALSE);

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
            return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public InterfaceC32730Eu1<Boolean> getLoading() {
            return this.loading;
        }
    }

    public DefaultCardAccountRangeRepositoryFactory(Context context, AnalyticsRequestExecutor analyticsRequestExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.appContext = context.getApplicationContext();
    }

    private final CardAccountRangeSource createRemoteCardAccountRangeSource() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            PaymentConfiguration.Companion companion2 = PaymentConfiguration.Companion;
            Context appContext = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            obj = Result.m116783constructorimpl(companion2.getInstance(appContext).getPublishableKey());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116790isSuccessimpl(obj)) {
            fireAnalyticsEvent((String) obj, PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (Result.m116786exceptionOrNullimpl(obj) != null) {
            fireAnalyticsEvent(ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY, PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (Result.m116786exceptionOrNullimpl(obj) == null) {
            String str = (String) obj;
            Context appContext2 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
            StripeApiRepository stripeApiRepository = new StripeApiRepository(appContext2, new C18616x3970d67f(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
            Context appContext3 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext3, "appContext");
            DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(appContext3);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            Context appContext4 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext4, "appContext");
            return new RemoteCardAccountRangeSource(stripeApiRepository, options, defaultCardAccountRangeStore, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext4, str, (Set) null, 4, (DefaultConstructorMarker) null));
        }
        return new NullCardAccountRangeSource();
    }

    private final void fireAnalyticsEvent(String str, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(new PaymentAnalyticsRequestFactory(appContext, str, (Set) null, 4, (DefaultConstructorMarker) null), paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository create() throws IllegalStateException {
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(appContext);
        return new DefaultCardAccountRangeRepository(new InMemoryCardAccountRangeSource(defaultCardAccountRangeStore), createRemoteCardAccountRangeSource(), new StaticCardAccountRangeSource(null, 1, null), defaultCardAccountRangeStore);
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository createWithStripeRepository(StripeRepository stripeRepository, String publishableKey) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(appContext);
        InMemoryCardAccountRangeSource inMemoryCardAccountRangeSource = new InMemoryCardAccountRangeSource(defaultCardAccountRangeStore);
        ApiRequest.Options options = new ApiRequest.Options(publishableKey, null, null, 6, null);
        Context appContext2 = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore2 = new DefaultCardAccountRangeStore(appContext2);
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
        Context appContext3 = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext3, "appContext");
        return new DefaultCardAccountRangeRepository(inMemoryCardAccountRangeSource, new RemoteCardAccountRangeSource(stripeRepository, options, defaultCardAccountRangeStore2, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext3, publishableKey, (Set) null, 4, (DefaultConstructorMarker) null)), new StaticCardAccountRangeSource(null, 1, null), defaultCardAccountRangeStore);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory(Context context) {
        this(context, new DefaultAnalyticsRequestExecutor());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
