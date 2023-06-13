.class public Lcom/google/crypto/tink/shaded/protobuf/g$a;
.super Lcom/google/crypto/tink/shaded/protobuf/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/crypto/tink/shaded/protobuf/g;->v()Lcom/google/crypto/tink/shaded/protobuf/g$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:I

.field public final c:I

.field public final synthetic d:Lcom/google/crypto/tink/shaded/protobuf/g;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/g$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->b:I

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result p1

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->c:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->b:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public nextByte()B
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->b:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->c:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->b:I

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/g$a;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->s(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
