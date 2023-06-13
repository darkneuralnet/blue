.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->observeCountdown-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Lkotlin/time/Duration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlin/time/Duration;",
        "duration",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPollingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,255:1\n230#2,5:256\n*S KotlinDebug\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2\n*L\n153#1:256,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lkotlin/time/Duration;

    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;->emit-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-static {p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->access$get_uiState$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)LGX2;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-wide v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v1

    invoke-interface {p3, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
