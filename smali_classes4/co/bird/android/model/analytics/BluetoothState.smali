.class public final Lco/bird/android/model/analytics/BluetoothState;
.super Lco/bird/android/model/analytics/PersistentPropertyEntry;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/analytics/BluetoothState;",
        "Lco/bird/android/model/analytics/PersistentPropertyEntry;",
        "value",
        "",
        "(Ljava/lang/Object;)V",
        "model-analytics_release"
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
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/analytics/PersistentType;->BLUETOOTH_STATE:Lco/bird/android/model/analytics/PersistentType;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lco/bird/android/model/analytics/PersistentPropertyEntry;-><init>(Lco/bird/android/model/analytics/PersistentType;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
