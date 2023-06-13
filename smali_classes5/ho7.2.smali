.class public final Lho7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Lho7;


# instance fields
.field public final a:Lfo7;

.field public final b:Lmo7;

.field public final c:Lko7;

.field public d:Lno7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgo7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lko7;

    invoke-direct {v0}, Lko7;-><init>()V

    iput-object v0, p0, Lho7;->c:Lko7;

    new-instance v1, Lmo7;

    invoke-direct {v1, p1}, Lmo7;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lho7;->b:Lmo7;

    new-instance p1, Lfo7;

    invoke-direct {p1, p2, v0}, Lfo7;-><init>(Lgo7;Lko7;)V

    iput-object p1, p0, Lho7;->a:Lfo7;

    return-void
.end method

.method public static declared-synchronized b()Lho7;
    .locals 4

    const-class v0, Lho7;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lho7;->e:Lho7;

    if-nez v1, :cond_0

    new-instance v1, Lho7;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    invoke-virtual {v2, v3}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, Loo7;->a:Lgo7;

    invoke-direct {v1, v2, v3}, Lho7;-><init>(Landroid/content/Context;Lgo7;)V

    sput-object v1, Lho7;->e:Lho7;

    :cond_0
    sget-object v1, Lho7;->e:Lho7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a()Ldo7;
    .locals 1

    iget-object v0, p0, Lho7;->d:Lno7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    iget-object v0, p0, Lho7;->d:Lno7;

    invoke-virtual {v0}, Lno7;->b()Ldo7;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    new-instance v0, Ljo7;

    invoke-direct {v0}, Ljo7;-><init>()V

    invoke-virtual {v0}, Ljo7;->g()V

    :try_start_0
    iget-object v1, p0, Lho7;->b:Lmo7;

    invoke-virtual {v1, v0}, Lmo7;->a(Ljo7;)Lno7;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, p0, Lho7;->d:Lno7;

    goto :goto_1

    :cond_0
    new-instance v1, Ljo7;

    invoke-direct {v1}, Ljo7;-><init>()V

    invoke-virtual {v1}, Ljo7;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Ldo7;

    invoke-static {}, Lio7;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ldo7;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lho7;->a:Lfo7;

    new-instance v4, Leo7;

    invoke-direct {v4, v3, v2, v1}, Leo7;-><init>(Lfo7;Ldo7;Ljo7;)V

    invoke-static {v4}, Ljp7;->a(Lip7;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lzm7;->h:Lzm7;

    invoke-virtual {v1, v2}, Ljo7;->d(Lzm7;)V

    sget-object v2, Lzm7;->e:Lzm7;

    invoke-virtual {v1, v2}, Ljo7;->d(Lzm7;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljo7;->e()V

    iget-object v2, p0, Lho7;->c:Lko7;

    sget-object v3, LWk7;->M1:LWk7;

    :goto_0
    invoke-virtual {v2, v3, v1}, Lko7;->a(LWk7;Ljo7;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object v2, p0, Lho7;->a:Lfo7;

    invoke-virtual {v2}, Lfo7;->a()Lno7;

    move-result-object v2

    iput-object v2, p0, Lho7;->d:Lno7;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lho7;->b:Lmo7;

    invoke-virtual {v3, v2, v1}, Lmo7;->c(Lno7;Ljo7;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljo7;->e()V

    iget-object v2, p0, Lho7;->c:Lko7;

    sget-object v3, LWk7;->M1:LWk7;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Ljo7;->e()V

    iget-object v1, p0, Lho7;->c:Lko7;

    sget-object v2, LWk7;->L1:LWk7;

    invoke-virtual {v1, v2, v0}, Lko7;->a(LWk7;Ljo7;)V

    return-void

    :catchall_0
    move-exception v2

    :try_start_5
    invoke-virtual {v1}, Ljo7;->e()V

    iget-object v3, p0, Lho7;->c:Lko7;

    sget-object v4, LWk7;->M1:LWk7;

    invoke-virtual {v3, v4, v1}, Lko7;->a(LWk7;Ljo7;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Ljo7;->e()V

    iget-object v2, p0, Lho7;->c:Lko7;

    sget-object v3, LWk7;->L1:LWk7;

    invoke-virtual {v2, v3, v0}, Lko7;->a(LWk7;Ljo7;)V

    throw v1
.end method
