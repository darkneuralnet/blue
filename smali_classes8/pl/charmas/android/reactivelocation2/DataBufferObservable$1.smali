.class final Lpl/charmas/android/reactivelocation2/DataBufferObservable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpl/charmas/android/reactivelocation2/DataBufferObservable;->from(Lcom/google/android/gms/common/data/AbstractDataBuffer;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic val$buffer:Lcom/google/android/gms/common/data/AbstractDataBuffer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/AbstractDataBuffer;)V
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/DataBufferObservable$1;->val$buffer:Lcom/google/android/gms/common/data/AbstractDataBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/DataBufferObservable$1;->val$buffer:Lcom/google/android/gms/common/data/AbstractDataBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/AbstractDataBuffer;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lpl/charmas/android/reactivelocation2/DataBufferObservable$1$1;

    invoke-direct {v0, p0}, Lpl/charmas/android/reactivelocation2/DataBufferObservable$1$1;-><init>(Lpl/charmas/android/reactivelocation2/DataBufferObservable$1;)V

    invoke-static {v0}, Lio/reactivex/disposables/d;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    return-void
.end method
