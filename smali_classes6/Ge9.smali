.class public abstract LGe9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LNe9<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LGe9<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "LKp9;"
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

    invoke-virtual {p0}, LGe9;->k()LGe9;

    move-result-object v0

    return-object v0
.end method

.method public abstract k()LGe9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation
.end method

.method public abstract l(LNe9;)LGe9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation
.end method

.method public final bridge synthetic p0(LNp9;)LKp9;
    .locals 1

    invoke-interface {p0}, LPp9;->h()LNp9;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, LNe9;

    invoke-virtual {p0, p1}, LGe9;->l(LNe9;)LGe9;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
