.class public Lcom/google/crypto/tink/shaded/protobuf/t$e;
.super Lcom/google/crypto/tink/shaded/protobuf/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/crypto/tink/shaded/protobuf/F;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/crypto/tink/shaded/protobuf/l<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/F;

.field public final b:Lcom/google/crypto/tink/shaded/protobuf/t$d;


# virtual methods
.method public a()Lcom/google/crypto/tink/shaded/protobuf/U$b;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getLiteType()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$e;->a:Lcom/google/crypto/tink/shaded/protobuf/F;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    iget-boolean v0, v0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->e:Z

    return v0
.end method
