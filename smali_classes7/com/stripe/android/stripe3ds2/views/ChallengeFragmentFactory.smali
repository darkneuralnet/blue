.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;
.super Landroidx/fragment/app/e;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;",
        "Landroidx/fragment/app/e;",
        "Ljava/lang/ClassLoader;",
        "classLoader",
        "",
        "className",
        "Landroidx/fragment/app/Fragment;",
        "instantiate",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "transactionTimer",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;",
        "errorRequestExecutor",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "challengeActionHandler",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "initialUiType",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "intentData",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field private final challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

.field private final initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field private final intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

.field private final transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeActionHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/fragment/app/e;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public instantiate(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 10

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    iget-object v7, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v8, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iget-object v9, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/e;->instantiate(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    const-string p2, "{\n                super.\u2026 className)\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
