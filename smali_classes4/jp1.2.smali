.class public final Ljp1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "",
        "a",
        "(F)D",
        "radians",
        "widget_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(F)D
    .locals 4

    float-to-double v0, p0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const/16 p0, 0xb4

    int-to-double v2, p0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static final synthetic access$getRadians(F)D
    .locals 2

    invoke-static {p0}, Ljp1;->a(F)D

    move-result-wide v0

    return-wide v0
.end method
