.class public Lyl2;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "Lwl2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, Lyl2$a;

    const-class v2, Lp8;

    invoke-direct {v1, v2}, Lyl2$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lwl2;

    invoke-direct {p0, v1, v0}, LQk2;-><init>(Ljava/lang/Class;[LD24;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Lyl2;

    invoke-direct {v0}, Lyl2;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "Lxl2;",
            "Lwl2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyl2$b;

    const-class v1, Lxl2;

    invoke-direct {v0, p0, v1}, Lyl2$b;-><init>(Lyl2;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lhk2$c;
    .locals 1

    sget-object v0, Lhk2$c;->g:Lhk2$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/g;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lyl2;->l(Lcom/google/crypto/tink/shaded/protobuf/g;)Lwl2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/F;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, Lwl2;

    invoke-virtual {p0, p1}, Lyl2;->n(Lwl2;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/g;)Lwl2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, Lwl2;->L(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lwl2;

    move-result-object p1

    return-object p1
.end method

.method public n(Lwl2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lwl2;->J()I

    move-result p1

    invoke-virtual {p0}, Lyl2;->k()I

    move-result v0

    invoke-static {p1, v0}, LAj6;->c(II)V

    return-void
.end method
