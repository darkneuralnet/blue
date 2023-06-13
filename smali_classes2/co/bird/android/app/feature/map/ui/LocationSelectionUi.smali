.class public interface abstract Lco/bird/android/app/feature/map/ui/LocationSelectionUi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS74;
.implements LH31;
.implements LaM5;
.implements LUX0;
.implements Lco/bird/android/app/feature/map/ui/MapAreasUi;
.implements Ldl2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/LocationSelectionUi$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J\u0008\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u001b\u0010\u000f\u001a\u00020\u000b2\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH&J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013H&J\u0008\u0010\u0016\u001a\u00020\u0015H&J\u0008\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0012\u0010\u001e\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\rH&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH&J\u000e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0013H&J\u000e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0013H&J\u000e\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013H&J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0015H&J\u000e\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0013H&J \u0010+\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH&J\u0018\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00132\u0008\u0008\u0002\u0010,\u001a\u00020\tH&\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;",
        "LS74;",
        "LH31;",
        "LaM5;",
        "LUX0;",
        "Lco/bird/android/app/feature/map/ui/MapAreasUi;",
        "Ldl2;",
        "Landroid/view/View;",
        "getView",
        "",
        "enable",
        "",
        "enableDoneButton",
        "",
        "text",
        "setHeadsUpText",
        "(Ljava/lang/Integer;)V",
        "show",
        "showDoneButton",
        "Lio/reactivex/Observable;",
        "doneClicks",
        "",
        "getAddress",
        "Lco/bird/android/model/wire/WireLocation;",
        "getLocation",
        "location",
        "",
        "radius",
        "setCurrentLocation",
        "hint",
        "setAddressHint",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "showInfoWindow",
        "Landroid/location/Location;",
        "centerLocation",
        "mapClicks",
        "keyboardDoneClicks",
        "address",
        "setAddress",
        "observeAddressField",
        "animate",
        "indirect",
        "setLocation",
        "includeIndirectUpdates",
        "observeLocation",
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
.method public abstract synthetic agreementDialog(Lf9;ZZ)Lio/reactivex/F;
.end method

.method public abstract synthetic agreementDialog(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)Lio/reactivex/F;
.end method

.method public abstract synthetic birdDialog(LNy;ZZ)Lio/reactivex/F;
.end method

.method public abstract centerLocation()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end method

.method public abstract synthetic dialog(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;)Lio/reactivex/F;
.end method

.method public abstract synthetic dialog(LNy;ZZ)Lio/reactivex/F;
.end method

.method public abstract synthetic dialogShown()Z
.end method

.method public abstract synthetic dialogWithInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZ)Lio/reactivex/F;
.end method

.method public abstract synthetic dismissDialog()V
.end method

.method public varargs abstract synthetic dismissIfCurrentDialogIsInstanceOf([Lkotlin/reflect/KClass;)Z
.end method

.method public abstract doneClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract enableDoneButton(Z)V
.end method

.method public abstract synthetic error(I)V
.end method

.method public abstract synthetic error(Ljava/lang/String;)V
.end method

.method public abstract synthetic error(Ljava/lang/Throwable;)V
.end method

.method public abstract synthetic errorGeneric()V
.end method

.method public abstract getAddress()Ljava/lang/String;
.end method

.method public abstract getLocation()Lco/bird/android/model/wire/WireLocation;
.end method

.method public abstract getView()Landroid/view/View;
.end method

.method public abstract synthetic hideKeyboard()V
.end method

.method public abstract synthetic hideKeyboard(Landroid/os/IBinder;)V
.end method

.method public abstract synthetic hideKeyboard(Landroid/widget/EditText;)V
.end method

.method public abstract keyboardDoneClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract mapClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract observeAddressField()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract observeLocation(Z)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
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

.method public abstract synthetic persistentError(I)Lcom/google/android/material/snackbar/Snackbar;
.end method

.method public abstract synthetic selectorDialog(Ljava/util/List;ZLjava/lang/CharSequence;)Lio/reactivex/p;
.end method

.method public abstract setAddress(Ljava/lang/String;)V
.end method

.method public abstract setAddressHint(I)V
.end method

.method public abstract setCurrentLocation(Lco/bird/android/model/wire/WireLocation;D)V
.end method

.method public abstract setHeadsUpText(Ljava/lang/Integer;)V
.end method

.method public abstract setLocation(Lco/bird/android/model/wire/WireLocation;ZZ)V
.end method

.method public abstract synthetic showBirdDialog(LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V
.end method

.method public abstract synthetic showBottomSheetAlert(LNy;Ljava/lang/Integer;)Lio/reactivex/F;
.end method

.method public abstract synthetic showCustomDialog(ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V
.end method

.method public abstract synthetic showCustomDialog(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V
.end method

.method public abstract synthetic showDialog(LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V
.end method

.method public abstract synthetic showDialog(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
.end method

.method public abstract synthetic showDialogCompletable(LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract showDoneButton(Z)V
.end method

.method public abstract synthetic showIndeterminateDialog(Lo12;)V
.end method

.method public abstract showInfoWindow(Lcom/google/android/gms/maps/model/MarkerOptions;)V
.end method

.method public abstract synthetic showKeyboard(Landroid/os/IBinder;)V
.end method

.method public abstract synthetic showKeyboard(Landroid/view/View;)V
.end method

.method public abstract synthetic showProgress(ZI)V
.end method

.method public abstract synthetic showRetrofitExceptionDialog(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V
.end method

.method public abstract synthetic snackToast(I)V
.end method

.method public abstract synthetic snackToast(Ljava/lang/String;)V
.end method

.method public abstract synthetic startProgress()V
.end method

.method public abstract synthetic stopProgress(I)V
.end method

.method public abstract synthetic success(I)V
.end method

.method public abstract synthetic success(Ljava/lang/String;)V
.end method

.method public abstract synthetic warn(I)V
.end method

.method public abstract synthetic warn(Ljava/lang/String;)V
.end method
