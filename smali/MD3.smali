.class public abstract LMD3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Landroid/graphics/Bitmap;LUh1;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "LUh1;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Lxa0;",
            ")",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v9, LUt;

    const/16 v3, 0x2a

    new-instance v4, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-direct {v4, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, LUt;-><init>(Ljava/lang/Object;LUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)V

    return-object v9
.end method

.method public static k(Landroidx/camera/core/i;LUh1;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/i;",
            "LUh1;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Lxa0;",
            ")",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    new-instance v2, Landroid/util/Size;

    invoke-interface {p0}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p0}, Landroidx/camera/core/i;->getHeight()I

    move-result v1

    invoke-direct {v2, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, LMD3;->l(Landroidx/camera/core/i;LUh1;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroidx/camera/core/i;LUh1;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/i;",
            "LUh1;",
            "Landroid/util/Size;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Lxa0;",
            ")",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/camera/core/i;->getFormat()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const-string v0, "JPEG image must have Exif."

    move-object v3, p1

    invoke-static {p1, v0}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    new-instance v0, LUt;

    invoke-interface {p0}, Landroidx/camera/core/i;->getFormat()I

    move-result v4

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v9}, LUt;-><init>(Ljava/lang/Object;LUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)V

    return-object v0
.end method

.method public static m([BLUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)LMD3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "LUh1;",
            "I",
            "Landroid/util/Size;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Lxa0;",
            ")",
            "LMD3<",
            "[B>;"
        }
    .end annotation

    new-instance v9, LUt;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LUt;-><init>(Ljava/lang/Object;LUh1;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Lxa0;)V

    return-object v9
.end method


# virtual methods
.method public abstract a()Lxa0;
.end method

.method public abstract b()Landroid/graphics/Rect;
.end method

.method public abstract c()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract d()LUh1;
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/graphics/Matrix;
.end method

.method public abstract h()Landroid/util/Size;
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, LMD3;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, LMD3;->h()Landroid/util/Size;

    move-result-object v1

    invoke-static {v0, v1}, Lp96;->f(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result v0

    return v0
.end method
