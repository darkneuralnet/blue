.class public LFa9;
.super Lr39;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lub9<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LFa9<",
        "TMessageType;TBuilderType;>;>",
        "Lr39<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lub9;

.field public c:Lub9;

.field public d:Z


# direct methods
.method public constructor <init>(Lub9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lr39;-><init>()V

    iput-object p1, p0, LFa9;->b:Lub9;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lub9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lub9;

    iput-object p1, p0, LFa9;->c:Lub9;

    const/4 p1, 0x0

    iput-boolean p1, p0, LFa9;->d:Z

    return-void
.end method

.method public static final j(Lub9;Lub9;)V
    .locals 2

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LEi9;->a(Ljava/lang/Object;Ljava/lang/Object;)V

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

    invoke-virtual {p0}, LFa9;->k()LFa9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e()Lr39;
    .locals 1

    invoke-virtual {p0}, LFa9;->k()LFa9;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic f(LA39;)Lr39;
    .locals 0

    check-cast p1, Lub9;

    invoke-virtual {p0, p1}, LFa9;->l(Lub9;)LFa9;

    return-object p0
.end method

.method public final synthetic g()Lpg9;
    .locals 1

    iget-object v0, p0, LFa9;->b:Lub9;

    return-object v0
.end method

.method public final k()LFa9;
    .locals 3

    iget-object v0, p0, LFa9;->b:Lub9;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lub9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFa9;

    invoke-virtual {p0}, LFa9;->n()Lub9;

    move-result-object v1

    invoke-virtual {v0, v1}, LFa9;->l(Lub9;)LFa9;

    return-object v0
.end method

.method public final l(Lub9;)LFa9;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    invoke-static {v0, p1}, LFa9;->j(Lub9;Lub9;)V

    return-object p0
.end method

.method public final m()Lub9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, LFa9;->n()Lub9;

    move-result-object v0

    invoke-virtual {v0}, Lub9;->zzv()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzqu;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzqu;-><init>(Lpg9;)V

    throw v1
.end method

.method public n()Lub9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LFa9;->c:Lub9;

    return-object v0

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object v1

    invoke-interface {v1, v0}, LEi9;->zzf(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LFa9;->d:Z

    iget-object v0, p0, LFa9;->c:Lub9;

    return-object v0
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, LFa9;->c:Lub9;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lub9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub9;

    iget-object v1, p0, LFa9;->c:Lub9;

    invoke-static {v0, v1}, LFa9;->j(Lub9;Lub9;)V

    iput-object v0, p0, LFa9;->c:Lub9;

    return-void
.end method

.method public bridge synthetic zzs()Lpg9;
    .locals 1

    invoke-virtual {p0}, LFa9;->n()Lub9;

    move-result-object v0

    return-object v0
.end method

.method public final zzv()Z
    .locals 2

    iget-object v0, p0, LFa9;->c:Lub9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lub9;->l(Lub9;Z)Z

    move-result v0

    return v0
.end method
