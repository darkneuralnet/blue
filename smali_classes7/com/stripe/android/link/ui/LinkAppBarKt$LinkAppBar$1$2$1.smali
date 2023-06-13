.class final Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LTe;",
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
        "SMAP\nLinkAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,208:1\n154#2:209\n154#2:210\n76#3,5:211\n81#3:242\n85#3:247\n75#4:216\n76#4,11:218\n89#4:246\n76#5:217\n460#6,13:229\n473#6,3:243\n*S KotlinDebug\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1\n*L\n79#1:209\n80#1:210\n76#1:211,5\n76#1:242\n76#1:247\n76#1:216\n76#1:218,11\n76#1:246\n76#1:217\n76#1:229,13\n76#1:243,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $state:Lcom/stripe/android/link/ui/LinkAppBarState;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/LinkAppBarState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;->$state:Lcom/stripe/android/link/ui/LinkAppBarState;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;->invoke(LTe;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LEt0;I)V
    .locals 24

    move-object/from16 v0, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkAppBar.<anonymous>.<anonymous>.<anonymous> (LinkAppBar.kt:74)"

    const v3, 0x543a38e7

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    sget-object v2, Llo;->a:Llo;

    invoke-virtual {v2}, Llo;->b()Llo$e;

    move-result-object v2

    move-object/from16 v15, p0

    iget-object v3, v15, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$2$1;->$state:Lcom/stripe/android/link/ui/LinkAppBarState;

    const v4, 0x2952b718

    invoke-interface {v0, v4}, LEt0;->F(I)V

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->k()LK9$c;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v2, v4, v0, v5}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    const v4, -0x4ee9b9da

    invoke-interface {v0, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v0, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v0, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_0
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v2, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v2, v0, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v0, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v1, 0x57c83d4b

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/LinkAppBarState;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    move-object/from16 v20, v1

    const/4 v1, 0x0

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-static {v2, v0, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getDisabledText-0d7_KjU()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    sget-object v16, Ln26;->a:Ln26$a;

    invoke-virtual/range {v16 .. v16}, Ln26$a;->b()I

    move-result v16

    move/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xc30

    const v23, 0xd7fa

    move-object/from16 v0, v20

    move-object/from16 v20, p2

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    return-void
.end method
