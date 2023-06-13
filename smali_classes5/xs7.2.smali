.class public abstract Lxs7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lys7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lxs7<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lev7;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic D0(Lfv7;)Lev7;
    .locals 1

    invoke-interface {p0}, Lgv7;->zzw()Lfv7;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lys7;

    invoke-virtual {p0, p1}, Lxs7;->e(Lys7;)Lxs7;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lxs7;->d()Lxs7;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Lxs7;
.end method

.method public abstract e(Lys7;)Lxs7;
.end method
