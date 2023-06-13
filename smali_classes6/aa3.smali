.class public Laa3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/UUID;


# instance fields
.field public final a:[B

.field public final b:[B

.field public final c:[B

.field public final d:Landroid/bluetooth/BluetoothGatt;

.field public final e:Lve5;

.field public final f:LA01;

.field public final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ldi0;",
            "LL2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Laa3;->h:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>([B[B[BLandroid/bluetooth/BluetoothGatt;Lve5;LA01;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Laa3;->g:Ljava/util/Map;

    iput-object p1, p0, Laa3;->a:[B

    iput-object p2, p0, Laa3;->b:[B

    iput-object p3, p0, Laa3;->c:[B

    iput-object p4, p0, Laa3;->d:Landroid/bluetooth/BluetoothGatt;

    iput-object p5, p0, Laa3;->e:Lve5;

    iput-object p6, p0, Laa3;->f:LA01;

    return-void
.end method

.method public static synthetic a(Lio/reactivex/c;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Laa3;->n(Lio/reactivex/c;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/c;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Laa3;->s(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/c;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Laa3;->t(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Laa3;Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)Lio/reactivex/B;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Laa3;->r(Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ldi0;Lci0;)Z
    .locals 0

    invoke-static {p0, p1}, Laa3;->k(Ldi0;Lci0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Laa3;Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Laa3;->q(Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V

    return-void
.end method

.method public static synthetic g(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/Observable;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Laa3;->o(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lio/reactivex/subjects/d;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Laa3;->p(Lio/reactivex/subjects/d;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Laa3;->m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    return-void
.end method

.method public static synthetic j(Lci0;)[B
    .locals 0

    invoke-static {p0}, Laa3;->l(Lci0;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ldi0;Lci0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p1, p0}, Lci0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic l(Lci0;)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p0, p0, Lci0;->a:[B

    return-object p0
.end method

.method public static synthetic m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    throw p0
.end method

.method public static synthetic n(Lio/reactivex/c;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/h;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/Observable;)Lio/reactivex/B;
    .locals 1

    sget-object v0, Laa3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    invoke-static {p1, p2, p3}, Laa3;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0, p4}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p2, p3}, Laa3;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/c;->h0()Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lio/reactivex/observables/a;->a(I)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p4, p0}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/h;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LZ93;

    invoke-direct {p2, p0}, LZ93;-><init>(Lio/reactivex/c;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p4
.end method

.method public static synthetic p(Lio/reactivex/subjects/d;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/Observable;

    const-class v1, [B

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->cast(Ljava/lang/Class;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->amb(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private synthetic q(Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p1}, Lio/reactivex/subjects/d;->onComplete()V

    iget-object p1, p0, Laa3;->g:Ljava/util/Map;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Laa3;->g:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Laa3;->d:Landroid/bluetooth/BluetoothGatt;

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, Laa3;->v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/c;

    move-result-object p1

    iget-object p2, p0, Laa3;->f:LA01;

    iget-object v0, p0, Laa3;->c:[B

    invoke-static {p2, p3, v0, p4}, Laa3;->y(LA01;Landroid/bluetooth/BluetoothGattCharacteristic;[BLfd3;)Lio/reactivex/i;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->q(Lio/reactivex/i;)Lio/reactivex/c;

    move-result-object p1

    sget-object p2, Lio/reactivex/internal/functions/a;->c:Lio/reactivex/functions/a;

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lio/reactivex/c;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method private synthetic r(Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)Lio/reactivex/B;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Laa3;->g:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v7, Ldi0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getInstanceId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v7, v1, v2}, Ldi0;-><init>(Ljava/util/UUID;Ljava/lang/Integer;)V

    iget-object v1, p0, Laa3;->g:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL2;

    const/4 v8, 0x1

    if-eqz v1, :cond_2

    iget-boolean p3, v1, LL2;->b:Z

    if-ne p3, p2, :cond_0

    iget-object p1, v1, LL2;->a:Lio/reactivex/Observable;

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p3, Lcom/polidea/rxandroidble2/exceptions/BleConflictingNotificationAlreadySetException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_0
    invoke-direct {p3, p1, v8}, Lcom/polidea/rxandroidble2/exceptions/BleConflictingNotificationAlreadySetException;-><init>(Ljava/util/UUID;Z)V

    invoke-static {p3}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_2
    if-eqz p2, :cond_3

    iget-object v1, p0, Laa3;->b:[B

    goto :goto_1

    :cond_3
    iget-object v1, p0, Laa3;->a:[B

    :goto_1
    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v3

    iget-object v2, p0, Laa3;->d:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v2, p1, v8}, Laa3;->v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/c;

    move-result-object v2

    iget-object v4, p0, Laa3;->e:Lve5;

    invoke-static {v4, v7}, Laa3;->u(Lve5;Ldi0;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-static {v4}, Lde3;->b(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-virtual {v2, v4}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v2

    iget-object v4, p0, Laa3;->f:LA01;

    invoke-static {v4, p1, v1, p3}, Laa3;->w(LA01;Landroid/bluetooth/BluetoothGattCharacteristic;[BLfd3;)Lio/reactivex/C;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, LR93;

    invoke-direct {v2, v3}, LR93;-><init>(Lio/reactivex/subjects/d;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v9

    new-instance v10, LS93;

    move-object v1, v10

    move-object v2, p0

    move-object v4, v7

    move-object v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, LS93;-><init>(Laa3;Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V

    invoke-virtual {v9, v10}, Lio/reactivex/Observable;->doFinally(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object p3, p0, Laa3;->e:Lve5;

    invoke-virtual {p3}, Lve5;->k()Lio/reactivex/Observable;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1, v8}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/a;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/observables/a;->i()Lio/reactivex/Observable;

    move-result-object p1

    iget-object p3, p0, Laa3;->g:Ljava/util/Map;

    new-instance v1, LL2;

    invoke-direct {v1, p1, p2}, LL2;-><init>(Lio/reactivex/Observable;Z)V

    invoke-interface {p3, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic s(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/c;)Lio/reactivex/h;
    .locals 1

    sget-object v0, Lfd3;->c:Lfd3;

    if-ne p0, v0, :cond_0

    return-object p4

    :cond_0
    invoke-static {p1, p2, p3}, Laa3;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p4, p0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lio/reactivex/h;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1, p1}, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static u(Lve5;Ldi0;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5;",
            "Ldi0;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0}, Lve5;->b()Lio/reactivex/Observable;

    move-result-object p0

    new-instance v0, LW93;

    invoke-direct {v0, p1}, LW93;-><init>(Ldi0;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, LX93;

    invoke-direct {p1}, LX93;-><init>()V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/c;
    .locals 1

    new-instance v0, LV93;

    invoke-direct {v0, p0, p1, p2}, LV93;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    invoke-static {v0}, Lio/reactivex/c;->G(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static w(LA01;Landroid/bluetooth/BluetoothGattCharacteristic;[BLfd3;)Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LA01;",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "[B",
            "Lfd3;",
            ")",
            "Lio/reactivex/C<",
            "Lio/reactivex/Observable<",
            "[B>;",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    new-instance v0, LT93;

    invoke-direct {v0, p3, p1, p0, p2}, LT93;-><init>(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)V

    return-object v0
.end method

.method public static y(LA01;Landroid/bluetooth/BluetoothGattCharacteristic;[BLfd3;)Lio/reactivex/i;
    .locals 1

    new-instance v0, LU93;

    invoke-direct {v0, p3, p1, p0, p2}, LU93;-><init>(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)V

    return-object v0
.end method

.method public static z(Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)Lio/reactivex/c;
    .locals 1

    sget-object v0, Laa3;->h:Ljava/util/UUID;

    invoke-virtual {p0, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1, v0, p2}, LA01;->a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lio/reactivex/c;

    move-result-object p1

    new-instance p2, LY93;

    invoke-direct {p2, p0}, LY93;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {p1, p2}, Lio/reactivex/c;->S(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public x(Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "Lfd3;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    new-instance v0, LQ93;

    invoke-direct {v0, p0, p1, p3, p2}, LQ93;-><init>(Laa3;Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
