.class public LJ8$b;
.super LQk2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8;->f()LQk2$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQk2$a<",
        "LI8;",
        "LH8;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LJ8;


# direct methods
.method public constructor <init>(LJ8;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LJ8$b;->b:LJ8;

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

    check-cast p1, LI8;

    invoke-virtual {p0, p1}, LJ8$b;->f(LI8;)LH8;

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

    invoke-virtual {p0, p1}, LJ8$b;->g(Lcom/google/crypto/tink/shaded/protobuf/g;)LI8;

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

    check-cast p1, LI8;

    invoke-virtual {p0, p1}, LJ8$b;->h(LI8;)V

    return-void
.end method

.method public f(LI8;)LH8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LH8;->N()LH8$b;

    move-result-object v0

    invoke-virtual {p1}, LI8;->K()LK8;

    move-result-object v1

    invoke-virtual {v0, v1}, LH8$b;->z(LK8;)LH8$b;

    move-result-object v0

    invoke-virtual {p1}, LI8;->J()I

    move-result p1

    invoke-static {p1}, Ldn4;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->f([B)Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LH8$b;->y(Lcom/google/crypto/tink/shaded/protobuf/g;)LH8$b;

    move-result-object p1

    iget-object v0, p0, LJ8$b;->b:LJ8;

    invoke-virtual {v0}, LJ8;->l()I

    move-result v0

    invoke-virtual {p1, v0}, LH8$b;->A(I)LH8$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->l()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    check-cast p1, LH8;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/g;)LI8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    invoke-static {p1, v0}, LI8;->M(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LI8;

    move-result-object p1

    return-object p1
.end method

.method public h(LI8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LI8;->J()I

    move-result v0

    invoke-static {v0}, LAj6;->a(I)V

    iget-object v0, p0, LJ8$b;->b:LJ8;

    invoke-virtual {p1}, LI8;->K()LK8;

    move-result-object p1

    invoke-static {v0, p1}, LJ8;->k(LJ8;LK8;)V

    return-void
.end method
