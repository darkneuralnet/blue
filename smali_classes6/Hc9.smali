.class public final LHc9;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/concurrent/ExecutorService;)LTb9;
    .locals 1

    instance-of v0, p0, LTb9;

    if-eqz v0, :cond_0

    check-cast p0, LTb9;

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    new-instance v0, LAc9;

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0}, LAc9;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lhc9;

    invoke-direct {v0, p0}, Lhc9;-><init>(Ljava/util/concurrent/ExecutorService;)V

    :goto_0
    move-object p0, v0

    :goto_1
    return-object p0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ll79;->b:Ll79;

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Lcd9;

    invoke-direct {v0, p0}, Lcd9;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static d(Ljava/util/concurrent/Executor;Lv39;)Ljava/util/concurrent/Executor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lv39<",
            "*>;)",
            "Ljava/util/concurrent/Executor;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll79;->b:Ll79;

    if-ne p0, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lac9;

    invoke-direct {v0, p0, p1}, Lac9;-><init>(Ljava/util/concurrent/Executor;Lv39;)V

    return-object v0
.end method
