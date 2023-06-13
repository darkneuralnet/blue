.class public final LqE5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqE5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ6\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "LqE5$a;",
        "",
        "LqE5;",
        "fromWriter",
        "",
        "fromIndex",
        "toWriter",
        "",
        "updateFromCursor",
        "updateToCursor",
        "",
        "Ldb;",
        "b",
        "<init>",
        "()V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LqE5$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LqE5$a;LqE5;ILqE5;ZZ)Ljava/util/List;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LqE5$a;->b(LqE5;ILqE5;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LqE5;ILqE5;ZZ)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LqE5;",
            "I",
            "LqE5;",
            "ZZ)",
            "Ljava/util/List<",
            "Ldb;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p2}, LqE5;->c0(I)I

    move-result v3

    add-int v4, v1, v3

    invoke-static/range {p1 .. p2}, LqE5;->b(LqE5;I)I

    move-result v5

    invoke-static {v0, v4}, LqE5;->b(LqE5;I)I

    move-result v6

    sub-int v7, v6, v5

    invoke-static/range {p1 .. p2}, LqE5;->a(LqE5;I)Z

    move-result v8

    invoke-static {v2, v3}, LqE5;->o(LqE5;I)V

    invoke-virtual/range {p3 .. p3}, LqE5;->U()I

    move-result v9

    invoke-static {v2, v7, v9}, LqE5;->p(LqE5;II)V

    invoke-static/range {p1 .. p1}, LqE5;->h(LqE5;)I

    move-result v9

    if-ge v9, v4, :cond_0

    invoke-static {v0, v4}, LqE5;->q(LqE5;I)V

    :cond_0
    invoke-static/range {p1 .. p1}, LqE5;->n(LqE5;)I

    move-result v9

    if-ge v9, v6, :cond_1

    invoke-static {v0, v6, v4}, LqE5;->r(LqE5;II)V

    :cond_1
    invoke-static/range {p3 .. p3}, LqE5;->i(LqE5;)[I

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, LqE5;->U()I

    move-result v10

    invoke-static/range {p1 .. p1}, LqE5;->i(LqE5;)[I

    move-result-object v11

    mul-int/lit8 v12, v10, 0x5

    mul-int/lit8 v13, v1, 0x5

    mul-int/lit8 v14, v4, 0x5

    invoke-static {v11, v9, v12, v13, v14}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    invoke-static/range {p3 .. p3}, LqE5;->k(LqE5;)[Ljava/lang/Object;

    move-result-object v11

    invoke-static/range {p3 .. p3}, LqE5;->g(LqE5;)I

    move-result v12

    invoke-static/range {p1 .. p1}, LqE5;->k(LqE5;)[Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13, v11, v12, v5, v6}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    invoke-virtual/range {p3 .. p3}, LqE5;->V()I

    move-result v6

    invoke-static {v9, v10, v6}, LpE5;->z([III)V

    sub-int v13, v10, v1

    add-int v14, v10, v3

    invoke-static {v2, v9, v10}, LqE5;->c(LqE5;[II)I

    move-result v15

    sub-int v15, v12, v15

    invoke-static/range {p3 .. p3}, LqE5;->m(LqE5;)I

    move-result v16

    move/from16 v17, v6

    invoke-static/range {p3 .. p3}, LqE5;->l(LqE5;)I

    move-result v6

    array-length v11, v11

    move/from16 v18, v8

    move/from16 v8, v16

    move/from16 v16, v12

    move v12, v10

    :goto_0
    const/16 v19, 0x0

    if-ge v12, v14, :cond_5

    if-eq v12, v10, :cond_2

    invoke-static {v9, v12}, LpE5;->r([II)I

    move-result v20

    move/from16 v21, v14

    add-int v14, v20, v13

    invoke-static {v9, v12, v14}, LpE5;->z([III)V

    goto :goto_1

    :cond_2
    move/from16 v21, v14

    :goto_1
    invoke-static {v2, v9, v12}, LqE5;->c(LqE5;[II)I

    move-result v14

    add-int/2addr v14, v15

    if-ge v8, v12, :cond_3

    goto :goto_2

    :cond_3
    invoke-static/range {p3 .. p3}, LqE5;->n(LqE5;)I

    move-result v19

    :goto_2
    move/from16 v20, v15

    move/from16 v15, v19

    invoke-static {v2, v14, v15, v6, v11}, LqE5;->e(LqE5;IIII)I

    move-result v14

    invoke-static {v9, v12, v14}, LpE5;->v([III)V

    if-ne v12, v8, :cond_4

    add-int/lit8 v8, v8, 0x1

    :cond_4
    add-int/lit8 v12, v12, 0x1

    move/from16 v15, v20

    move/from16 v14, v21

    goto :goto_0

    :cond_5
    move/from16 v21, v14

    invoke-static {v2, v8}, LqE5;->x(LqE5;I)V

    invoke-static/range {p1 .. p1}, LqE5;->f(LqE5;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LqE5;->W()I

    move-result v8

    invoke-static {v6, v1, v8}, LpE5;->n(Ljava/util/ArrayList;II)I

    move-result v6

    invoke-static/range {p1 .. p1}, LqE5;->f(LqE5;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LqE5;->W()I

    move-result v11

    invoke-static {v8, v4, v11}, LpE5;->n(Ljava/util/ArrayList;II)I

    move-result v4

    if-ge v6, v4, :cond_7

    invoke-static/range {p1 .. p1}, LqE5;->f(LqE5;)Ljava/util/ArrayList;

    move-result-object v8

    new-instance v11, Ljava/util/ArrayList;

    sub-int v12, v4, v6

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v6

    :goto_3
    if-ge v12, v4, :cond_6

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "sourceAnchors[anchorIndex]"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ldb;

    invoke-virtual {v14}, Ldb;->a()I

    move-result v15

    add-int/2addr v15, v13

    invoke-virtual {v14, v15}, Ldb;->c(I)V

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_6
    invoke-static/range {p3 .. p3}, LqE5;->f(LqE5;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual/range {p3 .. p3}, LqE5;->U()I

    move-result v13

    invoke-virtual/range {p3 .. p3}, LqE5;->W()I

    move-result v14

    invoke-static {v12, v13, v14}, LpE5;->n(Ljava/util/ArrayList;II)I

    move-result v12

    invoke-static/range {p3 .. p3}, LqE5;->f(LqE5;)Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v13, v12, v11}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {v8, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->clear()V

    goto :goto_4

    :cond_7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    :goto_4
    invoke-virtual/range {p1 .. p2}, LqE5;->y0(I)I

    move-result v4

    const/4 v6, 0x1

    if-eqz p4, :cond_a

    if-ltz v4, :cond_8

    move/from16 v19, v6

    :cond_8
    if-eqz v19, :cond_9

    invoke-virtual/range {p1 .. p1}, LqE5;->T0()V

    invoke-virtual/range {p1 .. p1}, LqE5;->U()I

    move-result v3

    sub-int/2addr v4, v3

    invoke-virtual {v0, v4}, LqE5;->z(I)V

    invoke-virtual/range {p1 .. p1}, LqE5;->T0()V

    :cond_9
    invoke-virtual/range {p1 .. p1}, LqE5;->U()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-virtual {v0, v1}, LqE5;->z(I)V

    invoke-virtual/range {p1 .. p1}, LqE5;->E0()Z

    move-result v1

    if-eqz v19, :cond_b

    invoke-virtual/range {p1 .. p1}, LqE5;->O0()V

    invoke-virtual/range {p1 .. p1}, LqE5;->N()I

    invoke-virtual/range {p1 .. p1}, LqE5;->O0()V

    invoke-virtual/range {p1 .. p1}, LqE5;->N()I

    goto :goto_5

    :cond_a
    invoke-static {v0, v1, v3}, LqE5;->s(LqE5;II)Z

    move-result v3

    sub-int/2addr v1, v6

    invoke-static {v0, v5, v7, v1}, LqE5;->t(LqE5;III)V

    move v1, v3

    :cond_b
    :goto_5
    xor-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_f

    invoke-static/range {p3 .. p3}, LqE5;->j(LqE5;)I

    move-result v0

    invoke-static {v9, v10}, LpE5;->l([II)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-static {v9, v10}, LpE5;->o([II)I

    move-result v6

    :goto_6
    add-int/2addr v0, v6

    invoke-static {v2, v0}, LqE5;->w(LqE5;I)V

    if-eqz p5, :cond_d

    move/from16 v10, v21

    invoke-static {v2, v10}, LqE5;->u(LqE5;I)V

    add-int v12, v16, v7

    invoke-static {v2, v12}, LqE5;->v(LqE5;I)V

    :cond_d
    if-eqz v18, :cond_e

    move/from16 v0, v17

    invoke-static {v2, v0}, LqE5;->y(LqE5;I)V

    :cond_e
    return-object v11

    :cond_f
    const-string v0, "Unexpectedly removed anchors"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method
