.class public final LkQ3$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LlQ3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LkQ3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LkQ3;",
        "LkQ3$b;",
        ">;",
        "LlQ3;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LkQ3;->T()LkQ3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LkQ3$a;)V
    .locals 0

    invoke-direct {p0}, LkQ3$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M(Ldm$b;)LkQ3$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object p1

    check-cast p1, Ldm;

    invoke-static {v0, p1}, LkQ3;->U(LkQ3;Ldm;)V

    return-object p0
.end method

.method public N(LgB1;)LkQ3$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-static {v0, p1}, LkQ3;->V(LkQ3;LgB1;)V

    return-object p0
.end method

.method public O(LL73;)LkQ3$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-static {v0, p1}, LkQ3;->X(LkQ3;LL73;)V

    return-object p0
.end method

.method public P(Lg66;)LkQ3$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-static {v0, p1}, LkQ3;->W(LkQ3;Lg66;)V

    return-object p0
.end method

.method public e()LL73;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->e()LL73;

    move-result-object v0

    return-object v0
.end method

.method public g()LgB1;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->g()LgB1;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->h()Z

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->j()Z

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->k()Z

    move-result v0

    return v0
.end method

.method public l()Lg66;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LkQ3;

    invoke-virtual {v0}, LkQ3;->l()Lg66;

    move-result-object v0

    return-object v0
.end method
