.class public LZh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Loi;

.field public c:I

.field public d:LX46;

.field public e:LX46;

.field public f:LX46;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LZh;->c:I

    iput-object p1, p0, LZh;->a:Landroid/view/View;

    invoke-static {}, Loi;->b()Loi;

    move-result-object p1

    iput-object p1, p0, LZh;->b:Loi;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    iget-object v0, p0, LZh;->f:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LZh;->f:LX46;

    :cond_0
    iget-object v0, p0, LZh;->f:LX46;

    invoke-virtual {v0}, LX46;->a()V

    iget-object v1, p0, LZh;->a:Landroid/view/View;

    invoke-static {v1}, Lbq6;->u(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, LX46;->d:Z

    iput-object v1, v0, LX46;->a:Landroid/content/res/ColorStateList;

    :cond_1
    iget-object v1, p0, LZh;->a:Landroid/view/View;

    invoke-static {v1}, Lbq6;->v(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    if-eqz v1, :cond_2

    iput-boolean v2, v0, LX46;->c:Z

    iput-object v1, v0, LX46;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    iget-boolean v1, v0, LX46;->d:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, LX46;->c:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    iget-object v1, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-static {p1, v0, v1}, Loi;->i(Landroid/graphics/drawable/Drawable;LX46;[I)V

    return v2
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LZh;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, LZh;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LZh;->e:LX46;

    if-eqz v1, :cond_1

    iget-object v2, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Loi;->i(Landroid/graphics/drawable/Drawable;LX46;[I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LZh;->d:LX46;

    if-eqz v1, :cond_2

    iget-object v2, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Loi;->i(Landroid/graphics/drawable/Drawable;LX46;[I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LZh;->e:LX46;

    if-eqz v0, :cond_0

    iget-object v0, v0, LX46;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LZh;->e:LX46;

    if-eqz v0, :cond_0

    iget-object v0, v0, LX46;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 8

    iget-object v0, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Ljm4;->ViewBackgroundHelper:[I

    const/4 v1, 0x0

    invoke-static {v0, p1, v3, p2, v1}, LZ46;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)LZ46;

    move-result-object v0

    iget-object v1, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, LZ46;->r()Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v7}, Lbq6;->t0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :try_start_0
    sget p1, Ljm4;->ViewBackgroundHelper_android_background:I

    invoke-virtual {v0, p1}, LZ46;->s(I)Z

    move-result p2

    const/4 v1, -0x1

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1, v1}, LZ46;->n(II)I

    move-result p1

    iput p1, p0, LZh;->c:I

    iget-object p1, p0, LZh;->b:Loi;

    iget-object p2, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget v2, p0, LZh;->c:I

    invoke-virtual {p1, p2, v2}, Loi;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LZh;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget p1, Ljm4;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {v0, p1}, LZ46;->s(I)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, LZ46;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p2, p1}, Lbq6;->B0(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    sget p1, Ljm4;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {v0, p1}, LZ46;->s(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v0, p1, v1}, LZ46;->k(II)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ld71;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {p2, p1}, Lbq6;->C0(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v0}, LZ46;->w()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, LZ46;->w()V

    throw p1
.end method

.method public f(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, -0x1

    iput p1, p0, LZh;->c:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LZh;->h(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, LZh;->b()V

    return-void
.end method

.method public g(I)V
    .locals 2

    iput p1, p0, LZh;->c:I

    iget-object v0, p0, LZh;->b:Loi;

    if-eqz v0, :cond_0

    iget-object v1, p0, LZh;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Loi;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LZh;->h(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, LZh;->b()V

    return-void
.end method

.method public h(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, LZh;->d:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LZh;->d:LX46;

    :cond_0
    iget-object v0, p0, LZh;->d:LX46;

    iput-object p1, v0, LX46;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, LX46;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, LZh;->d:LX46;

    :goto_0
    invoke-virtual {p0}, LZh;->b()V

    return-void
.end method

.method public i(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LZh;->e:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LZh;->e:LX46;

    :cond_0
    iget-object v0, p0, LZh;->e:LX46;

    iput-object p1, v0, LX46;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, LX46;->d:Z

    invoke-virtual {p0}, LZh;->b()V

    return-void
.end method

.method public j(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LZh;->e:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LZh;->e:LX46;

    :cond_0
    iget-object v0, p0, LZh;->e:LX46;

    iput-object p1, v0, LX46;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, LX46;->c:Z

    invoke-virtual {p0}, LZh;->b()V

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LZh;->d:LX46;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
