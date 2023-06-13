.class public LCw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCw1$e;
    }
.end annotation


# static fields
.field public static final a:LvE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvE2<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/lang/Object;

.field public static final d:LNA5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LNA5<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lrz0<",
            "LCw1$e;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LvE2;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, LvE2;-><init>(I)V

    sput-object v0, LCw1;->a:LvE2;

    const/16 v0, 0xa

    const/16 v1, 0x2710

    const-string v2, "fonts-androidx"

    invoke-static {v2, v0, v1}, LJI4;->a(Ljava/lang/String;II)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, LCw1;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LCw1;->c:Ljava/lang/Object;

    new-instance v0, LNA5;

    invoke-direct {v0}, LNA5;-><init>()V

    sput-object v0, LCw1;->d:LNA5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lzw1;I)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lzw1;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(LLw1$a;)I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-virtual {p0}, LLw1$a;->c()I

    move-result v0

    const/4 v1, -0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LLw1$a;->c()I

    move-result p0

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, -0x2

    return p0

    :cond_1
    invoke-virtual {p0}, LLw1$a;->b()[LLw1$b;

    move-result-object p0

    if-eqz p0, :cond_5

    array-length v0, p0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_5

    aget-object v4, p0, v3

    invoke-virtual {v4}, LLw1$b;->b()I

    move-result v4

    if-eqz v4, :cond_4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    return v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v2
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;Lzw1;I)LCw1$e;
    .locals 3

    sget-object v0, LCw1;->a:LvE2;

    invoke-virtual {v0, p0}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LCw1$e;

    invoke-direct {p0, v1}, LCw1$e;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1, p2, v1}, Lyw1;->e(Landroid/content/Context;Lzw1;Landroid/os/CancellationSignal;)LLw1$a;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2}, LCw1;->b(LLw1$a;)I

    move-result v2

    if-eqz v2, :cond_1

    new-instance p0, LCw1$e;

    invoke-direct {p0, v2}, LCw1$e;-><init>(I)V

    return-object p0

    :cond_1
    invoke-virtual {p2}, LLw1$a;->b()[LLw1$b;

    move-result-object p2

    invoke-static {p1, v1, p2, p3}, LJb6;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[LLw1$b;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p0, p1}, LvE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, LCw1$e;

    invoke-direct {p0, p1}, LCw1$e;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_2
    new-instance p0, LCw1$e;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, LCw1$e;-><init>(I)V

    return-object p0

    :catch_0
    new-instance p0, LCw1$e;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, LCw1$e;-><init>(I)V

    return-object p0
.end method

.method public static d(Landroid/content/Context;Lzw1;ILjava/util/concurrent/Executor;LP80;)Landroid/graphics/Typeface;
    .locals 5

    invoke-static {p1, p2}, LCw1;->a(Lzw1;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LCw1;->a:LvE2;

    invoke-virtual {v1, v0}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LCw1$e;

    invoke-direct {p0, v1}, LCw1$e;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p4, p0}, LP80;->b(LCw1$e;)V

    return-object v1

    :cond_0
    new-instance v1, LCw1$b;

    invoke-direct {v1, p4}, LCw1$b;-><init>(LP80;)V

    sget-object p4, LCw1;->c:Ljava/lang/Object;

    monitor-enter p4

    :try_start_0
    sget-object v2, LCw1;->d:LNA5;

    invoke-virtual {v2, v0}, LNA5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p4

    return-object v4

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0, v3}, LNA5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p4, LCw1$c;

    invoke-direct {p4, v0, p0, p1, p2}, LCw1$c;-><init>(Ljava/lang/String;Landroid/content/Context;Lzw1;I)V

    if-nez p3, :cond_2

    sget-object p3, LCw1;->b:Ljava/util/concurrent/ExecutorService;

    :cond_2
    new-instance p0, LCw1$d;

    invoke-direct {p0, v0}, LCw1$d;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4, p0}, LJI4;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Lrz0;)V

    return-object v4

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static e(Landroid/content/Context;Lzw1;LP80;II)Landroid/graphics/Typeface;
    .locals 2

    invoke-static {p1, p3}, LCw1;->a(Lzw1;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LCw1;->a:LvE2;

    invoke-virtual {v1, v0}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LCw1$e;

    invoke-direct {p0, v1}, LCw1$e;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p2, p0}, LP80;->b(LCw1$e;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    invoke-static {v0, p0, p1, p3}, LCw1;->c(Ljava/lang/String;Landroid/content/Context;Lzw1;I)LCw1$e;

    move-result-object p0

    invoke-virtual {p2, p0}, LP80;->b(LCw1$e;)V

    iget-object p0, p0, LCw1$e;->a:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    new-instance v1, LCw1$a;

    invoke-direct {v1, v0, p0, p1, p3}, LCw1$a;-><init>(Ljava/lang/String;Landroid/content/Context;Lzw1;I)V

    :try_start_0
    sget-object p0, LCw1;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, v1, p4}, LJI4;->c(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LCw1$e;

    invoke-virtual {p2, p0}, LP80;->b(LCw1$e;)V

    iget-object p0, p0, LCw1$e;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, LCw1$e;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, LCw1$e;-><init>(I)V

    invoke-virtual {p2, p0}, LP80;->b(LCw1$e;)V

    const/4 p0, 0x0

    return-object p0
.end method
