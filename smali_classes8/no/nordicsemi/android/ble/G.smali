.class public final synthetic Lno/nordicsemi/android/ble/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/nordicsemi/android/ble/G;->a:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/G;->a:I

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->J(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
