.class public final Lso2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso2;->d(Lpo2;LCo2;Lho2;LPD3;ZZILK9$b;LK9$c;Llo$d;Llo$l;Lno2;LEt0;III)Lkotlin/jvm/functions/Function2;
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
        "Lvo2;",
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
        "SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,334:1\n480#2,4:335\n485#2:344\n122#3,5:339\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:335,4\n294#1:344\n294#1:339,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LPD3;

.field public final synthetic i:Z

.field public final synthetic j:LCo2;

.field public final synthetic k:Lpo2;

.field public final synthetic l:Llo$l;

.field public final synthetic m:Llo$d;

.field public final synthetic n:Lno2;

.field public final synthetic o:Lho2;

.field public final synthetic p:I

.field public final synthetic q:LK9$b;

.field public final synthetic r:LK9$c;


# direct methods
.method public constructor <init>(ZLPD3;ZLCo2;Lpo2;Llo$l;Llo$d;Lno2;Lho2;ILK9$b;LK9$c;)V
    .locals 0

    iput-boolean p1, p0, Lso2$c;->g:Z

    iput-object p2, p0, Lso2$c;->h:LPD3;

    iput-boolean p3, p0, Lso2$c;->i:Z

    iput-object p4, p0, Lso2$c;->j:LCo2;

    iput-object p5, p0, Lso2$c;->k:Lpo2;

    iput-object p6, p0, Lso2$c;->l:Llo$l;

    iput-object p7, p0, Lso2$c;->m:Llo$d;

    iput-object p8, p0, Lso2$c;->n:Lno2;

    iput-object p9, p0, Lso2$c;->o:Lho2;

    iput p10, p0, Lso2$c;->p:I

    iput-object p11, p0, Lso2$c;->q:LK9$b;

    iput-object p12, p0, Lso2$c;->r:LK9$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LVn2;J)Lvo2;
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v13, p2

    const-string v2, "$this$null"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v1, Lso2$c;->g:Z

    if-eqz v2, :cond_0

    sget-object v2, LEy3;->b:LEy3;

    goto :goto_0

    :cond_0
    sget-object v2, LEy3;->c:LEy3;

    :goto_0
    invoke-static {v13, v14, v2}, Loi0;->a(JLEy3;)V

    iget-boolean v2, v1, Lso2$c;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, v1, Lso2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    invoke-interface {v2, v3}, LPD3;->b(Lpm2;)F

    move-result v2

    invoke-interface {v0, v2}, Lg01;->F0(F)I

    move-result v2

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lso2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    invoke-static {v2, v3}, LND3;->g(LPD3;Lpm2;)F

    move-result v2

    invoke-interface {v0, v2}, Lg01;->F0(F)I

    move-result v2

    :goto_1
    iget-boolean v3, v1, Lso2$c;->g:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Lso2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-interface {v3, v4}, LPD3;->c(Lpm2;)F

    move-result v3

    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v3

    goto :goto_2

    :cond_2
    iget-object v3, v1, Lso2$c;->h:LPD3;

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v4

    invoke-static {v3, v4}, LND3;->f(LPD3;Lpm2;)F

    move-result v3

    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v3

    :goto_2
    iget-object v4, v1, Lso2$c;->h:LPD3;

    invoke-interface {v4}, LPD3;->d()F

    move-result v4

    invoke-interface {v0, v4}, Lg01;->F0(F)I

    move-result v4

    iget-object v5, v1, Lso2$c;->h:LPD3;

    invoke-interface {v5}, LPD3;->a()F

    move-result v5

    invoke-interface {v0, v5}, Lg01;->F0(F)I

    move-result v5

    add-int v15, v4, v5

    add-int v12, v2, v3

    iget-boolean v6, v1, Lso2$c;->g:Z

    if-eqz v6, :cond_3

    move v7, v15

    goto :goto_3

    :cond_3
    move v7, v12

    :goto_3
    if-eqz v6, :cond_4

    iget-boolean v8, v1, Lso2$c;->i:Z

    if-nez v8, :cond_4

    move/from16 v16, v4

    goto :goto_4

    :cond_4
    if-eqz v6, :cond_5

    iget-boolean v8, v1, Lso2$c;->i:Z

    if-eqz v8, :cond_5

    move/from16 v16, v5

    goto :goto_4

    :cond_5
    if-nez v6, :cond_6

    iget-boolean v5, v1, Lso2$c;->i:Z

    if-nez v5, :cond_6

    move/from16 v16, v2

    goto :goto_4

    :cond_6
    move/from16 v16, v3

    :goto_4
    sub-int v18, v7, v16

    neg-int v3, v12

    neg-int v5, v15

    invoke-static {v13, v14, v3, v5}, Lnz0;->h(JII)J

    move-result-wide v31

    iget-object v3, v1, Lso2$c;->j:LCo2;

    iget-object v5, v1, Lso2$c;->k:Lpo2;

    invoke-virtual {v3, v5}, LCo2;->K(Lpo2;)V

    iget-object v3, v1, Lso2$c;->j:LCo2;

    invoke-virtual {v3, v0}, LCo2;->F(Lg01;)V

    iget-object v3, v1, Lso2$c;->k:Lpo2;

    invoke-interface {v3}, Lpo2;->e()LMn2;

    move-result-object v3

    invoke-static/range {v31 .. v32}, Lkz0;->n(J)I

    move-result v5

    invoke-static/range {v31 .. v32}, Lkz0;->m(J)I

    move-result v6

    invoke-virtual {v3, v5, v6}, LMn2;->a(II)V

    iget-boolean v3, v1, Lso2$c;->g:Z

    const-string v5, "Required value was null."

    if-eqz v3, :cond_8

    iget-object v3, v1, Lso2$c;->l:Llo$l;

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
    iget-object v3, v1, Lso2$c;->m:Llo$d;

    if-eqz v3, :cond_e

    invoke-interface {v3}, Llo$d;->a()F

    move-result v3

    :goto_5
    invoke-interface {v0, v3}, Lg01;->F0(F)I

    move-result v19

    iget-object v3, v1, Lso2$c;->k:Lpo2;

    invoke-interface {v3}, LRn2;->getItemCount()I

    move-result v25

    iget-boolean v3, v1, Lso2$c;->g:Z

    if-eqz v3, :cond_9

    invoke-static/range {p2 .. p3}, Lkz0;->m(J)I

    move-result v3

    sub-int/2addr v3, v15

    goto :goto_6

    :cond_9
    invoke-static/range {p2 .. p3}, Lkz0;->n(J)I

    move-result v3

    sub-int/2addr v3, v12

    :goto_6
    move/from16 v33, v3

    iget-boolean v3, v1, Lso2$c;->i:Z

    if-eqz v3, :cond_d

    if-lez v33, :cond_a

    goto :goto_8

    :cond_a
    iget-boolean v3, v1, Lso2$c;->g:Z

    if-eqz v3, :cond_b

    goto :goto_7

    :cond_b
    add-int v2, v2, v33

    :goto_7
    if-eqz v3, :cond_c

    add-int v4, v4, v33

    :cond_c
    invoke-static {v2, v4}, LB52;->a(II)J

    move-result-wide v2

    goto :goto_9

    :cond_d
    :goto_8
    invoke-static {v2, v4}, LB52;->a(II)J

    move-result-wide v2

    :goto_9
    move-wide/from16 v20, v2

    new-instance v34, LGo2;

    iget-boolean v11, v1, Lso2$c;->g:Z

    iget-object v10, v1, Lso2$c;->k:Lpo2;

    new-instance v17, Lso2$c$b;

    iget-object v7, v1, Lso2$c;->q:LK9$b;

    iget-object v8, v1, Lso2$c;->r:LK9$c;

    iget-boolean v9, v1, Lso2$c;->i:Z

    iget-object v6, v1, Lso2$c;->n:Lno2;

    move-object/from16 v2, v17

    move/from16 v3, v25

    move/from16 v4, v19

    move-object/from16 v5, p1

    move-object/from16 v22, v6

    move v6, v11

    move-object/from16 v23, v10

    move/from16 v10, v16

    move/from16 v24, v11

    move/from16 v11, v18

    move/from16 v35, v12

    move-object/from16 v12, v22

    move-wide/from16 v13, v20

    invoke-direct/range {v2 .. v14}, Lso2$c$b;-><init>(IILVn2;ZLK9$b;LK9$c;ZIILno2;J)V

    const/4 v9, 0x0

    move-object/from16 v2, v34

    move-wide/from16 v3, v31

    move/from16 v5, v24

    move-object/from16 v6, v23

    move-object/from16 v7, p1

    move-object/from16 v8, v17

    invoke-direct/range {v2 .. v9}, LGo2;-><init>(JZLpo2;LVn2;LCO2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v1, Lso2$c;->j:LCo2;

    invoke-virtual/range {v34 .. v34}, LGo2;->b()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LCo2;->H(J)V

    sget-object v2, LsM5;->e:LsM5$a;

    iget-object v3, v1, Lso2$c;->j:LCo2;

    invoke-virtual {v2}, LsM5$a;->a()LsM5;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, LsM5;->k()LsM5;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, LCo2;->o()I

    move-result v5

    invoke-static {v5}, LKS0;->b(I)I

    move-result v36

    invoke-virtual {v3}, LCo2;->p()I

    move-result v37

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2, v4}, LsM5;->r(LsM5;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, LsM5;->d()V

    iget-object v9, v1, Lso2$c;->k:Lpo2;

    iget-object v2, v1, Lso2$c;->j:LCo2;

    invoke-virtual {v2}, LCo2;->y()F

    move-result v17

    iget-boolean v2, v1, Lso2$c;->g:Z

    move/from16 v20, v2

    iget-object v2, v1, Lso2$c;->k:Lpo2;

    invoke-interface {v2}, Lpo2;->h()Ljava/util/List;

    move-result-object v21

    iget-object v2, v1, Lso2$c;->l:Llo$l;

    move-object/from16 v22, v2

    iget-object v2, v1, Lso2$c;->m:Llo$d;

    move-object/from16 v23, v2

    iget-boolean v2, v1, Lso2$c;->i:Z

    move/from16 v24, v2

    iget-object v2, v1, Lso2$c;->n:Lno2;

    move-object/from16 v26, v2

    iget-object v2, v1, Lso2$c;->o:Lho2;

    move-object/from16 v27, v2

    iget v2, v1, Lso2$c;->p:I

    move/from16 v28, v2

    iget-object v2, v1, Lso2$c;->j:LCo2;

    invoke-virtual {v2}, LCo2;->s()LZn2;

    move-result-object v29

    new-instance v2, Lso2$c$a;

    move-object/from16 v30, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move/from16 v6, v35

    move v7, v15

    invoke-direct/range {v2 .. v7}, Lso2$c$a;-><init>(LVn2;JII)V

    move/from16 v8, v25

    move-object/from16 v10, v34

    move/from16 v11, v33

    move/from16 v12, v16

    move/from16 v13, v18

    move/from16 v14, v19

    move/from16 v15, v36

    move/from16 v16, v37

    move-wide/from16 v18, v31

    move-object/from16 v25, p1

    invoke-static/range {v8 .. v30}, Luo2;->i(ILpo2;LGo2;IIIIIIFJZLjava/util/List;Llo$l;Llo$d;ZLg01;Lno2;Lho2;ILZn2;Lkotlin/jvm/functions/Function3;)Lvo2;

    move-result-object v0

    iget-object v2, v1, Lso2$c;->j:LCo2;

    invoke-virtual {v2, v0}, LCo2;->k(Lvo2;)V

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

    :cond_e
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

    invoke-virtual {p0, p1, v0, v1}, Lso2$c;->a(LVn2;J)Lvo2;

    move-result-object p1

    return-object p1
.end method
