.class public interface abstract Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\nH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;",
        "",
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;",
        "ui",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "",
        "createRadius",
        "Lco/bird/android/model/LocationSelectionModel;",
        "model",
        "Lio/reactivex/c;",
        "doNotEnableDoneButtonUntil",
        "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;",
        "create",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract create(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;
.end method
