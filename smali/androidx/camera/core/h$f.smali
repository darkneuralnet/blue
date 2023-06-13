.class public Landroidx/camera/core/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LeX1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/h;


# direct methods
.method public constructor <init>(Landroidx/camera/core/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/h$f;->a:Landroidx/camera/core/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/h$f;->a:Landroidx/camera/core/h;

    invoke-virtual {v0}, Landroidx/camera/core/h;->K0()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/h$f;->a:Landroidx/camera/core/h;

    invoke-virtual {v0}, Landroidx/camera/core/h;->W0()V

    return-void
.end method

.method public c(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/h$f;->a:Landroidx/camera/core/h;

    invoke-virtual {v0, p1}, Landroidx/camera/core/h;->Q0(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
