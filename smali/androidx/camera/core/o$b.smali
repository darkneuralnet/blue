.class public Landroidx/camera/core/o$b;
.super Landroidx/camera/core/impl/DeferrableSurface;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic m:Landroidx/camera/core/o;


# direct methods
.method public constructor <init>(Landroidx/camera/core/o;Landroid/util/Size;I)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/o$b;->m:Landroidx/camera/core/o;

    invoke-direct {p0, p2, p3}, Landroidx/camera/core/impl/DeferrableSurface;-><init>(Landroid/util/Size;I)V

    return-void
.end method


# virtual methods
.method public o()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/o$b;->m:Landroidx/camera/core/o;

    iget-object v0, v0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method
