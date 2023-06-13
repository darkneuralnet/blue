.class public LUo6$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUo6;->I0(Landroidx/camera/core/impl/q$b;Z)V
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
.field public final synthetic a:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic b:Z

.field public final synthetic c:LUo6;


# direct methods
.method public constructor <init>(LUo6;Lcom/google/common/util/concurrent/ListenableFuture;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LUo6$c;->c:LUo6;

    iput-object p2, p0, LUo6$c;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-boolean p3, p0, LUo6$c;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, LUo6$c;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v0, p0, LUo6$c;->c:LUo6;

    iget-object v1, v0, LUo6;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    if-ne p1, v1, :cond_1

    iget-object p1, v0, LUo6;->t:Ltp6$a;

    sget-object v1, Ltp6$a;->d:Ltp6$a;

    if-eq p1, v1, :cond_1

    iget-boolean p1, p0, LUo6$c;->b:Z

    if-eqz p1, :cond_0

    sget-object p1, Ltp6$a;->b:Ltp6$a;

    goto :goto_0

    :cond_0
    sget-object p1, Ltp6$a;->c:Ltp6$a;

    :goto_0
    invoke-virtual {v0, p1}, LUo6;->G0(Ltp6$a;)V

    :cond_1
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const-string v0, "VideoCapture"

    const-string v1, "Surface update completed with unexpected exception"

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LUo6$c;->a(Ljava/lang/Void;)V

    return-void
.end method
