.class public final Lcom/stripe/android/financialconnections/utils/ConflatedJob;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\tR\u0011\u0010\u000c\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/utils/ConflatedJob;",
        "",
        "Lzh2;",
        "newJob",
        "",
        "plusAssign",
        "cancel",
        "start",
        "job",
        "Lzh2;",
        "prevJob",
        "",
        "isActive",
        "()Z",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private job:Lzh2;

.field private prevJob:Lzh2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lzh2;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lzh2;

    iput-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->prevJob:Lzh2;

    return-void
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lzh2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzh2;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final declared-synchronized plusAssign(Lzh2;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "newJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->cancel()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lzh2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lzh2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzh2;->start()Z

    :cond_0
    return-void
.end method
