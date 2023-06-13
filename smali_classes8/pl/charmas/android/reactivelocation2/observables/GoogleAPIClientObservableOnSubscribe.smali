.class public Lpl/charmas/android/reactivelocation2/observables/GoogleAPIClientObservableOnSubscribe;
.super Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method private varargs constructor <init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;[Lcom/google/android/gms/common/api/Api;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "[",
            "Lcom/google/android/gms/common/api/Api<",
            "+",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NotRequiredOptions;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-direct {p0, p1, p2}, Lpl/charmas/android/reactivelocation2/observables/BaseObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;[Lcom/google/android/gms/common/api/Api;)V

    return-void
.end method

.method public static varargs create(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;[Lcom/google/android/gms/common/api/Api;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableContext;",
            "Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;",
            "[",
            "Lcom/google/android/gms/common/api/Api<",
            "+",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NotRequiredOptions;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/GoogleAPIClientObservableOnSubscribe;

    invoke-direct {v0, p0, p2}, Lpl/charmas/android/reactivelocation2/observables/GoogleAPIClientObservableOnSubscribe;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableContext;[Lcom/google/android/gms/common/api/Api;)V

    invoke-virtual {p1, v0}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;->createObservable(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onGoogleApiClientReady(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lio/reactivex/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lio/reactivex/y<",
            "-",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p3}, Lio/reactivex/y;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p3}, Lio/reactivex/j;->onComplete()V

    return-void
.end method
