.class public abstract Lcom/google/protobuf/r$a;
.super Lcom/google/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/r<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/protobuf/r$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/protobuf/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:Lcom/google/protobuf/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/protobuf/r;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/r$a;->b:Lcom/google/protobuf/r;

    invoke-virtual {p1}, Lcom/google/protobuf/r;->H()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/r$a;->J()Lcom/google/protobuf/r;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static I(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Ljava/lang/Object;",
            ">(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LL94;->a()LL94;

    move-result-object v0

    invoke-virtual {v0, p0}, LL94;->d(Ljava/lang/Object;)LJm5;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LJm5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private J()Lcom/google/protobuf/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r$a;->b:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->O()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->H()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->B()V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 2

    invoke-direct {p0}, Lcom/google/protobuf/r$a;->J()Lcom/google/protobuf/r;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-static {v0, v1}, Lcom/google/protobuf/r$a;->I(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    return-void
.end method

.method public C()Lcom/google/protobuf/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r$a;->b:Lcom/google/protobuf/r;

    return-object v0
.end method

.method public D(Lcom/google/protobuf/r;)Lcom/google/protobuf/r$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r$a;->H(Lcom/google/protobuf/r;)Lcom/google/protobuf/r$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic E()Lcom/google/protobuf/D;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method

.method public G(Lcom/google/protobuf/f;Lcom/google/protobuf/k;)Lcom/google/protobuf/r$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/f;",
            "Lcom/google/protobuf/k;",
            ")TBuilderType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    :try_start_0
    invoke-static {}, LL94;->a()LL94;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-virtual {v0, v1}, LL94;->d(Ljava/lang/Object;)LJm5;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-static {p1}, Lcom/google/protobuf/g;->Q(Lcom/google/protobuf/f;)Lcom/google/protobuf/g;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, LJm5;->j(Ljava/lang/Object;Lcom/google/protobuf/I;Lcom/google/protobuf/k;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    :cond_0
    throw p1
.end method

.method public H(Lcom/google/protobuf/r;)Lcom/google/protobuf/r$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->C()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/r;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-static {v0, p1}, Lcom/google/protobuf/r$a;->I(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/D;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

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

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->z()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/D;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->C()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/protobuf/r;->G(Lcom/google/protobuf/r;Z)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic l2(Lcom/google/protobuf/f;Lcom/google/protobuf/k;)Lcom/google/protobuf/D$a;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/r$a;->G(Lcom/google/protobuf/f;Lcom/google/protobuf/k;)Lcom/google/protobuf/r$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o()Lcom/google/protobuf/a$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->z()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lcom/google/protobuf/a;)Lcom/google/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/r;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r$a;->D(Lcom/google/protobuf/r;)Lcom/google/protobuf/r$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Lcom/google/protobuf/f;Lcom/google/protobuf/k;)Lcom/google/protobuf/a$a;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/r$a;->G(Lcom/google/protobuf/f;Lcom/google/protobuf/k;)Lcom/google/protobuf/r$a;

    move-result-object p1

    return-object p1
.end method

.method public final w()Lcom/google/protobuf/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/r;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/a$a;->t(Lcom/google/protobuf/D;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public y()Lcom/google/protobuf/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->I()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    return-object v0
.end method

.method public z()Lcom/google/protobuf/r$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->C()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/r;->M()Lcom/google/protobuf/r$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()Lcom/google/protobuf/r;

    move-result-object v1

    iput-object v1, v0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    return-object v0
.end method
