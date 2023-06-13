.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->openAuthFlow(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $authFlowStatus:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

.field final synthetic $manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

.field final synthetic $nativeAuthFlowEnabled:Z

.field final synthetic $sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$authFlowStatus:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$nativeAuthFlowEnabled:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 9

    const-string v0, "$this$setState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$authFlowStatus:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$nativeAuthFlowEnabled:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v1

    iget-object v6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$sync:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-direct {v0, v1, v6}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v6, v0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;->invoke(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p1

    return-object p1
.end method
