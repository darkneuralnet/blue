.class public final Lco/bird/android/model/BleScannedVehicle$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/BleScannedVehicle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static payloadEncryptor(Lco/bird/android/model/BleScannedVehicle;)Lco/bird/android/model/BlePayloadEncryptor;
    .locals 0

    new-instance p0, Lco/bird/android/model/BleScannedVehicle$payloadEncryptor$1;

    invoke-direct {p0}, Lco/bird/android/model/BleScannedVehicle$payloadEncryptor$1;-><init>()V

    return-object p0
.end method
