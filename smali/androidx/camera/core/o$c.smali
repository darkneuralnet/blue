.class public Landroidx/camera/core/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Landroid/view/Surface;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic b:LO80$a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/camera/core/o;


# direct methods
.method public constructor <init>(Landroidx/camera/core/o;Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/o$c;->d:Landroidx/camera/core/o;

    iput-object p2, p0, Landroidx/camera/core/o$c;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object p3, p0, Landroidx/camera/core/o$c;->b:LO80$a;

    iput-object p4, p0, Landroidx/camera/core/o$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/core/o$c;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v0, p0, Landroidx/camera/core/o$c;->b:LO80$a;

    invoke-static {p1, v0}, LIA1;->k(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/core/o$c;->b:LO80$a;

    new-instance v1, Landroidx/camera/core/o$f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Landroidx/camera/core/o$c;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " cancelled."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroidx/camera/core/o$f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-static {p1}, LHZ3;->i(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/camera/core/o$c;->b:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/Surface;

    invoke-virtual {p0, p1}, Landroidx/camera/core/o$c;->a(Landroid/view/Surface;)V

    return-void
.end method
