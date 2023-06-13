.class public final LCY3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0019\u0010\u0008\u001a\u00060\u0004j\u0002`\u0005*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u0015\u0010\u000c\u001a\u00020\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\"\u0019\u0010\u0011\u001a\u00060\rj\u0002`\u000e*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/google/ar/core/Pose;",
        "cameraPose",
        "",
        "a",
        "Lhu1;",
        "Lio/github/sceneview/math/Position;",
        "b",
        "(Lcom/google/ar/core/Pose;)Lhu1;",
        "position",
        "LUc4;",
        "c",
        "(Lcom/google/ar/core/Pose;)LUc4;",
        "quaternion",
        "LyM2;",
        "Lio/github/sceneview/math/Transform;",
        "d",
        "(Lcom/google/ar/core/Pose;)LyM2;",
        "transform",
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
.method public static final a(Lcom/google/ar/core/Pose;Lcom/google/ar/core/Pose;)F
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPose"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->tx()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->ty()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->tz()F

    move-result p1

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    invoke-virtual {p0, v3, v4, v0, v5}, Lcom/google/ar/core/Pose;->getTransformedAxis(IF[FI)V

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->tx()F

    move-result v4

    sub-float/2addr v1, v4

    aget v4, v0, v5

    mul-float/2addr v1, v4

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->ty()F

    move-result v4

    sub-float/2addr v2, v4

    aget v3, v0, v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->tz()F

    move-result p0

    sub-float/2addr p1, p0

    const/4 p0, 0x2

    aget p0, v0, p0

    mul-float/2addr p1, p0

    add-float/2addr v1, p1

    return v1
.end method

.method public static final b(Lcom/google/ar/core/Pose;)Lhu1;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhu1;

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->tx()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->ty()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->tz()F

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lhu1;-><init>(FFF)V

    return-object v0
.end method

.method public static final c(Lcom/google/ar/core/Pose;)LUc4;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUc4;

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->qx()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->qy()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->qz()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/ar/core/Pose;->qw()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, LUc4;-><init>(FFFF)V

    return-object v0
.end method

.method public static final d(Lcom/google/ar/core/Pose;)LyM2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LCY3;->b(Lcom/google/ar/core/Pose;)Lhu1;

    move-result-object v0

    invoke-static {v0}, LnN2;->h(Lhu1;)LyM2;

    move-result-object v0

    invoke-static {p0}, LCY3;->c(Lcom/google/ar/core/Pose;)LUc4;

    move-result-object p0

    invoke-static {p0}, LnN2;->f(LUc4;)LyM2;

    move-result-object p0

    invoke-virtual {v0, p0}, LyM2;->e(LyM2;)LyM2;

    move-result-object p0

    return-object p0
.end method
