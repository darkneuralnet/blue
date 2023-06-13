.class public final Lum0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0003\u001a2\u0010\u0003\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0000\u001a\u0012\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\u0008\u001a\u000e\u0010\u000c\u001a\u00060\u0005j\u0002`\u0006*\u00020\u000b*\n\u0010\r\"\u00020\u00052\u00020\u0005\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "r",
        "g",
        "b",
        "a",
        "Liu1;",
        "Lio/github/sceneview/utils/Color;",
        "rgb",
        "",
        "color",
        "c",
        "",
        "f",
        "Color",
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
.method public static final a(FF)Liu1;
    .locals 0

    invoke-static {p0, p0, p0, p1}, Lum0;->b(FFFF)Liu1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(FFFF)Liu1;
    .locals 1

    new-instance v0, Liu1;

    invoke-direct {v0, p0, p1, p2, p3}, Liu1;-><init>(FFFF)V

    return-object v0
.end method

.method public static final c(I)Liu1;
    .locals 4

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v1

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p0, v1

    invoke-static {v0, v2, v3, p0}, Lum0;->b(FFFF)Liu1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(FFFFILjava/lang/Object;)Liu1;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p0, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p1, v0

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_3
    invoke-static {p0, p1, p2, p3}, Lum0;->b(FFFF)Liu1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(FFILjava/lang/Object;)Liu1;
    .locals 0

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_1
    invoke-static {p0, p1}, Lum0;->a(FF)Liu1;

    move-result-object p0

    return-object p0
.end method

.method public static final f([F)Liu1;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liu1;

    const/4 v1, 0x0

    aget v1, p0, v1

    const/4 v2, 0x1

    aget v2, p0, v2

    const/4 v3, 0x2

    aget v3, p0, v3

    const/4 v4, 0x3

    invoke-static {p0, v4}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_0

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Liu1;-><init>(FFFF)V

    return-object v0
.end method
