.class public final Lqz7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:LmK7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lqz7;->a:Ljava/util/Map;

    new-instance v0, LmK7;

    invoke-direct {v0}, LmK7;-><init>()V

    iput-object v0, p0, Lqz7;->b:LmK7;

    new-instance v0, LMx7;

    invoke-direct {v0}, LMx7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LhA7;

    invoke-direct {v0}, LhA7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LUA7;

    invoke-direct {v0}, LUA7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LzE7;

    invoke-direct {v0}, LzE7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LII7;

    invoke-direct {v0}, LII7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LxJ7;

    invoke-direct {v0}, LxJ7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    new-instance v0, LJK7;

    invoke-direct {v0}, LJK7;-><init>()V

    invoke-virtual {p0, v0}, Lqz7;->b(LCy7;)V

    return-void
.end method


# virtual methods
.method public final a(Lam8;LXs7;)LXs7;
    .locals 2

    invoke-static {p1}, Lbt8;->c(Lam8;)I

    instance-of v0, p2, LLt7;

    if-eqz v0, :cond_1

    check-cast p2, LLt7;

    invoke-virtual {p2}, LLt7;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p2}, LLt7;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lqz7;->a:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqz7;->a:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCy7;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lqz7;->b:LmK7;

    :goto_0
    invoke-virtual {v1, p2, p1, v0}, LCy7;->a(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public final b(LCy7;)V
    .locals 3

    iget-object v0, p1, LCy7;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZK7;

    invoke-virtual {v1}, LZK7;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lqz7;->a:Ljava/util/Map;

    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
