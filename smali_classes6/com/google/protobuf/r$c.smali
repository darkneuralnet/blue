.class public abstract Lcom/google/protobuf/r$c;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/r$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/r<",
        "TMessageType;TBuilderType;>;",
        "LwT2;"
    }
.end annotation


# instance fields
.field protected extensions:Lcom/google/protobuf/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/o<",
            "Lcom/google/protobuf/r$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    invoke-static {}, Lcom/google/protobuf/o;->h()Lcom/google/protobuf/o;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/r$c;->extensions:Lcom/google/protobuf/o;

    return-void
.end method


# virtual methods
.method public T()Lcom/google/protobuf/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/o<",
            "Lcom/google/protobuf/r$d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r$c;->extensions:Lcom/google/protobuf/o;

    invoke-virtual {v0}, Lcom/google/protobuf/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/r$c;->extensions:Lcom/google/protobuf/o;

    invoke-virtual {v0}, Lcom/google/protobuf/o;->b()Lcom/google/protobuf/o;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/r$c;->extensions:Lcom/google/protobuf/o;

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/r$c;->extensions:Lcom/google/protobuf/o;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/D;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/r;->B()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/D$a;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/r;->M()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/D$a;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/r;->S()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method
