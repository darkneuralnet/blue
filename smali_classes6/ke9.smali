.class public final Lke9;
.super Lt89;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lt89<",
        "TV;>;",
        "Ljava/util/concurrent/RunnableFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public volatile i:LFb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFb9<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc69;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc69<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt89;-><init>()V

    new-instance v0, LUd9;

    invoke-direct {v0, p0, p1}, LUd9;-><init>(Lke9;Lc69;)V

    iput-object v0, p0, Lke9;->i:LFb9;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt89;-><init>()V

    new-instance v0, Lce9;

    invoke-direct {v0, p0, p1}, Lce9;-><init>(Lke9;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lke9;->i:LFb9;

    return-void
.end method

.method public static D(Ljava/lang/Runnable;Ljava/lang/Object;)Lke9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TV;)",
            "Lke9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lke9;

    invoke-static {p0, p1}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p0

    invoke-direct {v0, p0}, Lke9;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lke9;->i:LFb9;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x7

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "task=["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lv39;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, Lv39;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lke9;->i:LFb9;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LFb9;->g()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lke9;->i:LFb9;

    return-void
.end method

.method public final run()V
    .locals 1

    iget-object v0, p0, Lke9;->i:LFb9;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LFb9;->run()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lke9;->i:LFb9;

    return-void
.end method
