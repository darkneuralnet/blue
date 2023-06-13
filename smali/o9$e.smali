.class public final Lo9$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9;->c(FFLkotlin/jvm/functions/Function2;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    iput p1, p0, Lo9$e;->a:F

    iput p2, p0, Lo9$e;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;LzO2;FJLOU3;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LOU3;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "LzO2;",
            "FJ",
            "LOU3;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Lg01;->F0(F)I

    move-result p1

    add-int/2addr p0, p1

    invoke-virtual {p6}, LOU3;->i1()I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p4, p5}, Lkz0;->n(J)I

    move-result p1

    if-gt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final g(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;LzO2;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "LOU3;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "LzO2;",
            "F",
            "Ljava/util/List<",
            "LOU3;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            ")V"
        }
    .end annotation

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Lg01;->F0(F)I

    move-result p2

    add-int/2addr v0, p2

    iput v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_0
    move-object p2, p4

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    check-cast p5, Ljava/util/Collection;

    iget p0, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    check-cast p7, Ljava/util/Collection;

    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget p2, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr p0, p2

    iput p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget p0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget p1, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p4}, Ljava/util/List;->clear()V

    const/4 p0, 0x0

    iput p0, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iput p0, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    return-void
.end method


# virtual methods
.method public final a(LzO2;Ljava/util/List;J)LyO2;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzO2;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;J)",
            "LyO2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    const-string v1, "$this$Layout"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v15}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/16 v16, 0x0

    invoke-static/range {p3 .. p4}, Lkz0;->n(J)I

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LvO2;

    invoke-interface {v1, v5, v6}, LvO2;->P0(J)LOU3;

    move-result-object v4

    iget v3, v0, Lo9$e;->a:F

    move-object v1, v9

    move-object v2, v8

    move/from16 v17, v3

    move-object/from16 v3, p1

    move-object/from16 p2, v4

    move/from16 v4, v17

    move-wide/from16 v17, v5

    move-wide/from16 v5, p3

    move-object/from16 v19, v7

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v7}, Lo9$e;->f(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;LzO2;FJLOU3;)Z

    move-result v1

    if-nez v1, :cond_0

    iget v4, v0, Lo9$e;->b:F

    move-object v1, v12

    move-object v2, v10

    move-object/from16 v3, p1

    move-object v5, v9

    move-object v6, v13

    move-object/from16 v7, v19

    move-object/from16 v20, v8

    move-object v8, v14

    move-object/from16 v21, v9

    move-object v9, v15

    move-object/from16 v22, v10

    move-object/from16 v10, v20

    invoke-static/range {v1 .. v10}, Lo9$e;->g(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;LzO2;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    goto :goto_1

    :cond_0
    move-object/from16 v20, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    :goto_1
    invoke-interface/range {v21 .. v21}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    move-object/from16 v10, v20

    if-eqz v1, :cond_1

    iget v1, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v2, v0, Lo9$e;->a:F

    invoke-interface {v11, v2}, Lg01;->F0(F)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_1
    move-object/from16 v1, p2

    move-object/from16 v5, v21

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v2, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v1}, LOU3;->i1()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object/from16 v7, v19

    iget v2, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v1}, LOU3;->d1()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v9, v5

    move-object v8, v10

    move-wide/from16 v5, v17

    move-object/from16 v10, v22

    goto/16 :goto_0

    :cond_2
    move-object v5, v9

    move-object/from16 v22, v10

    move-object v10, v8

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    iget v4, v0, Lo9$e;->b:F

    move-object v1, v12

    move-object/from16 v2, v22

    move-object/from16 v3, p1

    move-object v6, v13

    move-object v8, v14

    move-object v9, v15

    invoke-static/range {v1 .. v10}, Lo9$e;->g(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;LzO2;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    :cond_3
    invoke-static/range {p3 .. p4}, Lkz0;->n(J)I

    move-result v1

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_4

    invoke-static/range {p3 .. p4}, Lkz0;->n(J)I

    move-result v1

    goto :goto_2

    :cond_4
    iget v1, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_2
    move v7, v1

    move-object/from16 v1, v22

    iget v1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    const/4 v9, 0x0

    new-instance v10, Lo9$e$a;

    iget v4, v0, Lo9$e;->a:F

    move-object v1, v10

    move-object v2, v12

    move-object/from16 v3, p1

    move v5, v7

    move-object v6, v14

    invoke-direct/range {v1 .. v6}, Lo9$e$a;-><init>(Ljava/util/List;LzO2;FILjava/util/List;)V

    const/4 v6, 0x4

    const/4 v12, 0x0

    move-object/from16 v1, p1

    move v2, v7

    move v3, v8

    move-object v4, v9

    move-object v5, v10

    move-object v7, v12

    invoke-static/range {v1 .. v7}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v1

    return-object v1
.end method
