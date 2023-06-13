.class public Landroidx/appcompat/app/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/drawerlayout/widget/DrawerLayout$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/a$e;,
        Landroidx/appcompat/app/a$d;,
        Landroidx/appcompat/app/a$b;,
        Landroidx/appcompat/app/a$c;
    }
.end annotation


# instance fields
.field public final a:Landroidx/appcompat/app/a$b;

.field public final b:Landroidx/drawerlayout/widget/DrawerLayout;

.field public c:Lj71;

.field public d:Z

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Z

.field public g:Z

.field public final h:I

.field public final i:I

.field public j:Landroid/view/View$OnClickListener;

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lj71;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/a;->d:Z

    iput-boolean v0, p0, Landroidx/appcompat/app/a;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/a;->k:Z

    if-eqz p2, :cond_0

    new-instance p1, Landroidx/appcompat/app/a$e;

    invoke-direct {p1, p2}, Landroidx/appcompat/app/a$e;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object p1, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    new-instance p1, Landroidx/appcompat/app/a$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroidx/appcompat/app/a;)V

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Landroidx/appcompat/app/a$c;

    if-eqz p2, :cond_1

    check-cast p1, Landroidx/appcompat/app/a$c;

    invoke-interface {p1}, Landroidx/appcompat/app/a$c;->getDrawerToggleDelegate()Landroidx/appcompat/app/a$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    goto :goto_0

    :cond_1
    new-instance p2, Landroidx/appcompat/app/a$d;

    invoke-direct {p2, p1}, Landroidx/appcompat/app/a$d;-><init>(Landroid/app/Activity;)V

    iput-object p2, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    :goto_0
    iput-object p3, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    iput p5, p0, Landroidx/appcompat/app/a;->h:I

    iput p6, p0, Landroidx/appcompat/app/a;->i:I

    if-nez p4, :cond_2

    new-instance p1, Lj71;

    iget-object p2, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    invoke-interface {p2}, Landroidx/appcompat/app/a$b;->a()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lj71;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/appcompat/app/a;->c:Lj71;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Landroidx/appcompat/app/a;->c:Lj71;

    :goto_1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/a;->e:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V
    .locals 7

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/app/a;-><init>(Landroid/app/Activity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lj71;II)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->k(F)V

    iget-boolean p1, p0, Landroidx/appcompat/app/a;->f:Z

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/appcompat/app/a;->i:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->f(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->k(F)V

    iget-boolean p1, p0, Landroidx/appcompat/app/a;->f:Z

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/appcompat/app/a;->h:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->f(I)V

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(Landroid/view/View;F)V
    .locals 1

    iget-boolean p1, p0, Landroidx/appcompat/app/a;->d:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->k(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/a;->k(F)V

    :goto_0
    return-void
.end method

.method public e()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    invoke-interface {v0}, Landroidx/appcompat/app/a$b;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    invoke-interface {v0, p1}, Landroidx/appcompat/app/a$b;->e(I)V

    return-void
.end method

.method public g(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/app/a;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    invoke-interface {v0}, Landroidx/appcompat/app/a$b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ActionBarDrawerToggle"

    const-string v1, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/a;->k:Z

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Landroidx/appcompat/app/a$b;

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/app/a$b;->d(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public h(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/a;->f:Z

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/a;->c:Lj71;

    iget-object v1, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    const v2, 0x800003

    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Landroidx/appcompat/app/a;->i:I

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/appcompat/app/a;->h:I

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/a;->g(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/a;->e:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/a;->g(Landroid/graphics/drawable/Drawable;I)V

    :goto_1
    iput-boolean p1, p0, Landroidx/appcompat/app/a;->f:Z

    :cond_2
    return-void
.end method

.method public i(I)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/a;->j(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public j(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/a;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/a;->e:Landroid/graphics/drawable/Drawable;

    iput-boolean v0, p0, Landroidx/appcompat/app/a;->g:Z

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/app/a;->e:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/app/a;->g:Z

    :goto_0
    iget-boolean p1, p0, Landroidx/appcompat/app/a;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/app/a;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/a;->g(Landroid/graphics/drawable/Drawable;I)V

    :cond_1
    return-void
.end method

.method public final k(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/a;->c:Lj71;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj71;->g(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/a;->c:Lj71;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj71;->g(Z)V

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/a;->c:Lj71;

    invoke-virtual {v0, p1}, Lj71;->e(F)V

    return-void
.end method

.method public l(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/a;->j:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/a;->k(F)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/a;->k(F)V

    :goto_0
    iget-boolean v0, p0, Landroidx/appcompat/app/a;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/app/a;->c:Lj71;

    iget-object v2, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v2, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/appcompat/app/a;->i:I

    goto :goto_1

    :cond_1
    iget v1, p0, Landroidx/appcompat/app/a;->h:I

    :goto_1
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/a;->g(Landroid/graphics/drawable/Drawable;I)V

    :cond_2
    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->q(I)I

    move-result v0

    iget-object v2, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v2, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->F(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/a;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->K(I)V

    :cond_1
    :goto_0
    return-void
.end method
