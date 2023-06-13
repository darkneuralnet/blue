.class public interface abstract LZ9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0006H\'\u00a8\u0006\t"
    }
    d2 = {
        "LZ9;",
        "",
        "Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;",
        "events",
        "Lio/reactivex/Observable;",
        "a",
        "Lco/bird/api/request/CreateAnalyticsEventsBody;",
        "Lio/reactivex/F;",
        "b",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "analytics/track"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use track()"
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/CreateAnalyticsEventsBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/CreateAnalyticsEventsBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "analytics/track-events"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CreateAnalyticsEventsBody;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
