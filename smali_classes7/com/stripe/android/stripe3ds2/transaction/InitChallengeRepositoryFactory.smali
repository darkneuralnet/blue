.class public final Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;",
        "",
        "application",
        "Landroid/app/Application;",
        "isLiveMode",
        "",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "rootCerts",
        "",
        "Ljava/security/cert/X509Certificate;",
        "enableLogging",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Landroid/app/Application;ZLcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Ljava/util/List;ZLkotlin/coroutines/CoroutineContext;)V",
        "create",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private final enableLogging:Z

.field private final isLiveMode:Z

.field private final rootCerts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Landroid/app/Application;ZLcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Ljava/util/List;ZLkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Z",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;Z",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootCerts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->application:Landroid/app/Application;

    iput-boolean p2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->rootCerts:Ljava/util/List;

    iput-boolean p6, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->enableLogging:Z

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public final create()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;
    .locals 14

    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/Logger;->Companion:Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->enableLogging:Z

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;->get(Z)Lcom/stripe/android/stripe3ds2/transaction/Logger;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->application:Landroid/app/Application;

    new-instance v4, Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-direct {v4, v2}, Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xf0

    const/4 v12, 0x0

    move-object v2, v1

    move-object v6, v0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;-><init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    invoke-direct {v4}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;-><init>()V

    new-instance v5, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;

    iget-boolean v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->rootCerts:Ljava/util/List;

    invoke-direct {v5, v2, v6, v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;-><init>(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    new-instance v6, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    iget-boolean v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    invoke-direct {v6, v2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(Z)V

    new-instance v7, Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;

    invoke-direct {v7, v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    new-instance v8, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v8, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    new-instance v9, Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v9, v2}, Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    iget-object v10, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-object v2, v13

    move-object v11, v1

    move-object v12, v0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V

    return-object v13
.end method
