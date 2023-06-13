.class public Lsl2;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "Lql2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, Lsl2$a;

    const-class v2, Lp8;

    invoke-direct {v1, v2}, Lsl2$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lql2;

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

    new-instance v0, Lsl2;

    invoke-direct {v0}, Lsl2;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "Lrl2;",
            "Lql2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsl2$b;

    const-class v1, Lrl2;

    invoke-direct {v0, p0, v1}, Lsl2$b;-><init>(Lsl2;Ljava/lang/Class;)V

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

    invoke-virtual {p0, p1}, Lsl2;->l(Lcom/google/crypto/tink/shaded/protobuf/g;)Lql2;

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

    check-cast p1, Lql2;

    invoke-virtual {p0, p1}, Lsl2;->n(Lql2;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/g;)Lql2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, Lql2;->L(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lql2;

    move-result-object p1

    return-object p1
.end method

.method public n(Lql2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lql2;->J()I

    move-result p1

    invoke-virtual {p0}, Lsl2;->k()I

    move-result v0

    invoke-static {p1, v0}, LAj6;->c(II)V

    return-void
.end method
