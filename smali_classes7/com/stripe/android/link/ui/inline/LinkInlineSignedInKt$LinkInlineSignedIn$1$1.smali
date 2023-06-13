.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt;->LinkInlineSignedIn(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
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
        "SMAP\nLinkInlineSignedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,95:1\n67#2,6:96\n73#2:128\n77#2:211\n75#3:102\n76#3,11:104\n75#3:136\n76#3,11:138\n75#3:170\n76#3,11:172\n89#3:200\n89#3:205\n89#3:210\n76#4:103\n76#4:137\n76#4:171\n460#5,13:115\n460#5,13:149\n460#5,13:183\n473#5,3:197\n473#5,3:202\n473#5,3:207\n154#6:129\n154#6:163\n154#6:164\n74#7,6:130\n80#7:162\n84#7:206\n76#8,5:165\n81#8:196\n85#8:201\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1\n*L\n46#1:96,6\n46#1:128\n46#1:211\n46#1:102\n46#1:104,11\n60#1:136\n60#1:138,11\n73#1:170\n73#1:172,11\n73#1:200\n60#1:205\n46#1:210\n46#1:103\n60#1:137\n73#1:171\n46#1:115,13\n60#1:149,13\n73#1:183,13\n73#1:197,3\n60#1:202,3\n46#1:207,3\n63#1:129\n67#1:163\n71#1:164\n60#1:130,6\n60#1:162\n60#1:206\n73#1:165,5\n73#1:196\n73#1:201\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $accountEmail:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:LgV2;

.field final synthetic $onLogout:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;


# direct methods
.method public constructor <init>(LgV2;LsP5;Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "LsP5<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$modifier:LgV2;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$accountEmail:LsP5;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$viewModel:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$onLogout:Lkotlin/jvm/functions/Function0;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 63

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

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.inline.LinkInlineSignedIn.<anonymous>.<anonymous> (LinkInlineSignedIn.kt:44)"

    const v4, -0x62ff5929

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$modifier:LgV2;

    sget-object v15, LTM2;->a:LTM2;

    sget v13, LTM2;->b:I

    or-int/lit8 v2, v13, 0x30

    const/4 v12, 0x0

    invoke-static {v15, v12, v14, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStroke(LTM2;ZLEt0;I)LeZ;

    move-result-object v2

    invoke-static {v15, v14, v13}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v3

    invoke-static {v1, v2, v3}, LdZ;->f(LgV2;LeZ;Lhy5;)LgV2;

    move-result-object v1

    invoke-static {v15, v14, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v2

    invoke-static {v15, v14, v13}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1$1;->INSTANCE:Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1$1;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v1, v12, v2, v10, v11}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v9, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$accountEmail:LsP5;

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$viewModel:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    iget-object v7, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1;->$onLogout:Lkotlin/jvm/functions/Function0;

    const v2, 0x2bb5b5d7

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v25, LK9;->a:LK9$a;

    invoke-virtual/range {v25 .. v25}, LK9$a;->n()LK9;

    move-result-object v2

    invoke-static {v2, v12, v14, v12}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v2

    const v5, -0x4ee9b9da

    invoke-interface {v14, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v26, LBt0;->M:LBt0$a;

    invoke-virtual/range {v26 .. v26}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v14, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual/range {v26 .. v26}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v5, v2, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v5, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v5, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v5, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v14, v10}, LEt0;->F(I)V

    const v1, -0x7f65a980

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Lf10;->a:Lf10;

    const v1, 0x15d6025d

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v5, LgV2;->b0:LgV2$a;

    const/4 v6, 0x0

    const/4 v3, 0x1

    invoke-static {v5, v6, v3, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x10

    int-to-float v4, v2

    invoke-static {v4}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    const v2, -0x1cd0f17e

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v27, Llo;->a:Llo;

    invoke-virtual/range {v27 .. v27}, Llo;->g()Llo$l;

    move-result-object v2

    invoke-virtual/range {v25 .. v25}, LK9$a;->j()LK9$b;

    move-result-object v3

    invoke-static {v2, v3, v14, v12}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v14, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    invoke-virtual/range {v26 .. v26}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v14, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual/range {v26 .. v26}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v10, v2, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v10, v11, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v2, v14, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v14, v10}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, -0x2416302d

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget v1, Lcom/stripe/android/link/R$string;->this_card_will_be_saved:I

    const/4 v12, 0x0

    invoke-static {v1, v14, v12}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static {v4}, Lk61;->g(F)F

    move-result v21

    const/16 v22, 0x7

    const/16 v23, 0x0

    move-object/from16 v17, v5

    invoke-static/range {v17 .. v23}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    const-wide/16 v17, 0x0

    move/from16 v29, v4

    const v6, -0x4ee9b9da

    const/4 v11, 0x1

    move-wide/from16 v3, v17

    const-wide/16 v16, 0x0

    move-object/from16 p2, v5

    move-wide/from16 v5, v16

    const/16 v16, 0x0

    move-object/from16 v31, v7

    move-object/from16 v7, v16

    move-object/from16 v32, v8

    move-object/from16 v8, v16

    move-object/from16 v30, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move/from16 v28, v12

    move-object/from16 v12, v16

    move/from16 v33, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v34, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x30

    const/16 v23, 0x0

    const v24, 0xfffc

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    move-object/from16 v14, p1

    move/from16 v13, v33

    move-object/from16 v15, v34

    invoke-static {v15, v14, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v2

    const v4, 0x3dcccccd    # 0.1f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v29 .. v29}, Lk61;->g(F)F

    move-result v21

    const/16 v22, 0x7

    const/16 v23, 0x0

    move-object/from16 v17, p2

    invoke-static/range {v17 .. v23}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/16 v8, 0xc

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    invoke-virtual/range {v27 .. v27}, Llo;->d()Llo$e;

    move-result-object v1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v3, v5, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, 0x2952b718

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-virtual/range {v25 .. v25}, LK9$a;->k()LK9$c;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v1, v3, v14, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v1

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    invoke-virtual/range {v26 .. v26}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_8
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v26 .. v26}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v26 .. v26}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v1, 0x12ec8637

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-interface/range {v30 .. v30}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_9

    const-string v1, ""

    :cond_9
    const/4 v2, 0x0

    invoke-static {v15, v14, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v35, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v36, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xfffa

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    new-instance v1, LDf;

    sget v2, Lcom/stripe/android/link/R$string;->logout:I

    move-object/from16 v12, p1

    move/from16 v3, v28

    invoke-static {v2, v12, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v38

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x6

    const/16 v42, 0x0

    move-object/from16 v37, v1

    invoke-direct/range {v37 .. v42}, LDf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    sget-object v3, LG26;->d:LG26$a;

    invoke-virtual {v3}, LG26$a;->a()LG26;

    move-result-object v37

    move/from16 v4, v35

    move-object/from16 v3, v36

    invoke-virtual {v3, v12, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->j()J

    move-result-wide v38

    const-wide/16 v40, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const v61, 0x3fffe

    const/16 v62, 0x0

    invoke-static/range {v37 .. v62}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v8, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1$2$1$1$1;

    move-object/from16 v10, v31

    move-object/from16 v9, v32

    invoke-direct {v8, v9, v10}, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1$2$1$1$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/jvm/functions/Function0;)V

    const/4 v10, 0x0

    const/16 v11, 0x7a

    move-object/from16 v9, p1

    invoke-static/range {v1 .. v11}, Lck0;->a(LDf;LgV2;LG26;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_4
    return-void
.end method
