.class public LXs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZs0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;LEs0;LOs0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LXs0;->c(Ljava/lang/String;LEs0;LOs0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;LEs0;LOs0;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-static {p0}, LSn1;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, LEs0;->h()LUs0;

    move-result-object p0

    invoke-interface {p0, p2}, LUs0;->a(LOs0;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LSn1;->a()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, LSn1;->a()V

    throw p0
.end method


# virtual methods
.method public a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ")",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEs0;

    invoke-virtual {v1}, LEs0;->i()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, LWs0;

    invoke-direct {v3, v2, v1}, LWs0;-><init>(Ljava/lang/String;LEs0;)V

    invoke-virtual {v1, v3}, LEs0;->t(LUs0;)LEs0;

    move-result-object v1

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
