.class public final synthetic Lno/nordicsemi/android/ble/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/nordicsemi/android/ble/k0;->a:I

    iput p2, p0, Lno/nordicsemi/android/ble/k0;->b:I

    iput p3, p0, Lno/nordicsemi/android/ble/k0;->c:I

    iput p4, p0, Lno/nordicsemi/android/ble/k0;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lno/nordicsemi/android/ble/k0;->a:I

    iget v1, p0, Lno/nordicsemi/android/ble/k0;->b:I

    iget v2, p0, Lno/nordicsemi/android/ble/k0;->c:I

    iget v3, p0, Lno/nordicsemi/android/ble/k0;->d:I

    invoke-static {v0, v1, v2, v3}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->Y(IIII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
