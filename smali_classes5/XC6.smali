.class public LXC6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:LQg1;

.field public final c:LFG6;

.field public final d:LBX5;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LQg1;LFG6;LBX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXC6;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LXC6;->b:LQg1;

    iput-object p3, p0, LXC6;->c:LFG6;

    iput-object p4, p0, LXC6;->d:LBX5;

    return-void
.end method

.method public static synthetic a(LXC6;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LXC6;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LXC6;)V
    .locals 0

    invoke-direct {p0}, LXC6;->e()V

    return-void
.end method

.method private synthetic d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LXC6;->b:LQg1;

    invoke-interface {v0}, LQg1;->S1()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT96;

    iget-object v2, p0, LXC6;->c:LFG6;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, LFG6;->a(LT96;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, LXC6;->d:LBX5;

    new-instance v1, LWC6;

    invoke-direct {v1, p0}, LWC6;-><init>(LXC6;)V

    invoke-interface {v0, v1}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, LXC6;->a:Ljava/util/concurrent/Executor;

    new-instance v1, LVC6;

    invoke-direct {v1, p0}, LVC6;-><init>(LXC6;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
