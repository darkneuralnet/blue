.class public final LY64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZh3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZh3<",
        "Le74$b;",
        "LMD3<",
        "Landroidx/camera/core/i;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lf74;LUh1;Landroidx/camera/core/i;)LMD3;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf74;",
            "LUh1;",
            "Landroidx/camera/core/i;",
            ")",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf74;->b()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Lf74;->e()I

    move-result v3

    invoke-virtual {p0}, Lf74;->f()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-static {p2}, LY64;->d(Landroidx/camera/core/i;)Lxa0;

    move-result-object v5

    move-object v0, p2

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LMD3;->k(Landroidx/camera/core/i;LUh1;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lf74;LUh1;Landroidx/camera/core/i;)LMD3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf74;",
            "LUh1;",
            "Landroidx/camera/core/i;",
            ")",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/Size;

    invoke-interface {p2}, Landroidx/camera/core/i;->getWidth()I

    move-result v1

    invoke-interface {p2}, Landroidx/camera/core/i;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Lf74;->e()I

    move-result v1

    invoke-virtual {p1}, LUh1;->s()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, LY64;->e(ILandroid/util/Size;)Landroid/util/Size;

    move-result-object v4

    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v5, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-direct {v0, v5, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {v2, v0, v1}, Lp96;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0}, Lf74;->b()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1, v0}, LY64;->f(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, LUh1;->s()I

    move-result v6

    invoke-virtual {p0}, Lf74;->f()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-static {p0, v0}, LY64;->g(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v7

    invoke-static {p2}, LY64;->d(Landroidx/camera/core/i;)Lxa0;

    move-result-object v8

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v2 .. v8}, LMD3;->l(Landroidx/camera/core/i;LUh1;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroidx/camera/core/i;)Lxa0;
    .locals 0

    invoke-interface {p0}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object p0

    check-cast p0, Lya0;

    invoke-virtual {p0}, Lya0;->d()Lxa0;

    move-result-object p0

    return-object p0
.end method

.method public static e(ILandroid/util/Size;)Landroid/util/Size;
    .locals 1

    invoke-static {p0}, Lp96;->s(I)I

    move-result p0

    invoke-static {p0}, Lp96;->g(I)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Landroid/util/Size;

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-direct {p0, v0, p1}, Landroid/util/Size;-><init>(II)V

    move-object p1, p0

    :cond_0
    return-object p1
.end method

.method public static f(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {v0}, Landroid/graphics/RectF;->sort()V

    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    return-object p0
.end method

.method public static g(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-object v0
.end method


# virtual methods
.method public a(Le74$b;)LMD3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le74$b;",
            ")",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, Le74$b;->a()Landroidx/camera/core/i;

    move-result-object v0

    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object p1

    invoke-interface {v0}, Landroidx/camera/core/i;->getFormat()I

    move-result v1

    const/16 v2, 0x100

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {v0}, LUh1;->j(Landroidx/camera/core/i;)LUh1;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/i;->A0()[Landroidx/camera/core/i$a;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v2}, Landroidx/camera/core/i$a;->e()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const/4 v1, 0x1

    const-string v2, "Failed to extract EXIF data."

    invoke-direct {v0, v1, v2, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, LEX1;->g:Lci1;

    invoke-virtual {v2, v0}, Lci1;->b(Landroidx/camera/core/i;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "JPEG image must have exif."

    invoke-static {v1, v2}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v1, v0}, LY64;->c(Lf74;LUh1;Landroidx/camera/core/i;)LMD3;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v1, v0}, LY64;->b(Lf74;LUh1;Landroidx/camera/core/i;)LMD3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    check-cast p1, Le74$b;

    invoke-virtual {p0, p1}, LY64;->a(Le74$b;)LMD3;

    move-result-object p1

    return-object p1
.end method
