.class public LT8$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT8;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LS8;",
        "LR8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LT8;


# direct methods
.method public constructor <init>(LT8;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LT8$b;->b:LT8;

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

    check-cast p1, LS8;

    invoke-virtual {p0, p1}, LT8$b;->f(LS8;)LR8;

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
            "LS8;",
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

    sget-object v1, LJk2$b;->b:LJk2$b;

    const/16 v2, 0x10

    invoke-static {v2, v1}, LT8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, LJk2$b;->d:LJk2$b;

    invoke-static {v2, v3}, LT8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, LT8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM_RAW"

    invoke-static {v2, v3}, LT8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, LT8$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LS8;

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

    check-cast p1, LS8;

    invoke-virtual {p0, p1}, LT8$b;->h(LS8;)V

    return-void
.end method

.method public f(LS8;)LR8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LR8;->K()LR8$b;

    move-result-object v0

    invoke-virtual {p1}, LS8;->H()I

    move-result p1

    invoke-static {p1}, Ldn4;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LR8$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LR8$b;

    move-result-object p1

    iget-object v0, p0, LT8$b;->b:LT8;

    invoke-virtual {v0}, LT8;->m()I

    move-result v0

    invoke-virtual {p1, v0}, LR8$b;->z(I)LR8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LR8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LS8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LS8;->J(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LS8;

    move-result-object p1

    return-object p1
.end method

.method public h(LS8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LS8;->H()I

    move-result p1

    invoke-static {p1}, LAj6;->a(I)V

    return-void
.end method
