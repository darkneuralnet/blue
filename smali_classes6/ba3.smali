.class public final Lba3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Laa3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "[B>;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "[B>;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lve5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LA01;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;",
            "LZ94<",
            "Lve5;",
            ">;",
            "LZ94<",
            "LA01;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba3;->a:LZ94;

    iput-object p2, p0, Lba3;->b:LZ94;

    iput-object p3, p0, Lba3;->c:LZ94;

    iput-object p4, p0, Lba3;->d:LZ94;

    iput-object p5, p0, Lba3;->e:LZ94;

    iput-object p6, p0, Lba3;->f:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lba3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "[B>;",
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;",
            "LZ94<",
            "Lve5;",
            ">;",
            "LZ94<",
            "LA01;",
            ">;)",
            "Lba3;"
        }
    .end annotation

    new-instance v7, Lba3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lba3;-><init>(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)V

    return-object v7
.end method

.method public static c([B[B[BLandroid/bluetooth/BluetoothGatt;Lve5;Ljava/lang/Object;)Laa3;
    .locals 8

    new-instance v7, Laa3;

    move-object v6, p5

    check-cast v6, LA01;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Laa3;-><init>([B[B[BLandroid/bluetooth/BluetoothGatt;Lve5;LA01;)V

    return-object v7
.end method


# virtual methods
.method public b()Laa3;
    .locals 7

    iget-object v0, p0, Lba3;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [B

    iget-object v0, p0, Lba3;->b:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [B

    iget-object v0, p0, Lba3;->c:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [B

    iget-object v0, p0, Lba3;->d:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, Lba3;->e:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lve5;

    iget-object v0, p0, Lba3;->f:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lba3;->c([B[B[BLandroid/bluetooth/BluetoothGatt;Lve5;Ljava/lang/Object;)Laa3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lba3;->b()Laa3;

    move-result-object v0

    return-object v0
.end method
