.class public final LQ74;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000c\u0010\u0012\u001a\u00020\u0011*\u00020\rH\u0002J\u000c\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "LQ74;",
        "Landroid/graphics/drawable/Drawable;",
        "",
        "alpha",
        "",
        "setAlpha",
        "getOpacity",
        "Landroid/graphics/ColorFilter;",
        "colorFilter",
        "setColorFilter",
        "Landroid/graphics/Canvas;",
        "canvas",
        "draw",
        "Landroid/graphics/Rect;",
        "bound",
        "b",
        "a",
        "",
        "d",
        "c",
        "I",
        "totalLevel",
        "currentLevel",
        "highlightColor",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/Paint;",
        "e",
        "Landroid/graphics/Paint;",
        "paint",
        "<init>",
        "(IIILandroid/content/Context;)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Landroid/content/Context;

.field public final e:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(IIILandroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput p1, p0, LQ74;->a:I

    iput p2, p0, LQ74;->b:I

    iput p3, p0, LQ74;->c:I

    iput-object p4, p0, LQ74;->d:Landroid/content/Context;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LQ74;->e:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 8

    iget-object v0, p0, LQ74;->e:Landroid/graphics/Paint;

    iget v1, p0, LQ74;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LQ74;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget v1, p0, LQ74;->a:I

    add-int/lit8 v2, v1, -0x1

    mul-int/2addr v0, v2

    div-int/2addr v0, v1

    int-to-float v2, v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget v1, p0, LQ74;->a:I

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x2

    int-to-float v7, v3

    div-float/2addr v1, v7

    sub-float/2addr v0, v1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v3, v1

    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v1

    iget-object v6, p0, LQ74;->e:Landroid/graphics/Paint;

    move-object v1, p1

    move v4, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p0, p2}, LQ74;->d(Landroid/graphics/Rect;)F

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v7

    iget-object v2, p0, LQ74;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 8

    iget-object v0, p0, LQ74;->e:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LQ74;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float v3, v0, v1

    invoke-virtual {p0, p2}, LQ74;->d(Landroid/graphics/Rect;)F

    move-result v0

    iget-object v1, p0, LQ74;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v0, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p2, Landroid/graphics/Rect;->top:I

    int-to-float v4, v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f666666    # 0.9f

    mul-float/2addr v0, v1

    iget v1, p0, LQ74;->a:I

    int-to-float v1, v1

    div-float v5, v0, v1

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, p2

    iget-object v7, p0, LQ74;->e:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final c(I)I
    .locals 1

    iget v0, p0, LQ74;->b:I

    if-ge p1, v0, :cond_0

    iget p1, p0, LQ74;->c:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, LQ74;->d:Landroid/content/Context;

    sget v0, LDf4;->birdGray:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(Landroid/graphics/Rect;)F
    .locals 2

    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v0

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, p1

    int-to-float p1, v0

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p1, v0

    sub-float/2addr v1, p1

    return v1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 12

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    const-string v1, "bounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p0, p1, v0}, LQ74;->b(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    iget v2, p0, LQ74;->a:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ge v3, v2, :cond_0

    mul-int v4, v1, v3

    iget v5, p0, LQ74;->a:I

    div-int/2addr v4, v5

    int-to-float v7, v4

    const v4, 0x3f666666    # 0.9f

    int-to-float v6, v1

    mul-float/2addr v6, v4

    int-to-float v4, v5

    div-float/2addr v6, v4

    add-float v9, v7, v6

    iget-object v4, p0, LQ74;->e:Landroid/graphics/Paint;

    invoke-virtual {p0, v3}, LQ74;->c(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget v4, v0, Landroid/graphics/Rect;->top:I

    int-to-float v8, v4

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v10, v4

    iget-object v11, p0, LQ74;->e:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, v0}, LQ74;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    return-void
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, LQ74;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, LQ74;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
