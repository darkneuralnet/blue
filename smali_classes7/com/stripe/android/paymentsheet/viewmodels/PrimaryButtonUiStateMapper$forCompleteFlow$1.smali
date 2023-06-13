.class final Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCompleteFlow()LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function6<",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "Ljava/lang/Boolean;",
        "Lcom/stripe/android/ui/core/Amount;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "screen",
        "",
        "buttonsEnabled",
        "Lcom/stripe/android/ui/core/Amount;",
        "amount",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "selection",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "customPrimaryButton",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCompleteFlow$1"
    f = "PrimaryButtonUiStateMapper.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrimaryButtonUiStateMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonUiStateMapper.kt\ncom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field synthetic L$3:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    const/4 p1, 0x6

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            "Z",
            "Lcom/stripe/android/ui/core/Amount;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    invoke-direct {v0, v1, p6}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->Z$0:Z

    iput-object p3, v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$2:Ljava/lang/Object;

    iput-object p5, v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$3:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object v3, p3

    check-cast v3, Lcom/stripe/android/ui/core/Amount;

    move-object v4, p4

    check-cast v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-object v5, p5

    check-cast v5, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-object v6, p6

    check-cast v6, Lkotlin/coroutines/Continuation;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->invoke(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->Z$0:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/ui/core/Amount;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    if-nez v3, :cond_2

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    invoke-static {v4, v1}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->access$buyButtonLabel(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/ui/core/Amount;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->access$getOnClick$p(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;)Lkotlin/jvm/functions/Function0;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {v3, v1, v4, v0, v5}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->getShowsBuyButton()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_1
    return-object v3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
