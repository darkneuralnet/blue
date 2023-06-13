.class final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
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

.field final synthetic $isEditing:Z

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $item:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

.field final synthetic $modifier:LgV2;

.field final synthetic $onAddCardPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemRemoved:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

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

.field final synthetic $width:F


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            "FZZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$item:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$width:F

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isEnabled:Z

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isEditing:Z

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isSelected:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$modifier:LgV2;

    iput p10, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$$changed:I

    iput p11, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$item:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$width:F

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isEnabled:Z

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isEditing:Z

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$isSelected:Z

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$modifier:LgV2;

    iget p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$$changed:I

    or-int/lit8 v10, p2, 0x1

    iget v11, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;->$$default:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->access$PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    return-void
.end method
