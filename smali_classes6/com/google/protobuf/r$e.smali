.class public Lcom/google/protobuf/r$e;
.super Lcom/google/protobuf/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/D;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/j<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/protobuf/D;

.field public final b:Lcom/google/protobuf/r$d;


# virtual methods
.method public a()Lcom/google/protobuf/P$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$e;->b:Lcom/google/protobuf/r$d;

    invoke-virtual {v0}, Lcom/google/protobuf/r$d;->getLiteType()Lcom/google/protobuf/P$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/protobuf/D;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$e;->a:Lcom/google/protobuf/D;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$e;->b:Lcom/google/protobuf/r$d;

    invoke-virtual {v0}, Lcom/google/protobuf/r$d;->getNumber()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$e;->b:Lcom/google/protobuf/r$d;

    iget-boolean v0, v0, Lcom/google/protobuf/r$d;->e:Z

    return v0
.end method
