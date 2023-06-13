.class public LDB6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDB6$a;,
        LDB6$n;,
        LDB6$m;,
        LDB6$e;,
        LDB6$d;,
        LDB6$c;,
        LDB6$f;,
        LDB6$b;,
        LDB6$k;,
        LDB6$j;,
        LDB6$i;,
        LDB6$h;,
        LDB6$g;,
        LDB6$l;
    }
.end annotation


# static fields
.field public static final b:LDB6;


# instance fields
.field public final a:LDB6$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, LDB6$k;->q:LDB6;

    sput-object v0, LDB6;->b:LDB6;

    goto :goto_0

    :cond_0
    sget-object v0, LDB6$l;->b:LDB6;

    sput-object v0, LDB6;->b:LDB6;

    :goto_0
    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    iget-object p1, p1, LDB6;->a:LDB6$l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LDB6$k;

    if-eqz v1, :cond_0

    new-instance v0, LDB6$k;

    move-object v1, p1

    check-cast v1, LDB6$k;

    invoke-direct {v0, p0, v1}, LDB6$k;-><init>(LDB6;LDB6$k;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v1, p1, LDB6$j;

    if-eqz v1, :cond_1

    new-instance v0, LDB6$j;

    move-object v1, p1

    check-cast v1, LDB6$j;

    invoke-direct {v0, p0, v1}, LDB6$j;-><init>(LDB6;LDB6$j;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v0, p1, LDB6$i;

    if-eqz v0, :cond_2

    new-instance v0, LDB6$i;

    move-object v1, p1

    check-cast v1, LDB6$i;

    invoke-direct {v0, p0, v1}, LDB6$i;-><init>(LDB6;LDB6$i;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_2
    instance-of v0, p1, LDB6$h;

    if-eqz v0, :cond_3

    new-instance v0, LDB6$h;

    move-object v1, p1

    check-cast v1, LDB6$h;

    invoke-direct {v0, p0, v1}, LDB6$h;-><init>(LDB6;LDB6$h;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_3
    instance-of v0, p1, LDB6$g;

    if-eqz v0, :cond_4

    new-instance v0, LDB6$g;

    move-object v1, p1

    check-cast v1, LDB6$g;

    invoke-direct {v0, p0, v1}, LDB6$g;-><init>(LDB6;LDB6$g;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_4
    new-instance v0, LDB6$l;

    invoke-direct {v0, p0}, LDB6$l;-><init>(LDB6;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    :goto_0
    invoke-virtual {p1, p0}, LDB6$l;->e(LDB6;)V

    goto :goto_1

    :cond_5
    new-instance p1, LDB6$l;

    invoke-direct {p1, p0}, LDB6$l;-><init>(LDB6;)V

    iput-object p1, p0, LDB6;->a:LDB6$l;

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LDB6$k;

    invoke-direct {v0, p0, p1}, LDB6$k;-><init>(LDB6;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LDB6$j;

    invoke-direct {v0, p0, p1}, LDB6$j;-><init>(LDB6;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, LDB6$i;

    invoke-direct {v0, p0, p1}, LDB6$i;-><init>(LDB6;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    goto :goto_0

    :cond_2
    new-instance v0, LDB6$h;

    invoke-direct {v0, p0, p1}, LDB6$h;-><init>(LDB6;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LDB6;->a:LDB6$l;

    :goto_0
    return-void
.end method

.method public static p(LD32;IIII)LD32;
    .locals 5

    iget v0, p0, LD32;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, LD32;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, LD32;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, LD32;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, LD32;->b(IIII)LD32;

    move-result-object p0

    return-object p0
.end method

.method public static y(Landroid/view/WindowInsets;)LDB6;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LDB6;->z(Landroid/view/WindowInsets;Landroid/view/View;)LDB6;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroid/view/WindowInsets;Landroid/view/View;)LDB6;
    .locals 1

    new-instance v0, LDB6;

    invoke-static {p0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, LDB6;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-static {p1}, Lbq6;->Y(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lbq6;->K(Landroid/view/View;)LDB6;

    move-result-object p0

    invoke-virtual {v0, p0}, LDB6;->v(LDB6;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, LDB6;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()LDB6;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->a()LDB6;

    move-result-object v0

    return-object v0
.end method

.method public b()LDB6;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->b()LDB6;

    move-result-object v0

    return-object v0
.end method

.method public c()LDB6;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->c()LDB6;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()Lf51;
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->f()Lf51;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LDB6;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LDB6;

    iget-object v0, p0, LDB6;->a:LDB6$l;

    iget-object p1, p1, LDB6;->a:LDB6$l;

    invoke-static {v0, p1}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)LD32;
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->g(I)LD32;

    move-result-object p1

    return-object p1
.end method

.method public g(I)LD32;
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->h(I)LD32;

    move-result-object p1

    return-object p1
.end method

.method public h()LD32;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->j()LD32;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LDB6$l;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()LD32;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->k()LD32;

    move-result-object v0

    return-object v0
.end method

.method public j()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->l()LD32;

    move-result-object v0

    iget v0, v0, LD32;->d:I

    return v0
.end method

.method public k()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->l()LD32;

    move-result-object v0

    iget v0, v0, LD32;->a:I

    return v0
.end method

.method public l()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->l()LD32;

    move-result-object v0

    iget v0, v0, LD32;->c:I

    return v0
.end method

.method public m()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->l()LD32;

    move-result-object v0

    iget v0, v0, LD32;->b:I

    return v0
.end method

.method public n()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->l()LD32;

    move-result-object v0

    sget-object v1, LD32;->e:LD32;

    invoke-virtual {v0, v1}, LD32;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public o(IIII)LDB6;
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1, p2, p3, p4}, LDB6$l;->n(IIII)LDB6;

    move-result-object p1

    return-object p1
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0}, LDB6$l;->o()Z

    move-result v0

    return v0
.end method

.method public r(I)Z
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->q(I)Z

    move-result p1

    return p1
.end method

.method public s(IIII)LDB6;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LDB6$b;

    invoke-direct {v0, p0}, LDB6$b;-><init>(LDB6;)V

    invoke-static {p1, p2, p3, p4}, LD32;->b(IIII)LD32;

    move-result-object p1

    invoke-virtual {v0, p1}, LDB6$b;->d(LD32;)LDB6$b;

    move-result-object p1

    invoke-virtual {p1}, LDB6$b;->a()LDB6;

    move-result-object p1

    return-object p1
.end method

.method public t([LD32;)V
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->r([LD32;)V

    return-void
.end method

.method public u(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->s(LD32;)V

    return-void
.end method

.method public v(LDB6;)V
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->t(LDB6;)V

    return-void
.end method

.method public w(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6;->a:LDB6$l;

    invoke-virtual {v0, p1}, LDB6$l;->u(LD32;)V

    return-void
.end method

.method public x()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, LDB6;->a:LDB6$l;

    instance-of v1, v0, LDB6$g;

    if-eqz v1, :cond_0

    check-cast v0, LDB6$g;

    iget-object v0, v0, LDB6$g;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
