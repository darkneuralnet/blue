.class public final Lun2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun2;->d(Lon2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLlo$d;Llo$l;Lmn2;LEt0;II)Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LVn2;",
        "Lkz0;",
        "Lxn2;",
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
        "SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,364:1\n154#2:365\n154#2:366\n480#3,4:367\n485#3:376\n122#4,5:371\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n234#1:365\n236#1:366\n317#1:367,4\n317#1:376\n317#1:371,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LPD3;

.field public final synthetic i:Z

.field public final synthetic j:LGn2;

.field public final synthetic k:Lon2;

.field public final synthetic l:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lg01;",
            "Lkz0;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic m:Llo$l;

.field public final synthetic n:Llo$d;

.field public final synthetic o:Lmn2;


# direct methods
.method public constructor <init>(ZLPD3;ZLGn2;Lon2;Lkotlin/jvm/functions/Function2;Llo$l;Llo$d;Lmn2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LPD3;",
            "Z",
            "LGn2;",
            "Lon2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lg01;",
            "-",
            "Lkz0;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;",
            "Llo$l;",
            "Llo$d;",
            "Lmn2;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lun2$c;->g:Z

    iput-object p2, p0, Lun2$c;->h:LPD3;

    iput-boolean p3, p0, Lun2$c;->i:Z

    iput-object p4, p0, Lun2$c;->j:LGn2;

    iput-object p5, p0, Lun2$c;->k:Lon2;

    iput-object p6, p0, Lun2$c;->l:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, Lun2$c;->m:Llo$l;

    iput-object p8, p0, Lun2$c;->n:Llo$d;

    iput-object p9, p0, Lun2$c;->o:Lmn2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LVn2;J)Lxn2;
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v11, p2

    const-string v2, "$this$null"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v1, Lun2$c;->g:Z

    if-eqz v2, :cond_0

    sget-object v2, LEy3;->b:LEy3;

    goto :goto_0

    :cond_0
    sget-object v2, LEy3;->c:LEy3;

    :goto_0
    invoke-static {v11, v12, v2}, Loi0;->a(JLEy3;)V

    iget-boolean v2, v1, Lun2$c;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, v1, Lun2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    invoke-interface {v2, v3}, LPD3;->b(Lpm2;)F

    move-result v2

    invoke-interface {v0, v2}, Lg01;->F0(F)I

    move-result v2

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lun2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    invoke-static {v2, v3}, LND3;->g(LPD3;Lpm2;)F

    move-result v2

    invoke-interface {v0, v2}, Lg01;->F0(F)I

    move-result v2

    :goto_1
    iget-boolean v3, v1, Lun2$c;->g:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Lun2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-interface {v3, v4}, LPD3;->c(Lpm2;)F

    move-result v3

    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v3

    goto :goto_2

    :cond_2
    iget-object v3, v1, Lun2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-static {v3, v4}, LND3;->f(LPD3;Lpm2;)F

    move-result v3

    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v3

    :goto_2
    iget-object v4, v1, Lun2$c;->h:LPD3;

    invoke-interface {v4}, LPD3;->d()F

    move-result v4

    invoke-interface {v0, v4}, Lg01;->F0(F)I

    move-result v4

    iget-object v5, v1, Lun2$c;->h:LPD3;

    invoke-interface {v5}, LPD3;->a()F

    move-result v5

    invoke-interface {v0, v5}, Lg01;->F0(F)I

    move-result v5

    add-int v13, v4, v5

    add-int v14, v2, v3

    iget-boolean v6, v1, Lun2$c;->g:Z

    if-eqz v6, :cond_3

    move v7, v13

    goto :goto_3

    :cond_3
    move v7, v14

    :goto_3
    if-eqz v6, :cond_4

    iget-boolean v8, v1, Lun2$c;->i:Z

    if-nez v8, :cond_4

    move v15, v4

    goto :goto_4

    :cond_4
    if-eqz v6, :cond_5

    iget-boolean v8, v1, Lun2$c;->i:Z

    if-eqz v8, :cond_5

    move v15, v5

    goto :goto_4

    :cond_5
    if-nez v6, :cond_6

    iget-boolean v5, v1, Lun2$c;->i:Z

    if-nez v5, :cond_6

    move v15, v2

    goto :goto_4

    :cond_6
    move v15, v3

    :goto_4
    sub-int v16, v7, v15

    neg-int v3, v14

    neg-int v5, v13

    invoke-static {v11, v12, v3, v5}, Lnz0;->h(JII)J

    move-result-wide v19

    iget-object v3, v1, Lun2$c;->j:LGn2;

    iget-object v5, v1, Lun2$c;->k:Lon2;

    invoke-virtual {v3, v5}, LGn2;->M(Lon2;)V

    iget-object v3, v1, Lun2$c;->k:Lon2;

    invoke-interface {v3}, Lon2;->i()LFn2;

    move-result-object v9

    iget-object v3, v1, Lun2$c;->l:Lkotlin/jvm/functions/Function2;

    invoke-static/range {p2 .. p3}, Lkz0;->b(J)Lkz0;

    move-result-object v5

    invoke-interface {v3, v0, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v9, v3}, LFn2;->h(I)V

    iget-object v3, v1, Lun2$c;->j:LGn2;

    invoke-virtual {v3, v0}, LGn2;->F(Lg01;)V

    iget-object v3, v1, Lun2$c;->j:LGn2;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v3, v5}, LGn2;->J(I)V

    iget-boolean v3, v1, Lun2$c;->g:Z

    const-string v5, "Required value was null."

    if-eqz v3, :cond_8

    iget-object v3, v1, Lun2$c;->m:Llo$l;

    if-eqz v3, :cond_7

    invoke-interface {v3}, Llo$l;->a()F

    move-result v3

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v3, v1, Lun2$c;->n:Llo$d;

    if-eqz v3, :cond_13

    invoke-interface {v3}, Llo$d;->a()F

    move-result v3

    :goto_5
    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v8

    iget-boolean v3, v1, Lun2$c;->g:Z

    const/4 v7, 0x0

    if-eqz v3, :cond_a

    iget-object v3, v1, Lun2$c;->n:Llo$d;

    if-eqz v3, :cond_9

    invoke-interface {v3}, Llo$d;->a()F

    move-result v3

    goto :goto_6

    :cond_9
    int-to-float v3, v7

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    goto :goto_6

    :cond_a
    iget-object v3, v1, Lun2$c;->m:Llo$l;

    if-eqz v3, :cond_b

    invoke-interface {v3}, Llo$l;->a()F

    move-result v3

    goto :goto_6

    :cond_b
    int-to-float v3, v7

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    :goto_6
    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v6

    iget-object v3, v1, Lun2$c;->k:Lon2;

    invoke-interface {v3}, LRn2;->getItemCount()I

    move-result v5

    iget-boolean v3, v1, Lun2$c;->g:Z

    if-eqz v3, :cond_c

    invoke-static/range {p2 .. p3}, Lkz0;->m(J)I

    move-result v3

    sub-int/2addr v3, v13

    goto :goto_7

    :cond_c
    invoke-static/range {p2 .. p3}, Lkz0;->n(J)I

    move-result v3

    sub-int/2addr v3, v14

    :goto_7
    move/from16 v17, v3

    iget-boolean v3, v1, Lun2$c;->i:Z

    if-eqz v3, :cond_10

    if-lez v17, :cond_d

    goto :goto_9

    :cond_d
    iget-boolean v3, v1, Lun2$c;->g:Z

    if-eqz v3, :cond_e

    goto :goto_8

    :cond_e
    add-int v2, v2, v17

    :goto_8
    if-eqz v3, :cond_f

    add-int v4, v4, v17

    :cond_f
    invoke-static {v2, v4}, LB52;->a(II)J

    move-result-wide v2

    goto :goto_a

    :cond_10
    :goto_9
    invoke-static {v2, v4}, LB52;->a(II)J

    move-result-wide v2

    :goto_a
    move-wide/from16 v21, v2

    new-instance v4, LFo2;

    iget-object v3, v1, Lun2$c;->k:Lon2;

    new-instance v2, Lun2$c$c;

    iget-boolean v7, v1, Lun2$c;->g:Z

    move/from16 v23, v5

    iget-boolean v5, v1, Lun2$c;->i:Z

    move/from16 v24, v8

    iget-object v8, v1, Lun2$c;->o:Lmn2;

    move-object/from16 v25, v2

    move-object v11, v3

    move-object/from16 v3, p1

    move-object v12, v4

    move v4, v7

    move/from16 v7, v23

    move/from16 v30, v13

    move v13, v6

    move v6, v15

    move/from16 v31, v7

    const/16 v18, 0x0

    move/from16 v7, v16

    move/from16 v32, v15

    move/from16 v15, v24

    move-object/from16 v33, v9

    move/from16 v34, v14

    move-object v14, v10

    move-wide/from16 v9, v21

    invoke-direct/range {v2 .. v10}, Lun2$c$c;-><init>(LVn2;ZZIILmn2;J)V

    invoke-direct {v12, v11, v0, v15, v2}, LFo2;-><init>(Lon2;LVn2;ILBO2;)V

    new-instance v10, LHo2;

    iget-boolean v2, v1, Lun2$c;->g:Z

    new-instance v3, Lun2$c$d;

    invoke-direct {v3, v2, v14, v0, v13}, Lun2$c$d;-><init>(ZLjava/util/List;LVn2;I)V

    move-object/from16 v21, v10

    move/from16 v22, v2

    move-object/from16 v23, v14

    move/from16 v24, v13

    move/from16 v25, v31

    move/from16 v26, v15

    move-object/from16 v27, v12

    move-object/from16 v28, v33

    move-object/from16 v29, v3

    invoke-direct/range {v21 .. v29}, LHo2;-><init>(ZLjava/util/List;IIILFo2;LFn2;LDO2;)V

    iget-object v2, v1, Lun2$c;->j:LGn2;

    new-instance v3, Lun2$c$a;

    move-object/from16 v14, v33

    invoke-direct {v3, v14, v10}, Lun2$c$a;-><init>(LFn2;LHo2;)V

    invoke-virtual {v2, v3}, LGn2;->H(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, LsM5;->e:LsM5$a;

    iget-object v3, v1, Lun2$c;->j:LGn2;

    invoke-virtual {v2}, LsM5$a;->a()LsM5;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, LsM5;->k()LsM5;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, LGn2;->m()I

    move-result v5

    move/from16 v8, v31

    if-lt v5, v8, :cond_12

    if-gtz v8, :cond_11

    goto :goto_b

    :cond_11
    add-int/lit8 v5, v8, -0x1

    invoke-virtual {v14, v5}, LFn2;->d(I)I

    move-result v3

    move/from16 v25, v3

    move/from16 v27, v18

    goto :goto_c

    :cond_12
    :goto_b
    invoke-virtual {v3}, LGn2;->m()I

    move-result v5

    invoke-virtual {v14, v5}, LFn2;->d(I)I

    move-result v5

    invoke-virtual {v3}, LGn2;->n()I

    move-result v3

    move/from16 v27, v3

    move/from16 v25, v5

    :goto_c
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2, v4}, LsM5;->r(LsM5;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, LsM5;->d()V

    iget-object v9, v1, Lun2$c;->k:Lon2;

    iget-object v2, v1, Lun2$c;->j:LGn2;

    invoke-virtual {v2}, LGn2;->w()F

    move-result v18

    iget-boolean v2, v1, Lun2$c;->g:Z

    move/from16 v21, v2

    iget-object v2, v1, Lun2$c;->m:Llo$l;

    move-object/from16 v22, v2

    iget-object v2, v1, Lun2$c;->n:Llo$d;

    move-object/from16 v23, v2

    iget-boolean v2, v1, Lun2$c;->i:Z

    move/from16 v24, v2

    iget-object v2, v1, Lun2$c;->o:Lmn2;

    move-object/from16 v26, v2

    iget-object v2, v1, Lun2$c;->j:LGn2;

    invoke-virtual {v2}, LGn2;->q()LZn2;

    move-result-object v28

    new-instance v2, Lun2$c$b;

    move-object/from16 v29, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move/from16 v6, v34

    move/from16 v7, v30

    invoke-direct/range {v2 .. v7}, Lun2$c$b;-><init>(LVn2;JII)V

    move-object v11, v12

    move/from16 v12, v17

    move/from16 v13, v32

    move-object v2, v14

    move/from16 v14, v16

    move/from16 v16, v25

    move/from16 v17, v27

    move-object/from16 v25, p1

    move-object/from16 v27, v2

    invoke-static/range {v8 .. v29}, Lwn2;->c(ILon2;LHo2;LFo2;IIIIIIFJZLlo$l;Llo$d;ZLg01;Lmn2;LFn2;LZn2;Lkotlin/jvm/functions/Function3;)Lxn2;

    move-result-object v0

    iget-object v2, v1, Lun2$c;->j:LGn2;

    invoke-virtual {v2, v0}, LGn2;->i(Lxn2;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v2, v4}, LsM5;->r(LsM5;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v2}, LsM5;->d()V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LVn2;

    check-cast p2, Lkz0;

    invoke-virtual {p2}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lun2$c;->a(LVn2;J)Lxn2;

    move-result-object p1

    return-object p1
.end method
