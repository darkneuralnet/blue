.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2;->invoke()Landroidx/lifecycle/u$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
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
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;
    .locals 12

    new-instance v10, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->access$getArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->access$getArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getTimeLimitInSeconds()I

    move-result v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->access$getArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getInitialDelayInSeconds()I

    move-result v0

    invoke-static {v0, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->access$getArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getMaxAttempts()I

    move-result v7

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v11, 0x0

    move-object v0, v10

    move-wide v2, v3

    move-wide v4, v5

    move v6, v7

    move-object v7, v8

    move v8, v9

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;-><init>(Ljava/lang/String;JJILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2$1;->invoke()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    move-result-object v0

    return-object v0
.end method
