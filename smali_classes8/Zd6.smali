.class public LZd6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtB0;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lo0;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lt80;->d()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LZd6;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic c(Lo0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LZd6;->i(Lo0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LZd6;Lo0;Lo0;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, LZd6;->h(Lo0;Lo0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lo0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LZd6;->j(Lo0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LZd6;Lo0;Lo0;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, LZd6;->g(Lo0;Lo0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lo0;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "no normal-form order defined for class \'%s\'"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lo0;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "no normal-form order defined for class \'%s\'"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lo0;Lo0;Ljava/util/function/BiPredicate;Ljava/util/function/BinaryOperator;)Lo0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0;",
            "Lo0;",
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;",
            "Ljava/util/function/BinaryOperator<",
            "Lo0;",
            ">;)",
            "Lo0;"
        }
    .end annotation

    invoke-interface {p1}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Lae6;->d()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2}, LZd6;->h(Lo0;Lo0;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1

    :cond_1
    return-object p2

    :cond_2
    invoke-interface {p2}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p1

    :cond_3
    invoke-interface {p3, p1, p2}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p4, p1, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0;

    return-object p1

    :cond_4
    invoke-interface {p1}, Lae6;->D()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Lae6;->D()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_1
    if-eqz v0, :cond_6

    invoke-virtual {p0, p1, p2}, LZd6;->g(Lo0;Lo0;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_2
    if-eqz v1, :cond_7

    new-instance v0, Lo0$c;

    invoke-direct {v0, p2, p1}, Lo0$c;-><init>(Lae6;Lae6;)V

    goto :goto_3

    :cond_7
    new-instance v0, Lo0$c;

    invoke-direct {v0, p1, p2}, Lo0$c;-><init>(Lae6;Lae6;)V

    :goto_3
    new-instance p1, Lou0;

    new-instance p2, LVd6;

    invoke-direct {p2, p0}, LVd6;-><init>(LZd6;)V

    new-instance v1, LWd6;

    invoke-direct {v1, p0}, LWd6;-><init>(LZd6;)V

    invoke-direct {p1, p2, v1, p3, p4}, Lou0;-><init>(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;Ljava/util/function/BinaryOperator;)V

    invoke-virtual {v0}, Lo0;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lou0;->i(Ljava/util/List;)Lo0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lo0;Lo0;)Z
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of v0, p1, LUY3;

    if-eqz v0, :cond_1

    check-cast p1, LUY3;

    invoke-virtual {p1}, LUY3;->m()I

    move-result p1

    check-cast p2, LUY3;

    invoke-virtual {p2}, LUY3;->m()I

    move-result p2

    if-gt p1, p2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    iget-object v0, p0, LZd6;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    new-instance v3, LXd6;

    invoke-direct {v3, p1}, LXd6;-><init>(Lo0;)V

    invoke-static {v0, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    iget-object p1, p0, LZd6;->a:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    new-instance v3, LYd6;

    invoke-direct {v3, p2}, LYd6;-><init>(Lo0;)V

    invoke-static {p1, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-gt p2, p1, :cond_3

    move v1, v2

    :cond_3
    return v1
.end method

.method public final h(Lo0;Lo0;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LZd6;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, LZd6;->a:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-gt p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
