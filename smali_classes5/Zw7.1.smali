.class public final LZw7;
.super LPT7;
.source "SourceFile"


# instance fields
.field public final synthetic b:LEy7;


# direct methods
.method public constructor <init>(LEy7;)V
    .locals 0

    iput-object p1, p0, LZw7;->b:LEy7;

    invoke-direct {p0}, LPT7;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LZw7;->b:LEy7;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LZw7;->b:LEy7;

    iget-object v0, v0, LEy7;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LOx7;

    iget-object v1, p0, LZw7;->b:LEy7;

    invoke-direct {v0, v1}, LOx7;-><init>(LEy7;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, LPT7;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LZw7;->b:LEy7;

    iget-object v0, v0, LEy7;->f:LiG7;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LiG7;->m(LiG7;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
