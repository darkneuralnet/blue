.class public final Lkl2$b;
.super Lcom/google/crypto/tink/shaded/protobuf/t$a;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkl2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t$a<",
        "Lkl2;",
        "Lkl2$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lkl2;->F()Lkl2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkl2$a;)V
    .locals 0

    invoke-direct {p0}, Lkl2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lkl2;

    invoke-virtual {v0}, Lkl2;->L()I

    move-result v0

    return v0
.end method

.method public B()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkl2$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lkl2;

    invoke-virtual {v0}, Lkl2;->M()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public C(I)Lkl2$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lkl2;

    invoke-static {v0, p1}, Lkl2;->G(Lkl2;I)V

    return-object p0
.end method

.method public y(Lkl2$c;)Lkl2$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lkl2;

    invoke-static {v0, p1}, Lkl2;->H(Lkl2;Lkl2$c;)V

    return-object p0
.end method

.method public z(I)Lkl2$c;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lkl2;

    invoke-virtual {v0, p1}, Lkl2;->K(I)Lkl2$c;

    move-result-object p1

    return-object p1
.end method
