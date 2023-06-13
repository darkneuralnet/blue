.class final Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V
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

.field final synthetic $$default:I

.field final synthetic $description:Ljava/lang/String;

.field final synthetic $iconRes:I

.field final synthetic $iconTint:Lpm0;

.field final synthetic $isEditing:Z

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $labelIcon:Ljava/lang/Integer;

.field final synthetic $labelText:Ljava/lang/String;

.field final synthetic $modifier:LgV2;

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onRemoveAccessibilityDescription:Ljava/lang/String;

.field final synthetic $onRemoveListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $removePmDialogTitle:Ljava/lang/String;

.field final synthetic $viewWidth:F


# direct methods
.method public constructor <init>(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;III)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZZZI",
            "LgV2;",
            "Lpm0;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;III)V"
        }
    .end annotation

    move-object v0, p0

    move v1, p1

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$viewWidth:F

    move v1, p2

    iput-boolean v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isSelected:Z

    move v1, p3

    iput-boolean v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isEditing:Z

    move v1, p4

    iput-boolean v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isEnabled:Z

    move v1, p5

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$iconRes:I

    move-object v1, p6

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$modifier:LgV2;

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$iconTint:Lpm0;

    move-object v1, p8

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$labelIcon:Ljava/lang/Integer;

    move-object v1, p9

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$labelText:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$removePmDialogTitle:Ljava/lang/String;

    move-object v1, p11

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$description:Ljava/lang/String;

    move-object v1, p12

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onRemoveListener:Lkotlin/jvm/functions/Function0;

    move-object v1, p13

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onRemoveAccessibilityDescription:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    move/from16 v1, p15

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$changed:I

    move/from16 v1, p16

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$changed1:I

    move/from16 v1, p17

    iput v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$default:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$viewWidth:F

    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isSelected:Z

    iget-boolean v3, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isEditing:Z

    iget-boolean v4, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$isEnabled:Z

    iget v5, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$iconRes:I

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$modifier:LgV2;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$iconTint:Lpm0;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$labelIcon:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$labelText:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$removePmDialogTitle:Ljava/lang/String;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$description:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onRemoveListener:Lkotlin/jvm/functions/Function0;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onRemoveAccessibilityDescription:Ljava/lang/String;

    iget-object v14, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    move/from16 p1, v1

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$changed:I

    or-int/lit8 v16, v1, 0x1

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$changed1:I

    move/from16 v17, v1

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$3;->$$default:I

    move/from16 v18, v1

    move/from16 v1, p1

    invoke-static/range {v1 .. v18}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V

    return-void
.end method
