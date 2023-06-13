.class public final synthetic LIU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/BleManagerHandler$e;

.field public final synthetic c:LyU;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIU;->b:Lno/nordicsemi/android/ble/BleManagerHandler$e;

    iput-object p2, p0, LIU;->c:LyU;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LIU;->b:Lno/nordicsemi/android/ble/BleManagerHandler$e;

    iget-object v1, p0, LIU;->c:LyU;

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->O(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V

    return-void
.end method
