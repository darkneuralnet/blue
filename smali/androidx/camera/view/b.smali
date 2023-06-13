.class public final Landroidx/camera/view/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Landroidx/camera/view/PreviewView$g;


# instance fields
.field public a:Landroid/util/Size;

.field public b:Landroid/graphics/Rect;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Landroidx/camera/view/PreviewView$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$g;->d:Landroidx/camera/view/PreviewView$g;

    sput-object v0, Landroidx/camera/view/b;->h:Landroidx/camera/view/PreviewView$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/camera/view/b;->h:Landroidx/camera/view/PreviewView$g;

    iput-object v0, p0, Landroidx/camera/view/b;->g:Landroidx/camera/view/PreviewView$g;

    return-void
.end method

.method public static a(Landroid/graphics/RectF;F)Landroid/graphics/RectF;
    .locals 4

    new-instance v0, Landroid/graphics/RectF;

    add-float/2addr p1, p1

    iget v1, p0, Landroid/graphics/RectF;->right:F

    sub-float v1, p1, v1

    iget v2, p0, Landroid/graphics/RectF;->top:F

    iget v3, p0, Landroid/graphics/RectF;->left:F

    sub-float/2addr p1, v3

    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, p1, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public static n(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroidx/camera/view/PreviewView$g;)V
    .locals 2

    sget-object v0, Landroidx/camera/view/b$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected crop rect: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PreviewTransform"

    invoke-static {v1, v0}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_0

    :pswitch_0
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_0

    :pswitch_1
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_0

    :pswitch_2
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    :goto_0
    sget-object v1, Landroidx/camera/view/PreviewView$g;->g:Landroidx/camera/view/PreviewView$g;

    if-eq p3, v1, :cond_1

    sget-object v1, Landroidx/camera/view/PreviewView$g;->f:Landroidx/camera/view/PreviewView$g;

    if-eq p3, v1, :cond_1

    sget-object v1, Landroidx/camera/view/PreviewView$g;->h:Landroidx/camera/view/PreviewView$g;

    if-ne p3, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p3, 0x1

    :goto_2
    if-eqz p3, :cond_2

    invoke-virtual {p0, p1, p2, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_3

    :cond_2
    invoke-virtual {p0, p2, p1, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public b(Landroid/util/Size;I)Landroid/graphics/Matrix;
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/view/b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0, p1, p2}, Landroidx/camera/view/b;->h(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    new-instance p2, Landroid/graphics/RectF;

    iget-object v1, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v3, v3, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {p1, p2, v1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-object v0
.end method

.method public c(Landroid/util/Size;I)Landroid/graphics/RectF;
    .locals 5

    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p0}, Landroidx/camera/view/b;->e()Landroid/util/Size;

    move-result-object v1

    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v2, v3, v3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iget-object v3, p0, Landroidx/camera/view/b;->g:Landroidx/camera/view/PreviewView$g;

    invoke-static {v1, v2, v0, v3}, Landroidx/camera/view/b;->n(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroidx/camera/view/PreviewView$g;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-static {v2, p1}, Landroidx/camera/view/b;->a(Landroid/graphics/RectF;F)Landroid/graphics/RectF;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2
.end method

.method public final d()I
    .locals 3

    iget v0, p0, Landroidx/camera/view/b;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-boolean v2, p0, Landroidx/camera/view/b;->f:Z

    if-nez v2, :cond_0

    iget v0, p0, Landroidx/camera/view/b;->c:I

    return v0

    :cond_0
    iget-boolean v2, p0, Landroidx/camera/view/b;->f:Z

    if-eqz v2, :cond_1

    if-eq v0, v1, :cond_1

    invoke-static {v0}, Lac0;->b(I)I

    move-result v0

    neg-int v0, v0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Target rotation must be specified. Target rotation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/view/b;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " hasCameraTransform "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Landroidx/camera/view/b;->f:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Landroid/util/Size;
    .locals 3

    iget v0, p0, Landroidx/camera/view/b;->c:I

    invoke-static {v0}, Lp96;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/util/Size;

    iget-object v1, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, Landroid/util/Size;

    iget-object v1, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    return-object v0
.end method

.method public f()Landroidx/camera/view/PreviewView$g;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/b;->g:Landroidx/camera/view/PreviewView$g;

    return-object v0
.end method

.method public g()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public h(Landroid/util/Size;I)Landroid/graphics/Matrix;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/view/b;->k()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    invoke-virtual {p0, p1}, Landroidx/camera/view/b;->l(Landroid/util/Size;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, v0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/camera/view/b;->c(Landroid/util/Size;I)Landroid/graphics/RectF;

    move-result-object p2

    :goto_0
    new-instance p1, Landroid/graphics/RectF;

    iget-object v0, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget v0, p0, Landroidx/camera/view/b;->c:I

    invoke-static {p1, p2, v0}, Lp96;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object p1

    iget-boolean p2, p0, Landroidx/camera/view/b;->e:Z

    if-eqz p2, :cond_2

    iget p2, p0, Landroidx/camera/view/b;->c:I

    invoke-static {p2}, Lp96;->g(I)Z

    move-result p2

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    move-result p2

    int-to-float p2, p2

    iget-object v2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, p2, v2}, Landroid/graphics/Matrix;->preScale(FFFF)Z

    goto :goto_1

    :cond_1
    iget-object p2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    move-result p2

    int-to-float p2, p2

    iget-object v2, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v1, v0, p2, v2}, Landroid/graphics/Matrix;->preScale(FFFF)Z

    :cond_2
    :goto_1
    return-object p1
.end method

.method public i()Landroid/graphics/Matrix;
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/view/b;->k()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p0}, Landroidx/camera/view/b;->d()I

    move-result v1

    invoke-static {v0, v0, v1}, Lp96;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final j(Landroid/util/Size;I)Landroid/graphics/RectF;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/view/b;->k()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    invoke-virtual {p0, p1, p2}, Landroidx/camera/view/b;->h(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object p1

    new-instance p2, Landroid/graphics/RectF;

    iget-object v0, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-direct {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    return-object p2
.end method

.method public final k()Z
    .locals 4

    iget-boolean v0, p0, Landroidx/camera/view/b;->f:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/camera/view/b;->d:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    iget-object v3, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public l(Landroid/util/Size;)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/view/b;->e()Landroid/util/Size;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp96;->i(Landroid/util/Size;ZLandroid/util/Size;Z)Z

    move-result p1

    return p1
.end method

.method public m(II)V
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/view/b;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/camera/view/b;->c:I

    iput p2, p0, Landroidx/camera/view/b;->d:I

    return-void
.end method

.method public o(Landroidx/camera/view/PreviewView$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/b;->g:Landroidx/camera/view/PreviewView$g;

    return-void
.end method

.method public p(Landroidx/camera/core/o$h;Landroid/util/Size;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transformation info set: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PreviewTransform"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/o$h;->a()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/view/b;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroidx/camera/core/o$h;->b()I

    move-result v0

    iput v0, p0, Landroidx/camera/view/b;->c:I

    invoke-virtual {p1}, Landroidx/camera/core/o$h;->c()I

    move-result v0

    iput v0, p0, Landroidx/camera/view/b;->d:I

    iput-object p2, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    iput-boolean p3, p0, Landroidx/camera/view/b;->e:Z

    invoke-virtual {p1}, Landroidx/camera/core/o$h;->d()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/view/b;->f:Z

    return-void
.end method

.method public q(Landroid/util/Size;ILandroid/view/View;)V
    .locals 5

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    const-string v1, "PreviewTransform"

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/view/b;->k()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p3, Landroid/view/TextureView;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Landroid/view/TextureView;

    invoke-virtual {p0}, Landroidx/camera/view/b;->i()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    iget-boolean v2, p0, Landroidx/camera/view/b;->f:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iget v2, p0, Landroidx/camera/view/b;->d:I

    if-eq v0, v2, :cond_3

    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v4

    :goto_0
    iget-boolean v2, p0, Landroidx/camera/view/b;->f:Z

    if-nez v2, :cond_4

    invoke-virtual {p0}, Landroidx/camera/view/b;->d()I

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move v3, v4

    :goto_1
    if-nez v0, :cond_5

    if-eqz v3, :cond_6

    :cond_5
    const-string v0, "Custom rotation not supported with SurfaceView/PERFORMANCE mode."

    invoke-static {v1, v0}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    invoke-virtual {p0, p1, p2}, Landroidx/camera/view/b;->j(Landroid/util/Size;I)Landroid/graphics/RectF;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {p3, p2}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    iget-object v0, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p3, p2}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p2

    iget-object v0, p0, Landroidx/camera/view/b;->a:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p3, p2}, Landroid/view/View;->setScaleY(F)V

    iget p2, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p2, v0

    invoke-virtual {p3, p2}, Landroid/view/View;->setTranslationX(F)V

    iget p1, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_7
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Transform not applied due to PreviewView size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
