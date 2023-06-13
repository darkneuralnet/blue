.class public Lvy5$c;
.super Lvy5$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final c:Lvy5$e;

.field public final d:F

.field public final e:F


# direct methods
.method public constructor <init>(Lvy5$e;FF)V
    .locals 0

    invoke-direct {p0}, Lvy5$g;-><init>()V

    iput-object p1, p0, Lvy5$c;->c:Lvy5$e;

    iput p2, p0, Lvy5$c;->d:F

    iput p3, p0, Lvy5$c;->e:F

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Matrix;LSx5;ILandroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lvy5$c;->c:Lvy5$e;

    invoke-static {v0}, Lvy5$e;->d(Lvy5$e;)F

    move-result v0

    iget v1, p0, Lvy5$c;->e:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lvy5$c;->c:Lvy5$e;

    invoke-static {v1}, Lvy5$e;->b(Lvy5$e;)F

    move-result v1

    iget v2, p0, Lvy5$c;->d:F

    sub-float/2addr v1, v2

    new-instance v2, Landroid/graphics/RectF;

    float-to-double v3, v0

    float-to-double v0, v1

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v1, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v0, p0, Lvy5$g;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lvy5$g;->a:Landroid/graphics/Matrix;

    iget v0, p0, Lvy5$c;->d:F

    iget v1, p0, Lvy5$c;->e:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object p1, p0, Lvy5$g;->a:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lvy5$c;->c()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    iget-object p1, p0, Lvy5$g;->a:Landroid/graphics/Matrix;

    invoke-virtual {p2, p4, p1, v2, p3}, LSx5;->b(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;I)V

    return-void
.end method

.method public c()F
    .locals 3

    iget-object v0, p0, Lvy5$c;->c:Lvy5$e;

    invoke-static {v0}, Lvy5$e;->d(Lvy5$e;)F

    move-result v0

    iget v1, p0, Lvy5$c;->e:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lvy5$c;->c:Lvy5$e;

    invoke-static {v1}, Lvy5$e;->b(Lvy5$e;)F

    move-result v1

    iget v2, p0, Lvy5$c;->d:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method
