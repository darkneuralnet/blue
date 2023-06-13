.class public final LC75$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC75;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "Lco/bird/android/model/wire/WireRideDetail;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideDetail;",
        "rideDetail",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryPresenter.kt\nco/bird/android/feature/rideendsummary/RideSummaryPresenterImpl$onResume$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LC75$y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LC75$y;

    invoke-direct {v0}, LC75$y;-><init>()V

    sput-object v0, LC75$y;->g:LC75$y;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;
    .locals 2

    const-string v0, "rideDetail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getReportStatus()Lco/bird/android/model/constant/RideReportStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/RideReportStatus;->AVAILABLE:Lco/bird/android/model/constant/RideReportStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lco/bird/android/feature/rideendsummary/exceptions/RideReportPending;->b:Lco/bird/android/feature/rideendsummary/exceptions/RideReportPending;

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p0, p1}, LC75$y;->a(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;

    move-result-object p1

    return-object p1
.end method
