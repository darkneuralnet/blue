.class public LvW7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LwN7;


# instance fields
.field public a:LTD7;

.field public volatile b:LH28;

.field public volatile c:LTD7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LwN7;->b()LwN7;

    move-result-object v0

    sput-object v0, LvW7;->d:LwN7;

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

    iget-object v0, p0, LvW7;->c:LTD7;

    if-eqz v0, :cond_0

    iget-object v0, p0, LvW7;->c:LTD7;

    invoke-virtual {v0}, LTD7;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LvW7;->b:LH28;

    if-eqz v0, :cond_1

    iget-object v0, p0, LvW7;->b:LH28;

    invoke-interface {v0}, LH28;->o()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final b(LH28;)LH28;
    .locals 1

    iget-object v0, p0, LvW7;->b:LH28;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LvW7;->b:LH28;

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    :try_start_1
    iput-object p1, p0, LvW7;->b:LH28;

    sget-object v0, LTD7;->c:LTD7;

    iput-object v0, p0, LvW7;->c:LTD7;
    :try_end_1
    .catch Lcom/google/android/gms/internal/clearcut/zzco; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, LvW7;->b:LH28;

    sget-object p1, LTD7;->c:LTD7;

    iput-object p1, p0, LvW7;->c:LTD7;

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, LvW7;->b:LH28;

    return-object p1
.end method

.method public final c(LH28;)LH28;
    .locals 2

    iget-object v0, p0, LvW7;->b:LH28;

    const/4 v1, 0x0

    iput-object v1, p0, LvW7;->a:LTD7;

    iput-object v1, p0, LvW7;->c:LTD7;

    iput-object p1, p0, LvW7;->b:LH28;

    return-object v0
.end method

.method public final d()LTD7;
    .locals 1

    iget-object v0, p0, LvW7;->c:LTD7;

    if-eqz v0, :cond_0

    iget-object v0, p0, LvW7;->c:LTD7;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LvW7;->c:LTD7;

    if-eqz v0, :cond_1

    iget-object v0, p0, LvW7;->c:LTD7;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, LvW7;->b:LH28;

    if-nez v0, :cond_2

    sget-object v0, LTD7;->c:LTD7;

    :goto_0
    iput-object v0, p0, LvW7;->c:LTD7;

    goto :goto_1

    :cond_2
    iget-object v0, p0, LvW7;->b:LH28;

    invoke-interface {v0}, LH28;->k()LTD7;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, LvW7;->c:LTD7;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LvW7;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LvW7;

    iget-object v0, p0, LvW7;->b:LH28;

    iget-object v1, p1, LvW7;->b:LH28;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, LvW7;->d()LTD7;

    move-result-object v0

    invoke-virtual {p1}, LvW7;->d()LTD7;

    move-result-object p1

    invoke-virtual {v0, p1}, LTD7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lk38;->v()LH28;

    move-result-object v1

    invoke-virtual {p1, v1}, LvW7;->b(LH28;)LH28;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lk38;->v()LH28;

    move-result-object p1

    invoke-virtual {p0, p1}, LvW7;->b(LH28;)LH28;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
