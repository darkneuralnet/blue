.class public LF8$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LE8;",
        "LD8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LF8;


# direct methods
.method public constructor <init>(LF8;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LF8$b;->b:LF8;

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

    check-cast p1, LE8;

    invoke-virtual {p0, p1}, LF8$b;->f(LE8;)LD8;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQk2$a$a<",
            "LE8;",
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

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    sget-object v11, LuH1;->f:LuH1;

    sget-object v12, LJk2$b;->b:LJk2$b;

    move-object v5, v11

    move-object v6, v12

    invoke-static/range {v1 .. v6}, LF8;->k(IIIILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x10

    const/16 v6, 0x10

    const/16 v7, 0x20

    const/16 v8, 0x10

    sget-object v1, LJk2$b;->d:LJk2$b;

    move-object v9, v11

    move-object v10, v1

    invoke-static/range {v5 .. v10}, LF8;->k(IIIILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v2

    const-string v3, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x20

    const/16 v8, 0x20

    move-object v10, v12

    invoke-static/range {v5 .. v10}, LF8;->k(IIIILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v2

    const-string v3, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v1

    invoke-static/range {v5 .. v10}, LF8;->k(IIIILuH1;LJk2$b;)LQk2$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

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

    invoke-virtual {p0, p1}, LF8$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LE8;

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

    check-cast p1, LE8;

    invoke-virtual {p0, p1}, LF8$b;->h(LE8;)V

    return-void
.end method

.method public f(LE8;)LD8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LJ8;

    invoke-direct {v0}, LJ8;-><init>()V

    invoke-virtual {v0}, LJ8;->f()LQk2$a;

    move-result-object v0

    invoke-virtual {p1}, LE8;->I()LI8;

    move-result-object v1

    invoke-virtual {v0, v1}, LQk2$a;->a(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    check-cast v0, LH8;

    new-instance v1, LVM1;

    invoke-direct {v1}, LVM1;-><init>()V

    invoke-virtual {v1}, LVM1;->f()LQk2$a;

    move-result-object v1

    invoke-virtual {p1}, LE8;->J()LUM1;

    move-result-object p1

    invoke-virtual {v1, p1}, LQk2$a;->a(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p1

    check-cast p1, LTM1;

    invoke-static {}, LD8;->M()LD8$b;

    move-result-object v1

    invoke-virtual {v1, v0}, LD8$b;->y(LH8;)LD8$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LD8$b;->z(LTM1;)LD8$b;

    move-result-object p1

    iget-object v0, p0, LF8$b;->b:LF8;

    invoke-virtual {v0}, LF8;->n()I

    move-result v0

    invoke-virtual {p1, v0}, LD8$b;->A(I)LD8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LD8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LE8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LE8;->L(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LE8;

    move-result-object p1

    return-object p1
.end method

.method public h(LE8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LJ8;

    invoke-direct {v0}, LJ8;-><init>()V

    invoke-virtual {v0}, LJ8;->f()LQk2$a;

    move-result-object v0

    invoke-virtual {p1}, LE8;->I()LI8;

    move-result-object v1

    invoke-virtual {v0, v1}, LQk2$a;->e(Lcom/google/crypto/tink/shaded/protobuf/F;)V

    new-instance v0, LVM1;

    invoke-direct {v0}, LVM1;-><init>()V

    invoke-virtual {v0}, LVM1;->f()LQk2$a;

    move-result-object v0

    invoke-virtual {p1}, LE8;->J()LUM1;

    move-result-object v1

    invoke-virtual {v0, v1}, LQk2$a;->e(Lcom/google/crypto/tink/shaded/protobuf/F;)V

    invoke-virtual {p1}, LE8;->I()LI8;

    move-result-object p1

    invoke-virtual {p1}, LI8;->J()I

    move-result p1

    invoke-static {p1}, LAj6;->a(I)V

    return-void
.end method
