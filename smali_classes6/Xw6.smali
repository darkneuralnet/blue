.class public final LXw6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:Ljava/lang/Object;

.field public static c:LVw6;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, LXw6;->a:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LXw6;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Intent;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, LXw6;->e(Landroid/content/Intent;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    sget-object v0, LXw6;->c:LVw6;

    if-nez v0, :cond_0

    new-instance v0, LVw6;

    const-string v1, "wake:com.google.firebase.iid.WakeLockHolder"

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2, v1}, LVw6;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    sput-object v0, LXw6;->c:LVw6;

    invoke-virtual {v0, v2}, LVw6;->d(Z)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Intent;)V
    .locals 2

    sget-object v0, LXw6;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LXw6;->c:LVw6;

    if-eqz v1, :cond_0

    invoke-static {p0}, LXw6;->d(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {p0, v1}, LXw6;->g(Landroid/content/Intent;Z)V

    sget-object p0, LXw6;->c:LVw6;

    invoke-virtual {p0}, LVw6;->c()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static d(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Landroid/content/Intent;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0}, LXw6;->c(Landroid/content/Intent;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lcom/google/firebase/messaging/g;Landroid/content/Intent;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    sget-object v0, LXw6;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, LXw6;->b(Landroid/content/Context;)V

    invoke-static {p2}, LXw6;->d(Landroid/content/Intent;)Z

    move-result p0

    const/4 v1, 0x1

    invoke-static {p2, v1}, LXw6;->g(Landroid/content/Intent;Z)V

    if-nez p0, :cond_0

    sget-object p0, LXw6;->c:LVw6;

    sget-wide v1, LXw6;->a:J

    invoke-virtual {p0, v1, v2}, LVw6;->a(J)V

    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/firebase/messaging/g;->c(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, LWw6;

    invoke-direct {p1, p2}, LWw6;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static g(Landroid/content/Intent;Z)V
    .locals 1

    const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-void
.end method

.method public static h(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 3

    sget-object v0, LXw6;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, LXw6;->b(Landroid/content/Context;)V

    invoke-static {p1}, LXw6;->d(Landroid/content/Intent;)Z

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2}, LXw6;->g(Landroid/content/Intent;Z)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p0

    if-nez p0, :cond_0

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez v1, :cond_1

    sget-object p1, LXw6;->c:LVw6;

    sget-wide v1, LXw6;->a:J

    invoke-virtual {p1, v1, v2}, LVw6;->a(J)V

    :cond_1
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
