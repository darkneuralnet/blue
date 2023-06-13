.class final Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V
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
        "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,206:1\n154#2:207\n154#2:241\n67#3,6:208\n73#3:240\n77#3:246\n75#4:214\n76#4,11:216\n89#4:245\n76#5:215\n460#6,13:227\n473#6,3:242\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2\n*L\n100#1:207\n107#1:241\n100#1:208,6\n100#1:240\n100#1:246\n100#1:214\n100#1:216,11\n100#1:245\n100#1:215\n100#1:227,13\n100#1:242,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $iconEnd:Ljava/lang/Integer;

.field final synthetic $iconStart:Ljava/lang/Integer;

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $onButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/link/ui/PrimaryButtonState;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/ui/PrimaryButtonState;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$state:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iput p3, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$$dirty:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$iconStart:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$label:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$iconEnd:Ljava/lang/Integer;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v14, p1

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

    const-string v3, "com.stripe.android.link.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:98)"

    const v4, 0x77045545

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LgV2;->b0:LgV2$a;

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v13, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v13, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    iget-object v15, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$state:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iget v11, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$$dirty:I

    iget-object v10, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$iconStart:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$label:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->$iconEnd:Ljava/lang/Integer;

    const v5, 0x2bb5b5d7

    invoke-interface {v14, v5}, LEt0;->F(I)V

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->n()LK9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6, v14, v6}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v7, -0x4ee9b9da

    invoke-interface {v14, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v14, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v14, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v6, v5, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v6, v3, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v3, v14, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v14, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, -0x1f3d8fb5

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getPrimaryButtonHeight()F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v3, v4, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v13

    sget-object v1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    if-ne v12, v1, :cond_5

    const/16 v16, 0x1

    goto :goto_2

    :cond_5
    const/16 v16, 0x0

    :goto_2
    const/16 v17, 0x0

    sget-object v20, Li70;->a:Li70;

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v3

    invoke-static {v1}, Lk61;->g(F)F

    move-result v4

    invoke-static {v1}, Lk61;->g(F)F

    move-result v5

    invoke-static {v1}, Lk61;->g(F)F

    move-result v6

    sget v19, Li70;->l:I

    shl-int/lit8 v1, v19, 0xf

    or-int/lit16 v7, v1, 0x6db6

    const/16 v21, 0x0

    move-object/from16 v1, v20

    move/from16 v22, v7

    move-object/from16 v7, p1

    move-object/from16 v23, v8

    move/from16 v8, v22

    move-object/from16 v22, v9

    move/from16 v9, v21

    invoke-virtual/range {v1 .. v9}, Li70;->b(FFFFFLEt0;II)Lj70;

    move-result-object v21

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v14, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkShapes;->getMedium()Lbc5;

    move-result-object v24

    const/16 v25, 0x0

    invoke-virtual {v1, v14, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->j()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v14, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->j()J

    move-result-wide v7

    const-wide/16 v26, 0x0

    shl-int/lit8 v19, v19, 0xc

    const/16 v28, 0xa

    move-object/from16 v1, v20

    move-wide v2, v3

    move-wide v4, v5

    move-wide v6, v7

    move-wide/from16 v8, v26

    move-object/from16 v20, v10

    move-object/from16 v10, p1

    move/from16 v26, v11

    move/from16 v11, v19

    move-object/from16 v19, v12

    move/from16 v12, v28

    invoke-virtual/range {v1 .. v12}, Li70;->a(JJJJLEt0;II)Lh70;

    move-result-object v11

    const/4 v12, 0x0

    new-instance v1, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;

    move-object v5, v1

    move-object/from16 v6, v19

    move-object/from16 v7, v20

    move/from16 v8, v26

    move-object/from16 v9, v22

    move-object/from16 v10, v23

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;-><init>(Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;)V

    const v2, -0x7309bbc5

    const/4 v3, 0x1

    invoke-static {v14, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    shr-int/lit8 v1, v26, 0x6

    and-int/lit8 v1, v1, 0xe

    const v2, 0x30000030

    or-int v18, v1, v2

    const/16 v19, 0x148

    move-object v1, v15

    move-object v2, v13

    move/from16 v3, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v21

    move-object/from16 v6, v24

    move-object/from16 v7, v25

    move-object v8, v11

    move-object v9, v12

    move-object/from16 v11, p1

    move/from16 v12, v18

    move/from16 v13, v19

    invoke-static/range {v1 .. v13}, Lk70;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method
