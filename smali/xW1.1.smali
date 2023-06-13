.class public final LxW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZh3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxW1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZh3<",
        "LxW1$a;",
        "LMD3<",
        "[B>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b([B)LUh1;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, LUh1;->k(Ljava/io/InputStream;)LUh1;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const/4 v1, 0x0

    const-string v2, "Failed to extract Exif from YUV-generated JPEG"

    invoke-direct {v0, v1, v2, p0}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a(LxW1$a;)LMD3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxW1$a;",
            ")",
            "LMD3<",
            "[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, LxW1$a;->b()LMD3;

    move-result-object v0

    invoke-virtual {v0}, LMD3;->e()I

    move-result v0

    const/16 v1, 0x23

    if-eq v0, v1, :cond_1

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, LxW1;->c(LxW1$a;)LMD3;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p1}, LxW1$a;->b()LMD3;

    move-result-object p1

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/i;

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    return-object v0

    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected format: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {p0, p1}, LxW1;->d(LxW1$a;)LMD3;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, LxW1$a;->b()LMD3;

    move-result-object p1

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/i;

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    check-cast p1, LxW1$a;

    invoke-virtual {p0, p1}, LxW1;->a(LxW1$a;)LMD3;

    move-result-object p1

    return-object p1
.end method

.method public final c(LxW1$a;)LMD3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxW1$a;",
            ")",
            "LMD3<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, LxW1$a;->b()LMD3;

    move-result-object p1

    invoke-virtual {p1}, LMD3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/i;

    invoke-static {v0}, Landroidx/camera/core/internal/utils/ImageUtil;->k(Landroidx/camera/core/i;)[B

    move-result-object v1

    invoke-virtual {p1}, LMD3;->d()LUh1;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x100

    invoke-virtual {p1}, LMD3;->h()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {p1}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, LMD3;->f()I

    move-result v6

    invoke-virtual {p1}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {p1}, LMD3;->a()Lxa0;

    move-result-object v8

    invoke-static/range {v1 .. v8}, LMD3;->m([BLUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p1

    return-object p1
.end method

.method public final d(LxW1$a;)LMD3;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxW1$a;",
            ")",
            "LMD3<",
            "[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, LxW1$a;->b()LMD3;

    move-result-object v0

    invoke-virtual {v0}, LMD3;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/i;

    invoke-virtual {v0}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, LxW1$a;->a()I

    move-result p1

    invoke-virtual {v0}, LMD3;->f()I

    move-result v3

    invoke-static {v1, v2, p1, v3}, Landroidx/camera/core/internal/utils/ImageUtil;->q(Landroidx/camera/core/i;Landroid/graphics/Rect;II)[B

    move-result-object v4
    :try_end_0
    .catch Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v4}, LxW1;->b([B)LUh1;

    move-result-object v5

    const/16 v6, 0x100

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result p1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-direct {v7, p1, v1}, Landroid/util/Size;-><init>(II)V

    new-instance v8, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result p1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v8, v3, v3, p1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0}, LMD3;->f()I

    move-result v9

    invoke-virtual {v0}, LMD3;->g()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-static {p1, v2}, Lp96;->r(Landroid/graphics/Matrix;Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v10

    invoke-virtual {v0}, LMD3;->a()Lxa0;

    move-result-object v11

    invoke-static/range {v4 .. v11}, LMD3;->m([BLUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const/4 v1, 0x1

    const-string v2, "Failed to encode the image to JPEG."

    invoke-direct {v0, v1, v2, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
