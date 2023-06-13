.class Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl/charmas/android/reactivelocation2/observables/ObservableFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RetryOnConnectionSuspension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension$IsConnectionSuspendedException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/C<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field private final shouldRetry:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension;->shouldRetry:Z

    return-void
.end method


# virtual methods
.method public apply(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension;->shouldRetry:Z

    if-eqz v0, :cond_0

    new-instance v0, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension$IsConnectionSuspendedException;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$RetryOnConnectionSuspension$IsConnectionSuspendedException;-><init>(Lpl/charmas/android/reactivelocation2/observables/ObservableFactory$1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->retry(Lio/reactivex/functions/d;)Lio/reactivex/Observable;

    move-result-object p1

    :cond_0
    return-object p1
.end method
