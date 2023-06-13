.class public final Lco/bird/android/model/analytics/LastRideDate;
.super Lco/bird/android/model/analytics/PersistentPropertyEntry;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/analytics/LastRideDate;",
        "Lco/bird/android/model/analytics/PersistentPropertyEntry;",
        "()V",
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

    sget-object v0, Lco/bird/android/model/analytics/PersistentType;->LAST_RIDE_DATE:Lco/bird/android/model/analytics/PersistentType;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "now().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lco/bird/android/model/analytics/PersistentPropertyEntry;-><init>(Lco/bird/android/model/analytics/PersistentType;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
