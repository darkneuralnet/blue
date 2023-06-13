.class final Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodUI-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;LEt0;III)V
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

.field final synthetic $iconRes:I

.field final synthetic $iconUrl:Ljava/lang/String;

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $itemIndex:I

.field final synthetic $minViewWidth:F

.field final synthetic $modifier:LgV2;

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tintOnSelected:Z

.field final synthetic $title:Ljava/lang/String;


# direct methods
.method public constructor <init>(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Ljava/lang/String;",
            "ZZZI",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;III)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$minViewWidth:F

    iput p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$iconRes:I

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$iconUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$title:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$isSelected:Z

    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$isEnabled:Z

    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$tintOnSelected:Z

    iput p9, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$itemIndex:I

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$modifier:LgV2;

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$changed:I

    iput p13, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$changed1:I

    iput p14, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$minViewWidth:F

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$iconRes:I

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$iconUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$title:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$isSelected:Z

    iget-boolean v7, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$isEnabled:Z

    iget-boolean v8, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$tintOnSelected:Z

    iget v9, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$itemIndex:I

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$modifier:LgV2;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$changed:I

    or-int/lit8 v13, v12, 0x1

    iget v14, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$changed1:I

    iget v15, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$2;->$$default:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodUI-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;LEt0;III)V

    return-void
.end method
