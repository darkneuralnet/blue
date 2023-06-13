.class public final Lhk2$b;
.super Lcom/google/crypto/tink/shaded/protobuf/t$a;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t$a<",
        "Lhk2;",
        "Lhk2$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lhk2;->F()Lhk2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public synthetic constructor <init>(Lhk2$a;)V
    .locals 0

    invoke-direct {p0}, Lhk2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Lcom/google/crypto/tink/shaded/protobuf/g;)Lhk2$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lhk2;

    invoke-static {v0, p1}, Lhk2;->H(Lhk2;Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-object p0
.end method

.method public y(Lhk2$c;)Lhk2$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lhk2;

    invoke-static {v0, p1}, Lhk2;->I(Lhk2;Lhk2$c;)V

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lhk2$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lhk2;

    invoke-static {v0, p1}, Lhk2;->G(Lhk2;Ljava/lang/String;)V

    return-object p0
.end method
