.class public Lcom/google/android/gms/internal/clearcut/c$a;
.super Lgw7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/clearcut/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/clearcut/c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/clearcut/c$a<",
        "TMessageType;TBuilderType;>;>",
        "Lgw7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/gms/internal/clearcut/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:Lcom/google/android/gms/internal/clearcut/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/clearcut/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lgw7;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/c$a;->b:Lcom/google/android/gms/internal/clearcut/c;

    sget v0, Lcom/google/android/gms/internal/clearcut/c$e;->d:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/clearcut/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/clearcut/c$a;->d:Z

    return-void
.end method

.method public static g(Lcom/google/android/gms/internal/clearcut/c;Lcom/google/android/gms/internal/clearcut/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LY68;->a()LY68;

    move-result-object v0

    invoke-virtual {v0, p0}, LY68;->d(Ljava/lang/Object;)Lx88;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lx88;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final synthetic L1()LH28;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->c2()LH28;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/c;

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, LY68;->a()LY68;

    move-result-object v1

    invoke-virtual {v1, v0}, LY68;->d(Ljava/lang/Object;)Lx88;

    move-result-object v1

    invoke-interface {v1, v0}, Lx88;->g(Ljava/lang/Object;)Z

    move-result v3

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->b:I

    if-eqz v3, :cond_2

    move-object v4, v0

    goto :goto_0

    :cond_2
    move-object v4, v2

    :goto_0
    invoke-virtual {v0, v1, v4, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    if-eqz v3, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/clearcut/zzew;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/clearcut/zzew;-><init>(LH28;)V

    throw v1
.end method

.method public synthetic c2()LH28;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->j()Lcom/google/android/gms/internal/clearcut/c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->b:Lcom/google/android/gms/internal/clearcut/c;

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/c$a;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->c2()LH28;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/clearcut/c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/clearcut/c$a;->f(Lcom/google/android/gms/internal/clearcut/c;)Lcom/google/android/gms/internal/clearcut/c$a;

    return-object v0
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/clearcut/a;)Lgw7;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/clearcut/c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/c$a;->f(Lcom/google/android/gms/internal/clearcut/c;)Lcom/google/android/gms/internal/clearcut/c$a;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e()Lgw7;
    .locals 1

    invoke-virtual {p0}, Lgw7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/c$a;

    return-object v0
.end method

.method public final f(Lcom/google/android/gms/internal/clearcut/c;)Lcom/google/android/gms/internal/clearcut/c$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/clearcut/c$a;->g(Lcom/google/android/gms/internal/clearcut/c;Lcom/google/android/gms/internal/clearcut/c;)V

    return-object p0
.end method

.method public h()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/clearcut/c$a;->g(Lcom/google/android/gms/internal/clearcut/c;Lcom/google/android/gms/internal/clearcut/c;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->d:Z

    :cond_0
    return-void
.end method

.method public j()Lcom/google/android/gms/internal/clearcut/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    invoke-static {}, LY68;->a()LY68;

    move-result-object v1

    invoke-virtual {v1, v0}, LY68;->d(Ljava/lang/Object;)Lx88;

    move-result-object v1

    invoke-interface {v1, v0}, Lx88;->zzc(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->c:Lcom/google/android/gms/internal/clearcut/c;

    return-object v0
.end method

.method public final p()Lcom/google/android/gms/internal/clearcut/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/clearcut/c$a;->c2()LH28;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/c;

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, LY68;->a()LY68;

    move-result-object v1

    invoke-virtual {v1, v0}, LY68;->d(Ljava/lang/Object;)Lx88;

    move-result-object v1

    invoke-interface {v1, v0}, Lx88;->g(Ljava/lang/Object;)Z

    move-result v3

    sget v1, Lcom/google/android/gms/internal/clearcut/c$e;->b:I

    if-eqz v3, :cond_2

    move-object v4, v0

    goto :goto_0

    :cond_2
    move-object v4, v2

    :goto_0
    invoke-virtual {v0, v1, v4, v2}, Lcom/google/android/gms/internal/clearcut/c;->d(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    if-eqz v3, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/clearcut/zzew;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/clearcut/zzew;-><init>(LH28;)V

    throw v1
.end method

.method public final synthetic v()LH28;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$a;->b:Lcom/google/android/gms/internal/clearcut/c;

    return-object v0
.end method
