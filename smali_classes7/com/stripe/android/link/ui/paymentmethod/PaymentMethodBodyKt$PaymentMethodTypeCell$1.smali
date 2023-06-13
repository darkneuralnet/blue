.class final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodTypeCell(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,288:1\n154#2:289\n154#2:290\n154#2:291\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1\n*L\n233#1:289\n239#1:290\n241#1:291\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $enabled:Z

.field final synthetic $modifier:LgV2;

.field final synthetic $onSelected:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

.field final synthetic $selected:Z

.field final synthetic $this_PaymentMethodTypeCell:LZc5;


# direct methods
.method public constructor <init>(LZc5;LgV2;ZZLkotlin/jvm/functions/Function0;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZc5;",
            "LgV2;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$this_PaymentMethodTypeCell:LZc5;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$modifier:LgV2;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$selected:Z

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$enabled:Z

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$onSelected:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$paymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.paymentmethod.PaymentMethodTypeCell.<anonymous> (PaymentMethodBody.kt:229)"

    const v5, -0xc73a1e4

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v11, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$this_PaymentMethodTypeCell:LZc5;

    iget-object v1, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$modifier:LgV2;

    const/16 v2, 0x38

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v12

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v2, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v2, v10, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v5

    invoke-static {v2, v10, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBackground-0d7_KjU()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    iget-boolean v11, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$selected:Z

    const/4 v12, 0x1

    if-eqz v11, :cond_3

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    goto :goto_1

    :cond_3
    int-to-float v3, v12

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    :goto_1
    iget-boolean v11, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$selected:Z

    if-eqz v11, :cond_4

    invoke-virtual {v2, v10, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->j()J

    move-result-wide v13

    goto :goto_2

    :cond_4
    invoke-static {v2, v10, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v13

    :goto_2
    invoke-static {v3, v13, v14}, LfZ;->a(FJ)LeZ;

    move-result-object v11

    const/4 v13, 0x0

    new-instance v2, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1$1;

    iget-boolean v3, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$enabled:Z

    iget-object v4, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$onSelected:Lkotlin/jvm/functions/Function0;

    iget-object v14, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$paymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    iget-boolean v15, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;->$selected:Z

    invoke-direct {v2, v3, v4, v14, v15}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1$1;-><init>(ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Z)V

    const v3, 0x4f45160

    invoke-static {v10, v3, v12, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v12

    const/high16 v14, 0x180000

    const/16 v15, 0x28

    move-object v2, v5

    move-wide v3, v6

    move-wide v5, v8

    move-object v7, v11

    move v8, v13

    move-object v9, v12

    move-object/from16 v10, p1

    move v11, v14

    move v12, v15

    invoke-static/range {v1 .. v12}, LNV5;->a(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method
