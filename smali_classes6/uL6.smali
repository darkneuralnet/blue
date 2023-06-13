.class public final LuL6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:LhK6;


# instance fields
.field public final a:LpM6;

.field public final b:LsL6;

.field public final c:LdN6;

.field public final d:LFM6;

.field public final e:LKM6;

.field public final f:LOM6;

.field public final g:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "LfP6;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LvM6;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LhK6;

    const-string v1, "ExtractorLooper"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    sput-object v0, LuL6;->j:LhK6;

    return-void
.end method

.method public constructor <init>(LpM6;LoM6;LsL6;LdN6;LFM6;LKM6;LOM6;LvM6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpM6;",
            "LoM6<",
            "LfP6;",
            ">;",
            "LsL6;",
            "LdN6;",
            "LFM6;",
            "LKM6;",
            "LOM6;",
            "LvM6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuL6;->a:LpM6;

    iput-object p2, p0, LuL6;->g:LoM6;

    iput-object p3, p0, LuL6;->b:LsL6;

    iput-object p4, p0, LuL6;->c:LdN6;

    iput-object p5, p0, LuL6;->d:LFM6;

    iput-object p6, p0, LuL6;->e:LKM6;

    iput-object p7, p0, LuL6;->f:LOM6;

    iput-object p8, p0, LuL6;->h:LvM6;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LuL6;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    sget-object v0, LuL6;->j:LhK6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Run extractor loop"

    invoke-virtual {v0, v3, v2}, LhK6;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, LuL6;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_0
    :try_start_0
    iget-object v0, p0, LuL6;->h:LvM6;

    invoke-virtual {v0}, LvM6;->a()LtM6;

    move-result-object v0
    :try_end_0
    .catch LtL6; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v2, LuL6;->j:LhK6;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "Error while getting next extraction task: %s"

    invoke-virtual {v2, v5, v4}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget v2, v0, LtL6;->b:I

    const/4 v4, 0x0

    if-ltz v2, :cond_0

    iget-object v2, p0, LuL6;->g:LoM6;

    invoke-interface {v2}, LoM6;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LfP6;

    iget v5, v0, LtL6;->b:I

    invoke-interface {v2, v5}, LfP6;->a(I)V

    iget v2, v0, LtL6;->b:I

    invoke-virtual {p0, v2, v0}, LuL6;->b(ILjava/lang/Exception;)V

    :cond_0
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_6

    :try_start_1
    instance-of v2, v0, LrL6;

    if-eqz v2, :cond_1

    iget-object v2, p0, LuL6;->b:LsL6;

    move-object v4, v0

    check-cast v4, LrL6;

    invoke-virtual {v2, v4}, LsL6;->a(LrL6;)V

    goto :goto_0

    :cond_1
    instance-of v2, v0, LcN6;

    if-eqz v2, :cond_2

    iget-object v2, p0, LuL6;->c:LdN6;

    move-object v4, v0

    check-cast v4, LcN6;

    invoke-virtual {v2, v4}, LdN6;->a(LcN6;)V

    goto :goto_0

    :cond_2
    instance-of v2, v0, LEM6;

    if-eqz v2, :cond_3

    iget-object v2, p0, LuL6;->d:LFM6;

    move-object v4, v0

    check-cast v4, LEM6;

    invoke-virtual {v2, v4}, LFM6;->a(LEM6;)V

    goto :goto_0

    :cond_3
    instance-of v2, v0, LHM6;

    if-eqz v2, :cond_4

    iget-object v2, p0, LuL6;->e:LKM6;

    move-object v4, v0

    check-cast v4, LHM6;

    invoke-virtual {v2, v4}, LKM6;->a(LHM6;)V

    goto :goto_0

    :cond_4
    instance-of v2, v0, LNM6;

    if-eqz v2, :cond_5

    iget-object v2, p0, LuL6;->f:LOM6;

    move-object v4, v0

    check-cast v4, LNM6;

    invoke-virtual {v2, v4}, LOM6;->a(LNM6;)V

    goto :goto_0

    :cond_5
    sget-object v2, LuL6;->j:LhK6;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "Unknown task type: %s"

    invoke-virtual {v2, v5, v4}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    sget-object v4, LuL6;->j:LhK6;

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const-string v6, "Error during extraction task: %s"

    invoke-virtual {v4, v6, v5}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, p0, LuL6;->g:LoM6;

    invoke-interface {v4}, LoM6;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfP6;

    iget v5, v0, LtM6;->a:I

    invoke-interface {v4, v5}, LfP6;->a(I)V

    iget v0, v0, LtM6;->a:I

    invoke-virtual {p0, v0, v2}, LuL6;->b(ILjava/lang/Exception;)V

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, LuL6;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_7
    const-string v2, "runLoop already looping; return"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, LhK6;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final b(ILjava/lang/Exception;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LuL6;->a:LpM6;

    invoke-virtual {v0, p1}, LpM6;->o(I)V

    iget-object v0, p0, LuL6;->a:LpM6;

    invoke-virtual {v0, p1}, LpM6;->g(I)V
    :try_end_0
    .catch LtL6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    sget-object p1, LuL6;->j:LhK6;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v1

    const-string p2, "Error during error handling: %s"

    invoke-virtual {p1, p2, v0}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
