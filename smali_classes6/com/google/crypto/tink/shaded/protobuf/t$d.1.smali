.class public final Lcom/google/crypto/tink/shaded/protobuf/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/crypto/tink/shaded/protobuf/q$b<",
        "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/crypto/tink/shaded/protobuf/v$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:Lcom/google/crypto/tink/shaded/protobuf/U$b;

.field public final e:Z

.field public final f:Z


# virtual methods
.method public a(Lcom/google/crypto/tink/shaded/protobuf/t$d;)I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->c:I

    iget p1, p1, Lcom/google/crypto/tink/shaded/protobuf/t$d;->c:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public a0(Lcom/google/crypto/tink/shaded/protobuf/F$a;Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$a;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->t(Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/google/crypto/tink/shaded/protobuf/v$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->b:Lcom/google/crypto/tink/shaded/protobuf/v$d;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->a(Lcom/google/crypto/tink/shaded/protobuf/t$d;)I

    move-result p1

    return p1
.end method

.method public getLiteJavaType()Lcom/google/crypto/tink/shaded/protobuf/U$c;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->d:Lcom/google/crypto/tink/shaded/protobuf/U$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/U$b;->a()Lcom/google/crypto/tink/shaded/protobuf/U$c;

    move-result-object v0

    return-object v0
.end method

.method public getLiteType()Lcom/google/crypto/tink/shaded/protobuf/U$b;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->d:Lcom/google/crypto/tink/shaded/protobuf/U$b;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->c:I

    return v0
.end method

.method public isPacked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->f:Z

    return v0
.end method

.method public isRepeated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$d;->e:Z

    return v0
.end method
