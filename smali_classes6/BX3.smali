.class public LBX3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DDLjava/util/List;Z)Z
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;Z)Z"
        }
    .end annotation

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v13

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    const/16 v17, 0x1

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    iget-wide v5, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v18, v1

    move-wide v2, v3

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/LatLng;

    sub-double v7, v15, v5

    const-wide v9, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    const-wide v11, 0x400921fb54442d18L    # Math.PI

    invoke-static/range {v7 .. v12}, LbN2;->f(DDD)D

    move-result-wide v10

    cmpl-double v7, v13, v2

    if-nez v7, :cond_1

    const-wide/16 v7, 0x0

    cmpl-double v7, v10, v7

    if-nez v7, :cond_1

    return v17

    :cond_1
    iget-wide v7, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v19

    iget-wide v7, v4, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v21

    sub-double v23, v21, v5

    const-wide v25, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    const-wide v27, 0x400921fb54442d18L    # Math.PI

    invoke-static/range {v23 .. v28}, LbN2;->f(DDD)D

    move-result-wide v6

    move-wide/from16 v4, v19

    move-wide v8, v13

    move/from16 v12, p5

    invoke-static/range {v2 .. v12}, LBX3;->d(DDDDDZ)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v18, v18, 0x1

    :cond_2
    move-wide/from16 v2, v19

    move-wide/from16 v5, v21

    goto :goto_0

    :cond_3
    and-int/lit8 v0, v18, 0x1

    if-eqz v0, :cond_4

    move/from16 v1, v17

    :cond_4
    return v1
.end method

.method public static b(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Z)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;Z)Z"
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, LBX3;->a(DDLjava/util/List;Z)Z

    move-result p0

    return p0
.end method

