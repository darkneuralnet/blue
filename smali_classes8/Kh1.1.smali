.class public final LKh1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007*\u000c\u0008\u0007\u0010\u0008\"\u00020\u00012\u00020\u0001\u00a8\u0006\t"
    }
    d2 = {
        "Ljava/util/concurrent/ExecutorService;",
        "LEh1;",
        "b",
        "(Ljava/util/concurrent/ExecutorService;)LEh1;",
        "Ljava/util/concurrent/Executor;",
        "LSC0;",
        "a",
        "(Ljava/util/concurrent/Executor;)LSC0;",
        "CloseableCoroutineDispatcher",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/concurrent/Executor;)LSC0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "from"
    .end annotation

    instance-of v0, p0, LR41;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LR41;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LR41;->b:LSC0;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LFh1;

    invoke-direct {v0, p0}, LFh1;-><init>(Ljava/util/concurrent/Executor;)V

    :cond_2
    return-object v0
.end method

.method public static final b(Ljava/util/concurrent/ExecutorService;)LEh1;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "from"
    .end annotation

    new-instance v0, LFh1;

    invoke-direct {v0, p0}, LFh1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
