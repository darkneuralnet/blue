.class public final synthetic LDW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/BleManagerHandler$b;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDW;->b:Lno/nordicsemi/android/ble/BleManagerHandler$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LDW;->b:Lno/nordicsemi/android/ble/BleManagerHandler$b;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V

    return-void
.end method
