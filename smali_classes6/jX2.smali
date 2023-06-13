.class public final LjX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjX2$b;,
        LjX2$c;,
        LjX2$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LgX2;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgX2<",
            "**>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, LgX2;

    if-eqz v0, :cond_1

    check-cast p1, LgX2;

    invoke-interface {p0}, LgX2;->f()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, LgX2;->f()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(LZl1;LIZ3;)LYv5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LZl1<",
            "TK;TV;>;",
            "LIZ3<",
            "-",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, LXl1;->c()LIZ3;

    move-result-object v0

    invoke-static {v0, p1}, LJZ3;->b(LIZ3;LIZ3;)LIZ3;

    move-result-object p1

    new-instance v0, LUl1;

    invoke-interface {p0}, LZl1;->a()LYv5;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LUl1;-><init>(LYv5;LIZ3;)V

    return-object v0
.end method

.method public static c(LYv5;LIZ3;)LYv5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LYv5<",
            "TK;TV;>;",
            "LIZ3<",
            "-TK;>;)",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation

    instance-of v0, p0, LWl1;

    if-eqz v0, :cond_0

    check-cast p0, LWl1;

    new-instance v0, LWl1;

    invoke-virtual {p0}, LWl1;->a()LYv5;

    move-result-object v1

    iget-object p0, p0, LVl1;->h:LIZ3;

    invoke-static {p0, p1}, LJZ3;->b(LIZ3;LIZ3;)LIZ3;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LWl1;-><init>(LYv5;LIZ3;)V

    return-object v0

    :cond_0
    instance-of v0, p0, LZl1;

    if-eqz v0, :cond_1

    check-cast p0, LZl1;

    invoke-static {p1}, LaM2;->j(LIZ3;)LIZ3;

    move-result-object p1

    invoke-static {p0, p1}, LjX2;->b(LZl1;LIZ3;)LYv5;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, LWl1;

    invoke-direct {v0, p0, p1}, LWl1;-><init>(LYv5;LIZ3;)V

    return-object v0
.end method

.method public static d(Ljava/util/Map;LYU5;)LYv5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;",
            "LYU5<",
            "+",
            "Ljava/util/Set<",
            "TV;>;>;)",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LjX2$a;

    invoke-direct {v0, p0, p1}, LjX2$a;-><init>(Ljava/util/Map;LYU5;)V

    return-object v0
.end method
