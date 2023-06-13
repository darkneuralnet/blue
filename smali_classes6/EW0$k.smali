.class public LEW0$k;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public a:Z

.field public b:LEW0$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEW0<",
            "TT;>.j;"
        }
    .end annotation
.end field

.field public final synthetic c:LEW0;


# direct methods
.method public constructor <init>(LEW0;)V
    .locals 0

    iput-object p1, p0, LEW0$k;->c:LEW0;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LEW0$k;->a:Z

    const/4 p1, 0x0

    iput-object p1, p0, LEW0$k;->b:LEW0$j;

    return-void
.end method

.method public synthetic constructor <init>(LEW0;LKW0;)V
    .locals 0

    invoke-direct {p0, p1}, LEW0$k;-><init>(LEW0;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, LEW0$j;

    iget-object v1, p0, LEW0$k;->c:LEW0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LEW0$j;-><init>(LEW0;Ljava/util/Set;LJW0;)V

    iput-object v0, p0, LEW0$k;->b:LEW0$j;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    iput-boolean v0, p0, LEW0$k;->a:Z

    iget-object p1, p0, LEW0$k;->b:LEW0$j;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-boolean p1, p0, LEW0$k;->a:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, LEW0$k;->b:LEW0$j;

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LEW0$k;->c:LEW0;

    invoke-static {p1}, LEW0;->i(LEW0;)LcD1;

    move-result-object p1

    invoke-virtual {p1}, LcD1;->k()LU74;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LEW0$k;->b:LEW0$j;

    const/4 v2, 0x0

    iput-object v2, p0, LEW0$k;->b:LEW0$j;

    iput-boolean v1, p0, LEW0$k;->a:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, LEW0$k$a;

    invoke-direct {v1, p0}, LEW0$k$a;-><init>(LEW0$k;)V

    invoke-virtual {v0, v1}, LEW0$j;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0, p1}, LEW0$j;->c(LU74;)V

    iget-object p1, p0, LEW0$k;->c:LEW0;

    invoke-static {p1}, LEW0;->i(LEW0;)LcD1;

    move-result-object p1

    invoke-virtual {p1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-virtual {v0, p1}, LEW0$j;->b(F)V

    new-instance p1, Ljava/lang/Thread;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
