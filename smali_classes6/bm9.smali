.class public Lbm9;
.super LGe9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LEm9<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lbm9<",
        "TMessageType;TBuilderType;>;>",
        "LGe9<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:LEm9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:LEm9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(LEm9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, LGe9;-><init>()V

    iput-object p1, p0, Lbm9;->b:LEm9;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, LEm9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEm9;

    iput-object p1, p0, Lbm9;->c:LEm9;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lbm9;->d:Z

    return-void
.end method

.method public static final m(LEm9;LEm9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lnq9;->a()Lnq9;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnq9;->b(Ljava/lang/Class;)Lbr9;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lbr9;->zze(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()LNp9;
    .locals 1

    invoke-virtual {p0}, Lbm9;->r()LEm9;

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

    invoke-virtual {p0}, Lbm9;->n()Lbm9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()LNp9;
    .locals 1

    iget-object v0, p0, Lbm9;->b:LEm9;

    return-object v0
.end method

.method public final bridge synthetic k()LGe9;
    .locals 1

    invoke-virtual {p0}, Lbm9;->n()Lbm9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic l(LNe9;)LGe9;
    .locals 0

    check-cast p1, LEm9;

    invoke-virtual {p0, p1}, Lbm9;->o(LEm9;)Lbm9;

    return-object p0
.end method

.method public final n()Lbm9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    iget-object v0, p0, Lbm9;->b:LEm9;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LEm9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbm9;

    invoke-virtual {p0}, Lbm9;->r()LEm9;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbm9;->o(LEm9;)Lbm9;

    return-object v0
.end method

.method public final o(LEm9;)Lbm9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    invoke-static {v0, p1}, Lbm9;->m(LEm9;LEm9;)V

    return-object p0
.end method

.method public final q()LEm9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lbm9;->r()LEm9;

    move-result-object v0

    invoke-virtual {v0}, LEm9;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/recaptcha/zztq;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/recaptcha/zztq;-><init>(LNp9;)V

    throw v1
.end method

.method public r()LEm9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbm9;->c:LEm9;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    invoke-static {}, Lnq9;->a()Lnq9;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnq9;->b(Ljava/lang/Class;)Lbr9;

    move-result-object v1

    invoke-interface {v1, v0}, Lbr9;->a(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbm9;->d:Z

    iget-object v0, p0, Lbm9;->c:LEm9;

    return-object v0
.end method

.method public w()V
    .locals 3

    iget-object v0, p0, Lbm9;->c:LEm9;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LEm9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEm9;

    iget-object v1, p0, Lbm9;->c:LEm9;

    invoke-static {v0, v1}, Lbm9;->m(LEm9;LEm9;)V

    iput-object v0, p0, Lbm9;->c:LEm9;

    return-void
.end method
