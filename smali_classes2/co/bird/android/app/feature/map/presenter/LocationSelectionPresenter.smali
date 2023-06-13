.class public interface abstract Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;",
        "LUX0;",
        "",
        "hint",
        "",
        "setAddressHint",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/LocationSelectionModel;",
        "observeDone",
        "",
        "observeCompleteRevGeoCodeAddress",
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
.method public abstract observeCompleteRevGeoCodeAddress()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract observeDone()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/LocationSelectionModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract synthetic onCreate(Landroid/os/Bundle;)V
.end method

.method public abstract synthetic onDestroy()V
.end method

.method public abstract synthetic onLowMemory()V
.end method

.method public abstract synthetic onPause()V
.end method

.method public abstract synthetic onResume()V
.end method

.method public abstract synthetic onSaveInstanceState(Landroid/os/Bundle;)V
.end method

.method public abstract synthetic onStart()V
.end method

.method public abstract synthetic onStop()V
.end method

.method public abstract setAddressHint(I)V
.end method
