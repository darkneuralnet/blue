.class public interface abstract LHp1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHp1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H&J(\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a8\u0006\u000f"
    }
    d2 = {
        "LHp1;",
        "",
        "",
        "fleetId",
        "Lco/bird/android/model/persistence/FleetReportPeriod;",
        "period",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "page",
        "Lio/reactivex/c;",
        "u",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/FleetReport;",
        "k0",
        "",
        "l0",
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
.method public abstract k0(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/FleetReportPeriod;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FleetReport;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l0(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetReportPeriod;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;
.end method
