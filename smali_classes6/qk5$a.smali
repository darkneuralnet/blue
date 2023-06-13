.class public Lqk5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqk5;->g(Lio/reactivex/y;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/y;

.field public final synthetic b:Lqk5;


# direct methods
.method public constructor <init>(Lqk5;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lqk5$a;->b:Lqk5;

    iput-object p2, p0, Lqk5$a;->a:Lio/reactivex/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 4

    iget-object v0, p0, Lqk5$a;->b:Lqk5;

    iget-object v0, v0, Lqk5;->d:LXa1;

    invoke-virtual {v0}, LXa1;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lye5;->l(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lye5;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p3}, LOx2;->a([B)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "%s, name=%s, rssi=%d, data=%s"

    invoke-static {v0, v1}, Lye5;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lqk5$a;->b:Lqk5;

    iget-object v0, v0, Lqk5;->c:Lu62;

    invoke-virtual {v0, p1, p2, p3}, Lu62;->b(Landroid/bluetooth/BluetoothDevice;I[B)Lxe5;

    move-result-object p1

    iget-object p2, p0, Lqk5$a;->b:Lqk5;

    iget-object p2, p2, Lqk5;->d:LXa1;

    invoke-virtual {p2, p1}, LXa1;->b(Lxe5;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lqk5$a;->a:Lio/reactivex/y;

    invoke-interface {p2, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
