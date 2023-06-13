.class public abstract LsW1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LtW1;


# direct methods
.method public constructor <init>(LtW1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsW1;->a:LtW1;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;
.end method
