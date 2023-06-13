.class public final Ldm$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "Ldm;",
        "Ldm$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ldm;->T()Ldm;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Ldm$a;)V
    .locals 0

    invoke-direct {p0}, Ldm$b;-><init>()V

    return-void
.end method


# virtual methods
.method public M()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-virtual {v0}, Ldm;->d0()Z

    move-result v0

    return v0
.end method

.method public N(Ljava/util/Map;)Ldm$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ldm$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-static {v0}, Ldm;->W(Ldm;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public O(Lmb$b;)Ldm$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object p1

    check-cast p1, Lmb;

    invoke-static {v0, p1}, Ldm;->Y(Ldm;Lmb;)V

    return-object p0
.end method

.method public P(Ljava/lang/String;)Ldm$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-static {v0, p1}, Ldm;->X(Ldm;Ljava/lang/String;)V

    return-object p0
.end method

.method public Q(Lim;)Ldm$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-static {v0, p1}, Ldm;->V(Ldm;Lim;)V

    return-object p0
.end method

.method public S(Ljava/lang/String;)Ldm$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, Ldm;

    invoke-static {v0, p1}, Ldm;->U(Ldm;Ljava/lang/String;)V

    return-object p0
.end method
