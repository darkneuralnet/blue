.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4;->invoke(LPD3;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
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
        "SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n74#2,6:236\n80#2:268\n74#2,6:346\n80#2:378\n74#2,6:382\n80#2:414\n84#2:428\n84#2:435\n74#2,6:437\n80#2:469\n84#2:474\n84#2:481\n75#3:242\n76#3,11:244\n75#3:276\n76#3,11:278\n89#3:306\n75#3:313\n76#3,11:315\n89#3:343\n75#3:352\n76#3,11:354\n75#3:388\n76#3,11:390\n89#3:427\n89#3:434\n75#3:443\n76#3,11:445\n89#3:473\n89#3:480\n76#4:243\n76#4:277\n76#4:314\n76#4:353\n76#4:389\n76#4:444\n460#5,13:255\n460#5,13:289\n473#5,3:303\n460#5,13:326\n473#5,3:340\n460#5,13:365\n460#5,13:401\n473#5,3:424\n473#5,3:431\n460#5,13:456\n473#5,3:470\n473#5,3:477\n154#6:269\n154#6:345\n154#6:380\n154#6:381\n154#6:429\n154#6:436\n154#6:475\n154#6:476\n67#7,6:270\n73#7:302\n77#7:307\n76#8,5:308\n81#8:339\n85#8:344\n1855#9:379\n1549#9:415\n1620#9,3:416\n766#9:419\n857#9,2:420\n1855#9,2:422\n1856#9:430\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1\n*L\n126#1:236,6\n126#1:268\n156#1:346,6\n156#1:378\n162#1:382,6\n162#1:414\n162#1:428\n156#1:435\n201#1:437,6\n201#1:469\n201#1:474\n126#1:481\n126#1:242\n126#1:244,11\n129#1:276\n129#1:278,11\n129#1:306\n144#1:313\n144#1:315,11\n144#1:343\n156#1:352\n156#1:354,11\n162#1:388\n162#1:390,11\n162#1:427\n156#1:434\n201#1:443\n201#1:445,11\n201#1:473\n126#1:480\n126#1:243\n129#1:277\n144#1:314\n156#1:353\n162#1:389\n201#1:444\n126#1:255,13\n129#1:289,13\n129#1:303,3\n144#1:326,13\n144#1:340,3\n156#1:365,13\n162#1:401,13\n162#1:424,3\n156#1:431,3\n201#1:456,13\n201#1:470,3\n126#1:477,3\n132#1:269\n154#1:345\n169#1:380\n170#1:381\n196#1:429\n204#1:436\n223#1:475\n224#1:476\n129#1:270,6\n129#1:302\n129#1:307\n144#1:308,5\n144#1:339\n144#1:344\n159#1:379\n177#1:415\n177#1:416,3\n179#1:419\n179#1:420,2\n181#1:422,2\n159#1:430\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $attributionDrawable:Ljava/lang/Integer;

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $loading$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $predictions$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $query:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;


# direct methods
.method public constructor <init>(LsP5;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Landroidx/compose/ui/focus/h;LsP5;LsP5;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
            "Landroidx/compose/ui/focus/h;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$query:LsP5;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$loading$delegate:LsP5;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$predictions$delegate:LsP5;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$attributionDrawable:Ljava/lang/Integer;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$ScrollableColumn"

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

    goto/16 :goto_e

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:124)"

    const v5, 0xb1fc0c3

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v10, LgV2;->b0:LgV2$a;

    const/4 v15, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    invoke-static {v10, v15, v13, v12}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$query:LsP5;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$loading$delegate:LsP5;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$predictions$delegate:LsP5;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1;->$attributionDrawable:Ljava/lang/Integer;

    const v5, -0x1cd0f17e

    invoke-interface {v14, v5}, LEt0;->F(I)V

    sget-object v16, Llo;->a:Llo;

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v4

    sget-object v17, LK9;->a:LK9$a;

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v5

    move-object/from16 v18, v6

    const/4 v6, 0x0

    invoke-static {v4, v5, v14, v6}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    const v5, -0x4ee9b9da

    invoke-interface {v14, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v14, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v21, LBt0;->M:LBt0$a;

    invoke-virtual/range {v21 .. v21}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

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

    invoke-interface {v14, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual/range {v21 .. v21}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v13, v4, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v3, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v13, v12, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v14, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v15, 0x7ab4aae9

    invoke-interface {v14, v15}, LEt0;->F(I)V

    const v13, -0x455f09d5

    invoke-interface {v14, v13}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, 0x6dde77b9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v10, v3, v1, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/16 v1, 0x10

    int-to-float v12, v1

    invoke-static {v12}, Lk61;->g(F)F

    move-result v1

    const/4 v13, 0x2

    invoke-static {v5, v1, v3, v13, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const v3, 0x2bb5b5d7

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-virtual/range {v17 .. v17}, LK9$a;->n()LK9;

    move-result-object v3

    invoke-static {v3, v6, v14, v6}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {v14, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v14, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    invoke-virtual/range {v21 .. v21}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v14, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v21 .. v21}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v6, v3, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v13, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v14, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, -0x7f65a980

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Lf10;->a:Lf10;

    const v1, -0x4b8790c1

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getTextFieldController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v1

    sget-object v3, LFY1;->b:LFY1$a;

    invoke-virtual {v3}, LFY1$a;->b()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v10, v13, v5, v15}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v6

    invoke-static {v6, v2}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v13, 0x0

    sget v2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->$stable:I

    or-int/lit16 v15, v2, 0x180

    const/16 v27, 0x30

    move v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v26, v18

    const/16 p1, 0x0

    move-object v6, v13

    move-object v13, v7

    move-object/from16 v7, p2

    move-object/from16 v18, v8

    move v8, v15

    move-object v15, v9

    move/from16 v9, v27

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static/range {v18 .. v18}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->access$AutocompleteScreenUI$lambda$1(LsP5;)Z

    move-result v1

    if-eqz v1, :cond_9

    const v1, 0x4b12db5

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->b()Llo$e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v10, v3, v2, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, 0x2952b718

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-virtual/range {v17 .. v17}, LK9$a;->k()LK9$c;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v1, v3, v14, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v1

    const v9, -0x4ee9b9da

    invoke-interface {v14, v9}, LEt0;->F(I)V

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

    invoke-virtual/range {v21 .. v21}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v21 .. v21}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v1, -0x7d7b5fc8

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v0, v14

    goto/16 :goto_d

    :cond_9
    const v9, -0x4ee9b9da

    invoke-interface {v11}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_18

    const v1, 0x4b12ee6

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-static {v13}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->access$AutocompleteScreenUI$lambda$0(LsP5;)Ljava/util/List;

    move-result-object v13

    if-nez v13, :cond_a

    move-object v0, v14

    goto/16 :goto_c

    :cond_a
    move-object v1, v13

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_14

    const v1, -0x3d156923

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/16 v1, 0x8

    int-to-float v8, v1

    invoke-static {v8}, Lk61;->g(F)F

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v10, v3, v1, v2, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/16 v18, 0xe

    move-object/from16 v6, p2

    move/from16 v27, v8

    move/from16 v8, v18

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v10, v2, v1, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const v10, -0x1cd0f17e

    invoke-interface {v14, v10}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v2

    move/from16 v8, p1

    invoke-static {v1, v2, v14, v8}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    invoke-interface {v14, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v14, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    invoke-virtual/range {v21 .. v21}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_c
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_4
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v21 .. v21}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v1, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const v1, 0x6f9a109b

    invoke-interface {v14, v1}, LEt0;->F(I)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :goto_5
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;->getPrimaryText()Landroid/text/SpannableString;

    move-result-object v2

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;->getSecondaryText()Landroid/text/SpannableString;

    move-result-object v29

    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v13, 0x0

    invoke-static {v3, v13, v4, v5}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1$1$3$1$1$1;

    invoke-direct {v3, v15, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$4$1$1$3$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V

    const/16 v35, 0x7

    const/16 v36, 0x0

    move-object/from16 v34, v3

    invoke-static/range {v30 .. v36}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    invoke-static/range {v27 .. v27}, Lk61;->g(F)F

    move-result v3

    invoke-static {v12}, Lk61;->g(F)F

    move-result v4

    invoke-static {v1, v4, v3}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v1

    invoke-interface {v14, v10}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->j()LK9$b;

    move-result-object v4

    invoke-static {v3, v4, v14, v8}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    invoke-interface {v14, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_d

    invoke-static {}, Lyt0;->c()V

    :cond_d
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v14, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_e
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_6
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v14, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v14, v10}, LEt0;->F(I)V

    const v9, -0x455f09d5

    invoke-interface {v14, v9}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, 0x256b0d7b

    invoke-interface {v14, v1}, LEt0;->F(I)V

    new-instance v1, Lkotlin/text/Regex;

    invoke-interface {v11}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v30, v3

    check-cast v30, Ljava/lang/String;

    const-string v31, " "

    const-string v32, "|"

    const/16 v33, 0x0

    const/16 v34, 0x4

    const/16 v35, 0x0

    invoke-static/range {v30 .. v35}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-direct {v1, v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v1, v2, v8, v7, v6}, Lkotlin/text/Regex;->findAll$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v1

    invoke-static {v1}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/text/MatchResult;

    invoke-interface {v4}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    const/16 v16, 0x1

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_10

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_11
    const/16 v16, 0x1

    invoke-virtual {v2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "primaryText.toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v17, v2

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<b>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "</b>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x0

    move-object/from16 v18, v2

    invoke-static/range {v17 .. v22}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    goto :goto_9

    :cond_12
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x6

    move-object/from16 v1, v17

    move-object/from16 v4, p2

    move-object/from16 v17, v6

    move/from16 v6, v18

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/uicore/text/HtmlKt;->annotatedStringResource(Ljava/lang/String;Ljava/util/Map;LGN5;LEt0;II)LDf;

    move-result-object v1

    sget-object v5, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v5, v14, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v18, 0x0

    move-object v2, v5

    move/from16 v37, v6

    move-wide/from16 v5, v18

    const/16 v18, 0x0

    move/from16 v19, v7

    move-object/from16 v7, v18

    move-object/from16 v8, v18

    move/from16 v20, v9

    move-object/from16 v9, v18

    const-wide/16 v21, 0x0

    move/from16 v18, v10

    move-object/from16 v31, v11

    move-wide/from16 v10, v21

    const/16 v21, 0x0

    move/from16 v32, v12

    move-object/from16 v12, v21

    const/16 v17, 0x0

    move/from16 v16, v13

    move-object/from16 v13, v17

    const-wide/16 v19, 0x0

    move-object v5, v14

    move-object/from16 v35, v15

    move/from16 v6, v18

    move-wide/from16 v14, v19

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v6, v37

    invoke-virtual {v2, v5, v6}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, LGc6;->c()LG26;

    move-result-object v21

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0xfffa

    move-object/from16 v22, p2

    move-object/from16 v38, v2

    move-object v0, v5

    move/from16 v39, v6

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v25}, Lc26;->b(LDf;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-virtual/range {v29 .. v29}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v1, v2

    const-string v3, "secondaryText.toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    move-object/from16 v14, v38

    move/from16 v15, v39

    invoke-static {v14, v0, v15}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move-object v2, v14

    move v5, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-virtual {v2, v0, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v2

    invoke-virtual {v2}, LGc6;->c()LG26;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v24, 0x7ffa

    move-object/from16 v21, p2

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    sget-object v1, LgV2;->b0:LgV2$a;

    invoke-static/range {v32 .. v32}, Lk61;->g(F)F

    move-result v2

    const/4 v9, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v2, v11, v9, v12}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/16 v8, 0xe

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    move-object v14, v0

    move-object/from16 v11, v31

    move/from16 v12, v32

    move-object/from16 v15, v35

    const/4 v8, 0x0

    const v9, -0x4ee9b9da

    const v10, -0x1cd0f17e

    move-object/from16 v0, p0

    goto/16 :goto_5

    :cond_13
    move/from16 v32, v12

    move-object v0, v14

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_b

    :cond_14
    move/from16 v32, v12

    move-object v0, v14

    const/4 v9, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v1, -0x3d155df8

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const/4 v1, 0x1

    invoke-static {v10, v11, v1, v12}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    invoke-static/range {v32 .. v32}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2, v11, v9, v12}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const v2, -0x1cd0f17e

    invoke-interface {v0, v2}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v3

    const/4 v14, 0x0

    invoke-static {v2, v3, v0, v14}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v0, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v0, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    invoke-virtual/range {v21 .. v21}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_15

    invoke-static {}, Lyt0;->c()V

    :cond_15
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v0, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_a

    :cond_16
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_a
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v21 .. v21}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v21 .. v21}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const v1, 0x13185a72

    invoke-interface {v0, v1}, LEt0;->F(I)V

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_autocomplete_no_results_found:I

    invoke-static {v1, v0, v14}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v15, LTM2;->a:LTM2;

    sget v13, LTM2;->b:I

    invoke-static {v15, v0, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move v2, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move v6, v14

    move-object v5, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual {v5, v0, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v2

    invoke-virtual {v2}, LGc6;->c()LG26;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x7ffa

    move-object/from16 v21, p2

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_b
    if-nez v26, :cond_17

    goto :goto_c

    :cond_17
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, LgV2;->b0:LgV2$a;

    invoke-static/range {v32 .. v32}, Lk61;->g(F)F

    move-result v4

    invoke-static/range {v32 .. v32}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3, v5, v4}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v3

    const-string v4, "AutocompleteAttributionDrawable"

    invoke-static {v3, v4}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v10, 0x78

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_c
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_d

    :cond_18
    move-object v0, v14

    const v1, 0x4b1400f

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_d
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LQt0;->Y()V

    :cond_19
    :goto_e
    return-void
.end method
