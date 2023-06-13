.class public Lcom/google/android/gms/internal/vision/G$b;
.super LRu8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/vision/G<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/vision/G$b<",
        "TMessageType;TBuilderType;>;>",
        "LRu8<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/gms/internal/vision/G;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:Lcom/google/android/gms/internal/vision/G;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/vision/G;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, LRu8;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/vision/G$b;->b:Lcom/google/android/gms/internal/vision/G;

    sget v0, Lcom/google/android/gms/internal/vision/G$f;->d:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/vision/G;->l(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/vision/G;

    iput-object p1, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    return-void
.end method

.method public static n(Lcom/google/android/gms/internal/vision/G;Lcom/google/android/gms/internal/vision/G;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LeT8;->a()LeT8;

    move-result-object v0

    invoke-virtual {v0, p0}, LeT8;->c(Ljava/lang/Object;)LzU8;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LzU8;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->b:Lcom/google/android/gms/internal/vision/G;

    sget v1, Lcom/google/android/gms/internal/vision/G$f;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/vision/G;->l(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/G$b;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->zze()LlQ8;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/vision/G$b;->m(Lcom/google/android/gms/internal/vision/G;)Lcom/google/android/gms/internal/vision/G$b;

    return-object v0
.end method

.method public final synthetic f()LRu8;
    .locals 1

    invoke-virtual {p0}, LRu8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/G$b;

    return-object v0
.end method

.method public final synthetic g(Lcom/google/android/gms/internal/vision/C;)LRu8;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/G$b;->m(Lcom/google/android/gms/internal/vision/G;)Lcom/google/android/gms/internal/vision/G$b;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j(LWB8;Lcom/google/android/gms/internal/vision/E;)LRu8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/G$b;->o(LWB8;Lcom/google/android/gms/internal/vision/E;)Lcom/google/android/gms/internal/vision/G$b;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k()LlQ8;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->b:Lcom/google/android/gms/internal/vision/G;

    return-object v0
.end method

.method public final synthetic l([BIILcom/google/android/gms/internal/vision/E;)LRu8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/vision/zzjk;
        }
    .end annotation

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/vision/G$b;->p([BIILcom/google/android/gms/internal/vision/E;)Lcom/google/android/gms/internal/vision/G$b;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lcom/google/android/gms/internal/vision/G;)Lcom/google/android/gms/internal/vision/G$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/vision/G$b;->n(Lcom/google/android/gms/internal/vision/G;Lcom/google/android/gms/internal/vision/G;)V

    return-object p0
.end method

.method public final o(LWB8;Lcom/google/android/gms/internal/vision/E;)Lcom/google/android/gms/internal/vision/G$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB8;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TBuilderType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    :try_start_0
    invoke-static {}, LeT8;->a()LeT8;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {v0, v1}, LeT8;->c(Ljava/lang/Object;)LzU8;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-static {p1}, LiC8;->I(LWB8;)LiC8;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, LzU8;->d(Ljava/lang/Object;LIU8;Lcom/google/android/gms/internal/vision/E;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    :cond_1
    throw p1
.end method

.method public final p([BIILcom/google/android/gms/internal/vision/E;)Lcom/google/android/gms/internal/vision/G$b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TBuilderType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/vision/zzjk;
        }
    .end annotation

    iget-boolean p2, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    :try_start_0
    invoke-static {}, LeT8;->a()LeT8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {p2, v0}, LeT8;->c(Ljava/lang/Object;)LzU8;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    const/4 v4, 0x0

    new-instance v6, Lgx8;

    invoke-direct {v6, p4}, Lgx8;-><init>(Lcom/google/android/gms/internal/vision/E;)V

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, LzU8;->e(Ljava/lang/Object;[BIILgx8;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/vision/zzjk; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->a()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    throw p1
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    sget v1, Lcom/google/android/gms/internal/vision/G$f;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/vision/G;->l(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/G;

    iget-object v1, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/vision/G$b;->n(Lcom/google/android/gms/internal/vision/G;Lcom/google/android/gms/internal/vision/G;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    return-void
.end method

.method public r()Lcom/google/android/gms/internal/vision/G;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    invoke-static {}, LeT8;->a()LeT8;

    move-result-object v1

    invoke-virtual {v1, v0}, LeT8;->c(Ljava/lang/Object;)LzU8;

    move-result-object v1

    invoke-interface {v1, v0}, LzU8;->zzc(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    return-object v0
.end method

.method public final t()Lcom/google/android/gms/internal/vision/G;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->zze()LlQ8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/G;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/vision/zzlv;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/vision/zzlv;-><init>(LlQ8;)V

    throw v1
.end method

.method public synthetic x()LlQ8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->t()Lcom/google/android/gms/internal/vision/G;

    move-result-object v0

    return-object v0
.end method

.method public synthetic zze()LlQ8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->r()Lcom/google/android/gms/internal/vision/G;

    move-result-object v0

    return-object v0
.end method
