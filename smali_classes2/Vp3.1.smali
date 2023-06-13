.class public interface abstract LVp3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbI4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVp3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\t\u001a\u00020\u0008H&J\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH&J\u0008\u0010\u0010\u001a\u00020\u0002H&J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0004H&\u00a8\u0006\u0013"
    }
    d2 = {
        "LVp3;",
        "LbI4;",
        "Lio/reactivex/c;",
        "g1",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
        "d0",
        "",
        "section",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "p0",
        "orderId",
        "Lco/bird/android/model/constant/OperatorOrderViewType;",
        "type",
        "W",
        "m0",
        "",
        "M",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract M()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract W(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/OperatorOrderViewType;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d0()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g1()Lio/reactivex/c;
.end method

.method public abstract m0()Lio/reactivex/c;
.end method

.method public abstract p0(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;>;"
        }
    .end annotation
.end method
