.class public final Lg4$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg4$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lg4$b;


# direct methods
.method public constructor <init>(Lg4$b;)V
    .locals 0

    iput-object p1, p0, Lg4$b$a;->b:Lg4$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v0, :cond_1

    return-void

    :cond_1
    :try_start_1
    sget-object v0, Lg4;->l:Lg4;

    invoke-static {v0}, Lg4;->e(Lg4;)Lvv5;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lvv5;

    iget-object v2, p0, Lg4$b$a;->b:Lg4$b;

    iget-wide v2, v2, Lg4$b;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lvv5;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, Lg4;->n(Lg4;Lvv5;)V

    :cond_2
    invoke-static {v0}, Lg4;->f(Lg4;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-gtz v1, :cond_3

    iget-object v1, p0, Lg4$b$a;->b:Lg4$b;

    iget-object v1, v1, Lg4$b;->c:Ljava/lang/String;

    invoke-static {v0}, Lg4;->e(Lg4;)Lvv5;

    move-result-object v3

    invoke-static {v0}, Lg4;->b(Lg4;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lwv5;->e(Ljava/lang/String;Lvv5;Ljava/lang/String;)V

    sget-object v1, Lvv5;->g:Lvv5$a;

    invoke-virtual {v1}, Lvv5$a;->a()V

    invoke-static {v0, v2}, Lg4;->n(Lg4;Lvv5;)V

    :cond_3
    invoke-static {v0}, Lg4;->d(Lg4;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v0, v2}, Lg4;->m(Lg4;Ljava/util/concurrent/ScheduledFuture;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_2
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
