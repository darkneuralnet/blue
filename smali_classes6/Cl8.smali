.class public final LCl8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Ldn8;


# direct methods
.method public constructor <init>(Ldn8;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LCl8;->b:Ldn8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LCl8;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, LCl8;->b:Ldn8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    iget-object v0, p0, LCl8;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
