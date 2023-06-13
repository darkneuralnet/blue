.class public LDB6$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# static fields
.field public static final b:LDB6;


# instance fields
.field public final a:LDB6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LDB6$b;

    invoke-direct {v0}, LDB6$b;-><init>()V

    invoke-virtual {v0}, LDB6$b;->a()LDB6;

    move-result-object v0

    invoke-virtual {v0}, LDB6;->a()LDB6;

    move-result-object v0

    invoke-virtual {v0}, LDB6;->b()LDB6;

    move-result-object v0

    invoke-virtual {v0}, LDB6;->c()LDB6;

    move-result-object v0

    sput-object v0, LDB6$l;->b:LDB6;

    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDB6$l;->a:LDB6;

    return-void
.end method


# virtual methods
.method public a()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$l;->a:LDB6;

    return-object v0
.end method

.method public b()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$l;->a:LDB6;

    return-object v0
.end method

.method public c()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$l;->a:LDB6;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(LDB6;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LDB6$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LDB6$l;

    invoke-virtual {p0}, LDB6$l;->p()Z

    move-result v1

    invoke-virtual {p1}, LDB6$l;->p()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LDB6$l;->o()Z

    move-result v1

    invoke-virtual {p1}, LDB6$l;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LDB6$l;->l()LD32;

    move-result-object v1

    invoke-virtual {p1}, LDB6$l;->l()LD32;

    move-result-object v3

    invoke-static {v1, v3}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LDB6$l;->j()LD32;

    move-result-object v1

    invoke-virtual {p1}, LDB6$l;->j()LD32;

    move-result-object v3

    invoke-static {v1, v3}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LDB6$l;->f()Lf51;

    move-result-object v1

    invoke-virtual {p1}, LDB6$l;->f()Lf51;

    move-result-object p1

    invoke-static {v1, p1}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lf51;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(I)LD32;
    .locals 0

    sget-object p1, LD32;->e:LD32;

    return-object p1
.end method

.method public h(I)LD32;
    .locals 1

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_0

    sget-object p1, LD32;->e:LD32;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to query the maximum insets for IME"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, LDB6$l;->p()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, LDB6$l;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    invoke-virtual {p0}, LDB6$l;->l()LD32;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p0}, LDB6$l;->j()LD32;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p0}, LDB6$l;->f()Lf51;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, LYd3;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()LD32;
    .locals 1

    invoke-virtual {p0}, LDB6$l;->l()LD32;

    move-result-object v0

    return-object v0
.end method

.method public j()LD32;
    .locals 1

    sget-object v0, LD32;->e:LD32;

    return-object v0
.end method

.method public k()LD32;
    .locals 1

    invoke-virtual {p0}, LDB6$l;->l()LD32;

    move-result-object v0

    return-object v0
.end method

.method public l()LD32;
    .locals 1

    sget-object v0, LD32;->e:LD32;

    return-object v0
.end method

.method public m()LD32;
    .locals 1

    invoke-virtual {p0}, LDB6$l;->l()LD32;

    move-result-object v0

    return-object v0
.end method

.method public n(IIII)LDB6;
    .locals 0

    sget-object p1, LDB6$l;->b:LDB6;

    return-object p1
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public r([LD32;)V
    .locals 0

    return-void
.end method

.method public s(LD32;)V
    .locals 0

    return-void
.end method

.method public t(LDB6;)V
    .locals 0

    return-void
.end method

.method public u(LD32;)V
    .locals 0

    return-void
.end method
