.class public interface abstract Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008g\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "",
        "create",
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;",
        "scopeProvider",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "ui",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "mapMode",
        "Lco/bird/android/model/constant/MapMode;",
        "moveLocation",
        "",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract create(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/model/constant/MapMode;",
            "Z)",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;"
        }
    .end annotation
.end method
