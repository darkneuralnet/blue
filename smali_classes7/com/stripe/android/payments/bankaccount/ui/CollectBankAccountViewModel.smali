.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;,
        Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 62\u00020\u0001:\u000267BG\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u00084\u00105J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001d\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00170(8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "LOr6;",
        "",
        "createFinancialConnectionsSession",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
        "result",
        "finishWithResult",
        "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "financialConnectionsSession",
        "finishWithFinancialConnectionsSession",
        "attachFinancialConnectionsSessionToIntent",
        "",
        "throwable",
        "finishWithError",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "onConnectionsResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "args",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "LBX2;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
        "_viewEffect",
        "LBX2;",
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
        "attachFinancialConnectionsSession",
        "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
        "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
        "retrieveStripeIntent",
        "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "LTy5;",
        "viewEffect",
        "LTy5;",
        "getViewEffect",
        "()LTy5;",
        "",
        "value",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "hasLaunched",
        "<init>",
        "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)V",
        "Companion",
        "Factory",
        "payments-core_release"
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
        "SMAP\nCollectBankAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountViewModel.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

.field private static final KEY_HAS_LAUNCHED:Ljava/lang/String; = "key_has_launched"


# instance fields
.field private final _viewEffect:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

.field private final attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

.field private final createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final viewEffect:LTy5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTy5<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->Companion:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_viewEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createFinancialConnectionsSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachFinancialConnectionsSession"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveStripeIntent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:LBX2;

    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    iput-object p5, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    iput-object p7, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->viewEffect:LTy5;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->getHasLaunched()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x0

    new-instance p5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$1;

    const/4 p1, 0x0

    invoke-direct {p5, p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_0
    return-void
.end method

.method public static final synthetic access$attachFinancialConnectionsSessionToIntent(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSessionToIntent(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-void
.end method

.method public static final synthetic access$createFinancialConnectionsSession(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$finishWithError(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$finishWithFinancialConnectionsSession(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithFinancialConnectionsSession(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object p0
.end method

.method public static final synthetic access$getAttachFinancialConnectionsSession$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getRetrieveStripeIntent$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    return-object p0
.end method

.method private final attachFinancialConnectionsSessionToIntent(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final createFinancialConnectionsSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    iget v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v2, 0x2

    const/4 v11, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v11, :cond_3

    if-eq v1, v2, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iget-object v2, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object p1

    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    instance-of v3, v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    if-eqz v3, :cond_6

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    iput-object p0, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput v11, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    move-object v7, v0

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forPaymentIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_5

    return-object v8

    :cond_5
    move-object v1, p0

    :goto_1
    move-object v2, v1

    goto :goto_2

    :cond_6
    instance-of v3, v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    if-eqz v3, :cond_a

    iget-object v3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    iput-object p0, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    move-object v1, v3

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v5, p1

    move-object v7, v0

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forSetupIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_5

    return-object v8

    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :try_start_0
    check-cast p1, Lcom/stripe/android/model/FinancialConnectionsSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_7
    const-string p1, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_8
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    move-object v1, p1

    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move-object p1, v1

    check-cast p1, Ljava/lang/String;

    iget-object v3, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Bank account session created! "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-direct {v2, v11}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->setHasLaunched(Z)V

    iget-object v3, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:LBX2;

    iget-object v4, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    invoke-direct {v6, v4, p1, v5}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput v10, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    invoke-interface {v3, v6, v0}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_9

    return-object v8

    :cond_9
    :goto_4
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_b

    iput-object v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput v9, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    invoke-direct {v2, p1, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_b

    return-object v8

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    const-string v2, "Error"

    invoke-interface {v0, v2, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, v0, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final finishWithFinancialConnectionsSession(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:LBX2;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;

    invoke-direct {v1, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V

    invoke-interface {v0, v1, p2}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final getHasLaunched()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "key_has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final setHasLaunched(Z)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "key_has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getViewEffect()LTy5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LTy5<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->viewEffect:LTy5;

    return-object v0
.end method

.method public final onConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->setHasLaunched(Z)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
