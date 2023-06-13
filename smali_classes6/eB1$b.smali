.class public final LeB1$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LeB1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LeB1;",
        "LeB1$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LeB1;->T()LeB1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LeB1$a;)V
    .locals 0

    invoke-direct {p0}, LeB1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M(I)LeB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LeB1;

    invoke-static {v0, p1}, LeB1;->W(LeB1;I)V

    return-object p0
.end method

.method public N(I)LeB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LeB1;

    invoke-static {v0, p1}, LeB1;->U(LeB1;I)V

    return-object p0
.end method

.method public O(I)LeB1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LeB1;

    invoke-static {v0, p1}, LeB1;->V(LeB1;I)V

    return-object p0
.end method
