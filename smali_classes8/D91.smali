.class public LD91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;

.field public b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LD91;->a:Ljava/util/List;

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, LD91;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lq91;)V
    .locals 2

    iget-object v0, p0, LD91;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, LJy3;

    invoke-virtual {p1}, Lq91;->n()[LyB0;

    move-result-object v1

    invoke-direct {v0, v1}, LJy3;-><init>([LyB0;)V

    iget-object v1, p0, LD91;->b:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/util/Collection;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    invoke-virtual {p0, v0}, LD91;->a(Lq91;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lq91;)Lq91;
    .locals 1

    new-instance v0, LJy3;

    invoke-virtual {p1}, Lq91;->n()[LyB0;

    move-result-object p1

    invoke-direct {v0, p1}, LJy3;-><init>([LyB0;)V

    iget-object p1, p0, LD91;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq91;

    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD91;->a:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LD91;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
