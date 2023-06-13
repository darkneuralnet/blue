.class public final LBv9;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:LpH8;

.field public final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(LpH8;)V
    .locals 1

    const-string v0, "require"

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LBv9;->e:Ljava/util/Map;

    iput-object p1, p0, LBv9;->d:LpH8;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 2

    const-string v0, "require"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {p1, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LBv9;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LBv9;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    return-object p1

    :cond_0
    iget-object p2, p0, LBv9;->d:LpH8;

    iget-object v0, p2, LpH8;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, LpH8;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Callable;

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to create API implementation: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    sget-object p2, LXs7;->h0:LXs7;

    :goto_0
    instance-of v0, p2, Len7;

    if-eqz v0, :cond_2

    iget-object v0, p0, LBv9;->e:Ljava/util/Map;

    move-object v1, p2

    check-cast v1, Len7;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object p2
.end method
