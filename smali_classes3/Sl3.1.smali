.class public interface abstract LSl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrx4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrx4<",
        "Lel3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R&\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00080\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0006R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0006R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0006R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0006\u00a8\u0006\u0019"
    }
    d2 = {
        "LSl3;",
        "Lrx4;",
        "Lel3;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "D7",
        "()Lio/reactivex/Observable;",
        "filterSelects",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "p8",
        "optionUpdates",
        "Lco/bird/android/model/constant/FilterLogicToggleOption;",
        "X1",
        "logicOperatorClicks",
        "V1",
        "logicOperatorSelected",
        "",
        "K2",
        "applyClicks",
        "x9",
        "resetClicks",
        "f2",
        "closeClicks",
        "filters_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract D7()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;"
        }
    .end annotation
.end method

.method public abstract K2()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract V1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/FilterLogicToggleOption;",
            ">;"
        }
    .end annotation
.end method

.method public abstract X1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/FilterLogicToggleOption;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f2()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract p8()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract x9()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method
