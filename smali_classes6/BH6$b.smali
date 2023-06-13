.class public LBH6$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBH6;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LAH6;",
        "LzH6;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LBH6;


# direct methods
.method public constructor <init>(LBH6;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LBH6$b;->b:LBH6;

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

    check-cast p1, LAH6;

    invoke-virtual {p0, p1}, LBH6$b;->f(LAH6;)LzH6;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQk2$a$a<",
            "LAH6;",
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

    invoke-static {}, LAH6;->G()LAH6;

    move-result-object v2

    sget-object v3, LJk2$b;->b:LJk2$b;

    invoke-direct {v1, v2, v3}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "XCHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LQk2$a$a;

    invoke-static {}, LAH6;->G()LAH6;

    move-result-object v2

    sget-object v3, LJk2$b;->d:LJk2$b;

    invoke-direct {v1, v2, v3}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "XCHACHA20_POLY1305_RAW"

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

    invoke-virtual {p0, p1}, LBH6$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LAH6;

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

    check-cast p1, LAH6;

    invoke-virtual {p0, p1}, LBH6$b;->h(LAH6;)V

    return-void
.end method

.method public f(LAH6;)LzH6;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LzH6;->K()LzH6$b;

    move-result-object p1

    iget-object v0, p0, LBH6$b;->b:LBH6;

    invoke-virtual {v0}, LBH6;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LzH6$b;->z(I)LzH6$b;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {v0}, Ldn4;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-virtual {p1, v0}, LzH6$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LzH6$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LzH6;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LAH6;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LAH6;->H(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LAH6;

    move-result-object p1

    return-object p1
.end method

.method public h(LAH6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    return-void
.end method
