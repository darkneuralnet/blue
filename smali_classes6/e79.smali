.class public final Le79;
.super LD49;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "LD49<",
        "Ljava/lang/Object;",
        "TV;>;"
    }
.end annotation


# instance fields
.field public p:LX69;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX69<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LXO8;ZLjava/util/concurrent/Executor;Lc69;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXO8<",
            "+",
            "LMb9<",
            "*>;>;Z",
            "Ljava/util/concurrent/Executor;",
            "Lc69<",
            "TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LD49;-><init>(LXO8;ZZ)V

    new-instance p1, LH69;

    invoke-direct {p1, p0, p4, p3}, LH69;-><init>(Le79;Lc69;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Le79;->p:LX69;

    invoke-virtual {p0}, LD49;->S()V

    return-void
.end method

.method public constructor <init>(LXO8;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXO8<",
            "+",
            "LMb9<",
            "*>;>;Z",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LD49;-><init>(LXO8;ZZ)V

    new-instance p1, LP69;

    invoke-direct {p1, p0, p4, p3}, LP69;-><init>(Le79;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Le79;->p:LX69;

    invoke-virtual {p0}, LD49;->S()V

    return-void
.end method

.method public static synthetic T(Le79;LX69;)LX69;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Le79;->p:LX69;

    return-object p1
.end method


# virtual methods
.method public final K(I)V
    .locals 1

    invoke-super {p0, p1}, LD49;->K(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Le79;->p:LX69;

    :cond_0
    return-void
.end method

.method public final R()V
    .locals 1

    iget-object v0, p0, Le79;->p:LX69;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LX69;->i()V

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Le79;->p:LX69;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LFb9;->g()V

    :cond_0
    return-void
.end method
