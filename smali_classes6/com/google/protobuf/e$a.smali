.class public Lcom/google/protobuf/e$a;
.super Lcom/google/protobuf/e$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/e;->u()Lcom/google/protobuf/e$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:I

.field public final c:I

.field public final synthetic d:Lcom/google/protobuf/e;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/e;)V
    .locals 1

    iput-object p1, p0, Lcom/google/protobuf/e$a;->d:Lcom/google/protobuf/e;

    invoke-direct {p0}, Lcom/google/protobuf/e$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/e$a;->b:I

    invoke-virtual {p1}, Lcom/google/protobuf/e;->size()I

    move-result p1

    iput p1, p0, Lcom/google/protobuf/e$a;->c:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/protobuf/e$a;->b:I

    iget v1, p0, Lcom/google/protobuf/e$a;->c:I

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

    iget v0, p0, Lcom/google/protobuf/e$a;->b:I

    iget v1, p0, Lcom/google/protobuf/e$a;->c:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/protobuf/e$a;->b:I

    iget-object v1, p0, Lcom/google/protobuf/e$a;->d:Lcom/google/protobuf/e;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/e;->o(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
