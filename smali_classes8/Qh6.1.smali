.class public LQh6;
.super Ljj5;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljj5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljj5;)V
    .locals 1

    invoke-direct {p0}, Ljj5;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljj5;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljj5;->b(I)V

    :cond_0
    return-void
.end method

.method public c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 1

    iget-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    :cond_0
    return-void
.end method

.method public d()Ljj5;
    .locals 1

    iget-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj5;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LQh6;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
