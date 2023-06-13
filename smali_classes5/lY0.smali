.class public final LlY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final a:LrH1;

.field public final b:I

.field public final c:I

.field public final d:LnV0;

.field public final e:Lc61;

.field public final f:Z

.field public final g:LUZ3;


# direct methods
.method public constructor <init>(IILsy3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LrH1;->b()LrH1;

    move-result-object v0

    iput-object v0, p0, LlY0;->a:LrH1;

    iput p1, p0, LlY0;->b:I

    iput p2, p0, LlY0;->c:I

    sget-object p1, Li61;->f:Liy3;

    invoke-virtual {p3, p1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LnV0;

    iput-object p1, p0, LlY0;->d:LnV0;

    sget-object p1, Lc61;->h:Liy3;

    invoke-virtual {p3, p1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc61;

    iput-object p1, p0, LlY0;->e:Lc61;

    sget-object p1, Li61;->j:Liy3;

    invoke-virtual {p3, p1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LlY0;->f:Z

    sget-object p1, Li61;->g:Liy3;

    invoke-virtual {p3, p1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUZ3;

    iput-object p1, p0, LlY0;->g:LUZ3;

    return-void
.end method


# virtual methods
.method public onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 8

    iget-object p3, p0, LlY0;->a:LrH1;

    iget v0, p0, LlY0;->b:I

    iget v1, p0, LlY0;->c:I

    iget-boolean v2, p0, LlY0;->f:Z

    const/4 v3, 0x0

    invoke-virtual {p3, v0, v1, v2, v3}, LrH1;->e(IIZZ)Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    const/4 p3, 0x3

    invoke-static {p1, p3}, LdY0;->a(Landroid/graphics/ImageDecoder;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, LdY0;->a(Landroid/graphics/ImageDecoder;I)V

    :goto_0
    iget-object p3, p0, LlY0;->d:LnV0;

    sget-object v1, LnV0;->c:LnV0;

    if-ne p3, v1, :cond_1

    invoke-static {p1, v3}, LfY0;->a(Landroid/graphics/ImageDecoder;I)V

    :cond_1
    new-instance p3, LlY0$a;

    invoke-direct {p3, p0}, LlY0$a;-><init>(LlY0;)V

    invoke-static {p1, p3}, LgY0;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    invoke-static {p2}, LhY0;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    move-result-object p3

    iget v1, p0, LlY0;->b:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_2

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v1

    :cond_2
    iget v4, p0, LlY0;->c:I

    if-ne v4, v2, :cond_3

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v4

    :cond_3
    iget-object v2, p0, LlY0;->e:Lc61;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-virtual {v2, v5, v6, v1, v4}, Lc61;->b(IIII)F

    move-result v1

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v5, 0x2

    const-string v6, "ImageDecoder"

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Resizing from ["

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "x"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p3

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] to ["

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] scaleFactor: "

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v6, p3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-static {p1, v2, v4}, LiY0;->a(Landroid/graphics/ImageDecoder;II)V

    iget-object p3, p0, LlY0;->g:LUZ3;

    if-eqz p3, :cond_8

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_7

    sget-object v1, LUZ3;->c:LUZ3;

    if-ne p3, v1, :cond_5

    invoke-static {p2}, LjY0;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-static {p2}, LjY0;->a(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p2}, LkY0;->a(Landroid/graphics/ColorSpace;)Z

    move-result p2

    if-eqz p2, :cond_5

    move v3, v0

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {}, LKg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p2

    goto :goto_1

    :cond_6
    invoke-static {}, LMg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p2

    :goto_1
    invoke-static {p2}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p1, p2}, LeY0;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    goto :goto_2

    :cond_7
    const/16 p2, 0x1a

    if-lt v1, p2, :cond_8

    invoke-static {}, LMg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p2

    invoke-static {p2}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p1, p2}, LeY0;->a(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    :cond_8
    :goto_2
    return-void
.end method
