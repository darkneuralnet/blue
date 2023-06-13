.class public LN83;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;

.field public b:LJ83;


# direct methods
.method public constructor <init>(LJ83;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, LN83;->a:Ljava/util/Map;

    iput-object p1, p0, LN83;->b:LJ83;

    return-void
.end method


# virtual methods
.method public a(Lv91;)V
    .locals 1

    invoke-virtual {p1}, Lv91;->c()LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LN83;->b(LyB0;)LD83;

    move-result-object v0

    invoke-virtual {v0, p1}, LD83;->i(Lv91;)V

    return-void
.end method

.method public b(LyB0;)LD83;
    .locals 2

    iget-object v0, p0, LN83;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD83;

    if-nez v0, :cond_0

    iget-object v0, p0, LN83;->b:LJ83;

    invoke-virtual {v0, p1}, LJ83;->a(LyB0;)LD83;

    move-result-object v0

    iget-object v1, p0, LN83;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public c(LyB0;)LD83;
    .locals 1

    iget-object v0, p0, LN83;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD83;

    return-object p1
.end method

.method public d(I)Ljava/util/Collection;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LN83;->e()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD83;

    invoke-virtual {v2}, LSD1;->b()LSl2;

    move-result-object v3

    invoke-virtual {v3, p1}, LSl2;->d(I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public e()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LN83;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LN83;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
