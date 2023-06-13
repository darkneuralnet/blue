.class public final LQD0$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQD0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LQD0;",
        "LQD0$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LQD0;->T()LQD0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LQD0$a;)V
    .locals 0

    invoke-direct {p0}, LQD0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M(J)LQD0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LQD0;

    invoke-static {v0, p1, p2}, LQD0;->U(LQD0;J)V

    return-object p0
.end method

.method public N(J)LQD0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LQD0;

    invoke-static {v0, p1, p2}, LQD0;->W(LQD0;J)V

    return-object p0
.end method

.method public O(J)LQD0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LQD0;

    invoke-static {v0, p1, p2}, LQD0;->V(LQD0;J)V

    return-object p0
.end method
