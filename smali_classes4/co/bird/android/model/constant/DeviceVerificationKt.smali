.class public final Lco/bird/android/model/constant/DeviceVerificationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "EmptyDeviceVerification",
        "Lco/bird/android/model/constant/DeviceVerification;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final EmptyDeviceVerification()Lco/bird/android/model/constant/DeviceVerification;
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/DeviceVerification;

    const-string v1, "[init]"

    sget-object v2, Lco/bird/android/model/constant/HttpMethod;->NONE:Lco/bird/android/model/constant/HttpMethod;

    invoke-direct {v0, v1, v2, v1}, Lco/bird/android/model/constant/DeviceVerification;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/HttpMethod;Ljava/lang/String;)V

    return-object v0
.end method
