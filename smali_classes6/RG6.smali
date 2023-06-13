.class public final LRG6;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static c:Landroid/os/Handler;


# instance fields
.field public b:Lzd6;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Message;)V
    .locals 2

    sget-object v0, LRG6;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, LRG6;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void
.end method

.method public final b()V
    .locals 3

    sget-object v0, LRG6;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    sput-object v2, LRG6;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public final c(LkF0;LU74;)LkF0;
    .locals 22

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, LkF0;->g()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/LatLng;

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual/range {p1 .. p1}, LkF0;->i()Z

    move-result v5

    const-wide v12, 0x3f747ae147ae147bL    # 0.005

    const-wide v14, 0x3ff0147ae147ae14L    # 1.005

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v0, v4}, LU74;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v4

    invoke-virtual {v0, v11}, LU74;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LkF0;->f()F

    move-result v8

    float-to-double v8, v8

    invoke-static {v8, v9, v4, v5}, LEG;->b(DLandroid/graphics/Point;Landroid/graphics/Point;)LUT3;

    move-result-object v8

    :goto_0
    cmpg-double v9, v6, v14

    if-gez v9, :cond_0

    invoke-virtual {v8}, LUT3;->a()Landroid/graphics/Point;

    move-result-object v17

    invoke-virtual {v8}, LUT3;->b()Landroid/graphics/Point;

    move-result-object v18

    move-object/from16 v16, v4

    move-object/from16 v19, v5

    move-wide/from16 v20, v6

    invoke-static/range {v16 .. v21}, LEG;->c(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;D)Landroid/graphics/Point;

    move-result-object v9

    invoke-virtual {v0, v9}, LU74;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LkF0;->h()Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/google/android/gms/maps/model/PolylineOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    add-double/2addr v6, v12

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, LkF0;->f()F

    move-result v5

    float-to-double v8, v5

    invoke-static {v8, v9, v4, v11}, LEG;->a(DLcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lbm2;

    move-result-object v16

    move-wide/from16 v17, v6

    :goto_1
    cmpg-double v5, v17, v14

    if-gez v5, :cond_0

    invoke-virtual/range {v16 .. v16}, Lbm2;->a()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, Lbm2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    move-object v5, v4

    move-object v8, v11

    move-wide/from16 v9, v17

    invoke-static/range {v5 .. v10}, LEG;->d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LkF0;->h()Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/maps/model/PolylineOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    add-double v17, v17, v12

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Curve-Fit workerThread finished, took: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WorkerHandlerThread"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method

.method public d(Lzd6;)V
    .locals 0

    iput-object p1, p0, LRG6;->b:Lzd6;

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LyT2;

    invoke-virtual {p1}, LyT2;->a()LkF0;

    move-result-object v0

    invoke-virtual {p1}, LyT2;->b()LU74;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LRG6;->c(LkF0;LU74;)LkF0;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, LRG6;->b:Lzd6;

    invoke-interface {v0, p1}, Lzd6;->a(Landroid/os/Message;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public quit()Z
    .locals 1

    invoke-virtual {p0}, LRG6;->b()V

    invoke-super {p0}, Landroid/os/HandlerThread;->quit()Z

    move-result v0

    return v0
.end method
