.class public LcZ3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcZ3;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/functions/a;

.field public final synthetic c:LcZ3;


# direct methods
.method public constructor <init>(LcZ3;Lio/reactivex/functions/a;)V
    .locals 0

    iput-object p1, p0, LcZ3$b;->c:LcZ3;

    iput-object p2, p0, LcZ3$b;->b:Lio/reactivex/functions/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LcZ3$b;->b:Lio/reactivex/functions/a;

    invoke-interface {v0}, Lio/reactivex/functions/a;->run()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object v0

    new-instance v1, LcZ3$b$a;

    invoke-direct {v1, p0, v0}, LcZ3$b$a;-><init>(LcZ3$b;Lio/reactivex/E$c;)V

    invoke-virtual {v0, v1}, Lio/reactivex/E$c;->b(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    :goto_0
    return-void
.end method
