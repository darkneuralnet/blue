.class public LSt5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqy0;

.field public final b:Landroid/bluetooth/BluetoothGatt;

.field public final c:Lei3;

.field public d:Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/F<",
            "Lue5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "LL46;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Lqy0;Landroid/bluetooth/BluetoothGatt;Lei3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/h;->a()Lio/reactivex/subjects/h;

    move-result-object v0

    iput-object v0, p0, LSt5;->e:Lio/reactivex/subjects/h;

    const/4 v0, 0x0

    iput-boolean v0, p0, LSt5;->f:Z

    iput-object p1, p0, LSt5;->a:Lqy0;

    iput-object p2, p0, LSt5;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, LSt5;->c:Lei3;

    invoke-virtual {p0}, LSt5;->d()V

    return-void
.end method

.method public static f()Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothGattService;",
            ">;",
            "Lue5;",
            ">;"
        }
    .end annotation

    new-instance v0, LSt5$d;

    invoke-direct {v0}, LSt5$d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/F<",
            "Lue5;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, LSt5;->f:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, LSt5;->d:Lio/reactivex/F;

    return-object p1

    :cond_0
    iget-object v0, p0, LSt5;->d:Lio/reactivex/F;

    new-instance v1, LSt5$a;

    invoke-direct {v1, p0, p1, p2, p3}, LSt5$a;-><init>(LSt5;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothGattService;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LSt5$f;

    invoke-direct {v0, p0}, LSt5$f;-><init>(LSt5;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSt5$e;

    invoke-direct {v1, p0}, LSt5$e;-><init>(LSt5;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LL46;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSt5;->e:Lio/reactivex/subjects/h;

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LSt5;->f:Z

    invoke-virtual {p0}, LSt5;->b()Lio/reactivex/p;

    move-result-object v0

    invoke-static {}, LSt5;->f()Lio/reactivex/functions/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {p0}, LSt5;->c()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {p0}, LSt5;->e()Lio/reactivex/functions/o;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->W(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSt5$b;

    invoke-direct {v1, p0}, LSt5$b;-><init>(LSt5;)V

    invoke-static {v1}, Lio/reactivex/internal/functions/a;->a(Lio/reactivex/functions/a;)Lio/reactivex/functions/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSt5$c;

    invoke-direct {v1, p0}, LSt5$c;-><init>(LSt5;)V

    invoke-static {v1}, Lio/reactivex/internal/functions/a;->a(Lio/reactivex/functions/a;)Lio/reactivex/functions/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->h()Lio/reactivex/F;

    move-result-object v0

    iput-object v0, p0, LSt5;->d:Lio/reactivex/F;

    return-void
.end method

.method public final e()Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "LL46;",
            "Lio/reactivex/F<",
            "Lue5;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LSt5$g;

    invoke-direct {v0, p0}, LSt5$g;-><init>(LSt5;)V

    return-object v0
.end method
