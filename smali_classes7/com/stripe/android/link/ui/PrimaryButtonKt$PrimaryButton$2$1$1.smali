.class final Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LZc5;",
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
        "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,206:1\n154#2:207\n154#2:208\n154#2:209\n75#3,6:210\n81#3:242\n85#3:248\n75#4:216\n76#4,11:218\n89#4:247\n76#5:217\n76#5:243\n460#6,13:229\n473#6,3:244\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1\n*L\n117#1:207\n122#1:208\n128#1:209\n134#1:210,6\n134#1:242\n134#1:248\n134#1:216\n134#1:218,11\n134#1:247\n134#1:217\n143#1:243\n134#1:229,13\n134#1:244,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $iconEnd:Ljava/lang/Integer;

.field final synthetic $iconStart:Ljava/lang/Integer;

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $state:Lcom/stripe/android/link/ui/PrimaryButtonState;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$state:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$iconStart:Ljava/lang/Integer;

    iput p3, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$$dirty:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$label:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$iconEnd:Ljava/lang/Integer;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc5;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "$this$Button"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x51

    const/16 v4, 0x10

    if-ne v3, v4, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:112)"

    const v5, -0x7309bbc5

    invoke-static {v5, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$state:Lcom/stripe/android/link/ui/PrimaryButtonState;

    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v2, v6, :cond_6

    if-eq v2, v3, :cond_5

    const v2, -0x433b567e

    invoke-interface {v1, v2}, LEt0;->F(I)V

    sget-object v8, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    invoke-static {v8, v2, v6, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$iconStart:Ljava/lang/Integer;

    iget v14, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$$dirty:I

    iget-object v15, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$label:Ljava/lang/String;

    iget-object v13, v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1;->$iconEnd:Ljava/lang/Integer;

    const v6, 0x2952b718

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->f()Llo$d;

    move-result-object v6

    const/16 v7, 0x30

    invoke-static {v6, v3, v1, v7}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v6, -0x4ee9b9da

    invoke-interface {v1, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v1, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v1, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v3, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v9, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v3, v1, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v2, -0x286e2e7f

    invoke-interface {v1, v2}, LEt0;->F(I)V

    sget-object v7, Lad5;->a:Lad5;

    const v2, 0x34b7aa36

    invoke-interface {v1, v2}, LEt0;->F(I)V

    shr-int/lit8 v2, v14, 0x9

    and-int/lit8 v2, v2, 0xe

    invoke-static {v4, v1, v2}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->access$PrimaryButtonIcon(Ljava/lang/Integer;LEt0;I)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v3, v1, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getButtonLabel-0d7_KjU()J

    move-result-wide v4

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    sget-object v16, Lr06;->b:Lr06$a;

    invoke-virtual/range {v16 .. v16}, Lr06$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move-object/from16 v25, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move/from16 v26, v14

    move-object/from16 v21, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    and-int/lit8 v22, v26, 0xe

    const/16 v23, 0x0

    const v24, 0xfdf8

    move-object/from16 v1, v21

    move-object/from16 v21, p2

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    shr-int/lit8 v1, v26, 0xc

    and-int/lit8 v1, v1, 0xe

    move-object/from16 v9, p2

    move-object/from16 v2, v25

    invoke-static {v2, v9, v1}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->access$PrimaryButtonIcon(Ljava/lang/Integer;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_2

    :cond_5
    move-object v9, v1

    const v1, -0x433b585e

    invoke-interface {v9, v1}, LEt0;->F(I)V

    sget v1, Lcom/stripe/android/link/R$drawable;->ic_link_complete:I

    invoke-static {v1, v9, v5}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, LgV2;->b0:LgV2$a;

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v3, v7}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    sget-object v7, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$2;->INSTANCE:Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$2;

    invoke-static {v3, v5, v7, v6, v4}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v4, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-static {v4, v9, v5}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkColors;->getButtonLabel-0d7_KjU()J

    move-result-wide v4

    const/16 v7, 0x38

    const/4 v8, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_2

    :cond_6
    move-object v9, v1

    const v1, -0x433b5a14

    invoke-interface {v9, v1}, LEt0;->F(I)V

    sget-object v1, LgV2;->b0:LgV2$a;

    const/16 v2, 0x12

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$1;->INSTANCE:Lcom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1$1;

    invoke-static {v1, v5, v2, v6, v4}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v2, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v2, v9, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getButtonLabel-0d7_KjU()J

    move-result-wide v4

    int-to-float v2, v3

    invoke-static {v2}, Lk61;->g(F)F

    move-result v6

    const/16 v7, 0x180

    const/4 v8, 0x0

    move-wide v2, v4

    move v4, v6

    move-object/from16 v5, p2

    move v6, v7

    move v7, v8

    invoke-static/range {v1 .. v7}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
