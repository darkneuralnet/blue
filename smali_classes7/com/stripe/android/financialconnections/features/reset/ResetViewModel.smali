.class public final Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B9\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
        "",
        "logErrors",
        "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;",
        "linkMoreAccounts",
        "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final linkMoreAccounts:Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->Companion:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V
    .locals 9

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkMoreAccounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goNext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->linkMoreAccounts:Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->logErrors()V

    new-instance v3, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;

    invoke-direct {v3, p0, v1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGoNext$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    return-object p0
.end method

.method public static final synthetic access$getLinkMoreAccounts$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->linkMoreAccounts:Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method private final logErrors()V
    .locals 6

    sget-object v1, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$1;

    new-instance v2, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
