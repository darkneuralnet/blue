.class public final Lcom/stripe/android/link/account/LinkAccountManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010X\u001a\u00020W\u00a2\u0006\u0004\u0008r\u0010sJR\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\u0008\u0000\u0010\u00022(\u0010\u0007\u001a$\u0008\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J8\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J*\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJL\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0008\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008#\u0010$J\"\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008&\u0010\'J*\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010)\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008*\u0010+J\"\u0010/\u001a\u0008\u0012\u0004\u0012\u00020-0\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008.\u0010\'J*\u00105\u001a\u0008\u0012\u0004\u0012\u0002020\u00062\u0006\u00101\u001a\u000200H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u00083\u00104J\"\u00108\u001a\u0008\u0012\u0004\u0012\u0002060\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u00087\u0010\'J*\u0010<\u001a\u0008\u0012\u0004\u0012\u00020:0\u00062\u0006\u00109\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008;\u0010+J:\u00105\u001a\u0008\u0012\u0004\u0012\u0002020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010=\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008@\u0010AJ*\u0010F\u001a\u0008\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010C\u001a\u00020BH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008D\u0010EJ*\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010G\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008H\u0010+J\u0008\u0010K\u001a\u0004\u0018\u00010JJ\u0010\u0010L\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0014\u0010M\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0007R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R*\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0]8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR$\u0010d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iR\u001d\u0010l\u001a\u0008\u0012\u0004\u0012\u00020k0j8\u0006\u00a2\u0006\u000c\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010oR\u0016\u0010p\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008p\u0010q\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006t"
    }
    d2 = {
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "",
        "T",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/Result;",
        "apiCall",
        "retryingOnAuthError-gIAlu-s",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retryingOnAuthError",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSession",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "setAccount",
        "newSession",
        "",
        "maybeUpdateConsumerPublishableKey",
        "cookie",
        "email",
        "",
        "startSession",
        "lookupConsumer-0E7RQCE",
        "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "lookupConsumer",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "userInput",
        "signInWithUserInput-gIAlu-s",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signInWithUserInput",
        "phone",
        "country",
        "name",
        "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
        "consentAction",
        "signUp-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signUp",
        "startVerification-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startVerification",
        "code",
        "confirmVerification-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmVerification",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "listPaymentDetails-IoAF18A",
        "listPaymentDetails",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "createCardPaymentDetails-gIAlu-s",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createCardPaymentDetails",
        "Lcom/stripe/android/model/FinancialConnectionsSession;",
        "createFinancialConnectionsSession-IoAF18A",
        "createFinancialConnectionsSession",
        "financialConnectionsAccountId",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
        "createBankAccountPaymentDetails-gIAlu-s",
        "createBankAccountPaymentDetails",
        "userEmail",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "createCardPaymentDetails-BWLJW6A",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
        "updateParams",
        "updatePaymentDetails-gIAlu-s",
        "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updatePaymentDetails",
        "paymentDetailsId",
        "deletePaymentDetails-gIAlu-s",
        "deletePaymentDetails",
        "Lzh2;",
        "logout",
        "hasUserLoggedOut",
        "setAccountNullable",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "config",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "linkRepository",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "Lcom/stripe/android/link/account/CookieStore;",
        "cookieStore",
        "Lcom/stripe/android/link/account/CookieStore;",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "LGX2;",
        "_linkAccount",
        "LGX2;",
        "LtP5;",
        "linkAccount",
        "LtP5;",
        "getLinkAccount",
        "()LtP5;",
        "setLinkAccount",
        "(LtP5;)V",
        "consumerPublishableKey",
        "Ljava/lang/String;",
        "getConsumerPublishableKey",
        "()Ljava/lang/String;",
        "setConsumerPublishableKey",
        "(Ljava/lang/String;)V",
        "LEu1;",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "accountStatus",
        "LEu1;",
        "getAccountStatus",
        "()LEu1;",
        "userHasLoggedOut",
        "Z",
        "<init>",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)V",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n39#2,6:398\n1#3:404\n*S KotlinDebug\n*F\n+ 1 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n*L\n43#1:398,6\n*E\n"
    }
.end annotation


# instance fields
.field private final _linkAccount:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final accountStatus:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private consumerPublishableKey:Ljava/lang/String;

.field private final cookieStore:Lcom/stripe/android/link/account/CookieStore;

.field private linkAccount:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

