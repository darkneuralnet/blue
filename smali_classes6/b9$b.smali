.class public Lb9$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "La9;",
        "LZ8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lb9;


# direct methods
.method public constructor <init>(Lb9;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lb9$b;->b:Lb9;

    invoke-direct {p0, p2}, LQk2$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, La9;

    invoke-virtual {p0, p1}, Lb9$b;->f(La9;)LZ8;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQk2$a$a<",
            "La9;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, LQk2$a$a;

    invoke-static {}, La9;->I()La9$b;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v3}, La9$b;->y(I)La9$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    check-cast v2, La9;

    sget-object v4, LJk2$b;->b:LJk2$b;

    invoke-direct {v1, v2, v4}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "AES256_SIV"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LQk2$a$a;

    invoke-static {}, La9;->I()La9$b;

    move-result-object v2

    invoke-virtual {v2, v3}, La9$b;->y(I)La9$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    check-cast v2, La9;

    sget-object v3, LJk2$b;->d:LJk2$b;

    invoke-direct {v1, v2, v3}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "AES256_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/g;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lb9$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)La9;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/F;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, La9;

    invoke-virtual {p0, p1}, Lb9$b;->h(La9;)V

    return-void
.end method

.method public f(La9;)LZ8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LZ8;->K()LZ8$b;

    move-result-object v0

    invoke-virtual {p1}, La9;->H()I

    move-result p1

    invoke-static {p1}, Ldn4;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LZ8$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LZ8$b;

    move-result-object p1

    iget-object v0, p0, Lb9$b;->b:Lb9;

    invoke-virtual {v0}, Lb9;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LZ8$b;->z(I)LZ8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LZ8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)La9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, La9;->J(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)La9;

    move-result-object p1

    return-object p1
.end method

.method public h(La9;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, La9;->H()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, La9;->H()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
