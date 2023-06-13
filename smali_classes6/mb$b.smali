.class public final Lmb$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "Lmb;",
        "Lmb$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lmb;->T()Lmb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Lmb$a;)V
    .locals 0

    invoke-direct {p0}, Lmb$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M(Ljava/lang/String;)Lmb$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Lmb;

    invoke-static {v0, p1}, Lmb;->U(Lmb;Ljava/lang/String;)V

    return-object p0
.end method

.method public N(Ljava/lang/String;)Lmb$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Lmb;

    invoke-static {v0, p1}, Lmb;->V(Lmb;Ljava/lang/String;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;)Lmb$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Lmb;

    invoke-static {v0, p1}, Lmb;->W(Lmb;Ljava/lang/String;)V

    return-object p0
.end method
