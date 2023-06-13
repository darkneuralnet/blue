.class public Lcom/google/protobuf/K$c;
.super Lcom/google/protobuf/K$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/K<",
        "TK;TV;>.g;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/google/protobuf/K;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/K;)V
    .locals 1

    iput-object p1, p0, Lcom/google/protobuf/K$c;->c:Lcom/google/protobuf/K;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/K$g;-><init>(Lcom/google/protobuf/K;Lcom/google/protobuf/K$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/K;Lcom/google/protobuf/K$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/protobuf/K$c;-><init>(Lcom/google/protobuf/K;)V

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

    new-instance v0, Lcom/google/protobuf/K$b;

    iget-object v1, p0, Lcom/google/protobuf/K$c;->c:Lcom/google/protobuf/K;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/K$b;-><init>(Lcom/google/protobuf/K;Lcom/google/protobuf/K$a;)V

    return-object v0
.end method
