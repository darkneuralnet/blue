.class public final Lco/bird/android/model/analytics/AppStart;
.super Lco/bird/android/model/analytics/TraceKey;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/analytics/AppStart;",
        "Lco/bird/android/model/analytics/TraceKey;",
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
    .locals 2

    const-string v0, "app_start"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lco/bird/android/model/analytics/TraceKey;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
