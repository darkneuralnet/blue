.class public LZk5$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZk5;->g()Lio/reactivex/functions/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lxe5;",
        "Lxe5;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxe5;)Lxe5;
    .locals 9

    new-instance v8, Lxe5;

    invoke-virtual {p1}, Lxe5;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Lxe5;->b()I

    move-result v2

    invoke-virtual {p1}, Lxe5;->d()J

    move-result-wide v3

    invoke-virtual {p1}, Lxe5;->getScanRecord()LCk5;

    move-result-object v5

    sget-object v6, Lkj5;->c:Lkj5;

    invoke-virtual {p1}, Lxe5;->e()LY92;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lxe5;-><init>(Landroid/bluetooth/BluetoothDevice;IJLCk5;Lkj5;LY92;)V

    return-object v8
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lxe5;

    invoke-virtual {p0, p1}, LZk5$d;->a(Lxe5;)Lxe5;

    move-result-object p1

    return-object p1
.end method
