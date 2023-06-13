.class final Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ndPIYpw(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V
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
        "SMAP\nTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n74#2,7:347\n81#2:380\n75#2,6:382\n81#2:414\n85#2:421\n85#2:426\n75#3:354\n76#3,11:356\n75#3:388\n76#3,11:390\n89#3:420\n89#3:425\n76#4:355\n76#4:389\n460#5,13:367\n460#5,13:401\n473#5,3:417\n473#5,3:422\n154#6:381\n1855#7,2:415\n*S KotlinDebug\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1\n*L\n235#1:347,7\n235#1:380\n241#1:382,6\n241#1:414\n241#1:421\n235#1:426\n235#1:354\n235#1:356,11\n241#1:388\n241#1:390,11\n241#1:420\n235#1:425\n235#1:355\n241#1:389\n235#1:367,13\n241#1:401,13\n241#1:417,3\n235#1:422,3\n241#1:381\n242#1:415,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $it:Lcom/stripe/android/uicore/elements/TextFieldIcon;

.field final synthetic $loading$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldIcon;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;->$it:Lcom/stripe/android/uicore/elements/TextFieldIcon;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;->$loading$delegate:LsP5;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0xb

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.TextField.<anonymous>.<anonymous> (TextFieldUI.kt:233)"

    const v5, 0x345cec8d

    invoke-static {v5, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;->$it:Lcom/stripe/android/uicore/elements/TextFieldIcon;

    iget-object v3, v0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$11$1;->$loading$delegate:LsP5;

    const v4, 0x2952b718

    invoke-interface {v1, v4}, LEt0;->F(I)V

    sget-object v5, LgV2;->b0:LgV2$a;

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->f()Llo$d;

    move-result-object v7

    sget-object v8, LK9;->a:LK9$a;

    invoke-virtual {v8}, LK9$a;->k()LK9$c;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v7, v9, v1, v10}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v7

    const v9, -0x4ee9b9da

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v1, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v1, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    sget-object v14, LBt0;->M:LBt0$a;

    invoke-virtual {v14}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v4

    instance-of v4, v4, Llm;

    if-nez v4, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v4

    invoke-virtual {v14}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v4, v7, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v4, v11, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v4, v12, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v4, v13, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v4, v1, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const v7, -0x286e2e7f

    invoke-interface {v1, v7}, LEt0;->F(I)V

    sget-object v9, Lad5;->a:Lad5;

    const v9, -0x5ffb7c57

    invoke-interface {v1, v9}, LEt0;->F(I)V

    instance-of v9, v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    if-eqz v9, :cond_5

    const v4, -0x3dde2342

    invoke-interface {v1, v4}, LEt0;->F(I)V

    check-cast v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$6(LsP5;)Z

    move-result v3

    invoke-static {v2, v3, v1, v10}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TrailingIcon(Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;ZLEt0;I)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    goto/16 :goto_4

    :cond_5
    instance-of v9, v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;

    if-eqz v9, :cond_9

    const v9, -0x3dde22b6    # -40.466103f

    invoke-interface {v1, v9}, LEt0;->F(I)V

    const/16 v9, 0xa

    int-to-float v9, v9

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    invoke-static {v5, v9}, LND3;->i(LgV2;F)LgV2;

    move-result-object v5

    const v9, 0x2952b718

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-virtual {v6}, Llo;->f()Llo$d;

    move-result-object v6

    invoke-virtual {v8}, LK9$a;->k()LK9$c;

    move-result-object v8

    invoke-static {v6, v8, v1, v10}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v6

    const v8, -0x4ee9b9da

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    invoke-virtual {v14}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_6

    invoke-static {}, Lyt0;->c()V

    :cond_6
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v1, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_7
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual {v14}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v12, v6, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v12, v8, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v12, v9, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v12, v11, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v5, v6, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-interface {v1, v7}, LEt0;->F(I)V

    const v4, -0x2c2b147c

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const v4, 0x5c803062

    invoke-interface {v1, v4}, LEt0;->F(I)V

    check-cast v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;->getStaticIcons()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$6(LsP5;)Z

    move-result v6

    invoke-static {v5, v6, v1, v10}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TrailingIcon(Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;ZLEt0;I)V

    goto :goto_3

    :cond_8
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;->getAnimatedIcons()Ljava/util/List;

    move-result-object v2

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$6(LsP5;)Z

    move-result v3

    const/16 v4, 0x8

    invoke-static {v2, v3, v1, v4}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->AnimatedIcons(Ljava/util/List;ZLEt0;I)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    goto :goto_4

    :cond_9
    const v2, -0x3dde212d

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    :goto_4
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
    :goto_5
    return-void
.end method
