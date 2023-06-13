.class public Ly91;
.super Lz91;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz91;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Lv91;)V
    .locals 1

    iget-object v0, p0, Lz91;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx91;

    if-nez v0, :cond_0

    new-instance v0, Lx91;

    invoke-direct {v0, p1}, Lx91;-><init>(Lv91;)V

    invoke-virtual {p0, p1, v0}, Lz91;->h(Lv91;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lx91;->m(Lv91;)V

    :goto_0
    return-void
.end method

.method public k(LP62;)V
    .locals 2

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx91;

    invoke-virtual {v1, p1}, Lx91;->o(LP62;)V

    goto :goto_0

    :cond_0
    return-void
.end method
