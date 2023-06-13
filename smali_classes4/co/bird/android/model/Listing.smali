.class public final Lco/bird/android/model/Listing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J5\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R#\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/model/Listing;",
        "",
        "T",
        "Lio/reactivex/Observable;",
        "LZD3;",
        "component1",
        "Lco/bird/android/model/RetryableContiguousDataSource;",
        "component2",
        "pagedList",
        "retryableContiguousDataSource",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lio/reactivex/Observable;",
        "getPagedList",
        "()Lio/reactivex/Observable;",
        "getRetryableContiguousDataSource",
        "<init>",
        "(Lio/reactivex/Observable;Lio/reactivex/Observable;)V",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final pagedList:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final retryableContiguousDataSource:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;Lio/reactivex/Observable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TT;>;>;",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pagedList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryableContiguousDataSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    iput-object p2, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/Listing;Lio/reactivex/Observable;Lio/reactivex/Observable;ILjava/lang/Object;)Lco/bird/android/model/Listing;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/Listing;->copy(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lco/bird/android/model/Listing;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final component2()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final copy(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lco/bird/android/model/Listing;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TT;>;>;",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;)",
            "Lco/bird/android/model/Listing<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "pagedList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryableContiguousDataSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/Listing;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/Listing;-><init>(Lio/reactivex/Observable;Lio/reactivex/Observable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/Listing;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/Listing;

    iget-object v1, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    iget-object v3, p1, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    iget-object p1, p1, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPagedList()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LZD3<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getRetryableContiguousDataSource()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/Listing;->pagedList:Lio/reactivex/Observable;

    iget-object v1, p0, Lco/bird/android/model/Listing;->retryableContiguousDataSource:Lio/reactivex/Observable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Listing(pagedList="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", retryableContiguousDataSource="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
