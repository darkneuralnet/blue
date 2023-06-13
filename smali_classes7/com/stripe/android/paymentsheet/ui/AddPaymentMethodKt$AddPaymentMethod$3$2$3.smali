.class final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

.field final synthetic $sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->invoke(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Landroid/content/Context;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void
.end method
