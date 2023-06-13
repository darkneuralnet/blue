.class final Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3<",
        "Le10;",
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
        "SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,258:1\n73#2,7:259\n80#2:292\n84#2:305\n75#3:266\n76#3,11:268\n89#3:304\n76#4:267\n460#5,13:279\n36#5:294\n473#5,3:301\n154#6:293\n1057#7,6:295\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2\n*L\n88#1:259,7\n88#1:292\n88#1:305\n88#1:266\n88#1:268,11\n88#1:304\n88#1:267\n88#1:279,13\n105#1:294\n88#1:301,3\n104#1:293\n105#1:295,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $$dirty1:I

.field final synthetic $description:Ljava/lang/String;

.field final synthetic $iconRes:I

.field final synthetic $iconTint:Lpm0;

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $labelIcon:Ljava/lang/Integer;

.field final synthetic $labelText:Ljava/lang/String;

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZILpm0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILjava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZI",
            "Lpm0;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$isSelected:Z

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$isEnabled:Z

    iput p3, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$iconRes:I

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$iconTint:Lpm0;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$labelText:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    iput p7, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$$dirty:I

    iput p8, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$$dirty1:I

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$description:Ljava/lang/String;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$labelIcon:Ljava/lang/Integer;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->invoke(Le10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Le10;LEt0;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v11, p2

    move/from16 v1, p3

    const-string v2, "$this$BadgedBox"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.PaymentOptionUi.<anonymous> (PaymentOptionUi.kt:86)"

    const v4, -0x76f2d06

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$isSelected:Z

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$isEnabled:Z

    iget v3, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$iconRes:I

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$iconTint:Lpm0;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$labelText:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    iget v14, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$$dirty:I

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$$dirty1:I

    iget-object v15, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$description:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2;->$labelIcon:Ljava/lang/Integer;

    const v5, -0x1cd0f17e

    invoke-interface {v11, v5}, LEt0;->F(I)V

    sget-object v16, LgV2;->b0:LgV2$a;

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v7, LK9;->a:LK9$a;

    invoke-virtual {v7}, LK9$a;->j()LK9$b;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v5, v7, v11, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v7, -0x4ee9b9da

    invoke-interface {v11, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v11, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v11, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v11, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    move-object/from16 v18, v10

    invoke-static/range {v16 .. v16}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v10

    move-object/from16 p3, v15

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v11, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v0, v5, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v0, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v0, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v0, v9, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v0, v11, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v11, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v11, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x259fbbc

    invoke-interface {v11, v0}, LEt0;->F(I)V

    const/4 v7, 0x0

    shr-int/lit8 v0, v14, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v5, v14, 0x6

    and-int/lit8 v8, v5, 0x70

    or-int/2addr v0, v8

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v0, v5

    shr-int/lit8 v5, v14, 0x9

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v0, v5

    shr-int/lit8 v5, v14, 0xc

    const v15, 0xe000

    and-int/2addr v5, v15

    or-int/2addr v0, v5

    const/high16 v5, 0x70000

    const/4 v10, 0x6

    shl-int/2addr v2, v10

    and-int/2addr v2, v5

    or-int/2addr v0, v2

    const/16 v17, 0x40

    move v2, v12

    move-object v5, v13

    move-object/from16 v8, p2

    move v15, v9

    move v9, v0

    move v15, v10

    move-object/from16 v0, v18

    move/from16 v10, v17

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->access$PaymentOptionCard-flo8M7A(ZZILpm0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v1, v11, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->i()J

    move-result-wide v3

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v18

    int-to-float v1, v15

    invoke-static {v1}, Lk61;->g(F)F

    move-result v17

    invoke-static {v1}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const v2, 0x44faf204

    invoke-interface {v11, v2}, LEt0;->F(I)V

    move-object/from16 v2, p3

    invoke-interface {v11, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2$1$1$1;

    invoke-direct {v6, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2$1$1$1;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v1, v7, v6, v2, v5}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v5

    shr-int/lit8 v1, v14, 0x15

    and-int/lit8 v2, v1, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v2, v14, 0x3

    const v6, 0xe000

    and-int/2addr v2, v6

    or-int v8, v1, v2

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, v13

    move v6, v12

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;->LpmSelectorText-T042LqI(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_2
    return-void
.end method
