.class public final LIH2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIH2;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideStatusBottomSheetButton;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideStatusBottomSheetButton;",
        "button",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/RideStatusBottomSheetButton;)Lio/reactivex/h;"
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
        "SMAP\nManageRidesDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$handleButtonClicks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIH2;


# direct methods
.method public constructor <init>(LIH2;)V
    .locals 0

    iput-object p1, p0, LIH2$a;->g:LIH2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIH2$a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIH2$a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIH2$a;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lco/bird/android/model/RideStatusBottomSheetButton;)Lio/reactivex/h;
    .locals 5

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/SelectedRideButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getMutableSelectedRideRelay(LIH2;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_3

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/EndSelectedRideButton;

    const-string v1, "no ride state found for "

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget-object p1, p0, LIH2$a;->g:LIH2;

    invoke-static {p1}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object p1

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getSelectedRide(LIH2;)LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/SelectedRideButton;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/SelectedRideButton;->getRideId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    invoke-interface {p1, v0}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object p1

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getUi$p(LIH2;)LMH2;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v3

    :goto_1
    invoke-virtual {v0, v4}, LMH2;->Pl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v3

    :goto_2
    if-nez p1, :cond_4

    iget-object p1, p0, LIH2$a;->g:LIH2;

    invoke-static {p1}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->o0()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-static {p1}, Lco/bird/android/model/RideStatesKt;->firstActivePrimaryThenGuestOrNull(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideState;

    move-result-object p1

    :cond_4
    if-eqz p1, :cond_5

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/RideState$Status;->ENDED:Lco/bird/android/model/RideState$Status;

    invoke-interface {v0, p1, v1}, LYR4;->v0(Ljava/lang/String;Lco/bird/android/model/RideState$Status;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, LIH2$a$a;->g:LIH2$a$a;

    new-instance v1, LFH2;

    invoke-direct {v1, v0}, LFH2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_3

    :cond_5
    iget-object p1, p0, LIH2$a;->g:LIH2;

    invoke-static {p1}, LIH2;->access$getSelectedRide(LIH2;)LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/SelectedRideButton;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/SelectedRideButton;->getRideId()Ljava/lang/String;

    move-result-object v3

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to end ride"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/NoSuchElementException;

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getUi$p(LIH2;)LMH2;

    move-result-object v0

    sget v1, Lnl4;->manage_rides_error_no_ride_found_to_end:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_3

    :cond_7
    instance-of v0, p1, Lco/bird/android/model/RideStatusLockButton;

    if-eqz v0, :cond_9

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/RideStatusLockButton;

    invoke-virtual {p1}, Lco/bird/android/model/RideStatusLockButton;->getRideId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object p1, p0, LIH2$a;->g:LIH2;

    invoke-static {p1}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideState$Status;->LOCKED:Lco/bird/android/model/RideState$Status;

    invoke-interface {p1, v0, v1}, LYR4;->v0(Ljava/lang/String;Lco/bird/android/model/RideState$Status;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, LIH2$a$b;->g:LIH2$a$b;

    new-instance v1, LGH2;

    invoke-direct {v1, v0}, LGH2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_3

    :cond_8
    invoke-virtual {p1}, Lco/bird/android/model/RideStatusLockButton;->getRideId()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to lock"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/NoSuchElementException;

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getUi$p(LIH2;)LMH2;

    move-result-object v0

    sget v1, Lnl4;->manage_rides_error_no_ride_found_to_lock:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_3

    :cond_9
    instance-of v0, p1, Lco/bird/android/model/RideStatusUnlockButton;

    if-eqz v0, :cond_b

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/RideStatusUnlockButton;

    invoke-virtual {p1}, Lco/bird/android/model/RideStatusUnlockButton;->getRideId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object p1, p0, LIH2$a;->g:LIH2;

    invoke-static {p1}, LIH2;->access$getRideManager$p(LIH2;)LYR4;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideState$Status;->UNLOCKED:Lco/bird/android/model/RideState$Status;

    invoke-interface {p1, v0, v1}, LYR4;->v0(Ljava/lang/String;Lco/bird/android/model/RideState$Status;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, LIH2$a$c;->g:LIH2$a$c;

    new-instance v1, LHH2;

    invoke-direct {v1, v0}, LHH2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Lco/bird/android/model/RideStatusUnlockButton;->getRideId()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to unlock"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/NoSuchElementException;

    iget-object v0, p0, LIH2$a;->g:LIH2;

    invoke-static {v0}, LIH2;->access$getUi$p(LIH2;)LMH2;

    move-result-object v0

    sget v1, Lnl4;->manage_rides_error_no_ride_found_to_unlock:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_3

    :cond_b
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideStatusBottomSheetButton;

    invoke-virtual {p0, p1}, LIH2$a;->d(Lco/bird/android/model/RideStatusBottomSheetButton;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
