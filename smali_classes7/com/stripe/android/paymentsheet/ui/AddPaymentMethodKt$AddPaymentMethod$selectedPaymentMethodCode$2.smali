.class final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LEX2<",
        "Ljava/lang/String;",
        ">;>;"
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
.field final synthetic $sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LEX2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$getInitiallySelectedPaymentMethodType(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;->invoke()LEX2;

    move-result-object v0

    return-object v0
.end method
