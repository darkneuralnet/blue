.class final Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodsUI(Ljava/util/List;IZLkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;LgV2;LCo2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lh10;",
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
.field final synthetic $$dirty:I

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $isEnabled:Z

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

.field final synthetic $paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedIndex:I

.field final synthetic $state:LCo2;


# direct methods
.method public constructor <init>(Ljava/util/List;LCo2;ZIILcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;",
            "LCo2;",
            "ZII",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$paymentMethods:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$state:LCo2;

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$isEnabled:Z

    iput p4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$$dirty:I

    iput p5, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$selectedIndex:I

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v2, p3

    const-string v3, "$this$BoxWithConstraints"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v5, 0x12

    if-ne v3, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v5, "com.stripe.android.paymentsheet.PaymentMethodsUI.<anonymous> (PaymentMethodsUI.kt:76)"

    const v6, 0x272c7053

    invoke-static {v6, v2, v3, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lh10;->a()F

    move-result v1

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$paymentMethods:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v10, v3}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->access$rememberViewWidth-kHDZbjc(FILEt0;I)F

    move-result v14

    sget-object v1, Lcom/stripe/android/paymentsheet/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/Spacing;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/Spacing;->getCarouselOuterPadding-D9Ej5fM()F

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, LND3;->c(FFILjava/lang/Object;)LPD3;

    move-result-object v3

    sget-object v2, Llo;->a:Llo;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/Spacing;->getCarouselInnerPadding-D9Ej5fM()F

    move-result v1

    invoke-virtual {v2, v1}, Llo;->n(F)Llo$e;

    move-result-object v5

    sget-object v1, LgV2;->b0:LgV2$a;

    const-string v2, "PaymentMethodsUITestTag"

    invoke-static {v1, v2}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$state:LCo2;

    const/4 v4, 0x0

    const/4 v6, 0x0

    iget-boolean v8, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$isEnabled:Z

    new-instance v9, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1;

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$paymentMethods:Ljava/util/List;

    iget v13, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$selectedIndex:I

    iget-object v15, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget v11, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$$dirty:I

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    move/from16 v17, v11

    move-object v11, v9

    move/from16 v16, v8

    move-object/from16 v18, v7

    invoke-direct/range {v11 .. v18}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1;-><init>(Ljava/util/List;IFLcom/stripe/android/uicore/image/StripeImageLoader;ZILkotlin/jvm/functions/Function1;)V

    iget v7, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2;->$$dirty:I

    shr-int/lit8 v11, v7, 0xf

    and-int/lit8 v11, v11, 0x70

    or-int/lit16 v11, v11, 0x6186

    const/high16 v12, 0x1c00000

    shl-int/lit8 v7, v7, 0xf

    and-int/2addr v7, v12

    or-int/2addr v11, v7

    const/16 v12, 0x68

    const/4 v7, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, Lgn2;->b(LgV2;LCo2;LPD3;ZLlo$d;LK9$c;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method
