.class public final LO75;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO75$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFrequentFlyerProgress;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/drawable/Drawable;",
        "a",
        "ride-end-summary_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireFrequentFlyerProgress;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getProgressType()Lco/bird/android/model/constant/ProgressType;

    move-result-object v0

    sget-object v1, LO75$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, LQ74;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getTotalRides()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getCurrentRides()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getColor()I

    move-result p0

    invoke-direct {v0, v1, v2, p0, p1}, LQ74;-><init>(IIILandroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, LP74;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getTotalRides()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getCurrentRides()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFrequentFlyerProgress;->getColor()I

    move-result p0

    invoke-direct {v0, v1, v2, p0, p1}, LP74;-><init>(IIILandroid/content/Context;)V

    :goto_0
    return-object v0
.end method
