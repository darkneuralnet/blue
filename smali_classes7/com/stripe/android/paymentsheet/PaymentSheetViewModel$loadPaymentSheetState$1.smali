.class final Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->loadPaymentSheetState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.paymentsheet.PaymentSheetViewModel"
    f = "PaymentSheetViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x100
    }
    m = "loadPaymentSheetState"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$loadPaymentSheetState$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$loadPaymentSheetState(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