.method public static c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    .locals 12

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, p0}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide p0

    return-wide p0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    iget-wide v8, p2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    iget-wide v10, p2, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    sub-double/2addr v8, v4

    sub-double/2addr v10, v6

    sub-double/2addr v0, v4

    mul-double/2addr v0, v8

    sub-double/2addr v2, v6

    mul-double/2addr v2, v10

    add-double/2addr v0, v2

    mul-double/2addr v8, v8

    mul-double/2addr v10, v10

    add-double/2addr v8, v10

    div-double/2addr v0, v8

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-gtz v2, :cond_1

    invoke-static {p0, p1}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide p0

    return-wide p0

    :cond_1
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, v0, v2

    if-ltz v2, :cond_2

    invoke-static {p0, p2}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide p0

    return-wide p0

    :cond_2
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v5, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v3, v5

    iget-wide v5, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v7, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    sub-double/2addr v5, v7

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance p0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, p2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v5, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v3, v5

    mul-double/2addr v3, v0

    iget-wide v5, p2, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide p1, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    sub-double/2addr v5, p1

    mul-double/2addr v0, v5

    invoke-direct {p0, v3, v4, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v2, p0}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static d(DDDDDZ)Z
    .locals 12

    const-wide/16 v0, 0x0

    cmpl-double v2, p8, v0

    const/4 v8, 0x0

    if-ltz v2, :cond_0

    cmpl-double v2, p8, p4

    if-gez v2, :cond_1

    :cond_0
    cmpg-double v2, p8, v0

    if-gez v2, :cond_2

    cmpg-double v2, p8, p4

    if-gez v2, :cond_2

    :cond_1
    return v8

    :cond_2
    const-wide v2, -0x4006de04abbbd2e8L    # -1.5707963267948966

    cmpg-double v4, p6, v2

    if-gtz v4, :cond_3

    return v8

    :cond_3
    cmpg-double v4, p0, v2

    if-lez v4, :cond_a

    cmpg-double v2, p2, v2

    if-lez v2, :cond_a

    const-wide v2, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpl-double v4, p0, v2

    if-gez v4, :cond_a

    cmpl-double v4, p2, v2

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-wide v4, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    cmpg-double v4, p4, v4

    if-gtz v4, :cond_5

    return v8

    :cond_5
    sub-double v4, p4, p8

    mul-double/2addr v4, p0

    mul-double v6, p2, p8

    add-double/2addr v4, v6

    div-double v4, v4, p4

    cmpl-double v6, p0, v0

    if-ltz v6, :cond_6

    cmpl-double v6, p2, v0

    if-ltz v6, :cond_6

    cmpg-double v6, p6, v4

    if-gez v6, :cond_6

    return v8

    :cond_6
    cmpg-double v6, p0, v0

    const/4 v9, 0x1

    if-gtz v6, :cond_7

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_7

    cmpl-double v0, p6, v4

    if-ltz v0, :cond_7

    return v9

    :cond_7
    cmpl-double v0, p6, v2

    if-ltz v0, :cond_8

    return v9

    :cond_8
    if-eqz p10, :cond_9

    invoke-static/range {p6 .. p7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v10

    move-wide v0, p0

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p8

    invoke-static/range {v0 .. v7}, LBX3;->h(DDDD)D

    move-result-wide v0

    cmpl-double v0, v10, v0

    if-ltz v0, :cond_a

    goto :goto_0

    :cond_9
    invoke-static/range {p6 .. p7}, LbN2;->d(D)D

    move-result-wide v10

    move-wide v0, p0

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p8

    invoke-static/range {v0 .. v7}, LBX3;->f(DDDD)D

    move-result-wide v0

    cmpl-double v0, v10, v0

    if-ltz v0, :cond_a

    :goto_0
    move v8, v9

    :cond_a
    :goto_1
    return v8
.end method

.method public static e(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static f(DDDD)D
    .locals 2

    invoke-static {p0, p1}, LbN2;->d(D)D

    move-result-wide p0

    sub-double v0, p4, p6

    mul-double/2addr p0, v0

    invoke-static {p2, p3}, LbN2;->d(D)D

    move-result-wide p2

    mul-double/2addr p2, p6

    add-double/2addr p0, p2

    div-double/2addr p0, p4

    return-wide p0
.end method

.method public static g(Ljava/util/List;D)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;D)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_9

    const-wide/16 v3, 0x0

    cmpg-double v5, p1, v3

    if-lez v5, :cond_8

    invoke-static/range {p0 .. p0}, LBX3;->e(Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/maps/model/LatLng;

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v2

    invoke-interface {v0, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    new-instance v7, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->b:D

    const-wide v10, 0x3da5fd7fe1796495L    # 1.0E-11

    add-double/2addr v8, v10

    iget-wide v12, v6, Lcom/google/android/gms/maps/model/LatLng;->c:D

    add-double/2addr v12, v10

    invoke-direct {v7, v8, v9, v12, v13}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    new-instance v7, Ljava/util/Stack;

    invoke-direct {v7}, Ljava/util/Stack;-><init>()V

    new-array v8, v1, [D

    const/4 v9, 0x0

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    aput-wide v10, v8, v9

    add-int/lit8 v12, v1, -0x1

    aput-wide v10, v8, v12

    const/4 v10, 0x2

    if-le v1, v10, :cond_4

    new-array v1, v10, [I

    aput v9, v1, v9

    aput v12, v1, v2

    invoke-virtual {v7, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v9

    :goto_1
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    if-lez v11, :cond_4

    invoke-virtual {v7}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [I

    aget v12, v11, v9

    add-int/2addr v12, v2

    move-wide v13, v3

    :goto_2
    aget v15, v11, v2

    if-ge v12, v15, :cond_2

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/maps/model/LatLng;

    aget v3, v11, v9

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    aget v4, v11, v2

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v15, v3, v4}, LBX3;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v3

    cmpl-double v15, v3, v13

    if-lez v15, :cond_1

    move-wide v13, v3

    move v1, v12

    :cond_1
    add-int/lit8 v12, v12, 0x1

    const-wide/16 v3, 0x0

    goto :goto_2

    :cond_2
    cmpl-double v3, v13, p1

    if-lez v3, :cond_3

    aput-wide v13, v8, v1

    new-array v3, v10, [I

    aget v4, v11, v9

    aput v4, v3, v9

    aput v1, v3, v2

    invoke-virtual {v7, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    new-array v3, v10, [I

    aput v1, v3, v9

    aget v4, v11, v2

    aput v4, v3, v2

    invoke-virtual {v7, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-wide/16 v3, 0x0

    goto :goto_1

    :cond_4
    if-eqz v5, :cond_5

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    aget-wide v3, v8, v9

    const-wide/16 v5, 0x0

    cmpl-double v3, v3, v5

    if-eqz v3, :cond_6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_7
    return-object v1

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tolerance must be greater than zero"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Polyline must have at least 1 point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(DDDD)D
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Math;->tan(D)D

    move-result-wide p0

    sub-double v0, p4, p6

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    mul-double/2addr p0, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->tan(D)D

    move-result-wide p2

    invoke-static {p6, p7}, Ljava/lang/Math;->sin(D)D

    move-result-wide p6

    mul-double/2addr p2, p6

    add-double/2addr p0, p2

    invoke-static {p4, p5}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    div-double/2addr p0, p2

    return-wide p0
.end method
