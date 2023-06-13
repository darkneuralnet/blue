.class final Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V
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

.field final synthetic $$default:I

.field final synthetic $completeFormValues:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $hiddenIdentifiers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field final synthetic $modifier:LgV2;

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

.field final synthetic $paymentMethodCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LgV2;",
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$paymentMethodCode:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$completeFormValues:LEu1;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$hiddenIdentifiers:Ljava/util/Set;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$elements:Ljava/util/List;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$modifier:LgV2;

    iput p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$$changed:I

    iput p10, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$paymentMethodCode:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$enabled:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$completeFormValues:LEu1;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$hiddenIdentifiers:Ljava/util/Set;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$elements:Ljava/util/List;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$modifier:LgV2;

    iget p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$$changed:I

    or-int/lit8 v9, p2, 0x1

    iget v10, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;->$$default:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V

    return-void
.end method
