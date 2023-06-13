.class public final LoH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnH3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "LoH3;",
        "LnH3;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "a",
        "Landroid/view/Menu;",
        "menu",
        "d",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "c",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LsH3;",
        "b",
        "LsH3;",
        "parkingReviewUi",
        "Le13;",
        "Le13;",
        "navigator",
        "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
        "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
        "parkingEvaluation",
        "",
        "e",
        "Ljava/lang/String;",
        "rideId",
        "<init>",
        "(LEa;LsH3;Le13;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public final b:LsH3;

.field public final c:Le13;

.field public d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

.field public e:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LEa;LsH3;Le13;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingReviewUi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoH3;->a:LEa;

    iput-object p2, p0, LoH3;->b:LsH3;

    iput-object p3, p0, LoH3;->c:Le13;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parking_photo_evaluation"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    iput-object v0, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    const-string v1, "ride_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LoH3;->e:Ljava/lang/String;

    iget-object p1, p0, LoH3;->b:LsH3;

    invoke-interface {p1, v0}, LsH3;->nc(Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)V

    return-void
.end method

.method public c(Landroid/view/MenuItem;)Z
    .locals 12

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    sget v0, LVg4;->parkingReviewHelp:I

    if-ne p1, v0, :cond_6

    iget-object p1, p0, LoH3;->a:LEa;

    new-instance v10, LlH3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    const-string v4, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v4

    :goto_1
    iget-object v0, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    invoke-static {v0}, Lco/bird/android/model/PhotoReviewStatusKt;->toPhotoReviewStatus(Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getReason()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v7, v0

    goto :goto_3

    :cond_3
    :goto_2
    move-object v7, v4

    :goto_3
    iget-object v0, p0, LoH3;->e:Ljava/lang/String;

    if-nez v0, :cond_4

    move-object v8, v4

    goto :goto_4

    :cond_4
    move-object v8, v0

    :goto_4
    const/4 v9, 0x7

    const/4 v11, 0x0

    move-object v0, v10

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v9

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, LlH3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LoH3;->e:Ljava/lang/String;

    if-eqz p1, :cond_5

    iget-object v0, p0, LoH3;->c:Le13;

    iget-object v1, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    invoke-interface {v0, p1, v1}, Le13;->U0(Ljava/lang/String;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)V

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method public d(Landroid/view/Menu;)V
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LVg4;->parkingReviewHelp:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, LoH3;->d:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getProperParking()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method
