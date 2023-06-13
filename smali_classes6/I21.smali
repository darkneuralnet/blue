.class public abstract LI21;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Lpd5;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-virtual {p1, p0}, Lpd5;->a(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method public static b(LAG;)Lxy0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAG<",
            "Lke5$a;",
            ">;)",
            "Lxy0;"
        }
    .end annotation

    new-instance v0, LI21$a;

    invoke-direct {v0, p0}, LI21$a;-><init>(LAG;)V

    return-object v0
.end method

.method public static c()LAG;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LAG<",
            "Lke5$a;",
            ">;"
        }
    .end annotation

    sget-object v0, Lke5$a;->e:Lke5$a;

    invoke-static {v0}, LAG;->h(Ljava/lang/Object;)LAG;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lio/reactivex/E;)LL46;
    .locals 4

    new-instance v0, LL46;

    const-wide/16 v1, 0x23

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3, p0}, LL46;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-object v0
.end method

.method public static e(Lio/reactivex/E;)LL46;
    .locals 4

    new-instance v0, LL46;

    const-wide/16 v1, 0xa

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3, p0}, LL46;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    return-object v0
.end method
