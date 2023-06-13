.class public final Lcom/stripe/android/financialconnections/domain/GoNext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "(Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
        "nextPane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "args",
        "",
        "",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V
    .locals 1

    const-string v0, "navigationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/GoNext;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/GoNext;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static synthetic invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;"
        }
    .end annotation

    const-string v0, "nextPane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/GoNext;->logger:Lcom/stripe/android/core/Logger;

    invoke-static {p1, v0, p2}, Lcom/stripe/android/financialconnections/domain/GoNextKt;->toNavigationCommand(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/core/Logger;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/GoNext;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/navigation/NavigationCommand;->getDestination()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Navigating to next pane: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/GoNext;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    invoke-virtual {p2, p1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-object p1
.end method
