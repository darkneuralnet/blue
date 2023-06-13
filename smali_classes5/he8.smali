.class public final Lhe8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqz7;

.field public final b:Lam8;

.field public final c:Lam8;

.field public final d:LpH8;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqz7;

    invoke-direct {v0}, Lqz7;-><init>()V

    iput-object v0, p0, Lhe8;->a:Lqz7;

    new-instance v1, Lam8;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lam8;-><init>(Lam8;Lqz7;)V

    iput-object v1, p0, Lhe8;->c:Lam8;

    invoke-virtual {v1}, Lam8;->a()Lam8;

    move-result-object v0

    iput-object v0, p0, Lhe8;->b:Lam8;

    new-instance v0, LpH8;

    invoke-direct {v0}, LpH8;-><init>()V

    iput-object v0, p0, Lhe8;->d:LpH8;

    new-instance v2, LBv9;

    invoke-direct {v2, v0}, LBv9;-><init>(LpH8;)V

    const-string v3, "require"

    invoke-virtual {v1, v3, v2}, Lam8;->g(Ljava/lang/String;LXs7;)V

    const-string v2, "internal.platform"

    sget-object v3, LZ58;->b:LZ58;

    invoke-virtual {v0, v2, v3}, LpH8;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v0, Lkm7;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v0, v2}, Lkm7;-><init>(Ljava/lang/Double;)V

    const-string v2, "runtime.counter"

    invoke-virtual {v1, v2, v0}, Lam8;->g(Ljava/lang/String;LXs7;)V

    return-void
.end method


# virtual methods
.method public final varargs a(Lam8;[LDs8;)LXs7;
    .locals 4

    sget-object v0, LXs7;->h0:LXs7;

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v0, p2, v2

    invoke-static {v0}, LeA8;->a(LDs8;)LXs7;

    move-result-object v0

    iget-object v3, p0, Lhe8;->c:Lam8;

    invoke-static {v3}, Lbt8;->c(Lam8;)I

    instance-of v3, v0, LLt7;

    if-nez v3, :cond_0

    instance-of v3, v0, Lhs7;

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lhe8;->a:Lqz7;

    invoke-virtual {v3, p1, v0}, Lqz7;->a(Lam8;LXs7;)LXs7;

    move-result-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
