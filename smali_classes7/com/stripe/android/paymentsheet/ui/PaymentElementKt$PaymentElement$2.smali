.class final Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->PaymentElement(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $enabled:Z

.field final synthetic $formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field final synthetic $linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field final synthetic $onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLinkSignupStateChanged:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

.field final synthetic $sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

.field final synthetic $showCheckboxFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLinkInlineSignup:Z

.field final synthetic $supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
            "Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Z",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "-",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$supportedPaymentMethods:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$showLinkInlineSignup:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$showCheckboxFlow:LEu1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onLinkSignupStateChanged:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$$changed:I

    iput p13, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$$changed1:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$enabled:Z

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$supportedPaymentMethods:Ljava/util/List;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iget-boolean v5, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$showLinkInlineSignup:Z

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$showCheckboxFlow:LEu1;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onLinkSignupStateChanged:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$$changed:I

    or-int/lit8 v13, v12, 0x1

    iget v14, v0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;->$$changed1:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->PaymentElement(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V

    return-void
.end method
