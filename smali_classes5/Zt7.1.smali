.class public LZt7;
.super Lxs7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Leu7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LZt7<",
        "TMessageType;TBuilderType;>;>",
        "Lxs7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Leu7;

.field public c:Leu7;

.field public d:Z


# direct methods
.method public constructor <init>(Leu7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lxs7;-><init>()V

    iput-object p1, p0, LZt7;->b:Leu7;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leu7;

    iput-object p1, p0, LZt7;->c:Leu7;

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    return-void
.end method

.method public static final f(Leu7;Leu7;)V
    .locals 2

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LNv7;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LZt7;->h()LZt7;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d()Lxs7;
    .locals 1

    invoke-virtual {p0}, LZt7;->h()LZt7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic e(Lys7;)Lxs7;
    .locals 0

    check-cast p1, Leu7;

    invoke-virtual {p0, p1}, LZt7;->j(Leu7;)LZt7;

    return-object p0
.end method

.method public final h()LZt7;
    .locals 3

    iget-object v0, p0, LZt7;->b:Leu7;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZt7;

    invoke-virtual {p0}, LZt7;->m()Leu7;

    move-result-object v1

    invoke-virtual {v0, v1}, LZt7;->j(Leu7;)LZt7;

    return-object v0
.end method

.method public bridge synthetic i()Lfv7;
    .locals 1

    invoke-virtual {p0}, LZt7;->l()Leu7;

    move-result-object v0

    return-object v0
.end method

.method public final j(Leu7;)LZt7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    invoke-static {v0, p1}, LZt7;->f(Leu7;Leu7;)V

    return-object p0
.end method

.method public final l()Leu7;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, LZt7;->m()Leu7;

    move-result-object v0

    invoke-virtual {v0}, Leu7;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzatc;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzatc;-><init>(Lfv7;)V

    throw v1
.end method

.method public m()Leu7;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LZt7;->c:Leu7;

    return-object v0

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v1

    invoke-interface {v1, v0}, LNv7;->zzf(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LZt7;->d:Z

    iget-object v0, p0, LZt7;->c:Leu7;

    return-object v0
.end method

.method public final n()Z
    .locals 2

    iget-object v0, p0, LZt7;->c:Leu7;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Leu7;->A(Leu7;Z)Z

    move-result v0

    return v0
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, LZt7;->c:Leu7;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leu7;

    iget-object v1, p0, LZt7;->c:Leu7;

    invoke-static {v0, v1}, LZt7;->f(Leu7;Leu7;)V

    iput-object v0, p0, LZt7;->c:Leu7;

    return-void
.end method

.method public bridge synthetic zzv()Lfv7;
    .locals 1

    invoke-virtual {p0}, LZt7;->m()Leu7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzw()Lfv7;
    .locals 1

    iget-object v0, p0, LZt7;->b:Leu7;

    return-object v0
.end method
