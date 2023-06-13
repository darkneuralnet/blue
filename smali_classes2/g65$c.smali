.class public final Lg65$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg65;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg65$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/RideStartTimeConstraint;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/RideStartTimeConstraint;",
        "kotlin.jvm.PlatformType",
        "timeConstraint",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
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
        "SMAP\nRideStartInBadAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lg65;


# direct methods
.method public constructor <init>(Lg65;)V
    .locals 0

    iput-object p1, p0, Lg65$c;->g:Lg65;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/RideStartTimeConstraint;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideStartTimeConstraint;

    invoke-virtual {p1}, Lco/bird/android/model/RideStartTimeConstraint;->getBadAreaType()Lco/bird/android/model/BadAreaType;

    move-result-object p1

    sget-object v0, Lg65$c$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_START_IN_NO_RIDE_AREA:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_START_OUTSIDE_OPERATING_AREA:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lg65$c;->g:Lg65;

    invoke-static {v0}, Lg65;->access$getFlightBannerCoordinatorPresenter$p(Lg65;)LZr1;

    move-result-object v0

    invoke-interface {v0, p1}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v1, :cond_4

    iget-object p1, p0, Lg65$c;->g:Lg65;

    invoke-static {p1}, Lg65;->access$disableRideStartBanners(Lg65;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lg65$c;->g:Lg65;

    invoke-static {p1}, Lg65;->access$disableRideStartBanners(Lg65;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lg65$c;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
