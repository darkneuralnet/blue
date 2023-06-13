.class public abstract Lcom/google/crypto/tink/shaded/protobuf/t$c;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/crypto/tink/shaded/protobuf/t$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "TMessageType;TBuilderType;>;",
        "LxT2;"
    }
.end annotation


# instance fields
.field protected extensions:Lcom/google/crypto/tink/shaded/protobuf/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->h()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    return-void
.end method


# virtual methods
.method public F()Lcom/google/crypto/tink/shaded/protobuf/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/q;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    return-object v0
.end method
