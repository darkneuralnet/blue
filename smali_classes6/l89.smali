.class public final Ll89;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:Ld89;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Leb9;->c:LMb9;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll89;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ld89;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld89;-><init>(Lt79;)V

    iput-object v0, p0, Ll89;->b:Ld89;

    return-void
.end method

.method public static synthetic a(Ll89;)Ld89;
    .locals 0

    iget-object p0, p0, Ll89;->b:Ld89;

    return-object p0
.end method

.method public static synthetic b(Ll89;Ld89;)Ld89;
    .locals 0

    iput-object p1, p0, Ll89;->b:Ld89;

    return-object p1
.end method

.method public static c()Ll89;
    .locals 1

    new-instance v0, Ll89;

    invoke-direct {v0}, Ll89;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final d(Lc69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc69<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, LW79;

    const/4 v0, 0x0

    invoke-direct {v6, p2, p0, v0}, LW79;-><init>(Ljava/util/concurrent/Executor;Ll89;Lt79;)V

    new-instance p2, LA79;

    invoke-direct {p2, p0, v6, p1}, LA79;-><init>(Ll89;LW79;Lc69;)V

    invoke-static {}, LMd9;->D()LMd9;

    move-result-object v3

    iget-object p1, p0, Ll89;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, LMb9;

    new-instance p1, Lke9;

    invoke-direct {p1, p2}, Lke9;-><init>(Lc69;)V

    invoke-interface {v4, p1, v6}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {p1}, Lva9;->h(LMb9;)LMb9;

    move-result-object p2

    new-instance v7, LI79;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, LI79;-><init>(Ll89;Lke9;LMd9;LMb9;LMb9;LW79;)V

    sget-object v0, Ll79;->b:Ll79;

    invoke-interface {p2, v7, v0}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v7, v0}, Lv39;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p2
.end method
