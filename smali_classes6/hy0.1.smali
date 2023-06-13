.class public abstract Lhy0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public static b()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method public static c(LkX;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-virtual {p0}, LkX;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lei0;
    .locals 9

    new-instance v8, Lei0;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/16 v4, 0x8

    const/16 v5, 0x10

    const/16 v6, 0x20

    const/16 v7, 0x40

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lei0;-><init>(IIIIIII)V

    return-object v8
.end method

.method public static e(ZLZ94;LZ94;)LsW1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LZ94<",
            "LUx2;",
            ">;",
            "LZ94<",
            "LV36;",
            ">;)",
            "LsW1;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p1}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LsW1;

    return-object p0

    :cond_0
    invoke-interface {p2}, LZ94;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LsW1;

    return-object p0
.end method

.method public static f(Lio/reactivex/E;LK46;)LL46;
    .locals 3

    new-instance v0, LL46;

    iget-wide v1, p1, LK46;->b:J

    iget-object p1, p1, LK46;->a:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, p1, p0}, LL46;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-object v0
.end method
