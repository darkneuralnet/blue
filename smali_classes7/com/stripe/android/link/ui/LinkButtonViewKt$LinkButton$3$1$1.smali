.class final Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
        "SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,166:1\n154#2:167\n154#2:168\n154#2:169\n154#2:204\n76#3:170\n76#3:178\n67#4,6:171\n73#4:203\n77#4:209\n75#5:177\n76#5,11:179\n89#5:208\n460#6,13:190\n473#6,3:205\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1\n*L\n97#1:167\n99#1:168\n100#1:169\n117#1:204\n103#1:170\n107#1:178\n107#1:171,6\n107#1:203\n107#1:209\n107#1:177\n107#1:179,11\n107#1:208\n107#1:190,13\n107#1:205,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $email:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;->$email:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 24

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "$this$Button"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0xe

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v2, v2, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButtonView.kt:91)"

    const v4, -0x40aa2104

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget v1, Lcom/stripe/android/link/R$drawable;->ic_link_logo:I

    const/4 v9, 0x0

    invoke-static {v1, v15, v9}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    sget v2, Lcom/stripe/android/link/R$string;->link:I

    invoke-static {v2, v15, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    sget-object v10, LgV2;->b0:LgV2$a;

    const/16 v3, 0x16

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v10, v3}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x5

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    const/4 v5, 0x3

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3, v4, v5}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v3

    sget-object v11, LTM2;->a:LTM2;

    sget v12, LTM2;->b:I

    invoke-static {v11, v15, v12}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkColors;->getButtonLabel-0d7_KjU()J

    move-result-wide v16

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v23, 0x0

    invoke-static/range {v16 .. v23}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    const/16 v7, 0x188

    const/4 v8, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    move-object/from16 v13, p0

    iget-object v14, v13, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;->$email:Ljava/lang/String;

    if-nez v14, :cond_5

    goto/16 :goto_4

    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object/from16 v0, p1

    move-object v1, v10

    invoke-static/range {v0 .. v5}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-static {v0, v15, v9}, LDN5;->a(LgV2;LEt0;I)V

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v1

    const v3, 0x3d4ccccd    # 0.05f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonEmailShape$p()Lbc5;

    move-result-object v2

    invoke-static {v10, v0, v1, v2}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v0

    const v1, 0x2bb5b5d7

    invoke-interface {v15, v1}, LEt0;->F(I)V

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->n()LK9;

    move-result-object v1

    invoke-static {v1, v9, v15, v9}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v5, LBt0;->M:LBt0$a;

    invoke-virtual {v5}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_6

    invoke-static {}, Lyt0;->c()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v15, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v5}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v15, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x98925c0

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v10, v0}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    invoke-static {v11, v15, v12}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/theme/LinkColors;->getButtonLabel-0d7_KjU()J

    move-result-wide v2

    const/16 v0, 0xe

    invoke-static {v0}, LN26;->f(I)J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object v0, v14

    move-wide/from16 v13, v16

    sget-object v16, Ln26;->a:Ln26$a;

    invoke-virtual/range {v16 .. v16}, Ln26$a;->b()I

    move-result v16

    move/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0xc30

    const/16 v22, 0xc30

    const v23, 0xd7f0

    move-object/from16 v20, p2

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_5
    return-void
.end method
