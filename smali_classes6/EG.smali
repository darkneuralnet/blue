.class public LEG;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DLcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lbm2;
    .locals 18

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-wide v2, 0x4056800000000000L    # 90.0

    mul-double v2, v2, p0

    invoke-static/range {p2 .. p3}, LAQ2;->a(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v4

    invoke-static/range {p2 .. p3}, LeN2;->b(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v6

    invoke-static {v1, v0}, LeN2;->b(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmpl-double v12, v6, v10

    const-wide v13, 0x4066800000000000L    # 180.0

    if-nez v12, :cond_0

    cmpl-double v15, v8, v13

    if-nez v15, :cond_0

    add-double v10, v6, v2

    neg-double v2, v2

    :goto_0
    add-double/2addr v2, v8

    goto :goto_1

    :cond_0
    cmpl-double v15, v6, v13

    if-nez v15, :cond_1

    cmpl-double v16, v8, v10

    if-nez v16, :cond_1

    neg-double v10, v2

    add-double/2addr v10, v6

    goto :goto_0

    :cond_1
    const-wide v16, 0x4076800000000000L    # 360.0

    if-lez v12, :cond_2

    cmpl-double v12, v8, v13

    if-lez v12, :cond_2

    neg-double v10, v2

    add-double/2addr v10, v6

    add-double/2addr v2, v8

    cmpl-double v6, v2, v16

    if-ltz v6, :cond_4

    sub-double v2, v2, v16

    goto :goto_1

    :cond_2
    if-lez v15, :cond_3

    cmpl-double v12, v8, v10

    if-lez v12, :cond_3

    add-double v10, v6, v2

    neg-double v2, v2

    add-double/2addr v2, v8

    cmpl-double v6, v10, v16

    if-ltz v6, :cond_4

    sub-double v10, v10, v16

    goto :goto_1

    :cond_3
    move-wide v2, v10

    :cond_4
    :goto_1
    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    div-double/2addr v4, v6

    invoke-static {v0, v4, v5, v10, v11}, LAQ2;->b(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-static {v1, v4, v5, v2, v3}, LAQ2;->b(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    new-instance v2, Lbm2;

    invoke-direct {v2, v0, v1}, Lbm2;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v2
.end method

.method public static b(DLandroid/graphics/Point;Landroid/graphics/Point;)LUT3;
    .locals 11

    const-wide v0, 0x4056800000000000L    # 90.0

    mul-double/2addr p0, v0

    invoke-static {p2, p3}, LeN2;->c(Landroid/graphics/Point;Landroid/graphics/Point;)D

    move-result-wide v2

    invoke-static {p2, p3}, LeN2;->a(Landroid/graphics/Point;Landroid/graphics/Point;)D

    move-result-wide v4

    invoke-static {p3, p2}, LeN2;->a(Landroid/graphics/Point;Landroid/graphics/Point;)D

    move-result-wide v6

    cmpg-double v8, v4, v0

    const-wide v9, 0x4070e00000000000L    # 270.0

    if-gez v8, :cond_0

    cmpg-double v8, v6, v9

    if-gez v8, :cond_0

    :goto_0
    neg-double v0, p0

    add-double/2addr v4, v0

    :goto_1
    add-double/2addr v6, p0

    goto :goto_3

    :cond_0
    cmpg-double v8, v4, v9

    if-gez v8, :cond_1

    cmpg-double v8, v6, v0

    if-gez v8, :cond_1

    :goto_2
    add-double/2addr v4, p0

    neg-double p0, p0

    goto :goto_1

    :cond_1
    cmpl-double v8, v4, v0

    if-ltz v8, :cond_2

    cmpl-double v8, v6, v9

    if-ltz v8, :cond_2

    goto :goto_2

    :cond_2
    cmpl-double v8, v4, v9

    if-ltz v8, :cond_3

    cmpl-double v0, v6, v0

    if-ltz v0, :cond_3

    goto :goto_0

    :cond_3
    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_3
    const-wide/high16 p0, 0x4008000000000000L    # 3.0

    div-double/2addr v2, p0

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p0

    invoke-static {p2, v2, v3, p0, p1}, LeN2;->d(Landroid/graphics/Point;DD)Landroid/graphics/Point;

    move-result-object p0

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p3, v2, v3, p1, p2}, LeN2;->d(Landroid/graphics/Point;DD)Landroid/graphics/Point;

    move-result-object p1

    new-instance p2, LUT3;

    invoke-direct {p2, p0, p1}, LUT3;-><init>(Landroid/graphics/Point;Landroid/graphics/Point;)V

    return-object p2
.end method

.method public static c(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;D)Landroid/graphics/Point;
    .locals 10

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    mul-double v2, v0, v0

    mul-double/2addr v2, v0

    iget v4, p0, Landroid/graphics/Point;->x:I

    int-to-double v4, v4

    mul-double/2addr v4, v2

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    mul-double/2addr v6, v0

    mul-double/2addr v0, v6

    mul-double/2addr v0, p4

    iget v8, p1, Landroid/graphics/Point;->x:I

    int-to-double v8, v8

    mul-double/2addr v8, v0

    add-double/2addr v4, v8

    mul-double/2addr v6, p4

    mul-double/2addr v6, p4

    iget v8, p2, Landroid/graphics/Point;->x:I

    int-to-double v8, v8

    mul-double/2addr v8, v6

    add-double/2addr v4, v8

    mul-double v8, p4, p4

    mul-double/2addr v8, p4

    iget p4, p3, Landroid/graphics/Point;->x:I

    int-to-double p4, p4

    mul-double/2addr p4, v8

    add-double/2addr v4, p4

    iget p0, p0, Landroid/graphics/Point;->y:I

    int-to-double p4, p0

    mul-double/2addr v2, p4

    iget p0, p1, Landroid/graphics/Point;->y:I

    int-to-double p0, p0

    mul-double/2addr v0, p0

    add-double/2addr v2, v0

    iget p0, p2, Landroid/graphics/Point;->y:I

    int-to-double p0, p0

    mul-double/2addr v6, p0

    add-double/2addr v2, v6

    iget p0, p3, Landroid/graphics/Point;->y:I

    int-to-double p0, p0

    mul-double/2addr v8, p0

    add-double/2addr v2, v8

    new-instance p0, Landroid/graphics/Point;

    double-to-int p1, v4

    double-to-int p2, v2

    invoke-direct {p0, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    return-object p0
.end method

.method public static d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 10

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    mul-double v2, v0, v0

    mul-double/2addr v2, v0

    iget-wide v4, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    mul-double/2addr v4, v2

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    mul-double/2addr v6, v0

    mul-double/2addr v0, v6

    mul-double/2addr v0, p4

    iget-wide v8, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    mul-double/2addr v8, v0

    add-double/2addr v4, v8

    mul-double/2addr v6, p4

    mul-double/2addr v6, p4

    iget-wide v8, p2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    mul-double/2addr v8, v6

    add-double/2addr v4, v8

    mul-double v8, p4, p4

    mul-double/2addr v8, p4

    iget-wide p4, p3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    mul-double/2addr p4, v8

    add-double/2addr v4, p4

    iget-wide p4, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    mul-double/2addr v2, p4

    iget-wide p0, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    mul-double/2addr v0, p0

    add-double/2addr v2, v0

    iget-wide p0, p2, Lcom/google/android/gms/maps/model/LatLng;->c:D

    mul-double/2addr v6, p0

    add-double/2addr v2, v6

    iget-wide p0, p3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    mul-double/2addr v8, p0

    add-double/2addr v2, v8

    new-instance p0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p0, v4, v5, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object p0
.end method
