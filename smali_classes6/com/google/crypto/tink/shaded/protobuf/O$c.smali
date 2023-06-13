.class public Lcom/google/crypto/tink/shaded/protobuf/O$c;
.super Lcom/google/crypto/tink/shaded/protobuf/O$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/O<",
        "TK;TV;>.g;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/google/crypto/tink/shaded/protobuf/O;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/O;)V
    .locals 1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/O$c;->c:Lcom/google/crypto/tink/shaded/protobuf/O;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/O$g;-><init>(Lcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/O$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/O$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/O$c;-><init>(Lcom/google/crypto/tink/shaded/protobuf/O;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/O$b;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/O$c;->c:Lcom/google/crypto/tink/shaded/protobuf/O;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/O$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/O;Lcom/google/crypto/tink/shaded/protobuf/O$a;)V

    return-object v0
.end method
