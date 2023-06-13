.class public final Lsm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a2\u0010\u0008\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Lcom/google/ar/core/HitResult;",
        "Lcom/google/ar/core/Camera;",
        "camera",
        "",
        "plane",
        "depth",
        "instantPlacement",
        "a",
        "arsceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/Collection;Lcom/google/ar/core/Camera;ZZZ)Lcom/google/ar/core/HitResult;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/google/ar/core/HitResult;",
            ">;",
            "Lcom/google/ar/core/Camera;",
            "ZZZ)",
            "Lcom/google/ar/core/HitResult;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/ar/core/HitResult;

    invoke-virtual {v1}, Lcom/google/ar/core/HitResult;->getTrackable()Lcom/google/ar/core/Trackable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    instance-of v3, v2, Lcom/google/ar/core/Plane;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-eqz p2, :cond_1

    check-cast v2, Lcom/google/ar/core/Plane;

    invoke-virtual {v1}, Lcom/google/ar/core/HitResult;->getHitPose()Lcom/google/ar/core/Pose;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/ar/core/Plane;->isPoseInPolygon(Lcom/google/ar/core/Pose;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/google/ar/core/HitResult;->getHitPose()Lcom/google/ar/core/Pose;

    move-result-object v1

    const-string v2, "hitResult.hitPose"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Camera;->getPose()Lcom/google/ar/core/Pose;

    move-result-object v2

    const-string v3, "camera.pose"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, LCY3;->a(Lcom/google/ar/core/Pose;Lcom/google/ar/core/Pose;)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    move v4, v5

    goto :goto_0

    :cond_2
    instance-of v1, v2, Lcom/google/ar/core/Point;

    if-eqz v1, :cond_3

    if-eqz p3, :cond_1

    check-cast v2, Lcom/google/ar/core/Point;

    invoke-virtual {v2}, Lcom/google/ar/core/Point;->getOrientationMode()Lcom/google/ar/core/Point$OrientationMode;

    move-result-object v1

    sget-object v2, Lcom/google/ar/core/Point$OrientationMode;->ESTIMATED_SURFACE_NORMAL:Lcom/google/ar/core/Point$OrientationMode;

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_3
    instance-of v1, v2, Lcom/google/ar/core/InstantPlacementPoint;

    if-eqz v1, :cond_4

    move v4, p4

    goto :goto_0

    :cond_4
    instance-of v1, v2, Lcom/google/ar/core/DepthPoint;

    if-eqz v1, :cond_1

    move v4, p3

    :goto_0
    if-eqz v4, :cond_0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lcom/google/ar/core/HitResult;

    return-object v0
.end method
