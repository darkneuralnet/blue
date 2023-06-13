.class public abstract LsT7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQi8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LGT7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LsT7<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "LQi8;"
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

    invoke-virtual {p0}, LsT7;->e()LsT7;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()LsT7;
.end method
