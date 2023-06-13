.class public interface abstract LLY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCq2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LCq2;"
    }
.end annotation


# virtual methods
.method public abstract getRequest()LnI4;
.end method

.method public abstract getSize(LFB5;)V
.end method

.method public abstract onLoadCleared(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract onLoadFailed(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract onLoadStarted(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract onResourceReady(Ljava/lang/Object;LG96;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "LG96<",
            "-TR;>;)V"
        }
    .end annotation
.end method

.method public abstract removeCallback(LFB5;)V
.end method

.method public abstract setRequest(LnI4;)V
.end method
