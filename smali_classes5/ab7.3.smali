.class public Lab7;
.super Lda7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lfb7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lab7<",
        "TMessageType;TBuilderType;>;>",
        "Lda7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lfb7;

.field public c:Lfb7;


# direct methods
.method public constructor <init>(Lfb7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lda7;-><init>()V

    iput-object p1, p0, Lab7;->b:Lfb7;

    invoke-virtual {p1}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lfb7;->x()Lfb7;

    move-result-object p1

    iput-object p1, p0, Lab7;->c:Lfb7;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lic7;->c(Ljava/lang/Object;Ljava/lang/Object;)V

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

    invoke-virtual {p0}, Lab7;->m()Lab7;

    move-result-object v0

    return-object v0
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lab7;->c:Lfb7;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lfb7;->n(Lfb7;Z)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic k()Lda7;
    .locals 1

    invoke-virtual {p0}, Lab7;->m()Lab7;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lab7;
    .locals 3

    iget-object v0, p0, Lab7;->b:Lfb7;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab7;

    invoke-virtual {p0}, Lab7;->p()Lfb7;

    move-result-object v1

    iput-object v1, v0, Lab7;->c:Lfb7;

    return-object v0
.end method

.method public final n(Lfb7;)Lab7;
    .locals 1

    iget-object v0, p0, Lab7;->b:Lfb7;

    invoke-virtual {v0, p1}, Lfb7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lab7;->c:Lfb7;

    invoke-virtual {v0}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lab7;->r()V

    :cond_0
    iget-object v0, p0, Lab7;->c:Lfb7;

    invoke-static {v0, p1}, Lab7;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final o()Lfb7;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lab7;->p()Lfb7;

    move-result-object v0

    invoke-virtual {v0}, Lfb7;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;-><init>(LTb7;)V

    throw v1
.end method

.method public p()Lfb7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lab7;->c:Lfb7;

    invoke-virtual {v0}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lab7;->c:Lfb7;

    return-object v0

    :cond_0
    iget-object v0, p0, Lab7;->c:Lfb7;

    invoke-virtual {v0}, Lfb7;->i()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    return-object v0
.end method

.method public final q()V
    .locals 1

    iget-object v0, p0, Lab7;->c:Lfb7;

    invoke-virtual {v0}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lab7;->r()V

    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lab7;->b:Lfb7;

    invoke-virtual {v0}, Lfb7;->x()Lfb7;

    move-result-object v0

    iget-object v1, p0, Lab7;->c:Lfb7;

    invoke-static {v0, v1}, Lab7;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lab7;->c:Lfb7;

    return-void
.end method

.method public bridge synthetic s()LTb7;
    .locals 1

    invoke-virtual {p0}, Lab7;->o()Lfb7;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u1()LTb7;
    .locals 1

    invoke-virtual {p0}, Lab7;->p()Lfb7;

    move-result-object v0

    return-object v0
.end method
