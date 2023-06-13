.class public Lcom/google/protobuf/u;
.super Lcom/google/protobuf/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/u$c;,
        Lcom/google/protobuf/u$b;
    }
.end annotation


# instance fields
.field public final f:Lcom/google/protobuf/D;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/u;->f()Lcom/google/protobuf/D;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Lcom/google/protobuf/D;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/u;->f:Lcom/google/protobuf/D;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/v;->c(Lcom/google/protobuf/D;)Lcom/google/protobuf/D;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/u;->f()Lcom/google/protobuf/D;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/u;->f()Lcom/google/protobuf/D;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
