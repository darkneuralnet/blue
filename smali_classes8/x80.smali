.class public interface abstract Lx80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# virtual methods
.method public abstract E0(LH80;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH80<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract cancel()V
.end method

.method public abstract clone()Lx80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx80<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract execute()LHM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LHM4<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract isCanceled()Z
.end method

.method public abstract request()Lokhttp3/Request;
.end method
