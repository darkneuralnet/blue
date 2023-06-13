.class public abstract Lda7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSb7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lea7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lda7<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "LSb7;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lda7;->k()Lda7;

    move-result-object v0

    return-object v0
.end method

.method public abstract k()Lda7;
.end method
