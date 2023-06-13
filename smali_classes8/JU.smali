.class public final synthetic LJU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/BleManagerHandler$f;

.field public final synthetic c:Loy0;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJU;->b:Lno/nordicsemi/android/ble/BleManagerHandler$f;

    iput-object p2, p0, LJU;->c:Loy0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJU;->b:Lno/nordicsemi/android/ble/BleManagerHandler$f;

    iget-object v1, p0, LJU;->c:Loy0;

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->z(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V

    return-void
.end method
