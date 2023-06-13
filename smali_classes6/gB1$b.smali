.class public final LgB1$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgB1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LgB1;",
        "LgB1$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LgB1;->T()LgB1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LgB1$a;)V
    .locals 0

    invoke-direct {p0}, LgB1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M(Lcd;)LgB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LgB1;

    invoke-static {v0, p1}, LgB1;->V(LgB1;Lcd;)V

    return-object p0
.end method

.method public N(LQD0;)LgB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LgB1;

    invoke-static {v0, p1}, LgB1;->X(LgB1;LQD0;)V

    return-object p0
.end method

.method public O(LeB1;)LgB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LgB1;

    invoke-static {v0, p1}, LgB1;->W(LgB1;LeB1;)V

    return-object p0
.end method

.method public P(Ljava/lang/String;)LgB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LgB1;

    invoke-static {v0, p1}, LgB1;->U(LgB1;Ljava/lang/String;)V

    return-object p0
.end method
