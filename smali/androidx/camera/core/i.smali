.class public interface abstract Landroidx/camera/core/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/i$a;
    }
.end annotation


# virtual methods
.method public abstract A0()[Landroidx/camera/core/i$a;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ArrayReturn"
        }
    .end annotation
.end method

.method public abstract close()V
.end method

.method public abstract getCropRect()Landroid/graphics/Rect;
.end method

.method public abstract getFormat()I
.end method

.method public abstract getHeight()I
.end method

.method public abstract getWidth()I
.end method

.method public abstract i1()LwX1;
.end method

.method public abstract k3()Landroid/media/Image;
.end method

.method public abstract setCropRect(Landroid/graphics/Rect;)V
.end method
