.class public final LO8;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "LM8;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, LO8$a;

    const-class v2, Lp8;

    invoke-direct {v1, v2}, LO8$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, LM8;

    invoke-direct {p0, v1, v0}, LQk2;-><init>(Ljava/lang/Class;[LD24;)V

    return-void
.end method

.method public static synthetic k(IILJk2$b;)LQk2$a$a;
    .locals 0

    invoke-static {p0, p1, p2}, LO8;->l(IILJk2$b;)LQk2$a$a;

    move-result-object p0

    return-object p0
.end method

.method public static l(IILJk2$b;)LQk2$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "LJk2$b;",
            ")",
            "LQk2$a$a<",
            "LN8;",
            ">;"
        }
    .end annotation

    invoke-static {}, LN8;->K()LN8$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LN8$b;->y(I)LN8$b;

    move-result-object p0

    invoke-static {}, LP8;->J()LP8$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LP8$b;->y(I)LP8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LP8;

    invoke-virtual {p0, p1}, LN8$b;->z(LP8;)LN8$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LN8;

    new-instance p1, LQk2$a$a;

    invoke-direct {p1, p0, p2}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    return-object p1
.end method

.method public static o(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LO8;

    invoke-direct {v0}, LO8;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "LN8;",
            "LM8;",
            ">;"
        }
    .end annotation

    new-instance v0, LO8$b;

    const-class v1, LN8;

    invoke-direct {v0, p0, v1}, LO8$b;-><init>(LO8;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lhk2$c;
    .locals 1

    sget-object v0, Lhk2$c;->d:Lhk2$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/g;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-virtual {p0, p1}, LO8;->n(Lcom/google/crypto/tink/shaded/protobuf/g;)LM8;

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

    check-cast p1, LM8;

    invoke-virtual {p0, p1}, LO8;->p(LM8;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/g;)LM8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LM8;->N(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LM8;

    move-result-object p1

    return-object p1
.end method

.method public p(LM8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LM8;->L()I

    move-result v0

    invoke-virtual {p0}, LO8;->m()I

    move-result v1

    invoke-static {v0, v1}, LAj6;->c(II)V

    invoke-virtual {p1}, LM8;->J()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    invoke-static {v0}, LAj6;->a(I)V

    invoke-virtual {p1}, LM8;->K()LP8;

    move-result-object v0

    invoke-virtual {v0}, LP8;->I()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, LM8;->K()LP8;

    move-result-object p1

    invoke-virtual {p1}, LP8;->I()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