.field private userHasLoggedOut:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cookieStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    iput-object p3, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    iput-object p4, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    const/4 p1, 0x0

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->_linkAccount:LGX2;

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    new-instance p3, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;

    invoke-direct {p3, p2, p1, p0}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;-><init>(LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/link/account/LinkAccountManager;)V

    invoke-static {p3}, LVu1;->E(Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->accountStatus:LEu1;

    return-void
.end method

.method public static final synthetic access$cookie(Lcom/stripe/android/link/account/LinkAccountManager;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object p0
.end method

.method public static final synthetic access$getCookieStore$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/account/CookieStore;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    return-object p0
.end method

.method public static final synthetic access$getLinkEventsReporter$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-object p0
.end method

.method public static final synthetic access$getLinkRepository$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/repositories/LinkRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    return-object p0
.end method

.method public static final synthetic access$retryingOnAuthError-gIAlu-s(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setAccount(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method private final cookie()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/CookieStore;->getAuthSessionCookie$link_release()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final maybeUpdateConsumerPublishableKey(Lcom/stripe/android/model/ConsumerSession;)V
    .locals 2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->_linkAccount:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iput-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private final retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    const/4 v8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iget-object v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    invoke-interface {p2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    iput-object p0, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v7, :cond_5

    return-object v7

    :cond_5
    move-object v1, p0

    :goto_1
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    goto :goto_4

    :cond_6
    instance-of p2, v3, Lcom/stripe/android/core/exception/AuthenticationException;

    if-eqz p2, :cond_b

    invoke-direct {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_b

    const/4 p2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    move-object v2, p2

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v7, :cond_7

    return-object v7

    :cond_7
    :goto_2
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_a

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    iput-object v9, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->L$0:Ljava/lang/Object;

    iput v8, v0, Lcom/stripe/android/link/account/LinkAccountManager$retryingOnAuthError$1;->label:I

    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v7, :cond_8

    return-object v7

    :cond_8
    :goto_3
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v9

    :cond_9
    move-object p1, v9

    goto :goto_4

    :cond_a
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    goto :goto_4

    :cond_b
    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    :goto_4
    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_c
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "User not signed in"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method private final setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 2

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager;->maybeUpdateConsumerPublishableKey(Lcom/stripe/android/model/ConsumerSession;)V

    new-instance v0, Lcom/stripe/android/link/model/LinkAccount;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/model/LinkAccount;-><init>(Lcom/stripe/android/model/ConsumerSession;)V

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->_linkAccount:LGX2;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getAuthSessionCookie()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/link/account/CookieStore;->updateAuthSessionCookie$link_release(Ljava/lang/String;)Lkotlin/Unit;

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/link/account/CookieStore;->isEmailLoggedOut$link_release(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    const-string v1, ""

    invoke-virtual {p1, v1}, Lcom/stripe/android/link/account/CookieStore;->storeLoggedOutEmail$link_release(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final confirmVerification-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$2;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$confirmVerification$1;->label:I

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final createBankAccountPaymentDetails-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$2;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$createBankAccountPaymentDetails$1;->label:I

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final createCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p4, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;

    const/4 v9, 0x0

    move-object v4, p4

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$3;->label:I

    invoke-direct {p0, p4, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final createCardPaymentDetails-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    invoke-interface {p2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lcom/stripe/android/link/account/LinkAccountManager;->config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$1;->label:I

    invoke-virtual {p0, p1, p2, v2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_3
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "A non-null Link account is needed to create payment details"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    :goto_1
    return-object p1
.end method

.method public final createFinancialConnectionsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$2;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$createFinancialConnectionsSession$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final deletePaymentDetails-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$2;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$deletePaymentDetails$1;->label:I

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final getAccountStatus()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->accountStatus:LEu1;

    return-object v0
.end method

.method public final getConsumerPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkAccount()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    return-object v0
.end method

.method public final hasUserLoggedOut(Ljava/lang/String;)Z
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->userHasLoggedOut:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v1, p1}, Lcom/stripe/android/link/account/CookieStore;->isEmailLoggedOut$link_release(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final listPaymentDetails-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$2;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$listPaymentDetails$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final logout()Lzh2;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/model/LinkAccount;

    const/4 v0, 0x0

    if-eqz v3, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v3}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/link/account/CookieStore;->logout$link_release(Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->userHasLoggedOut:Z

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->_linkAccount:LGX2;

    invoke-interface {v1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    sget-object v0, LVC1;->b:LVC1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/link/account/LinkAccountManager$logout$1$1;

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager$logout$1$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final lookupConsumer-0E7RQCE(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    move v6, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p3

    move p3, v6

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    invoke-direct {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object v2

    iput-object p0, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$1:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->Z$0:Z

    iput v4, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->label:I

    invoke-interface {p3, p1, v2, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->lookupConsumer-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p1, Lcom/stripe/android/link/account/LinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v4}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onAccountLookupFailure()V

    :cond_5
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    check-cast v2, Lcom/stripe/android/model/ConsumerSessionLookup;

    if-nez p2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p1, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    const-string v4, ""

    invoke-virtual {p2, v4}, Lcom/stripe/android/link/account/CookieStore;->updateAuthSessionCookie$link_release(Ljava/lang/String;)Lkotlin/Unit;

    :cond_6
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerSessionLookup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object p2

    if-eqz p2, :cond_8

    if-eqz p3, :cond_7

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccountNullable(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p2

    goto :goto_2

    :cond_7
    new-instance v2, Lcom/stripe/android/link/model/LinkAccount;

    invoke-direct {v2, p2}, Lcom/stripe/android/link/model/LinkAccount;-><init>(Lcom/stripe/android/model/ConsumerSession;)V

    move-object p2, v2

    goto :goto_2

    :cond_8
    move-object p2, v5

    :goto_2
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_3

    :cond_9
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_3
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    :try_start_1
    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_c

    if-eqz p3, :cond_b

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->isVerified()Z

    move-result p3

    if-nez p3, :cond_b

    iget-object p3, p1, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p1, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    invoke-direct {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object v4

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$lookupConsumer$1;->label:I

    invoke-interface {p3, p2, v2, v4, v0}, Lcom/stripe/android/link/repositories/LinkRepository;->startVerification-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    return-object v1

    :cond_a
    :goto_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    invoke-direct {p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    move-object v5, p1

    goto :goto_5

    :cond_b
    move-object v5, p2

    :cond_c
    :goto_5
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :goto_6
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    :cond_d
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1
.end method

.method public final setAccountNullable(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->_linkAccount:LGX2;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    move-object p1, v0

    :cond_1
    return-object p1
.end method

.method public final setConsumerPublishableKey(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    return-void
.end method

.method public final setLinkAccount(LtP5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager;->linkAccount:LtP5;

    return-void
.end method

.method public final signInWithUserInput-gIAlu-s(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p2, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->label:I

    const/4 v2, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v8, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    instance-of p2, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p2, :cond_7

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;->getEmail()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput v8, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->label:I

    move-object v1, p0

    move-object v4, v7

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    :try_start_0
    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_5
    const-string p1, "Error fetching user account"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_7
    instance-of p2, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz p2, :cond_a

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getEmail()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getPhone()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getName()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/model/ConsumerSignUpConsentAction;->Checkbox:Lcom/stripe/android/model/ConsumerSignUpConsentAction;

    iput-object p0, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->L$0:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/link/account/LinkAccountManager$signInWithUserInput$1;->label:I

    move-object v1, p0

    move-object v2, p2

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/link/account/LinkAccountManager;->signUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_8

    return-object v0

    :cond_8
    move-object p1, p0

    :goto_2
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p1, Lcom/stripe/android/link/account/LinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1, v8}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupCompleted(Z)V

    goto :goto_3

    :cond_9
    iget-object p1, p1, Lcom/stripe/android/link/account/LinkAccountManager;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1, v8}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupFailure(Z)V

    :goto_3
    move-object p1, p2

    :goto_4
    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final signUp-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerSignUpConsentAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v0, p6

    instance-of v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;

    iget v3, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v11

    iget v3, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->label:I

    const/4 v12, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v12, :cond_1

    iget-object v2, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v3

    move-object v3, v0

    move-object v0, v13

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    invoke-direct {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object v8

    iput-object v1, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    move-object v0, p1

    iput-object v0, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$1:Ljava/lang/Object;

    iput v4, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->label:I

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p5

    move-object v10, v2

    invoke-interface/range {v3 .. v10}, Lcom/stripe/android/link/repositories/LinkRepository;->consumerSignUp-bMdYcbs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_4

    return-object v11

    :cond_4
    move-object v4, v1

    :goto_1
    invoke-static {v3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    check-cast v3, Lcom/stripe/android/model/ConsumerSession;

    iget-object v5, v4, Lcom/stripe/android/link/account/LinkAccountManager;->cookieStore:Lcom/stripe/android/link/account/CookieStore;

    invoke-virtual {v5, v0}, Lcom/stripe/android/link/account/CookieStore;->storeNewUserEmail$link_release(Ljava/lang/String;)V

    invoke-direct {v4, v3}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_5
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    :try_start_1
    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->isVerified()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    iget-object v3, v4, Lcom/stripe/android/link/account/LinkAccountManager;->linkRepository:Lcom/stripe/android/link/repositories/LinkRepository;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    iget-object v5, v4, Lcom/stripe/android/link/account/LinkAccountManager;->consumerPublishableKey:Ljava/lang/String;

    invoke-direct {v4}, Lcom/stripe/android/link/account/LinkAccountManager;->cookie()Ljava/lang/String;

    move-result-object v6

    iput-object v4, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->L$1:Ljava/lang/Object;

    iput v12, v2, Lcom/stripe/android/link/account/LinkAccountManager$signUp$1;->label:I

    invoke-interface {v3, v0, v5, v6, v2}, Lcom/stripe/android/link/repositories/LinkRepository;->startVerification-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_7

    return-object v11

    :cond_7
    move-object v2, v4

    :goto_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSession;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->setAccount(Lcom/stripe/android/model/ConsumerSession;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    return-object v0
.end method

.method public final startVerification-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$2;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$startVerification$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final updatePaymentDetails-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance p2, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$2;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$2;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/link/account/LinkAccountManager$updatePaymentDetails$1;->label:I

    invoke-direct {p0, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->retryingOnAuthError-gIAlu-s(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method
