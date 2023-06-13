.class public final Lco/bird/android/model/BleScannedVehicle$payloadEncryptor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BlePayloadEncryptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BleScannedVehicle$DefaultImpls;->payloadEncryptor(Lco/bird/android/model/BleScannedVehicle;)Lco/bird/android/model/BlePayloadEncryptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "co/bird/android/model/BleScannedVehicle$payloadEncryptor$1",
        "Lco/bird/android/model/BlePayloadEncryptor;",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public decrypt([BLjava/lang/String;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lco/bird/android/model/BlePayloadEncryptor$DefaultImpls;->decrypt(Lco/bird/android/model/BlePayloadEncryptor;[BLjava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public encrypt([BLjava/lang/String;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lco/bird/android/model/BlePayloadEncryptor$DefaultImpls;->encrypt(Lco/bird/android/model/BlePayloadEncryptor;[BLjava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
