.class public LUS8;
.super LFJ8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LpU8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LUS8<",
        "TMessageType;TBuilderType;>;>",
        "LFJ8<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:LpU8;

.field public c:LpU8;


# direct methods
.method public constructor <init>(LpU8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, LFJ8;-><init>()V

    iput-object p1, p0, LUS8;->b:LpU8;

    invoke-virtual {p1}, LpU8;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LpU8;->l()LpU8;

    move-result-object p1

    iput-object p1, p0, LUS8;->c:LpU8;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, LR29;->a()LR29;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LR29;->b(Ljava/lang/Class;)LF39;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LF39;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic R1()Lr19;
    .locals 1

    invoke-virtual {p0}, LUS8;->r()LpU8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LUS8;->n()LUS8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()LFJ8;
    .locals 1

    invoke-virtual {p0}, LUS8;->n()LUS8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic j([BII)LFJ8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    const/4 p2, 0x0

    sget-object v0, LTQ8;->c:LTQ8;

    invoke-virtual {p0, p1, p2, p3, v0}, LUS8;->p([BIILTQ8;)LUS8;

    return-object p0
.end method

.method public final bridge synthetic k([BIILTQ8;)LFJ8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, LUS8;->p([BIILTQ8;)LUS8;

    return-object p0
.end method

.method public final n()LUS8;
    .locals 3

    iget-object v0, p0, LUS8;->b:LpU8;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LpU8;->A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUS8;

    invoke-virtual {p0}, LUS8;->r()LpU8;

    move-result-object v1

    iput-object v1, v0, LUS8;->c:LpU8;

    return-object v0
.end method

.method public final o(LpU8;)LUS8;
    .locals 1

    iget-object v0, p0, LUS8;->b:LpU8;

    invoke-virtual {v0, p1}, LpU8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-virtual {v0}, LpU8;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LUS8;->w()V

    :cond_0
    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-static {v0, p1}, LUS8;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final p([BIILTQ8;)LUS8;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    iget-object p2, p0, LUS8;->c:LpU8;

    invoke-virtual {p2}, LpU8;->y()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, LUS8;->w()V

    :cond_0
    :try_start_0
    invoke-static {}, LR29;->a()LR29;

    move-result-object p2

    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, LR29;->b(Ljava/lang/Class;)LF39;

    move-result-object v1

    iget-object v2, p0, LUS8;->c:LpU8;

    const/4 v4, 0x0

    new-instance v6, LzK8;

    invoke-direct {v6, p4}, LzK8;-><init>(LTQ8;)V

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, LF39;->e(Ljava/lang/Object;[BIILzK8;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzll; {:try_start_0 .. :try_end_0} :catch_2
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzll;->f()Lcom/google/android/gms/internal/measurement/zzll;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    throw p1
.end method

.method public final q()LpU8;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, LUS8;->r()LpU8;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LpU8;->A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Byte;

    invoke-virtual {v3}, Ljava/lang/Byte;->byteValue()B

    move-result v3

    if-ne v3, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_2

    invoke-static {}, LR29;->a()LR29;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, LR29;->b(Ljava/lang/Class;)LF39;

    move-result-object v3

    invoke-interface {v3, v0}, LF39;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eq v1, v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/4 v4, 0x2

    invoke-virtual {v0, v4, v1, v2}, LpU8;->A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    :goto_1
    return-object v0

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/measurement/zznj;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zznj;-><init>(Lr19;)V

    throw v1
.end method

.method public r()LpU8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-virtual {v0}, LpU8;->y()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LUS8;->c:LpU8;

    return-object v0

    :cond_0
    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-virtual {v0}, LpU8;->u()V

    iget-object v0, p0, LUS8;->c:LpU8;

    return-object v0
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    invoke-virtual {v0}, LpU8;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LUS8;->w()V

    :cond_0
    return-void
.end method

.method public w()V
    .locals 2

    iget-object v0, p0, LUS8;->b:LpU8;

    invoke-virtual {v0}, LpU8;->l()LpU8;

    move-result-object v0

    iget-object v1, p0, LUS8;->c:LpU8;

    invoke-static {v0, v1}, LUS8;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, LUS8;->c:LpU8;

    return-void
.end method
