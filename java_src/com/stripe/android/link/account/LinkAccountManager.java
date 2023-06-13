package com.stripe.android.link.account;

import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.inline.UserInput;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010X\u001a\u00020W¢\u0006\u0004\br\u0010sJR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J8\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b&\u0010'J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010)\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b*\u0010+J\"\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b.\u0010'J*\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00062\u0006\u00101\u001a\u000200H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b3\u00104J\"\u00108\u001a\b\u0012\u0004\u0012\u0002060\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b7\u0010'J*\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00062\u0006\u00109\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b;\u0010+J:\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010=\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b@\u0010AJ*\u0010F\u001a\b\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010C\u001a\u00020BH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\bD\u0010EJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010G\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\bH\u0010+J\b\u0010K\u001a\u0004\u0018\u00010JJ\u0010\u0010L\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0014\u0010M\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R*\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006t"}, m28432d2 = {"Lcom/stripe/android/link/account/LinkAccountManager;", "", "T", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "apiCall", "retryingOnAuthError-gIAlu-s", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryingOnAuthError", "Lcom/stripe/android/model/ConsumerSession;", "consumerSession", "Lcom/stripe/android/link/model/LinkAccount;", "setAccount", "newSession", "", "maybeUpdateConsumerPublishableKey", "cookie", "email", "", "startSession", "lookupConsumer-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupConsumer", "Lcom/stripe/android/link/ui/inline/UserInput;", "userInput", "signInWithUserInput-gIAlu-s", "(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithUserInput", PaymentMethod.BillingDetails.PARAM_PHONE, "country", "name", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "consentAction", "signUp-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "startVerification-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVerification", PaymentMethodOptionsParams.Blik.PARAM_CODE, "confirmVerification-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmVerification", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "listPaymentDetails-IoAF18A", "listPaymentDetails", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "createCardPaymentDetails-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/model/FinancialConnectionsSession;", "createFinancialConnectionsSession-IoAF18A", "createFinancialConnectionsSession", "financialConnectionsAccountId", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "createBankAccountPaymentDetails-gIAlu-s", "createBankAccountPaymentDetails", "userEmail", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "createCardPaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updateParams", "updatePaymentDetails-gIAlu-s", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentDetails", "paymentDetailsId", "deletePaymentDetails-gIAlu-s", "deletePaymentDetails", "Lzh2;", "logout", "hasUserLoggedOut", "setAccountNullable", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "config", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "Lcom/stripe/android/link/repositories/LinkRepository;", "linkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "Lcom/stripe/android/link/account/CookieStore;", "cookieStore", "Lcom/stripe/android/link/account/CookieStore;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "LGX2;", "_linkAccount", "LGX2;", "LtP5;", "linkAccount", "LtP5;", "getLinkAccount", "()LtP5;", "setLinkAccount", "(LtP5;)V", "consumerPublishableKey", "Ljava/lang/String;", "getConsumerPublishableKey", "()Ljava/lang/String;", "setConsumerPublishableKey", "(Ljava/lang/String;)V", "LEu1;", "Lcom/stripe/android/link/model/AccountStatus;", "accountStatus", "LEu1;", "getAccountStatus", "()LEu1;", "userHasLoggedOut", "Z", "<init>", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n39#2,6:398\n1#3:404\n*S KotlinDebug\n*F\n+ 1 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n*L\n43#1:398,6\n*E\n"})
/* loaded from: classes7.dex */
public final class LinkAccountManager {
    private final GX2<LinkAccount> _linkAccount;
    private final InterfaceC32730Eu1<AccountStatus> accountStatus;
    private final LinkPaymentLauncher.Configuration config;
    private String consumerPublishableKey;
    private final CookieStore cookieStore;
    private InterfaceC49220tP5<LinkAccount> linkAccount;
    private final LinkEventsReporter linkEventsReporter;
    private final LinkRepository linkRepository;
    private boolean userHasLoggedOut;

