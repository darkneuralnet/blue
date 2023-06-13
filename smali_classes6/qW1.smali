.class public LqW1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LsW1;


# direct methods
.method public constructor <init>(LsW1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqW1;->a:LsW1;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lio/reactivex/c;
    .locals 1

    new-instance v0, LqW1$a;

    invoke-direct {v0, p0, p1, p2}, LqW1$a;-><init>(LqW1;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-static {v0}, Lio/reactivex/c;->G(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
