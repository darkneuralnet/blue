.class public Lvr2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsf1;

.field public b:LDB0;

.field public c:LyB0;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "LyB0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsf1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lvr2;->c:LyB0;

    iput-object v0, p0, Lvr2;->d:Ljava/util/List;

    iput-object p1, p0, Lvr2;->a:Lsf1;

    return-void
.end method


# virtual methods
.method public final a(LyB0;)V
    .locals 1

    invoke-virtual {p0, p1}, Lvr2;->d(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lvr2;->c()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvr2;->c:LyB0;

    invoke-virtual {p0, v0}, Lvr2;->b(LyB0;)V

    invoke-virtual {p0, p1}, Lvr2;->b(LyB0;)V

    :goto_0
    iput-object p1, p0, Lvr2;->c:LyB0;

    return-void
.end method

.method public final b(LyB0;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lvr2;->g()V

    iget-object v0, p0, Lvr2;->b:LDB0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LDB0;->f(LyB0;Z)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lvr2;->b:LDB0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lvr2;->c:LyB0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, LDB0;->f(LyB0;Z)V

    iput-object v2, p0, Lvr2;->c:LyB0;

    :cond_1
    iget-object v0, p0, Lvr2;->b:LDB0;

    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object v0

    iget-object v1, p0, Lvr2;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v2, p0, Lvr2;->b:LDB0;

    return-void
.end method

.method public final d(LyB0;)Z
    .locals 2

    iget-object v0, p0, Lvr2;->c:LyB0;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lvr2;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v1, p0, Lvr2;->a:Lsf1;

    invoke-virtual {v1, v0, p1}, Lsf1;->F(LyB0;LyB0;)Z

    move-result p1

    return p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lvr2;->b:LDB0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f([LyB0;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LyB0;",
            ")",
            "Ljava/util/List<",
            "[",
            "LyB0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, Lvr2;->c:LyB0;

    iput-object v0, p0, Lvr2;->b:LDB0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lvr2;->d:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    aget-object v1, p1, v0

    iget-object v2, p0, Lvr2;->a:Lsf1;

    invoke-virtual {v2, v1}, Lsf1;->E(LyB0;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lvr2;->b(LyB0;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lvr2;->a(LyB0;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lvr2;->c()V

    iget-object p1, p0, Lvr2;->d:Ljava/util/List;

    return-object p1
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lvr2;->b:LDB0;

    if-nez v0, :cond_0

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    iput-object v0, p0, Lvr2;->b:LDB0;

    :cond_0
    iget-object v0, p0, Lvr2;->c:LyB0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lvr2;->b:LDB0;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LDB0;->f(LyB0;Z)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lvr2;->c:LyB0;

    return-void
.end method
