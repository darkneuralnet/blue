.class public LIL8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lcom/google/android/gms/internal/vision/E;


# instance fields
.field public a:Lzy8;

.field public volatile b:LlQ8;

.field public volatile c:Lzy8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/vision/E;->b()Lcom/google/android/gms/internal/vision/E;

    move-result-object v0

    sput-object v0, LIL8;->d:Lcom/google/android/gms/internal/vision/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LlQ8;)LlQ8;
    .locals 2

    iget-object v0, p0, LIL8;->b:LlQ8;

    const/4 v1, 0x0

    iput-object v1, p0, LIL8;->a:Lzy8;

    iput-object v1, p0, LIL8;->c:Lzy8;

    iput-object p1, p0, LIL8;->b:LlQ8;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LIL8;->c:Lzy8;

    if-eqz v0, :cond_0

    iget-object v0, p0, LIL8;->c:Lzy8;

    invoke-virtual {v0}, Lzy8;->b()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LIL8;->b:LlQ8;

    if-eqz v0, :cond_1

    iget-object v0, p0, LIL8;->b:LlQ8;

    invoke-interface {v0}, LlQ8;->b()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c(LlQ8;)LlQ8;
    .locals 1

    iget-object v0, p0, LIL8;->b:LlQ8;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LIL8;->b:LlQ8;

    if-eqz v0, :cond_0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    :try_start_1
    iput-object p1, p0, LIL8;->b:LlQ8;

    sget-object v0, Lzy8;->c:Lzy8;

    iput-object v0, p0, LIL8;->c:Lzy8;
    :try_end_1
    .catch Lcom/google/android/gms/internal/vision/zzjk; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, LIL8;->b:LlQ8;

    sget-object p1, Lzy8;->c:Lzy8;

    iput-object p1, p0, LIL8;->c:Lzy8;

    :goto_0
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, LIL8;->b:LlQ8;

    return-object p1
.end method

.method public final d()Lzy8;
    .locals 1

    iget-object v0, p0, LIL8;->c:Lzy8;

    if-eqz v0, :cond_0

    iget-object v0, p0, LIL8;->c:Lzy8;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LIL8;->c:Lzy8;

    if-eqz v0, :cond_1

    iget-object v0, p0, LIL8;->c:Lzy8;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, LIL8;->b:LlQ8;

    if-nez v0, :cond_2

    sget-object v0, Lzy8;->c:Lzy8;

    iput-object v0, p0, LIL8;->c:Lzy8;

    goto :goto_0

    :cond_2
    iget-object v0, p0, LIL8;->b:LlQ8;

    invoke-interface {v0}, LlQ8;->zzg()Lzy8;

    move-result-object v0

    iput-object v0, p0, LIL8;->c:Lzy8;

    :goto_0
    iget-object v0, p0, LIL8;->c:Lzy8;

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
    instance-of v0, p1, LIL8;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LIL8;

    iget-object v0, p0, LIL8;->b:LlQ8;

    iget-object v1, p1, LIL8;->b:LlQ8;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, LIL8;->d()Lzy8;

    move-result-object v0

    invoke-virtual {p1}, LIL8;->d()Lzy8;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzy8;->equals(Ljava/lang/Object;)Z

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

    invoke-interface {v0}, LHQ8;->k()LlQ8;

    move-result-object v1

    invoke-virtual {p1, v1}, LIL8;->c(LlQ8;)LlQ8;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, LHQ8;->k()LlQ8;

    move-result-object p1

    invoke-virtual {p0, p1}, LIL8;->c(LlQ8;)LlQ8;

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
