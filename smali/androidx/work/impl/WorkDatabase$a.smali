.class public final Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase$a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ljava/util/concurrent/Executor;",
        "queryExecutor",
        "",
        "useTestDatabase",
        "Landroidx/work/impl/WorkDatabase;",
        "b",
        "<init>",
        "()V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;LnV5$b;)LnV5;
    .locals 0

    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$a;->c(Landroid/content/Context;LnV5$b;)LnV5;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;LnV5$b;)LnV5;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LnV5$b;->f:LnV5$b$b;

    invoke-virtual {v0, p0}, LnV5$b$b;->a(Landroid/content/Context;)LnV5$b$a;

    move-result-object p0

    iget-object v0, p1, LnV5$b;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, LnV5$b$a;->d(Ljava/lang/String;)LnV5$b$a;

    move-result-object v0

    iget-object p1, p1, LnV5$b;->c:LnV5$a;

    invoke-virtual {v0, p1}, LnV5$b$a;->c(LnV5$a;)LnV5$b$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LnV5$b$a;->e(Z)LnV5$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, LnV5$b$a;->a(Z)LnV5$b$a;

    new-instance p1, LWy1;

    invoke-direct {p1}, LWy1;-><init>()V

    invoke-virtual {p0}, LnV5$b$a;->b()LnV5$b;

    move-result-object p0

    invoke-virtual {p1, p0}, LWy1;->a(LnV5$b;)LnV5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Landroidx/work/impl/WorkDatabase;

    if-eqz p3, :cond_0

    invoke-static {p1, v0}, LDb5;->c(Landroid/content/Context;Ljava/lang/Class;)LEb5$a;

    move-result-object p3

    invoke-virtual {p3}, LEb5$a;->c()LEb5$a;

    move-result-object p3

    goto :goto_0

    :cond_0
    const-string p3, "androidx.work.workdb"

    invoke-static {p1, v0, p3}, LDb5;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LEb5$a;

    move-result-object p3

    new-instance v0, LKC6;

    invoke-direct {v0, p1}, LKC6;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, LEb5$a;->f(LnV5$c;)LEb5$a;

    move-result-object p3

    :goto_0
    invoke-virtual {p3, p2}, LEb5$a;->g(Ljava/util/concurrent/Executor;)LEb5$a;

    move-result-object p2

    sget-object p3, LQj0;->a:LQj0;

    invoke-virtual {p2, p3}, LEb5$a;->a(LEb5$b;)LEb5$a;

    move-result-object p2

    const/4 p3, 0x1

    new-array v0, p3, [LcU2;

    sget-object v1, LgU2;->c:LgU2;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    new-instance v1, LZJ4;

    const/4 v3, 0x2

    const/4 v4, 0x3

    invoke-direct {v1, p1, v3, v4}, LZJ4;-><init>(Landroid/content/Context;II)V

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    sget-object v1, LhU2;->c:LhU2;

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    sget-object v1, LiU2;->c:LiU2;

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    new-instance v1, LZJ4;

    const/4 v3, 0x5

    const/4 v4, 0x6

    invoke-direct {v1, p1, v3, v4}, LZJ4;-><init>(Landroid/content/Context;II)V

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    sget-object v1, LjU2;->c:LjU2;

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    sget-object v1, LkU2;->c:LkU2;

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    sget-object v1, LlU2;->c:LlU2;

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    new-instance v1, LcD6;

    invoke-direct {v1, p1}, LcD6;-><init>(Landroid/content/Context;)V

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p2

    new-array v0, p3, [LcU2;

    new-instance v1, LZJ4;

    const/16 v3, 0xa

    const/16 v4, 0xb

    invoke-direct {v1, p1, v3, v4}, LZJ4;-><init>(Landroid/content/Context;II)V

    aput-object v1, v0, v2

    invoke-virtual {p2, v0}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p1

    new-array p2, p3, [LcU2;

    sget-object v0, LdU2;->c:LdU2;

    aput-object v0, p2, v2

    invoke-virtual {p1, p2}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p1

    new-array p2, p3, [LcU2;

    sget-object v0, LeU2;->c:LeU2;

    aput-object v0, p2, v2

    invoke-virtual {p1, p2}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p1

    new-array p2, p3, [LcU2;

    sget-object p3, LfU2;->c:LfU2;

    aput-object p3, p2, v2

    invoke-virtual {p1, p2}, LEb5$a;->b([LcU2;)LEb5$a;

    move-result-object p1

    invoke-virtual {p1}, LEb5$a;->e()LEb5$a;

    move-result-object p1

    invoke-virtual {p1}, LEb5$a;->d()LEb5;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    return-object p1
.end method
