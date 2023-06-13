.class public final Lco/bird/android/model/analytics/MapViewed;
.super Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/analytics/RecurrentNthEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/analytics/MapViewed;",
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "Lco/bird/android/model/analytics/RecurrentNthEvent;",
        "()V",
        "nthEvent",
        "count",
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

    sget-object v0, Lco/bird/android/model/analytics/Type;->MAP_VIEWED:Lco/bird/android/model/analytics/Type;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public nthEvent(I)Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Lco/bird/android/model/analytics/ViewRiderMapFirstTime;

    invoke-direct {p1}, Lco/bird/android/model/analytics/ViewRiderMapFirstTime;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
