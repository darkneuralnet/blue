.class public LqM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT83;


# instance fields
.field public a:LrM5;

.field public b:D

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(D)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LqM5;->b:D

    new-instance v0, LrM5;

    invoke-direct {v0, p1, p2}, LrM5;-><init>(D)V

    iput-object v0, p0, LqM5;->a:LrM5;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 0

    invoke-virtual {p0, p1}, LqM5;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LqM5;->e(Ljava/util/List;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LqM5;->c:Ljava/util/List;

    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LqM5;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcr5;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcr5;

    invoke-interface {v0}, Lcr5;->h()[LyB0;

    move-result-object v0

    array-length v1, v0

    div-int/lit8 v1, v1, 0x64

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-static {v2, v3}, LaN2;->c(D)D

    move-result-wide v2

    array-length v5, v0

    int-to-double v5, v5

    mul-double/2addr v5, v2

    double-to-int v5, v5

    iget-object v6, p0, LqM5;->a:LrM5;

    aget-object v5, v0, v5

    invoke-virtual {v6, v5}, LrM5;->a(LyB0;)LyB0;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d([LyB0;)[LyB0;
    .locals 5

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    iget-object v3, p0, LqM5;->a:LrM5;

    aget-object v4, p1, v2

    invoke-virtual {v3, v4}, LrM5;->a(LyB0;)LyB0;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, LDB0;->f(LyB0;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/List;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LS83;",
            ">;)",
            "Ljava/util/Collection;"
        }
    .end annotation

    new-instance v0, LpM5;

    iget-wide v1, p0, LqM5;->b:D

    iget-object v3, p0, LqM5;->a:LrM5;

    invoke-direct {v0, v1, v2, v3}, LpM5;-><init>(DLrM5;)V

    new-instance v1, LEE2;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iget-wide v4, p0, LqM5;->b:D

    mul-double/2addr v4, v2

    invoke-direct {v1, v0, v4, v5}, LEE2;-><init>(LVq5;D)V

    invoke-virtual {v1, p1}, LEE2;->a(Ljava/util/Collection;)V

    invoke-virtual {v1}, LEE2;->b()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcr5;)LS83;
    .locals 2

    invoke-interface {p1}, Lcr5;->h()[LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LqM5;->d([LyB0;)[LyB0;

    move-result-object v0

    new-instance v1, LS83;

    invoke-interface {p1}, Lcr5;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v1, v0, p1}, LS83;-><init>([LyB0;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final g(Ljava/util/Collection;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcr5;",
            ">;)",
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LqM5;->c(Ljava/util/Collection;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcr5;

    invoke-virtual {p0, v1}, LqM5;->f(Lcr5;)LS83;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
