.class public final Lio/reactivex/android/schedulers/b;
.super Lio/reactivex/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/android/schedulers/b$b;,
        Lio/reactivex/android/schedulers/b$a;
    }
.end annotation


# instance fields
.field public final d:Landroid/os/Handler;

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Z)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/E;-><init>()V

    iput-object p1, p0, Lio/reactivex/android/schedulers/b;->d:Landroid/os/Handler;

    iput-boolean p2, p0, Lio/reactivex/android/schedulers/b;->e:Z

    return-void
.end method


# virtual methods
.method public b()Lio/reactivex/E$c;
    .locals 3

    new-instance v0, Lio/reactivex/android/schedulers/b$a;

    iget-object v1, p0, Lio/reactivex/android/schedulers/b;->d:Landroid/os/Handler;

    iget-boolean v2, p0, Lio/reactivex/android/schedulers/b;->e:Z

    invoke-direct {v0, v1, v2}, Lio/reactivex/android/schedulers/b$a;-><init>(Landroid/os/Handler;Z)V

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    if-eqz p1, :cond_2

    if-eqz p4, :cond_1

    invoke-static {p1}, Lio/reactivex/plugins/a;->w(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v0, Lio/reactivex/android/schedulers/b$b;

    iget-object v1, p0, Lio/reactivex/android/schedulers/b;->d:Landroid/os/Handler;

    invoke-direct {v0, v1, p1}, Lio/reactivex/android/schedulers/b$b;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lio/reactivex/android/schedulers/b;->d:Landroid/os/Handler;

    invoke-static {p1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    iget-boolean v1, p0, Lio/reactivex/android/schedulers/b;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Message;->setAsynchronous(Z)V

    :cond_0
    iget-object v1, p0, Lio/reactivex/android/schedulers/b;->d:Landroid/os/Handler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "unit == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "run == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
