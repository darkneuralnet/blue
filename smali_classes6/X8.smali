.class public final LX8;
.super LQk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2<",
        "LV8;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LD24;

    new-instance v1, LX8$a;

    const-class v2, Lp8;

    invoke-direct {v1, v2}, LX8$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, LV8;

    invoke-direct {p0, v1, v0}, LQk2;-><init>(Ljava/lang/Class;[LD24;)V

    return-void
.end method

.method public static synthetic k(ILJk2$b;)LQk2$a$a;
    .locals 0

    invoke-static {p0, p1}, LX8;->m(ILJk2$b;)LQk2$a$a;

    move-result-object p0

    return-object p0
.end method

.method public static l()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static m(ILJk2$b;)LQk2$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LJk2$b;",
            ")",
            "LQk2$a$a<",
            "LW8;",
            ">;"
        }
    .end annotation

    invoke-static {}, LW8;->I()LW8$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LW8$b;->y(I)LW8$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LW8;

    new-instance v0, LQk2$a$a;

    invoke-direct {v0, p0, p1}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LX8;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LX8;

    invoke-direct {v0}, LX8;-><init>()V

    invoke-static {v0, p0}, LNt4;->k(LQk2;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public f()LQk2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQk2$a<",
            "LW8;",
            "LV8;",
            ">;"
        }
    .end annotation

    new-instance v0, LX8$b;

    const-class v1, LW8;

    invoke-direct {v0, p0, v1}, LX8$b;-><init>(LX8;Ljava/lang/Class;)V

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

    invoke-virtual {p0, p1}, LX8;->o(Lcom/google/crypto/tink/shaded/protobuf/g;)LV8;

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

    check-cast p1, LV8;

    invoke-virtual {p0, p1}, LX8;->q(LV8;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/g;)LV8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LV8;->L(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LV8;

    move-result-object p1

    return-object p1
.end method

.method public q(LV8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LV8;->J()I

    move-result v0

    invoke-virtual {p0}, LX8;->n()I

    move-result v1

    invoke-static {v0, v1}, LAj6;->c(II)V

    invoke-virtual {p1}, LV8;->I()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result p1

    invoke-static {p1}, LAj6;->a(I)V

    return-void
.end method
