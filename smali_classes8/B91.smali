.class public LB91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;

.field public b:Lq91;


# direct methods
.method public constructor <init>(Lq91;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, LB91;->a:Ljava/util/Map;

    iput-object p1, p0, LB91;->b:Lq91;

    return-void
.end method


# virtual methods
.method public a(LyB0;ID)LA91;
    .locals 1

    new-instance v0, LA91;

    invoke-direct {v0, p1, p2, p3, p4}, LA91;-><init>(LyB0;ID)V

    iget-object p1, p0, LB91;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA91;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, LB91;->a:Ljava/util/Map;

    invoke-interface {p1, v0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, LB91;->b:Lq91;

    iget-object v0, v0, Lq91;->f:[LyB0;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aget-object v0, v0, v2

    const-wide/16 v3, 0x0

    invoke-virtual {p0, v0, v2, v3, v4}, LB91;->a(LyB0;ID)LA91;

    iget-object v0, p0, LB91;->b:Lq91;

    iget-object v0, v0, Lq91;->f:[LyB0;

    aget-object v0, v0, v1

    invoke-virtual {p0, v0, v1, v3, v4}, LB91;->a(LyB0;ID)LA91;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 3

    invoke-virtual {p0}, LB91;->b()V

    invoke-virtual {p0}, LB91;->e()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA91;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA91;

    invoke-virtual {p0, v1, v2}, LB91;->d(LA91;LA91;)Lq91;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(LA91;LA91;)Lq91;
    .locals 6

    iget v0, p2, LA91;->c:I

    iget v1, p1, LA91;->c:I

    sub-int v1, v0, v1

    add-int/lit8 v1, v1, 0x2

    iget-object v2, p0, LB91;->b:Lq91;

    iget-object v2, v2, Lq91;->f:[LyB0;

    aget-object v0, v2, v0

    iget-wide v2, p2, LA91;->d:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gtz v2, :cond_1

    iget-object v2, p2, LA91;->b:LyB0;

    invoke-virtual {v2, v0}, LyB0;->g(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v4

    :goto_1
    if-nez v0, :cond_2

    add-int/lit8 v1, v1, -0x1

    :cond_2
    new-array v1, v1, [LyB0;

    new-instance v2, LyB0;

    iget-object v5, p1, LA91;->b:LyB0;

    invoke-direct {v2, v5}, LyB0;-><init>(LyB0;)V

    aput-object v2, v1, v3

    iget p1, p1, LA91;->c:I

    add-int/2addr p1, v4

    :goto_2
    iget v2, p2, LA91;->c:I

    if-gt p1, v2, :cond_3

    add-int/lit8 v2, v4, 0x1

    iget-object v3, p0, LB91;->b:Lq91;

    iget-object v3, v3, Lq91;->f:[LyB0;

    aget-object v3, v3, p1

    aput-object v3, v1, v4

    add-int/lit8 p1, p1, 0x1

    move v4, v2

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    iget-object p1, p2, LA91;->b:LyB0;

    aput-object p1, v1, v4

    :cond_4
    new-instance p1, Lq91;

    new-instance p2, LSl2;

    iget-object v0, p0, LB91;->b:Lq91;

    iget-object v0, v0, LSD1;->a:LSl2;

    invoke-direct {p2, v0}, LSl2;-><init>(LSl2;)V

    invoke-direct {p1, v1, p2}, Lq91;-><init>([LyB0;LSl2;)V

    return-object p1
.end method

.method public e()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LB91;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
