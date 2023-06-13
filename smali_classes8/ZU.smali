.class public final synthetic LZU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$g;


# instance fields
.field public final synthetic a:Lno/nordicsemi/android/ble/n0;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZU;->a:Lno/nordicsemi/android/ble/n0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LZU;->a:Lno/nordicsemi/android/ble/n0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->E(Lno/nordicsemi/android/ble/n0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
