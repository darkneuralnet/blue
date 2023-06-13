.class public Landroidx/camera/core/o$a;
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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LO80$a;

.field public final synthetic b:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic c:Landroidx/camera/core/o;


# direct methods
.method public constructor <init>(Landroidx/camera/core/o;LO80$a;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/o$a;->c:Landroidx/camera/core/o;

    iput-object p2, p0, Landroidx/camera/core/o$a;->a:LO80$a;

    iput-object p3, p0, Landroidx/camera/core/o$a;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/core/o$a;->a:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, LHZ3;->i(Z)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Landroidx/camera/core/o$f;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/camera/core/o$a;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    invoke-static {p1}, LHZ3;->i(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/camera/core/o$a;->a:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, LHZ3;->i(Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/o$a;->a(Ljava/lang/Void;)V

    return-void
.end method
