.class public LVM1$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVM1;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LUM1;",
        "LTM1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LVM1;


# direct methods
.method public constructor <init>(LVM1;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LVM1$b;->b:LVM1;

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

    check-cast p1, LUM1;

    invoke-virtual {p0, p1}, LVM1$b;->f(LUM1;)LTM1;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQk2$a$a<",
            "LUM1;",
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

    sget-object v1, LuH1;->f:LuH1;

    sget-object v2, LJk2$b;->b:LJk2$b;

    const/16 v3, 0x20

    const/16 v4, 0x10

    invoke-static {v3, v4, v1, v2}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v5

    const-string v6, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, LJk2$b;->d:LJk2$b;

    invoke-static {v3, v4, v1, v5}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG"

    invoke-static {v3, v3, v1, v2}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v7

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-static {v3, v3, v1, v5}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v1

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LuH1;->g:LuH1;

    const/16 v6, 0x40

    invoke-static {v6, v4, v1, v2}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-static {v6, v4, v1, v5}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v4

    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "HMAC_SHA512_256BITTAG"

    invoke-static {v6, v3, v1, v2}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v7

    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "HMAC_SHA512_256BITTAG_RAW"

    invoke-static {v6, v3, v1, v5}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "HMAC_SHA512_512BITTAG"

    invoke-static {v6, v6, v1, v2}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-static {v6, v6, v1, v5}, LVM1;->l(IILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v1

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

    invoke-virtual {p0, p1}, LVM1$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LUM1;

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

    check-cast p1, LUM1;

    invoke-virtual {p0, p1}, LVM1$b;->h(LUM1;)V

    return-void
.end method

.method public f(LUM1;)LTM1;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LTM1;->N()LTM1$b;

    move-result-object v0

    iget-object v1, p0, LVM1$b;->b:LVM1;

    invoke-virtual {v1}, LVM1;->n()I

    move-result v1

    invoke-virtual {v0, v1}, LTM1$b;->A(I)LTM1$b;

    move-result-object v0

    invoke-virtual {p1}, LUM1;->K()LWM1;

    move-result-object v1

    invoke-virtual {v0, v1}, LTM1$b;->z(LWM1;)LTM1$b;

    move-result-object v0

    invoke-virtual {p1}, LUM1;->J()I

    move-result p1

    invoke-static {p1}, Ldn4;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LTM1$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LTM1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LTM1;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LUM1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LUM1;->M(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LUM1;

    move-result-object p1

    return-object p1
.end method

.method public h(LUM1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LUM1;->J()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LUM1;->K()LWM1;

    move-result-object p1

    invoke-static {p1}, LVM1;->k(LWM1;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
