.class public final Lcom/google/protobuf/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/o$b<",
        "Lcom/google/protobuf/r$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/protobuf/t$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$d<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:Lcom/google/protobuf/P$b;

.field public final e:Z

.field public final f:Z


# virtual methods
.method public S(Lcom/google/protobuf/D$a;Lcom/google/protobuf/D;)Lcom/google/protobuf/D$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/r$a;

    check-cast p2, Lcom/google/protobuf/r;

    invoke-virtual {p1, p2}, Lcom/google/protobuf/r$a;->H(Lcom/google/protobuf/r;)Lcom/google/protobuf/r$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/google/protobuf/r$d;)I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/r$d;->c:I

    iget p1, p1, Lcom/google/protobuf/r$d;->c:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public b()Lcom/google/protobuf/t$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/t$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r$d;->b:Lcom/google/protobuf/t$d;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/r$d;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r$d;->a(Lcom/google/protobuf/r$d;)I

    move-result p1

    return p1
.end method

.method public getLiteJavaType()Lcom/google/protobuf/P$c;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$d;->d:Lcom/google/protobuf/P$b;

    invoke-virtual {v0}, Lcom/google/protobuf/P$b;->b()Lcom/google/protobuf/P$c;

    move-result-object v0

    return-object v0
.end method

.method public getLiteType()Lcom/google/protobuf/P$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/r$d;->d:Lcom/google/protobuf/P$b;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/r$d;->c:I

    return v0
.end method

.method public isPacked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/r$d;->f:Z

    return v0
.end method

.method public isRepeated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/r$d;->e:Z

    return v0
.end method
