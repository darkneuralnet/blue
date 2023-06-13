.class public Lk58;
.super LsT7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LV78<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lk58<",
        "TMessageType;TBuilderType;>;>",
        "LsT7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:LV78;

.field public c:LV78;


# direct methods
.method public constructor <init>(LV78;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, LsT7;-><init>()V

    iput-object p1, p0, Lk58;->b:LV78;

    invoke-virtual {p1}, LV78;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LV78;->j()LV78;

    move-result-object p1

    iput-object p1, p0, Lk58;->c:LV78;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lrl8;->a()Lrl8;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrl8;->b(Ljava/lang/Class;)LDo8;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LDo8;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ldj8;
    .locals 1

    invoke-virtual {p0}, Lk58;->k()LV78;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Ldj8;
    .locals 1

    invoke-virtual {p0}, Lk58;->j()LV78;

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

    invoke-virtual {p0}, Lk58;->g()Lk58;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lk58;->c:LV78;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LV78;->C(LV78;Z)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic e()LsT7;
    .locals 1

    invoke-virtual {p0}, Lk58;->g()Lk58;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lk58;
    .locals 3

    iget-object v0, p0, Lk58;->b:LV78;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LV78;->G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk58;

    invoke-virtual {p0}, Lk58;->k()LV78;

    move-result-object v1

    iput-object v1, v0, Lk58;->c:LV78;

    return-object v0
.end method

.method public final h(LV78;)Lk58;
    .locals 1

    iget-object v0, p0, Lk58;->b:LV78;

    invoke-virtual {v0, p1}, LV78;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lk58;->c:LV78;

    invoke-virtual {v0}, LV78;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk58;->n()V

    :cond_0
    iget-object v0, p0, Lk58;->c:LV78;

    invoke-static {v0, p1}, Lk58;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final j()LV78;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lk58;->k()LV78;

    move-result-object v0

    invoke-virtual {v0}, LV78;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgx;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzgx;-><init>(Ldj8;)V

    throw v1
.end method

.method public k()LV78;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lk58;->c:LV78;

    invoke-virtual {v0}, LV78;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk58;->c:LV78;

    return-object v0

    :cond_0
    iget-object v0, p0, Lk58;->c:LV78;

    invoke-virtual {v0}, LV78;->u()V

    iget-object v0, p0, Lk58;->c:LV78;

    return-object v0
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lk58;->c:LV78;

    invoke-virtual {v0}, LV78;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk58;->n()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lk58;->b:LV78;

    invoke-virtual {v0}, LV78;->j()LV78;

    move-result-object v0

    iget-object v1, p0, Lk58;->c:LV78;

    invoke-static {v0, v1}, Lk58;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lk58;->c:LV78;

    return-void
.end method
