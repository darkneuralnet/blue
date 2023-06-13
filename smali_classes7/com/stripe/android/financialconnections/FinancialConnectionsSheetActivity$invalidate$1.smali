.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->invalidate()V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "state",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "invoke",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lkotlin/Unit;"
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
.field final synthetic this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;->invoke(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lkotlin/Unit;
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getViewEffect()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->access$getStartBrowserForResult$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)LB5;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v3, "parse(viewEffect.url)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0, p1}, Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;->invoke(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v1, p1}, LB5;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->getResult()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->access$finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;

    if-eqz v1, :cond_2

    invoke-static {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->access$getStartNativeAuthFlowForResult$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)LB5;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x10000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    new-instance v4, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;

    invoke-direct {v4, p1, v3}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    const-string p1, "mavericks:arg"

    invoke-virtual {v2, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, LB5;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onViewEffectLaunched$financial_connections_release()V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
