.class public Landroidx/work/impl/background/systemalarm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAh1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/background/systemalarm/d$c;,
        Landroidx/work/impl/background/systemalarm/d$b;,
        Landroidx/work/impl/background/systemalarm/d$d;
    }
.end annotation


# static fields
.field public static final l:Ljava/lang/String;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LmZ5;

.field public final d:LOG6;

.field public final e:Li74;

.field public final f:LaD6;

.field public final g:Landroidx/work/impl/background/systemalarm/a;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroid/content/Intent;

.field public j:Landroidx/work/impl/background/systemalarm/d$c;

.field public k:LjP5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemAlarmDispatcher"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemalarm/d;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Landroidx/work/impl/background/systemalarm/d;-><init>(Landroid/content/Context;Li74;LaD6;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li74;LaD6;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->b:Landroid/content/Context;

    new-instance v1, LjP5;

    invoke-direct {v1}, LjP5;-><init>()V

    iput-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->k:LjP5;

    new-instance v1, Landroidx/work/impl/background/systemalarm/a;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->k:LjP5;

    invoke-direct {v1, v0, v2}, Landroidx/work/impl/background/systemalarm/a;-><init>(Landroid/content/Context;LjP5;)V

    iput-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->g:Landroidx/work/impl/background/systemalarm/a;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LaD6;->p(Landroid/content/Context;)LaD6;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/d;->f:LaD6;

    new-instance p1, LOG6;

    invoke-virtual {p3}, LaD6;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->k()Lfd5;

    move-result-object v0

    invoke-direct {p1, v0}, LOG6;-><init>(Lfd5;)V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d;->d:LOG6;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, LaD6;->r()Li74;

    move-result-object p2

    :goto_1
    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/d;->e:Li74;

    invoke-virtual {p3}, LaD6;->v()LmZ5;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d;->c:LmZ5;

    invoke-virtual {p2, p0}, Li74;->g(LAh1;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d;->i:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;I)Z
    .locals 4

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/d;->l:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding command "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->b()V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    const-string p2, "Unknown command. Ignoring"

    invoke-virtual {p1, v1, p2}, LBx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_0
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {p0, v0}, Landroidx/work/impl/background/systemalarm/d;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v3

    :cond_1
    const-string v0, "KEY_START_ID"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    move v3, v1

    :cond_2
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v3, :cond_3

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->k()V

    :cond_3
    monitor-exit p2

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Needs to be invoked on the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 5

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/d;->l:Ljava/lang/String;

    const-string v2, "Checking if commands are complete."

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->b()V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->i:Landroid/content/Intent;

    if-eqz v2, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Removing command "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/d;->i:Landroid/content/Intent;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/d;->i:Landroid/content/Intent;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->i:Landroid/content/Intent;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Dequeue-d command is not the first."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->c:LmZ5;

    invoke-interface {v2}, LmZ5;->c()LRs5;

    move-result-object v2

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/d;->g:Landroidx/work/impl/background/systemalarm/a;

    invoke-virtual {v3}, Landroidx/work/impl/background/systemalarm/a;->n()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, LRs5;->v()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    const-string v3, "No more commands & intents."

    invoke-virtual {v2, v1, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->j:Landroidx/work/impl/background/systemalarm/d$c;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroidx/work/impl/background/systemalarm/d$c;->b()V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->k()V

    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(LTC6;Z)V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->c:LmZ5;

    invoke-interface {v0}, LmZ5;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Landroidx/work/impl/background/systemalarm/d$b;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/d;->b:Landroid/content/Context;

    invoke-static {v2, p1, p2}, Landroidx/work/impl/background/systemalarm/a;->c(Landroid/content/Context;LTC6;Z)Landroid/content/Intent;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v1, p0, p1, p2}, Landroidx/work/impl/background/systemalarm/d$b;-><init>(Landroidx/work/impl/background/systemalarm/d;Landroid/content/Intent;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()Li74;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->e:Li74;

    return-object v0
.end method

.method public f()LmZ5;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->c:LmZ5;

    return-object v0
.end method

.method public g()LaD6;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->f:LaD6;

    return-object v0
.end method

.method public h()LOG6;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->d:LOG6;

    return-object v0
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->b()V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j()V
    .locals 3

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/d;->l:Ljava/lang/String;

    const-string v2, "Destroying SystemAlarmDispatcher"

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->e:Li74;

    invoke-virtual {v0, p0}, Li74;->n(LAh1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->j:Landroidx/work/impl/background/systemalarm/d$c;

    return-void
.end method

.method public final k()V
    .locals 3

    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/d;->b()V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->b:Landroid/content/Context;

    const-string v1, "ProcessCommand"

    invoke-static {v0, v1}, LYw6;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d;->f:LaD6;

    invoke-virtual {v1}, LaD6;->v()LmZ5;

    move-result-object v1

    new-instance v2, Landroidx/work/impl/background/systemalarm/d$a;

    invoke-direct {v2, p0}, Landroidx/work/impl/background/systemalarm/d$a;-><init>(Landroidx/work/impl/background/systemalarm/d;)V

    invoke-interface {v1, v2}, LmZ5;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    throw v1
.end method

.method public l(Landroidx/work/impl/background/systemalarm/d$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d;->j:Landroidx/work/impl/background/systemalarm/d$c;

    if-eqz v0, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, Landroidx/work/impl/background/systemalarm/d;->l:Ljava/lang/String;

    const-string v1, "A completion listener for SystemAlarmDispatcher already exists."

    invoke-virtual {p1, v0, v1}, LBx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d;->j:Landroidx/work/impl/background/systemalarm/d$c;

    return-void
.end method
