.class public Lv8$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "Lu8;",
        "Ls8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lv8;


# direct methods
.method public constructor <init>(Lv8;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lv8$b;->b:Lv8;

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

    check-cast p1, Lu8;

    invoke-virtual {p0, p1}, Lv8$b;->f(Lu8;)Ls8;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LQk2$a$a<",
            "Lu8;",
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

    invoke-static {}, Lu8;->K()Lu8$b;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lu8$b;->y(I)Lu8$b;

    move-result-object v2

    invoke-static {}, Lx8;->J()Lx8$b;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lx8$b;->y(I)Lx8$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v4

    check-cast v4, Lx8;

    invoke-virtual {v2, v4}, Lu8$b;->z(Lx8;)Lu8$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    check-cast v2, Lu8;

    sget-object v4, LJk2$b;->b:LJk2$b;

    invoke-direct {v1, v2, v4}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LQk2$a$a;

    invoke-static {}, Lu8;->K()Lu8$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lu8$b;->y(I)Lu8$b;

    move-result-object v2

    invoke-static {}, Lx8;->J()Lx8$b;

    move-result-object v6

    invoke-virtual {v6, v5}, Lx8$b;->y(I)Lx8$b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v6

    check-cast v6, Lx8;

    invoke-virtual {v2, v6}, Lu8$b;->z(Lx8;)Lu8$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    check-cast v2, Lu8;

    invoke-direct {v1, v2, v4}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LQk2$a$a;

    invoke-static {}, Lu8;->K()Lu8$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lu8$b;->y(I)Lu8$b;

    move-result-object v2

    invoke-static {}, Lx8;->J()Lx8$b;

    move-result-object v3

    invoke-virtual {v3, v5}, Lx8$b;->y(I)Lx8$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v3

    check-cast v3, Lx8;

    invoke-virtual {v2, v3}, Lu8$b;->z(Lx8;)Lu8$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    check-cast v2, Lu8;

    sget-object v3, LJk2$b;->d:LJk2$b;

    invoke-direct {v1, v2, v3}, LQk2$a$a;-><init>(Ljava/lang/Object;LJk2$b;)V

    const-string v2, "AES256_CMAC_RAW"

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

    invoke-virtual {p0, p1}, Lv8$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)Lu8;

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

    check-cast p1, Lu8;

    invoke-virtual {p0, p1}, Lv8$b;->h(Lu8;)V

    return-void
.end method

.method public f(Lu8;)Ls8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, Ls8;->M()Ls8$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls8$b;->A(I)Ls8$b;

    move-result-object v0

    invoke-virtual {p1}, Lu8;->I()I

    move-result v1

    invoke-static {v1}, Ldn4;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls8$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)Ls8$b;

    move-result-object v0

    invoke-virtual {p1}, Lu8;->J()Lx8;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls8$b;->z(Lx8;)Ls8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, Ls8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)Lu8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, Lu8;->L(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lu8;

    move-result-object p1

    return-object p1
.end method

.method public h(Lu8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lu8;->J()Lx8;

    move-result-object v0

    invoke-static {v0}, Lv8;->k(Lx8;)V

    invoke-virtual {p1}, Lu8;->I()I

    move-result p1

    invoke-static {p1}, Lv8;->l(I)V

    return-void
.end method
