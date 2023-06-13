.class public LJj1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsr2;

.field public b:Ljava/util/Collection;

.field public c:Z

.field public d:LU83;

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBb5;

    invoke-direct {v0}, LBb5;-><init>()V

    iput-object v0, p0, LJj1;->a:Lsr2;

    const/4 v0, 0x0

    iput-boolean v0, p0, LJj1;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, LJj1;->d:LU83;

    const/4 v0, 0x1

    iput-boolean v0, p0, LJj1;->e:Z

    iput-object p1, p0, LJj1;->b:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LJj1;->e:Z

    new-instance v0, LU83;

    iget-object v1, p0, LJj1;->a:Lsr2;

    invoke-direct {v0, v1}, LU83;-><init>(Lsr2;)V

    iput-object v0, p0, LJj1;->d:LU83;

    iget-boolean v1, p0, LJj1;->c:Z

    invoke-virtual {v0, v1}, LU83;->h(Z)V

    new-instance v0, LEE2;

    invoke-direct {v0}, LEE2;-><init>()V

    iget-object v1, p0, LJj1;->d:LU83;

    invoke-virtual {v0, v1}, LlB5;->c(LVq5;)V

    iget-object v1, p0, LJj1;->b:Ljava/util/Collection;

    invoke-virtual {v0, v1}, LEE2;->a(Ljava/util/Collection;)V

    iget-object v0, p0, LJj1;->d:LU83;

    invoke-virtual {v0}, LU83;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LJj1;->e:Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    invoke-virtual {p0}, LJj1;->c()V

    iget-boolean v0, p0, LJj1;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lorg/locationtech/jts/geom/TopologyException;

    invoke-virtual {p0}, LJj1;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LJj1;->d:LU83;

    invoke-virtual {v2}, LU83;->b()LyB0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LJj1;->d:LU83;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LJj1;->a()V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, LJj1;->e:Z

    if-eqz v0, :cond_0

    const-string v0, "no intersections found"

    return-object v0

    :cond_0
    iget-object v0, p0, LJj1;->d:LU83;

    invoke-virtual {v0}, LU83;->c()[LyB0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "found non-noded intersection between "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const/4 v3, 0x1

    aget-object v3, v0, v3

    invoke-static {v2, v3}, Lkw6;->A(LyB0;LyB0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    aget-object v2, v0, v2

    const/4 v3, 0x3

    aget-object v0, v0, v3

    invoke-static {v2, v0}, Lkw6;->A(LyB0;LyB0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
