.class public Lle5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lke5;


# instance fields
.field public final a:Lqy0;

.field public final b:Lve5;

.field public final c:Landroid/bluetooth/BluetoothGatt;

.field public final d:Lei3;

.field public final e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/E;

.field public final g:LSt5;

.field public final h:Laa3;

.field public final i:LoW2;

.field public final j:LA01;

.field public final k:LqW1;


# direct methods
.method public constructor <init>(Lqy0;Lve5;Landroid/bluetooth/BluetoothGatt;LSt5;Laa3;LoW2;LA01;Lei3;LZ94;Lio/reactivex/E;LqW1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqy0;",
            "Lve5;",
            "Landroid/bluetooth/BluetoothGatt;",
            "LSt5;",
            "Laa3;",
            "LoW2;",
            "LA01;",
            "Lei3;",
            "LZ94<",
            "Ljava/lang/Object;",
            ">;",
            "Lio/reactivex/E;",
            "LqW1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle5;->a:Lqy0;

    iput-object p2, p0, Lle5;->b:Lve5;

    iput-object p3, p0, Lle5;->c:Landroid/bluetooth/BluetoothGatt;

    iput-object p4, p0, Lle5;->g:LSt5;

    iput-object p5, p0, Lle5;->h:Laa3;

    iput-object p6, p0, Lle5;->i:LoW2;

    iput-object p7, p0, Lle5;->j:LA01;

    iput-object p8, p0, Lle5;->d:Lei3;

    iput-object p9, p0, Lle5;->e:LZ94;

    iput-object p10, p0, Lle5;->f:Lio/reactivex/E;

    iput-object p11, p0, Lle5;->k:LqW1;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lue5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lle5;->g:LSt5;

    const-wide/16 v1, 0x14

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, LSt5;->a(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/UUID;Lfd3;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lfd3;",
            ")",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lle5;->e(Ljava/util/UUID;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lle5$b;

    invoke-direct {v0, p0, p2}, Lle5$b;-><init>(Lle5;Lfd3;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/UUID;[B)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "[B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lle5;->e(Ljava/util/UUID;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lle5$c;

    invoke-direct {v0, p0, p2}, Lle5$c;-><init>(Lle5;[B)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/UUID;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    sget-object v0, Lfd3;->b:Lfd3;

    invoke-virtual {p0, p1, v0}, Lle5;->b(Ljava/util/UUID;Lfd3;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/UUID;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lle5;->a()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lle5$a;

    invoke-direct {v1, p0, p1}, Lle5$a;-><init>(Lle5;Ljava/util/UUID;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "Lfd3;",
            ")",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    iget-object v0, p0, Lle5;->k:LqW1;

    const/16 v1, 0x10

    invoke-virtual {v0, p1, v1}, LqW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lle5;->h:Laa3;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, p2, v2}, Laa3;->x(Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;Z)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "[B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lle5;->k:LqW1;

    const/16 v1, 0x4c

    invoke-virtual {v0, p1, v1}, LqW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lle5;->a:Lqy0;

    iget-object v2, p0, Lle5;->d:Lei3;

    invoke-interface {v2, p1, p2}, Lei3;->c(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lfi0;

    move-result-object p1

    invoke-interface {v1, p1}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
