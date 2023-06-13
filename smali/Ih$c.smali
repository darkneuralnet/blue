.class public final LIh$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIh;->c(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLEt0;II)V
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
        "SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n75#2,6:548\n81#2:580\n85#2:585\n75#2,6:586\n81#2:618\n85#2:623\n75#3:554\n76#3,11:556\n89#3:584\n75#3:592\n76#3,11:594\n89#3:622\n76#4:555\n76#4:593\n460#5,13:567\n473#5,3:581\n460#5,13:605\n473#5,3:619\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n97#1:548,6\n97#1:580\n97#1:585\n105#1:586,6\n105#1:618\n105#1:623\n97#1:554\n97#1:556,11\n97#1:584\n105#1:592\n105#1:594,11\n105#1:622\n97#1:555\n105#1:593\n97#1:567,13\n97#1:581,3\n105#1:605,13\n105#1:619,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:I

.field public final synthetic i:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LIh$c;->g:Lkotlin/jvm/functions/Function2;

    iput p2, p0, LIh$c;->h:I

    iput-object p3, p0, LIh$c;->i:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, LIh$c;->j:Lkotlin/jvm/functions/Function3;

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

    invoke-virtual {p0, p1, p2, p3}, LIh$c;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move/from16 v2, p3

    const-string v3, "$this$AppBar"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    if-nez v3, :cond_1

    invoke-interface {v7, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)"

    const v5, -0x58753a7e

    invoke-static {v5, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LIh$c;->g:Lkotlin/jvm/functions/Function2;

    const v8, 0x7ab4aae9

    const v9, -0x4ee9b9da

    const v10, 0x2952b718

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v13, 0x6

    const/4 v14, 0x1

    if-nez v2, :cond_5

    const v2, -0x1e90e66b

    invoke-interface {v7, v2}, LEt0;->F(I)V

    invoke-static {}, LIh;->h()LgV2;

    move-result-object v2

    invoke-static {v2, v7, v13}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_4

    :cond_5
    const v2, -0x1e90e630

    invoke-interface {v7, v2}, LEt0;->F(I)V

    invoke-static {}, LIh;->g()LgV2;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v3

    iget-object v4, v0, LIh$c;->g:Lkotlin/jvm/functions/Function2;

    iget v5, v0, LIh$c;->h:I

    invoke-interface {v7, v10}, LEt0;->F(I)V

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->f()Llo$d;

    move-result-object v6

    invoke-static {v6, v3, v7, v11}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    invoke-interface {v7, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v7, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v15

    invoke-interface {v7, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v7, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_6

    invoke-static {}, Lyt0;->c()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v7, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v3, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v15, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v9, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v3, v7, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v8}, LEt0;->F(I)V

    sget-object v2, Lad5;->a:Lad5;

    new-array v2, v14, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v3

    sget-object v6, LWz0;->a:LWz0;

    invoke-virtual {v6, v7, v13}, LWz0;->c(LEt0;I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v3, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v3

    aput-object v3, v2, v12

    shr-int/lit8 v3, v5, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x8

    invoke-static {v2, v4, v7, v3}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_4
    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v2

    iget-object v3, v0, LIh$c;->i:Lkotlin/jvm/functions/Function2;

    iget v4, v0, LIh$c;->h:I

    const v5, 0x2952b718

    invoke-interface {v7, v5}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->f()Llo$d;

    move-result-object v5

    const/16 v6, 0x30

    invoke-static {v5, v2, v7, v6}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    const v5, -0x4ee9b9da

    invoke-interface {v7, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v7, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v7, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v7, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_8

    invoke-static {}, Lyt0;->c()V

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v7, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_9
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_5
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v11, v2, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v11, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v11, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v11, v9, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v2, v7, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7, v8}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    sget-object v1, LTM2;->a:LTM2;

    invoke-virtual {v1, v7, v13}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->j()LG26;

    move-result-object v1

    new-instance v2, LIh$c$a;

    invoke-direct {v2, v3, v4}, LIh$c$a;-><init>(Lkotlin/jvm/functions/Function2;I)V

    const v3, -0x787deb73

    invoke-static {v7, v3, v14, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v1, v2, v7, v3}, Lc26;->a(LG26;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    new-array v1, v14, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v2

    sget-object v3, LWz0;->a:LWz0;

    invoke-virtual {v3, v7, v13}, LWz0;->d(LEt0;I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    aput-object v2, v1, v12

    new-instance v2, LIh$c$b;

    iget-object v3, v0, LIh$c;->j:Lkotlin/jvm/functions/Function3;

    iget v4, v0, LIh$c;->h:I

    invoke-direct {v2, v3, v4}, LIh$c$b;-><init>(Lkotlin/jvm/functions/Function3;I)V

    const v3, 0x450088c2

    invoke-static {v7, v3, v14, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v1, v2, v7, v3}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_6
    return-void
.end method
