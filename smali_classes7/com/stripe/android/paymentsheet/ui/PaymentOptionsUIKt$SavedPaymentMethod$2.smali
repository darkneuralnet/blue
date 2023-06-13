.class final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->SavedPaymentMethod-Uww-Ezs(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
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


# instance fields
.field final synthetic $onItemSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;->$paymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->toPaymentSelection(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