    public LinkAccountManager(LinkPaymentLauncher.Configuration config, LinkRepository linkRepository, CookieStore cookieStore, LinkEventsReporter linkEventsReporter) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(linkRepository, "linkRepository");
        Intrinsics.checkNotNullParameter(cookieStore, "cookieStore");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        this.config = config;
        this.linkRepository = linkRepository;
        this.cookieStore = cookieStore;
        this.linkEventsReporter = linkEventsReporter;
        GX2<LinkAccount> m8742a = C50405vP5.m8742a(null);
        this._linkAccount = m8742a;
        this.linkAccount = m8742a;
        this.accountStatus = C36708Vu1.m79283E(new LinkAccountManager$special$$inlined$transform$1(m8742a, null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String cookie() {
        return this.cookieStore.getAuthSessionCookie$link_release();
    }

    /* renamed from: lookupConsumer-0E7RQCE$default  reason: not valid java name */
    public static /* synthetic */ Object m116486lookupConsumer0E7RQCE$default(LinkAccountManager linkAccountManager, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return linkAccountManager.m116495lookupConsumer0E7RQCE(str, z, continuation);
    }

    private final void maybeUpdateConsumerPublishableKey(ConsumerSession consumerSession) {
        Unit unit;
        String str;
        String publishableKey = consumerSession.getPublishableKey();
        if (publishableKey != null) {
            this.consumerPublishableKey = publishableKey;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LinkAccount value = this._linkAccount.getValue();
            if (value != null) {
                str = value.getEmail();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, consumerSession.getEmailAddress())) {
                this.consumerPublishableKey = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* renamed from: retryingOnAuthError-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m116487retryingOnAuthErrorgIAlus(Function2<? super String, ? super Continuation<? super Result<? extends T>>, ? extends Object> function2, Continuation<? super Result<? extends T>> continuation) {
        LinkAccountManager$retryingOnAuthError$1 linkAccountManager$retryingOnAuthError$1;
        Object coroutine_suspended;
        int i;
        LinkAccountManager linkAccountManager;
        Throwable m116786exceptionOrNullimpl;
        Result m116782boximpl;
        Object m116486lookupConsumer0E7RQCE$default;
        Throwable m116786exceptionOrNullimpl2;
        if (continuation instanceof LinkAccountManager$retryingOnAuthError$1) {
            linkAccountManager$retryingOnAuthError$1 = (LinkAccountManager$retryingOnAuthError$1) continuation;
            int i2 = linkAccountManager$retryingOnAuthError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$retryingOnAuthError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$retryingOnAuthError$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$retryingOnAuthError$1.label;
                Result result = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                result = Result.m116782boximpl(((Result) obj).m116792unboximpl());
                                m116782boximpl = result;
                                if (m116782boximpl != null) {
                                    return m116782boximpl.m116792unboximpl();
                                }
                                Result.Companion companion = Result.Companion;
                                return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function2 = (Function2) linkAccountManager$retryingOnAuthError$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        m116486lookupConsumer0E7RQCE$default = ((Result) obj).m116792unboximpl();
                        m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116486lookupConsumer0E7RQCE$default);
                        if (m116786exceptionOrNullimpl2 != null) {
                            LinkAccount linkAccount = (LinkAccount) m116486lookupConsumer0E7RQCE$default;
                            if (linkAccount != null) {
                                String clientSecret = linkAccount.getClientSecret();
                                linkAccountManager$retryingOnAuthError$1.L$0 = null;
                                linkAccountManager$retryingOnAuthError$1.label = 3;
                                obj = function2.invoke(clientSecret, linkAccountManager$retryingOnAuthError$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                result = Result.m116782boximpl(((Result) obj).m116792unboximpl());
                            }
                            m116782boximpl = result;
                            if (m116782boximpl != null) {
                            }
                            Result.Companion companion2 = Result.Companion;
                            return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
                        }
                        m116782boximpl = Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl2)));
                        if (m116782boximpl != null) {
                        }
                        Result.Companion companion22 = Result.Companion;
                        return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
                    }
                    function2 = (Function2) linkAccountManager$retryingOnAuthError$1.L$1;
                    linkAccountManager = (LinkAccountManager) linkAccountManager$retryingOnAuthError$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    LinkAccount value = this.linkAccount.getValue();
                    if (value != null) {
                        String clientSecret2 = value.getClientSecret();
                        linkAccountManager$retryingOnAuthError$1.L$0 = this;
                        linkAccountManager$retryingOnAuthError$1.L$1 = function2;
                        linkAccountManager$retryingOnAuthError$1.label = 1;
                        obj = function2.invoke(clientSecret2, linkAccountManager$retryingOnAuthError$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        linkAccountManager = this;
                    }
                    Result.Companion companion222 = Result.Companion;
                    return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
                }
                Object m116792unboximpl = ((Result) obj).m116792unboximpl();
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl);
                if (m116786exceptionOrNullimpl != null) {
                    m116782boximpl = Result.m116782boximpl(Result.m116783constructorimpl(m116792unboximpl));
                } else if ((m116786exceptionOrNullimpl instanceof AuthenticationException) && linkAccountManager.cookie() != null) {
                    linkAccountManager$retryingOnAuthError$1.L$0 = function2;
                    linkAccountManager$retryingOnAuthError$1.L$1 = null;
                    linkAccountManager$retryingOnAuthError$1.label = 2;
                    m116486lookupConsumer0E7RQCE$default = m116486lookupConsumer0E7RQCE$default(linkAccountManager, null, false, linkAccountManager$retryingOnAuthError$1, 2, null);
                    if (m116486lookupConsumer0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116486lookupConsumer0E7RQCE$default);
                    if (m116786exceptionOrNullimpl2 != null) {
                    }
                } else {
                    m116782boximpl = Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl)));
                }
                if (m116782boximpl != null) {
                }
                Result.Companion companion2222 = Result.Companion;
                return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
            }
        }
        linkAccountManager$retryingOnAuthError$1 = new LinkAccountManager$retryingOnAuthError$1(this, continuation);
        Object obj2 = linkAccountManager$retryingOnAuthError$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$retryingOnAuthError$1.label;
        Result result2 = null;
        if (i == 0) {
        }
        Object m116792unboximpl2 = ((Result) obj2).m116792unboximpl();
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116792unboximpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
        if (m116782boximpl != null) {
        }
        Result.Companion companion22222 = Result.Companion;
        return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("User not signed in")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkAccount setAccount(ConsumerSession consumerSession) {
        maybeUpdateConsumerPublishableKey(consumerSession);
        LinkAccount linkAccount = new LinkAccount(consumerSession);
        this._linkAccount.setValue(linkAccount);
        this.cookieStore.updateAuthSessionCookie$link_release(linkAccount.getAuthSessionCookie());
        if (this.cookieStore.isEmailLoggedOut$link_release(linkAccount.getEmail())) {
            this.cookieStore.storeLoggedOutEmail$link_release("");
        }
        return linkAccount;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: confirmVerification-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116488confirmVerificationgIAlus(String str, Continuation<? super Result<LinkAccount>> continuation) {
        LinkAccountManager$confirmVerification$1 linkAccountManager$confirmVerification$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$confirmVerification$1) {
            linkAccountManager$confirmVerification$1 = (LinkAccountManager$confirmVerification$1) continuation;
            int i2 = linkAccountManager$confirmVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$confirmVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$confirmVerification$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$confirmVerification$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$confirmVerification$2 linkAccountManager$confirmVerification$2 = new LinkAccountManager$confirmVerification$2(this, str, null);
                linkAccountManager$confirmVerification$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$confirmVerification$2, linkAccountManager$confirmVerification$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$confirmVerification$1 = new LinkAccountManager$confirmVerification$1(this, continuation);
        Object obj2 = linkAccountManager$confirmVerification$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$confirmVerification$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: createBankAccountPaymentDetails-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116489createBankAccountPaymentDetailsgIAlus(String str, Continuation<? super Result<ConsumerPaymentDetails.BankAccount>> continuation) {
        LinkAccountManager$createBankAccountPaymentDetails$1 linkAccountManager$createBankAccountPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$createBankAccountPaymentDetails$1) {
            linkAccountManager$createBankAccountPaymentDetails$1 = (LinkAccountManager$createBankAccountPaymentDetails$1) continuation;
            int i2 = linkAccountManager$createBankAccountPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$createBankAccountPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$createBankAccountPaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$createBankAccountPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$createBankAccountPaymentDetails$2 linkAccountManager$createBankAccountPaymentDetails$2 = new LinkAccountManager$createBankAccountPaymentDetails$2(this, str, null);
                linkAccountManager$createBankAccountPaymentDetails$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$createBankAccountPaymentDetails$2, linkAccountManager$createBankAccountPaymentDetails$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$createBankAccountPaymentDetails$1 = new LinkAccountManager$createBankAccountPaymentDetails$1(this, continuation);
        Object obj2 = linkAccountManager$createBankAccountPaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$createBankAccountPaymentDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: createCardPaymentDetails-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116490createCardPaymentDetailsBWLJW6A(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        LinkAccountManager$createCardPaymentDetails$3 linkAccountManager$createCardPaymentDetails$3;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$createCardPaymentDetails$3) {
            linkAccountManager$createCardPaymentDetails$3 = (LinkAccountManager$createCardPaymentDetails$3) continuation;
            int i2 = linkAccountManager$createCardPaymentDetails$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$createCardPaymentDetails$3.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$createCardPaymentDetails$3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$createCardPaymentDetails$3.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$createCardPaymentDetails$4 linkAccountManager$createCardPaymentDetails$4 = new LinkAccountManager$createCardPaymentDetails$4(this, paymentMethodCreateParams, str, stripeIntent, null);
                linkAccountManager$createCardPaymentDetails$3.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$createCardPaymentDetails$4, linkAccountManager$createCardPaymentDetails$3);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$createCardPaymentDetails$3 = new LinkAccountManager$createCardPaymentDetails$3(this, continuation);
        Object obj2 = linkAccountManager$createCardPaymentDetails$3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$createCardPaymentDetails$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: createCardPaymentDetails-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116491createCardPaymentDetailsgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        LinkAccountManager$createCardPaymentDetails$1 linkAccountManager$createCardPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$createCardPaymentDetails$1) {
            linkAccountManager$createCardPaymentDetails$1 = (LinkAccountManager$createCardPaymentDetails$1) continuation;
            int i2 = linkAccountManager$createCardPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$createCardPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$createCardPaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$createCardPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccount value = this.linkAccount.getValue();
                if (value != null) {
                    String email = value.getEmail();
                    StripeIntent stripeIntent = this.config.getStripeIntent();
                    linkAccountManager$createCardPaymentDetails$1.label = 1;
                    Object m116490createCardPaymentDetailsBWLJW6A = m116490createCardPaymentDetailsBWLJW6A(paymentMethodCreateParams, email, stripeIntent, linkAccountManager$createCardPaymentDetails$1);
                    if (m116490createCardPaymentDetailsBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return m116490createCardPaymentDetailsBWLJW6A;
                }
                Result.Companion companion = Result.Companion;
                return Result.m116783constructorimpl(ResultKt.createFailure(new IllegalStateException("A non-null Link account is needed to create payment details")));
            }
        }
        linkAccountManager$createCardPaymentDetails$1 = new LinkAccountManager$createCardPaymentDetails$1(this, continuation);
        Object obj2 = linkAccountManager$createCardPaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$createCardPaymentDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: createFinancialConnectionsSession-IoAF18A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116492createFinancialConnectionsSessionIoAF18A(Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        LinkAccountManager$createFinancialConnectionsSession$1 linkAccountManager$createFinancialConnectionsSession$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$createFinancialConnectionsSession$1) {
            linkAccountManager$createFinancialConnectionsSession$1 = (LinkAccountManager$createFinancialConnectionsSession$1) continuation;
            int i2 = linkAccountManager$createFinancialConnectionsSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$createFinancialConnectionsSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$createFinancialConnectionsSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$createFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$createFinancialConnectionsSession$2 linkAccountManager$createFinancialConnectionsSession$2 = new LinkAccountManager$createFinancialConnectionsSession$2(this, null);
                linkAccountManager$createFinancialConnectionsSession$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$createFinancialConnectionsSession$2, linkAccountManager$createFinancialConnectionsSession$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$createFinancialConnectionsSession$1 = new LinkAccountManager$createFinancialConnectionsSession$1(this, continuation);
        Object obj2 = linkAccountManager$createFinancialConnectionsSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$createFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: deletePaymentDetails-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116493deletePaymentDetailsgIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        LinkAccountManager$deletePaymentDetails$1 linkAccountManager$deletePaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$deletePaymentDetails$1) {
            linkAccountManager$deletePaymentDetails$1 = (LinkAccountManager$deletePaymentDetails$1) continuation;
            int i2 = linkAccountManager$deletePaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$deletePaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$deletePaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$deletePaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$deletePaymentDetails$2 linkAccountManager$deletePaymentDetails$2 = new LinkAccountManager$deletePaymentDetails$2(this, str, null);
                linkAccountManager$deletePaymentDetails$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$deletePaymentDetails$2, linkAccountManager$deletePaymentDetails$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$deletePaymentDetails$1 = new LinkAccountManager$deletePaymentDetails$1(this, continuation);
        Object obj2 = linkAccountManager$deletePaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$deletePaymentDetails$1.label;
        if (i == 0) {
        }
    }

    public final InterfaceC32730Eu1<AccountStatus> getAccountStatus() {
        return this.accountStatus;
    }

    public final String getConsumerPublishableKey() {
        return this.consumerPublishableKey;
    }

    public final InterfaceC49220tP5<LinkAccount> getLinkAccount() {
        return this.linkAccount;
    }

    public final boolean hasUserLoggedOut(String str) {
        boolean z;
        if (!this.userHasLoggedOut) {
            if (str != null) {
                z = this.cookieStore.isEmailLoggedOut$link_release(str);
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: listPaymentDetails-IoAF18A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116494listPaymentDetailsIoAF18A(Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkAccountManager$listPaymentDetails$1 linkAccountManager$listPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$listPaymentDetails$1) {
            linkAccountManager$listPaymentDetails$1 = (LinkAccountManager$listPaymentDetails$1) continuation;
            int i2 = linkAccountManager$listPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$listPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$listPaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$listPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$listPaymentDetails$2 linkAccountManager$listPaymentDetails$2 = new LinkAccountManager$listPaymentDetails$2(this, null);
                linkAccountManager$listPaymentDetails$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$listPaymentDetails$2, linkAccountManager$listPaymentDetails$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$listPaymentDetails$1 = new LinkAccountManager$listPaymentDetails$1(this, continuation);
        Object obj2 = linkAccountManager$listPaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$listPaymentDetails$1.label;
        if (i == 0) {
        }
    }

    public final InterfaceC52943zh2 logout() {
        InterfaceC52943zh2 m73800d;
        LinkAccount value = this.linkAccount.getValue();
        if (value == null) {
            return null;
        }
        String cookie = cookie();
        this.cookieStore.logout$link_release(value.getEmail());
        this.userHasLoggedOut = true;
        this._linkAccount.setValue(null);
        String str = this.consumerPublishableKey;
        this.consumerPublishableKey = null;
        m73800d = Z30.m73800d(VC1.f38731b, null, null, new LinkAccountManager$logout$1$1(this, value, str, cookie, null), 3, null);
        return m73800d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x002c, B:52:0x00e3, B:54:0x00ef, B:44:0x00be, B:47:0x00c4, B:49:0x00ca), top: B:59:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* renamed from: lookupConsumer-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116495lookupConsumer0E7RQCE(String str, boolean z, Continuation<? super Result<LinkAccount>> continuation) {
        LinkAccountManager$lookupConsumer$1 linkAccountManager$lookupConsumer$1;
        Object coroutine_suspended;
        int i;
        Object obj;
        boolean z2;
        String str2;
        LinkAccountManager linkAccountManager;
        LinkAccount linkAccount;
        Object m116783constructorimpl;
        Object mo116509startVerificationBWLJW6A;
        LinkAccount linkAccount2;
        try {
            if (continuation instanceof LinkAccountManager$lookupConsumer$1) {
                linkAccountManager$lookupConsumer$1 = (LinkAccountManager$lookupConsumer$1) continuation;
                int i2 = linkAccountManager$lookupConsumer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    linkAccountManager$lookupConsumer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = linkAccountManager$lookupConsumer$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = linkAccountManager$lookupConsumer$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                linkAccountManager = (LinkAccountManager) linkAccountManager$lookupConsumer$1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                mo116509startVerificationBWLJW6A = ((Result) obj2).m116792unboximpl();
                                ResultKt.throwOnFailure(mo116509startVerificationBWLJW6A);
                                linkAccount = linkAccountManager.setAccount((ConsumerSession) mo116509startVerificationBWLJW6A);
                                return Result.m116783constructorimpl(linkAccount);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z3 = linkAccountManager$lookupConsumer$1.Z$0;
                        ResultKt.throwOnFailure(obj2);
                        str2 = (String) linkAccountManager$lookupConsumer$1.L$1;
                        linkAccountManager = (LinkAccountManager) linkAccountManager$lookupConsumer$1.L$0;
                        obj = ((Result) obj2).m116792unboximpl();
                        z2 = z3;
                    } else {
                        ResultKt.throwOnFailure(obj2);
                        LinkRepository linkRepository = this.linkRepository;
                        String cookie = cookie();
                        linkAccountManager$lookupConsumer$1.L$0 = this;
                        linkAccountManager$lookupConsumer$1.L$1 = str;
                        linkAccountManager$lookupConsumer$1.Z$0 = z;
                        linkAccountManager$lookupConsumer$1.label = 1;
                        Object mo116508lookupConsumer0E7RQCE = linkRepository.mo116508lookupConsumer0E7RQCE(str, cookie, linkAccountManager$lookupConsumer$1);
                        if (mo116508lookupConsumer0E7RQCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = mo116508lookupConsumer0E7RQCE;
                        z2 = z;
                        str2 = str;
                        linkAccountManager = this;
                    }
                    if (Result.m116789isFailureimpl(obj)) {
                        linkAccountManager.linkEventsReporter.onAccountLookupFailure();
                    }
                    linkAccount = null;
                    if (!Result.m116790isSuccessimpl(obj)) {
                        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
                        if (str2 == null && !consumerSessionLookup.getExists()) {
                            linkAccountManager.cookieStore.updateAuthSessionCookie$link_release("");
                        }
                        ConsumerSession consumerSession = consumerSessionLookup.getConsumerSession();
                        if (consumerSession != null) {
                            if (z2) {
                                linkAccount2 = linkAccountManager.setAccountNullable(consumerSession);
                            } else {
                                linkAccount2 = new LinkAccount(consumerSession);
                            }
                        } else {
                            linkAccount2 = null;
                        }
                        m116783constructorimpl = Result.m116783constructorimpl(linkAccount2);
                    } else {
                        m116783constructorimpl = Result.m116783constructorimpl(obj);
                    }
                    if (!Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        LinkAccount linkAccount3 = (LinkAccount) m116783constructorimpl;
                        if (linkAccount3 != null) {
                            if (z2 && !linkAccount3.isVerified()) {
                                LinkRepository linkRepository2 = linkAccountManager.linkRepository;
                                String clientSecret = linkAccount3.getClientSecret();
                                String str3 = linkAccountManager.consumerPublishableKey;
                                String cookie2 = linkAccountManager.cookie();
                                linkAccountManager$lookupConsumer$1.L$0 = linkAccountManager;
                                linkAccountManager$lookupConsumer$1.L$1 = null;
                                linkAccountManager$lookupConsumer$1.label = 2;
                                mo116509startVerificationBWLJW6A = linkRepository2.mo116509startVerificationBWLJW6A(clientSecret, str3, cookie2, linkAccountManager$lookupConsumer$1);
                                if (mo116509startVerificationBWLJW6A == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ResultKt.throwOnFailure(mo116509startVerificationBWLJW6A);
                                linkAccount = linkAccountManager.setAccount((ConsumerSession) mo116509startVerificationBWLJW6A);
                            } else {
                                linkAccount = linkAccount3;
                            }
                        }
                        return Result.m116783constructorimpl(linkAccount);
                    }
                    return Result.m116783constructorimpl(m116783constructorimpl);
                }
            }
            if (i == 0) {
            }
            if (Result.m116789isFailureimpl(obj)) {
            }
            linkAccount = null;
            if (!Result.m116790isSuccessimpl(obj)) {
            }
            if (!Result.m116790isSuccessimpl(m116783constructorimpl)) {
            }
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            return Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        linkAccountManager$lookupConsumer$1 = new LinkAccountManager$lookupConsumer$1(this, continuation);
        Object obj22 = linkAccountManager$lookupConsumer$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$lookupConsumer$1.label;
    }

    public final LinkAccount setAccountNullable(ConsumerSession consumerSession) {
        LinkAccount account;
        if (consumerSession == null || (account = setAccount(consumerSession)) == null) {
            this._linkAccount.setValue(null);
            this.consumerPublishableKey = null;
            return null;
        }
        return account;
    }

    public final void setConsumerPublishableKey(String str) {
        this.consumerPublishableKey = str;
    }

    public final void setLinkAccount(InterfaceC49220tP5<LinkAccount> interfaceC49220tP5) {
        Intrinsics.checkNotNullParameter(interfaceC49220tP5, "<set-?>");
        this.linkAccount = interfaceC49220tP5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: signInWithUserInput-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116496signInWithUserInputgIAlus(UserInput userInput, Continuation<? super Result<LinkAccount>> continuation) {
        LinkAccountManager$signInWithUserInput$1 linkAccountManager$signInWithUserInput$1;
        Object coroutine_suspended;
        int i;
        Object m116497signUphUnOzRk;
        LinkAccountManager linkAccountManager;
        Object m116486lookupConsumer0E7RQCE$default;
        if (continuation instanceof LinkAccountManager$signInWithUserInput$1) {
            linkAccountManager$signInWithUserInput$1 = (LinkAccountManager$signInWithUserInput$1) continuation;
            int i2 = linkAccountManager$signInWithUserInput$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$signInWithUserInput$1.label = i2 - Integer.MIN_VALUE;
                LinkAccountManager$signInWithUserInput$1 linkAccountManager$signInWithUserInput$12 = linkAccountManager$signInWithUserInput$1;
                Object obj = linkAccountManager$signInWithUserInput$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$signInWithUserInput$12.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            linkAccountManager = (LinkAccountManager) linkAccountManager$signInWithUserInput$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            m116497signUphUnOzRk = ((Result) obj).m116792unboximpl();
                            if (!Result.m116790isSuccessimpl(m116497signUphUnOzRk)) {
                                linkAccountManager.linkEventsReporter.onSignupCompleted(true);
                            } else {
                                linkAccountManager.linkEventsReporter.onSignupFailure(true);
                            }
                            return m116497signUphUnOzRk;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m116486lookupConsumer0E7RQCE$default = ((Result) obj).m116792unboximpl();
                    if (Result.m116790isSuccessimpl(m116486lookupConsumer0E7RQCE$default)) {
                        try {
                            LinkAccount linkAccount = (LinkAccount) m116486lookupConsumer0E7RQCE$default;
                            if (linkAccount != null) {
                                return Result.m116783constructorimpl(linkAccount);
                            }
                            throw new IllegalArgumentException("Error fetching user account".toString());
                        } catch (Throwable th) {
                            Result.Companion companion = Result.Companion;
                            m116486lookupConsumer0E7RQCE$default = ResultKt.createFailure(th);
                        }
                    }
                    return Result.m116783constructorimpl(m116486lookupConsumer0E7RQCE$default);
                }
                ResultKt.throwOnFailure(obj);
                if (userInput instanceof UserInput.SignIn) {
                    String email = ((UserInput.SignIn) userInput).getEmail();
                    linkAccountManager$signInWithUserInput$12.label = 1;
                    m116486lookupConsumer0E7RQCE$default = m116486lookupConsumer0E7RQCE$default(this, email, false, linkAccountManager$signInWithUserInput$12, 2, null);
                    if (m116486lookupConsumer0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (Result.m116790isSuccessimpl(m116486lookupConsumer0E7RQCE$default)) {
                    }
                    return Result.m116783constructorimpl(m116486lookupConsumer0E7RQCE$default);
                } else if (userInput instanceof UserInput.SignUp) {
                    UserInput.SignUp signUp = (UserInput.SignUp) userInput;
                    String email2 = signUp.getEmail();
                    String phone = signUp.getPhone();
                    String country = signUp.getCountry();
                    String name = signUp.getName();
                    ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.Checkbox;
                    linkAccountManager$signInWithUserInput$12.L$0 = this;
                    linkAccountManager$signInWithUserInput$12.label = 2;
                    m116497signUphUnOzRk = m116497signUphUnOzRk(email2, phone, country, name, consumerSignUpConsentAction, linkAccountManager$signInWithUserInput$12);
                    if (m116497signUphUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    linkAccountManager = this;
                    if (!Result.m116790isSuccessimpl(m116497signUphUnOzRk)) {
                    }
                    return m116497signUphUnOzRk;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        linkAccountManager$signInWithUserInput$1 = new LinkAccountManager$signInWithUserInput$1(this, continuation);
        LinkAccountManager$signInWithUserInput$1 linkAccountManager$signInWithUserInput$122 = linkAccountManager$signInWithUserInput$1;
        Object obj2 = linkAccountManager$signInWithUserInput$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$signInWithUserInput$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(5:11|12|13|14|16)(2:18|19))(1:20))(2:36|(1:38)(1:39))|21|(1:23)(1:35)|24|(2:26|(3:28|14|16)(2:29|(1:31)(4:32|13|14|16)))|33|34))|42|6|7|(0)(0)|21|(0)(0)|24|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.ResultKt.createFailure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x002f, B:37:0x00c0, B:38:0x00c9, B:30:0x009c, B:33:0x00a5), top: B:43:0x0025 }] */
    /* renamed from: signUp-hUnOzRk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116497signUphUnOzRk(String str, String str2, String str3, String str4, ConsumerSignUpConsentAction consumerSignUpConsentAction, Continuation<? super Result<LinkAccount>> continuation) {
        LinkAccountManager$signUp$1 linkAccountManager$signUp$1;
        Object coroutine_suspended;
        int i;
        Object createFailure;
        String str5;
        Object mo116501consumerSignUpbMdYcbs;
        LinkAccountManager linkAccountManager;
        LinkAccount linkAccount;
        Object mo116509startVerificationBWLJW6A;
        LinkAccountManager linkAccountManager2;
        if (continuation instanceof LinkAccountManager$signUp$1) {
            linkAccountManager$signUp$1 = (LinkAccountManager$signUp$1) continuation;
            int i2 = linkAccountManager$signUp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$signUp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$signUp$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$signUp$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            linkAccountManager2 = (LinkAccountManager) linkAccountManager$signUp$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            mo116509startVerificationBWLJW6A = ((Result) obj).m116792unboximpl();
                            ResultKt.throwOnFailure(mo116509startVerificationBWLJW6A);
                            linkAccount = linkAccountManager2.setAccount((ConsumerSession) mo116509startVerificationBWLJW6A);
                            return Result.m116783constructorimpl(linkAccount);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = (String) linkAccountManager$signUp$1.L$1;
                    linkAccountManager = (LinkAccountManager) linkAccountManager$signUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mo116501consumerSignUpbMdYcbs = ((Result) obj).m116792unboximpl();
                    str5 = str6;
                } else {
                    ResultKt.throwOnFailure(obj);
                    LinkRepository linkRepository = this.linkRepository;
                    String cookie = cookie();
                    linkAccountManager$signUp$1.L$0 = this;
                    str5 = str;
                    linkAccountManager$signUp$1.L$1 = str5;
                    linkAccountManager$signUp$1.label = 1;
                    mo116501consumerSignUpbMdYcbs = linkRepository.mo116501consumerSignUpbMdYcbs(str, str2, str3, str4, cookie, consumerSignUpConsentAction, linkAccountManager$signUp$1);
                    if (mo116501consumerSignUpbMdYcbs == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    linkAccountManager = this;
                }
                if (!Result.m116790isSuccessimpl(mo116501consumerSignUpbMdYcbs)) {
                    linkAccountManager.cookieStore.storeNewUserEmail$link_release(str5);
                    createFailure = Result.m116783constructorimpl(linkAccountManager.setAccount((ConsumerSession) mo116501consumerSignUpbMdYcbs));
                } else {
                    createFailure = Result.m116783constructorimpl(mo116501consumerSignUpbMdYcbs);
                }
                if (Result.m116790isSuccessimpl(createFailure)) {
                    linkAccount = (LinkAccount) createFailure;
                    if (!linkAccount.isVerified()) {
                        LinkRepository linkRepository2 = linkAccountManager.linkRepository;
                        String clientSecret = linkAccount.getClientSecret();
                        String str7 = linkAccountManager.consumerPublishableKey;
                        String cookie2 = linkAccountManager.cookie();
                        linkAccountManager$signUp$1.L$0 = linkAccountManager;
                        linkAccountManager$signUp$1.L$1 = null;
                        linkAccountManager$signUp$1.label = 2;
                        mo116509startVerificationBWLJW6A = linkRepository2.mo116509startVerificationBWLJW6A(clientSecret, str7, cookie2, linkAccountManager$signUp$1);
                        if (mo116509startVerificationBWLJW6A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        linkAccountManager2 = linkAccountManager;
                        ResultKt.throwOnFailure(mo116509startVerificationBWLJW6A);
                        linkAccount = linkAccountManager2.setAccount((ConsumerSession) mo116509startVerificationBWLJW6A);
                        return Result.m116783constructorimpl(linkAccount);
                    }
                    return Result.m116783constructorimpl(linkAccount);
                }
                return Result.m116783constructorimpl(createFailure);
            }
        }
        linkAccountManager$signUp$1 = new LinkAccountManager$signUp$1(this, continuation);
        Object obj2 = linkAccountManager$signUp$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$signUp$1.label;
        if (i == 0) {
        }
        if (!Result.m116790isSuccessimpl(mo116501consumerSignUpbMdYcbs)) {
        }
        if (Result.m116790isSuccessimpl(createFailure)) {
        }
        return Result.m116783constructorimpl(createFailure);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: startVerification-IoAF18A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116498startVerificationIoAF18A(Continuation<? super Result<LinkAccount>> continuation) {
        LinkAccountManager$startVerification$1 linkAccountManager$startVerification$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$startVerification$1) {
            linkAccountManager$startVerification$1 = (LinkAccountManager$startVerification$1) continuation;
            int i2 = linkAccountManager$startVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$startVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$startVerification$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$startVerification$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$startVerification$2 linkAccountManager$startVerification$2 = new LinkAccountManager$startVerification$2(this, null);
                linkAccountManager$startVerification$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$startVerification$2, linkAccountManager$startVerification$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$startVerification$1 = new LinkAccountManager$startVerification$1(this, continuation);
        Object obj2 = linkAccountManager$startVerification$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$startVerification$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: updatePaymentDetails-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116499updatePaymentDetailsgIAlus(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkAccountManager$updatePaymentDetails$1 linkAccountManager$updatePaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkAccountManager$updatePaymentDetails$1) {
            linkAccountManager$updatePaymentDetails$1 = (LinkAccountManager$updatePaymentDetails$1) continuation;
            int i2 = linkAccountManager$updatePaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountManager$updatePaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountManager$updatePaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAccountManager$updatePaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager$updatePaymentDetails$2 linkAccountManager$updatePaymentDetails$2 = new LinkAccountManager$updatePaymentDetails$2(this, consumerPaymentDetailsUpdateParams, null);
                linkAccountManager$updatePaymentDetails$1.label = 1;
                Object m116487retryingOnAuthErrorgIAlus = m116487retryingOnAuthErrorgIAlus(linkAccountManager$updatePaymentDetails$2, linkAccountManager$updatePaymentDetails$1);
                if (m116487retryingOnAuthErrorgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116487retryingOnAuthErrorgIAlus;
            }
        }
        linkAccountManager$updatePaymentDetails$1 = new LinkAccountManager$updatePaymentDetails$1(this, continuation);
        Object obj2 = linkAccountManager$updatePaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAccountManager$updatePaymentDetails$1.label;
        if (i == 0) {
        }
    }
}
