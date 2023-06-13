.class public final Lck6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lhu1;",
        "v",
        "a",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lhu1;)Lhu1;
    .locals 4

    const-string v0, "v"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhu1;->g()F

    move-result v0

    invoke-virtual {p0}, Lhu1;->g()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lhu1;->h()F

    move-result v1

    invoke-virtual {p0}, Lhu1;->h()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lhu1;->i()F

    move-result v1

    invoke-virtual {p0}, Lhu1;->i()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    new-instance v0, Lhu1;

    invoke-virtual {p0}, Lhu1;->g()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, Lhu1;->h()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, Lhu1;->i()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v0, v2, v3, p0}, Lhu1;-><init>(FFF)V

    return-object v0
.end method
