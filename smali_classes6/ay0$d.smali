.class public Lay0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lay0;->e()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/J<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lay0;


# direct methods
.method public constructor <init>(Lay0;)V
    .locals 0

    iput-object p1, p0, Lay0$d;->a:Lay0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/H;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lay0$d;->a:Lay0;

    invoke-virtual {v0}, Lay0;->d()Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Lay0$d;->a:Lay0;

    iget-object v1, v1, Lay0;->d:Lve5;

    invoke-virtual {v1}, Lve5;->d()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lay0$d$a;

    invoke-direct {v2, p0}, Lay0$d$a;-><init>(Lay0$d;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->p(Lio/reactivex/B;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Lay0$d;->a:Lay0;

    iget-object v1, v1, Lay0;->d:Lve5;

    invoke-virtual {v1}, Lve5;->k()Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->L(Lio/reactivex/K;)Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->V()Lio/reactivex/F;

    move-result-object v0

    invoke-static {p1}, Lr51;->b(Lio/reactivex/H;)Lio/reactivex/observers/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Z(Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object v0

    check-cast v0, Lio/reactivex/observers/e;

    invoke-interface {p1, v0}, Lio/reactivex/H;->b(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lay0$d;->a:Lay0;

    iget-object p1, p1, Lay0;->h:Lxy0;

    sget-object v0, Lke5$a;->c:Lke5$a;

    invoke-interface {p1, v0}, Lxy0;->a(Lke5$a;)V

    iget-object p1, p0, Lay0$d;->a:Lay0;

    iget-object v0, p1, Lay0;->c:LtU;

    iget-object v1, p1, Lay0;->b:Landroid/bluetooth/BluetoothDevice;

    iget-boolean v2, p1, Lay0;->g:Z

    iget-object p1, p1, Lay0;->d:Lve5;

    invoke-virtual {p1}, Lve5;->a()Landroid/bluetooth/BluetoothGattCallback;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, LtU;->a(Landroid/bluetooth/BluetoothDevice;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iget-object v0, p0, Lay0$d;->a:Lay0;

    iget-object v0, v0, Lay0;->e:LkX;

    invoke-virtual {v0, p1}, LkX;->b(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method
