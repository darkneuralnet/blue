.class public Lsl2$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl2;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "Lrl2;",
        "Lql2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lsl2;


# direct methods
.method public constructor <init>(Lsl2;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lsl2$b;->b:Lsl2;

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

    check-cast p1, Lrl2;

    invoke-virtual {p0, p1}, Lsl2$b;->f(Lrl2;)Lql2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/g;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lsl2$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)Lrl2;

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

    check-cast p1, Lrl2;

    invoke-virtual {p0, p1}, Lsl2$b;->h(Lrl2;)V

    return-void
.end method

.method public f(Lrl2;)Lql2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, Lql2;->K()Lql2$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lql2$b;->y(Lrl2;)Lql2$b;

    move-result-object p1

    iget-object v0, p0, Lsl2$b;->b:Lsl2;

    invoke-virtual {v0}, Lsl2;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lql2$b;->z(I)Lql2$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, Lql2;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)Lrl2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, Lrl2;->I(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lrl2;

    move-result-object p1

    return-object p1
.end method

.method public h(Lrl2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    return-void
.end method
