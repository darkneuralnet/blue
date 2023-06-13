.class public Lut2$a;
.super LuX2;
.source "SourceFile"

# interfaces
.implements Lst2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lut2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "LuX2<",
        "TD;>;",
        "Lst2$b<",
        "TD;>;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Landroid/os/Bundle;

.field public final c:Lst2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lst2<",
            "TD;>;"
        }
    .end annotation
.end field

.field public d:LLifecycleOwner;

.field public e:Lut2$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lut2$b<",
            "TD;>;"
        }
    .end annotation
.end field

.field public f:Lst2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lst2<",
            "TD;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroid/os/Bundle;Lst2;Lst2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            "Lst2<",
            "TD;>;",
            "Lst2<",
            "TD;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LuX2;-><init>()V

    iput p1, p0, Lut2$a;->a:I

    iput-object p2, p0, Lut2$a;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lut2$a;->c:Lst2;

    iput-object p4, p0, Lut2$a;->f:Lst2;

    invoke-virtual {p3, p1, p0}, Lst2;->registerListener(ILst2$b;)V

    return-void
.end method


# virtual methods
.method public a(Lst2;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lst2<",
            "TD;>;TD;)V"
        }
    .end annotation

    sget-boolean p1, Lut2;->c:Z

    const-string v0, "LoaderManager"

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoadComplete: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_1

    invoke-virtual {p0, p2}, Lut2$a;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-boolean p1, Lut2;->c:Z

    if-eqz p1, :cond_2

    const-string p1, "onLoadComplete was incorrectly called on a background thread"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {p0, p2}, LuX2;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public b(Z)Lst2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lst2<",
            "TD;>;"
        }
    .end annotation

    sget-boolean v0, Lut2;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Destroying: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lut2$a;->c:Lst2;

    invoke-virtual {v0}, Lst2;->cancelLoad()Z

    iget-object v0, p0, Lut2$a;->c:Lst2;

    invoke-virtual {v0}, Lst2;->abandon()V

    iget-object v0, p0, Lut2$a;->e:Lut2$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lut2$a;->removeObserver(Lfe3;)V

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lut2$b;->c()V

    :cond_1
    iget-object v1, p0, Lut2$a;->c:Lst2;

    invoke-virtual {v1, p0}, Lst2;->unregisterListener(Lst2$b;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lut2$b;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    if-eqz p1, :cond_4

    :cond_3
    iget-object p1, p0, Lut2$a;->c:Lst2;

    invoke-virtual {p1}, Lst2;->reset()V

    iget-object p1, p0, Lut2$a;->f:Lst2;

    return-object p1

    :cond_4
    iget-object p1, p0, Lut2$a;->c:Lst2;

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mId="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lut2$a;->a:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mArgs="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lut2$a;->b:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoader="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lut2$a;->c:Lst2;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Lut2$a;->c:Lst2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Lst2;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, Lut2$a;->e:Lut2$b;

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCallbacks="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lut2$a;->e:Lut2$b;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Lut2$a;->e:Lut2$b;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Lut2$b;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mData="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Lut2$a;->d()Lst2;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p2, p4}, Lst2;->dataToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mStarted="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method public d()Lst2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lst2<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, Lut2$a;->c:Lst2;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lut2$a;->d:LLifecycleOwner;

    iget-object v1, p0, Lut2$a;->e:Lut2$b;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-super {p0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Lfe3;)V

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    :cond_0
    return-void
.end method

.method public f(LLifecycleOwner;Ltt2$a;)Lst2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "Ltt2$a<",
            "TD;>;)",
            "Lst2<",
            "TD;>;"
        }
    .end annotation

    new-instance v0, Lut2$b;

    iget-object v1, p0, Lut2$a;->c:Lst2;

    invoke-direct {v0, v1, p2}, Lut2$b;-><init>(Lst2;Ltt2$a;)V

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    iget-object p2, p0, Lut2$a;->e:Lut2$b;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lut2$a;->removeObserver(Lfe3;)V

    :cond_0
    iput-object p1, p0, Lut2$a;->d:LLifecycleOwner;

    iput-object v0, p0, Lut2$a;->e:Lut2$b;

    iget-object p1, p0, Lut2$a;->c:Lst2;

    return-object p1
.end method

.method public onActive()V
    .locals 2

    sget-boolean v0, Lut2;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Starting: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lut2$a;->c:Lst2;

    invoke-virtual {v0}, Lst2;->startLoading()V

    return-void
.end method

.method public onInactive()V
    .locals 2

    sget-boolean v0, Lut2;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Stopping: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lut2$a;->c:Lst2;

    invoke-virtual {v0}, Lst2;->stopLoading()V

    return-void
.end method

.method public removeObserver(Lfe3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe3<",
            "-TD;>;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/lifecycle/LiveData;->removeObserver(Lfe3;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lut2$a;->d:LLifecycleOwner;

    iput-object p1, p0, Lut2$a;->e:Lut2$b;

    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    invoke-super {p0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lut2$a;->f:Lst2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lst2;->reset()V

    const/4 p1, 0x0

    iput-object p1, p0, Lut2$a;->f:Lst2;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lut2$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lut2$a;->c:Lst2;

    invoke-static {v1, v0}, LgV0;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
