.class public LMu7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lzt7;


# instance fields
.field public volatile a:Lfv7;

.field public volatile b:Lkt7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lzt7;->a()Lzt7;

    move-result-object v0

    sput-object v0, LMu7;->c:Lzt7;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LMu7;->b:Lkt7;

    if-eqz v0, :cond_0

    iget-object v0, p0, LMu7;->b:Lkt7;

    check-cast v0, Lit7;

    iget-object v0, v0, Lit7;->f:[B

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, LMu7;->a:Lfv7;

    if-eqz v0, :cond_1

    iget-object v0, p0, LMu7;->a:Lfv7;

    invoke-interface {v0}, Lfv7;->w()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Lkt7;
    .locals 1

    iget-object v0, p0, LMu7;->b:Lkt7;

    if-eqz v0, :cond_0

    iget-object v0, p0, LMu7;->b:Lkt7;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LMu7;->b:Lkt7;

    if-eqz v0, :cond_1

    iget-object v0, p0, LMu7;->b:Lkt7;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, LMu7;->a:Lfv7;

    if-nez v0, :cond_2

    sget-object v0, Lkt7;->c:Lkt7;

    iput-object v0, p0, LMu7;->b:Lkt7;

    goto :goto_0

    :cond_2
    iget-object v0, p0, LMu7;->a:Lfv7;

    invoke-interface {v0}, Lfv7;->g()Lkt7;

    move-result-object v0

    iput-object v0, p0, LMu7;->b:Lkt7;

    :goto_0
    iget-object v0, p0, LMu7;->b:Lkt7;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(Lfv7;)Lfv7;
    .locals 2

    iget-object v0, p0, LMu7;->a:Lfv7;

    const/4 v1, 0x0

    iput-object v1, p0, LMu7;->b:Lkt7;

    iput-object p1, p0, LMu7;->a:Lfv7;

    return-object v0
.end method

.method public final d(Lfv7;)V
    .locals 1

    iget-object v0, p0, LMu7;->a:Lfv7;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LMu7;->a:Lfv7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :try_start_1
    iput-object p1, p0, LMu7;->a:Lfv7;

    sget-object v0, Lkt7;->c:Lkt7;

    iput-object v0, p0, LMu7;->b:Lkt7;
    :try_end_1
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, LMu7;->a:Lfv7;

    sget-object p1, Lkt7;->c:Lkt7;

    iput-object p1, p0, LMu7;->b:Lkt7;

    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LMu7;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LMu7;

    iget-object v0, p0, LMu7;->a:Lfv7;

    iget-object v1, p1, LMu7;->a:Lfv7;

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LMu7;->b()Lkt7;

    move-result-object v0

    invoke-virtual {p1}, LMu7;->b()Lkt7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkt7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    if-eqz v0, :cond_5

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    invoke-interface {v0}, Lgv7;->zzw()Lfv7;

    move-result-object v1

    invoke-virtual {p1, v1}, LMu7;->d(Lfv7;)V

    iget-object p1, p1, LMu7;->a:Lfv7;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    invoke-interface {v1}, Lgv7;->zzw()Lfv7;

    move-result-object p1

    invoke-virtual {p0, p1}, LMu7;->d(Lfv7;)V

    iget-object p1, p0, LMu7;->a:Lfv7;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
