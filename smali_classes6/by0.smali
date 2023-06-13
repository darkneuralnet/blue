.class public final Lby0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lay0;",
        ">;"
    }
.end annotation


# direct methods
.method public static a(Landroid/bluetooth/BluetoothDevice;LtU;Lve5;LkX;LL46;ZLxy0;)Lay0;
    .locals 9

    new-instance v8, Lay0;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lay0;-><init>(Landroid/bluetooth/BluetoothDevice;LtU;Lve5;LkX;LL46;ZLxy0;)V

    return-object v8
.end method
