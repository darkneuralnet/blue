.class public final LUi$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUi;->h(LE1;LSi;)V
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
.field public final synthetic b:LE1;

.field public final synthetic c:LSi;


# direct methods
.method public constructor <init>(LE1;LSi;)V
    .locals 0

    iput-object p1, p0, LUi$a;->b:LE1;

    iput-object p2, p0, LUi$a;->c:LSi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    :try_start_1
    sget-object v0, LUi;->g:LUi;

    invoke-static {v0}, LUi;->a(LUi;)LTi;

    move-result-object v1

    iget-object v2, p0, LUi$a;->b:LE1;

    iget-object v3, p0, LUi$a;->c:LSi;

    invoke-virtual {v1, v2, v3}, LTi;->a(LE1;LSi;)V

    invoke-static {}, LXi;->d()LXi$a;

    move-result-object v1

    sget-object v2, LXi$a;->c:LXi$a;

    if-eq v1, v2, :cond_2

    invoke-static {v0}, LUi;->a(LUi;)LTi;

    move-result-object v1

    invoke-virtual {v1}, LTi;->d()I

    move-result v1

    invoke-static {v0}, LUi;->c(LUi;)I

    move-result v2

    if-le v1, v2, :cond_2

    sget-object v0, Lov1;->f:Lov1;

    invoke-static {v0}, LUi;->l(Lov1;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, LUi;->d(LUi;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {v0}, LUi;->e(LUi;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-static {v0}, LUi;->b(LUi;)Ljava/lang/Runnable;

    move-result-object v2

    const/16 v3, 0xf

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    invoke-static {v0, v1}, LUi;->g(LUi;Ljava/util/concurrent/ScheduledFuture;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
