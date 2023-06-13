.class public final Lou0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/function/BinaryOperator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/BinaryOperator<",
            "Lo0;",
            ">;"
        }
    .end annotation
.end field

.field public e:[Lo0;


# direct methods
.method public constructor <init>(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;Ljava/util/function/BinaryOperator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;",
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;",
            "Ljava/util/function/BiPredicate<",
            "Lo0;",
            "Lo0;",
            ">;",
            "Ljava/util/function/BinaryOperator<",
            "Lo0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou0;->a:Ljava/util/function/BiPredicate;

    iput-object p2, p0, Lou0;->b:Ljava/util/function/BiPredicate;

    iput-object p3, p0, Lou0;->c:Ljava/util/function/BiPredicate;

    iput-object p4, p0, Lou0;->d:Ljava/util/function/BinaryOperator;

    return-void
.end method

.method public static synthetic a(Lo0;Lo0;)Lo0;
    .locals 0

    invoke-static {p0, p1}, Lou0;->e(Lo0;Lo0;)Lo0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lou0;Lo0;Lo0;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lou0;->f(Lo0;Lo0;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lou0;[Lo0;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lou0;->g([Lo0;II)V

    return-void
.end method

.method public static synthetic d(Lou0;Lo0;Lo0;)Lo0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lou0;->h(Lo0;Lo0;)Lo0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lo0;Lo0;)Lo0;
    .locals 1

    new-instance v0, Lo0$c;

    invoke-direct {v0, p0, p1}, Lo0$c;-><init>(Lae6;Lae6;)V

    return-object v0
.end method

.method private synthetic f(Lo0;Lo0;)I
    .locals 3

    invoke-interface {p1}, Lae6;->d()Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-interface {p2}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lou0;->a:Ljava/util/function/BiPredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    return v1

    :cond_2
    invoke-interface {p2}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lou0;->b:Ljava/util/function/BiPredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    return v1
.end method

.method private synthetic g([Lo0;II)V
    .locals 1

    new-instance v0, Lnu0;

    invoke-direct {v0, p0}, Lnu0;-><init>(Lou0;)V

    invoke-static {p1, p2, p3, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    return-void
.end method

.method private synthetic h(Lo0;Lo0;)Lo0;
    .locals 1

    invoke-interface {p1}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-interface {p2}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, Lou0;->c:Ljava/util/function/BiPredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lou0;->d:Ljava/util/function/BinaryOperator;

    invoke-interface {v0, p1, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static j([Lo0;)Lo0;
    .locals 3

    if-eqz p0, :cond_2

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    aget-object p0, p0, v1

    return-object p0

    :cond_1
    new-instance v0, Lo0$c;

    aget-object v1, p0, v1

    aget-object v2, p0, v2

    invoke-direct {v0, v1, v2}, Lo0$c;-><init>(Lae6;Lae6;)V

    invoke-static {p0}, Ljava/util/Arrays;->stream([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object p0

    const-wide/16 v1, 0x2

    invoke-interface {p0, v1, v2}, Ljava/util/stream/Stream;->skip(J)Ljava/util/stream/Stream;

    move-result-object p0

    new-instance v1, Lju0;

    invoke-direct {v1}, Lju0;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/stream/Stream;->reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0;

    return-object p0

    :cond_2
    :goto_0
    sget-object p0, Lo0;->c:Lo0;

    return-object p0
.end method


# virtual methods
.method public i(Ljava/util/List;)Lo0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lae6;",
            ">;)",
            "Lo0;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lo0;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lo0;

    iput-object p1, p0, Lou0;->e:[Lo0;

    invoke-virtual {p0, p1}, Lou0;->k([Lo0;)V

    :goto_0
    invoke-virtual {p0}, Lou0;->l()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lou0;->e:[Lo0;

    invoke-virtual {p0, p1}, Lou0;->k([Lo0;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lou0;->e:[Lo0;

    invoke-static {p1}, Lou0;->j([Lo0;)Lo0;

    move-result-object p1

    return-object p1
.end method

.method public final k([Lo0;)V
    .locals 2

    new-instance v0, Llu0;

    invoke-direct {v0}, Llu0;-><init>()V

    invoke-static {p1, v0}, Lqu0;->a([Ljava/lang/Object;Ljava/util/function/Predicate;)Lqu0;

    move-result-object v0

    new-instance v1, Lmu0;

    invoke-direct {v1, p0, p1}, Lmu0;-><init>(Lou0;[Lo0;)V

    invoke-virtual {v0, v1}, Lqu0;->b(Lqu0$a;)V

    return-void
.end method

.method public final l()I
    .locals 2

    iget-object v0, p0, Lou0;->e:[Lo0;

    invoke-static {v0}, Lpu0;->a([Ljava/lang/Object;)Lpu0;

    move-result-object v0

    new-instance v1, Lku0;

    invoke-direct {v1, p0}, Lku0;-><init>(Lou0;)V

    invoke-virtual {v0, v1}, Lpu0;->c(Ljava/util/function/BinaryOperator;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0, v1}, Lpu0;->b(I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo0;

    iput-object v0, p0, Lou0;->e:[Lo0;

    :cond_0
    return v1
.end method
