.class public LX8$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LW8;",
        "LV8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LX8;


# direct methods
.method public constructor <init>(LX8;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LX8$b;->b:LX8;

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

    check-cast p1, LW8;

    invoke-virtual {p0, p1}, LX8$b;->f(LW8;)LV8;

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
            "LW8;",
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

    invoke-static {v2, v1}, LX8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, LJk2$b;->d:LJk2$b;

    invoke-static {v2, v3}, LX8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, LX8;->k(ILJk2$b;)LQk2$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM_SIV"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM_SIV_RAW"

    invoke-static {v2, v3}, LX8;->k(ILJk2$b;)LQk2$a$a;

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

    invoke-virtual {p0, p1}, LX8$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LW8;

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

    check-cast p1, LW8;

    invoke-virtual {p0, p1}, LX8$b;->h(LW8;)V

    return-void
.end method

.method public f(LW8;)LV8;
    .locals 1

    invoke-static {}, LV8;->K()LV8$b;

    move-result-object v0

    invoke-virtual {p1}, LW8;->H()I

    move-result p1

    invoke-static {p1}, Ldn4;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LV8$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LV8$b;

    move-result-object p1

    iget-object v0, p0, LX8$b;->b:LX8;

    invoke-virtual {v0}, LX8;->n()I

    move-result v0

    invoke-virtual {p1, v0}, LV8$b;->z(I)LV8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LV8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LW8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LW8;->J(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LW8;

    move-result-object p1

    return-object p1
.end method

.method public h(LW8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LW8;->H()I

    move-result p1

    invoke-static {p1}, LAj6;->a(I)V

    return-void
.end method
