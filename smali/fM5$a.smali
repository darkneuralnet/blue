.class public final LfM5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfM5;->a(LcM5;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "LEt0;",
        "-",
        "Ljava/lang/Integer;",
        "+",
        "Lkotlin/Unit;",
        ">;",
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
        "SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,373:1\n67#2,6:374\n73#2:406\n77#2:411\n75#3:380\n76#3,11:382\n89#3:410\n76#4:381\n460#5,13:393\n473#5,3:407\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n299#1:374,6\n299#1:406\n299#1:411\n299#1:380\n299#1:382,11\n299#1:410\n299#1:381\n299#1:393,13\n299#1:407,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LcM5;

.field public final synthetic h:LcM5;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LcM5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Lxj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxj1<",
            "LcM5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LcM5;LcM5;Ljava/util/List;Lxj1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcM5;",
            "LcM5;",
            "Ljava/util/List<",
            "LcM5;",
            ">;",
            "Lxj1<",
            "LcM5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LfM5$a;->g:LcM5;

    iput-object p2, p0, LfM5$a;->h:LcM5;

    iput-object p3, p0, LfM5$a;->i:Ljava/util/List;

    iput-object p4, p0, LfM5$a;->j:Lxj1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LfM5$a;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    const-string v2, "children"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_1

    invoke-interface {v8, v1}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v9, v2

    goto :goto_1

    :cond_1
    move/from16 v9, p3

    :goto_1
    and-int/lit8 v2, v9, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)"

    const v4, -0x59beafa

    invoke-static {v4, v9, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LfM5$a;->g:LcM5;

    iget-object v3, v0, LfM5$a;->h:LcM5;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/16 v2, 0x4b

    if-eqz v10, :cond_5

    const/16 v3, 0x96

    move v11, v3

    goto :goto_3

    :cond_5
    move v11, v2

    :goto_3
    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v10, :cond_6

    iget-object v3, v0, LfM5$a;->i:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v12, :cond_6

    move v14, v2

    goto :goto_4

    :cond_6
    move v14, v13

    :goto_4
    invoke-static {}, Li91;->c()Lh91;

    move-result-object v2

    invoke-static {v11, v14, v2}, Lmf;->j(IILh91;)Ltb6;

    move-result-object v2

    new-instance v4, LfM5$a$b;

    iget-object v3, v0, LfM5$a;->g:LcM5;

    iget-object v5, v0, LfM5$a;->j:Lxj1;

    invoke-direct {v4, v3, v5}, LfM5$a$b;-><init>(LcM5;Lxj1;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, v10

    move-object/from16 v5, p2

    invoke-static/range {v2 .. v7}, LfM5;->d(Llf;ZLkotlin/jvm/functions/Function0;LEt0;II)LsP5;

    move-result-object v2

    invoke-static {}, Li91;->b()Lh91;

    move-result-object v3

    invoke-static {v11, v14, v3}, Lmf;->j(IILh91;)Ltb6;

    move-result-object v3

    invoke-static {v3, v10, v8, v13}, LfM5;->e(Llf;ZLEt0;I)LsP5;

    move-result-object v3

    sget-object v14, LgV2;->b0:LgV2$a;

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v15

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v16

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const v35, 0x1fff8

    const/16 v36, 0x0

    invoke-static/range {v14 .. v36}, Landroidx/compose/ui/graphics/b;->c(LgV2;FFFFFFFFFFJLhy5;ZLow4;JJIILjava/lang/Object;)LgV2;

    move-result-object v2

    new-instance v3, LfM5$a$a;

    iget-object v4, v0, LfM5$a;->g:LcM5;

    invoke-direct {v3, v4}, LfM5$a$a;-><init>(LcM5;)V

    const/4 v4, 0x0

    invoke-static {v2, v13, v3, v12, v4}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, 0x2bb5b5d7

    invoke-interface {v8, v3}, LEt0;->F(I)V

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->n()LK9;

    move-result-object v3

    invoke-static {v3, v13, v8, v13}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v8, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v8, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v8, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v8, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v8, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_5
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v3, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v8, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v8, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    and-int/lit8 v2, v9, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v8, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_6
    return-void
.end method
