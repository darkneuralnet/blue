.class public final Lki8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final b:Ljava/lang/String;

.field public final synthetic c:Lxi8;


# direct methods
.method public constructor <init>(Lxi8;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lki8;->c:Lxi8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lki8;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic a(Lki8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lki8;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {p2}, LBM7;->d5(Landroid/os/IBinder;)LQM7;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lki8;->c:Lxi8;

    iget-object p1, p1, Lxi8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p2, "Install Referrer Service implementation was not found"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p2, p0, Lki8;->c:Lxi8;

    iget-object p2, p2, Lxi8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->s()Lec8;

    move-result-object p2

    const-string v0, "Install Referrer Service connected"

    invoke-virtual {p2, v0}, Lec8;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lki8;->c:Lxi8;

    iget-object p2, p2, Lxi8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->c()Ldn8;

    move-result-object p2

    new-instance v0, LVh8;

    invoke-direct {v0, p0, p1, p0}, LVh8;-><init>(Lki8;LQM7;Landroid/content/ServiceConnection;)V

    invoke-virtual {p2, v0}, Ldn8;->w(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lki8;->c:Lxi8;

    iget-object p2, p2, Lxi8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string v0, "Exception occurred while calling Install Referrer API"

    invoke-virtual {p2, v0, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lki8;->c:Lxi8;

    iget-object p1, p1, Lxi8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p2, "Install Referrer connection returned with null binder"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lki8;->c:Lxi8;

    iget-object p1, p1, Lxi8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string v0, "Install Referrer Service disconnected"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method
