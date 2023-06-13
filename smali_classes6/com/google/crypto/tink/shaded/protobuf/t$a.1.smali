.class public abstract Lcom/google/crypto/tink/shaded/protobuf/t$a;
.super Lcom/google/crypto/tink/shaded/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/crypto/tink/shaded/protobuf/t$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/crypto/tink/shaded/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/crypto/tink/shaded/protobuf/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:Lcom/google/crypto/tink/shaded/protobuf/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->b:Lcom/google/crypto/tink/shaded/protobuf/t;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/t$f;->e:Lcom/google/crypto/tink/shaded/protobuf/t$f;

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->l(Lcom/google/crypto/tink/shaded/protobuf/t$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->d:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic E()Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->m()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->n()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->n()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->q()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->r(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object p1

    return-object p1
.end method

.method public final l()Lcom/google/crypto/tink/shaded/protobuf/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->m()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->k(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public m()Lcom/google/crypto/tink/shaded/protobuf/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->d:Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    return-object v0
.end method

.method public n()Lcom/google/crypto/tink/shaded/protobuf/t$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->q()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->v()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->m()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->t(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->p()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->d:Z

    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/t$f;->e:Lcom/google/crypto/tink/shaded/protobuf/t$f;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/t;->l(Lcom/google/crypto/tink/shaded/protobuf/t$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/t;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->w(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    return-void
.end method

.method public q()Lcom/google/crypto/tink/shaded/protobuf/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->b:Lcom/google/crypto/tink/shaded/protobuf/t;

    return-object v0
.end method

.method public r(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->t(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->w(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-object p0
.end method

.method public final w(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LM94;->a()LM94;

    move-result-object v0

    invoke-virtual {v0, p1}, LM94;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/M;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
