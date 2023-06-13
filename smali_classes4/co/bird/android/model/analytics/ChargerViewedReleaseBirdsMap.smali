.class public final Lco/bird/android/model/analytics/ChargerViewedReleaseBirdsMap;
.super Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/analytics/ChargerViewedReleaseBirdsMap;",
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "()V",
        "brazeKey",
        "",
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
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lco/bird/android/model/analytics/Type;->CHARGER_VIEWED_RELEASE_BIRDS_MAP:Lco/bird/android/model/analytics/Type;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public brazeKey()Ljava/lang/String;
    .locals 1

    const-string v0, "CHARGER_VIEWED_RELEASE_BIRDS_MAP"

    return-object v0
.end method
