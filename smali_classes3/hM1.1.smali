.class public final LhM1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LhM1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/constant/VehicleHibernationCategory;",
        "Landroid/content/Context;",
        "context",
        "",
        "a",
        "hibernation-scan_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/constant/VehicleHibernationCategory;Landroid/content/Context;)I
    .locals 1

    sget-object v0, LhM1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    sget p0, LDf4;->primaryText:I

    goto :goto_0

    :cond_0
    sget p0, LDf4;->birdRed:I

    goto :goto_0

    :cond_1
    sget p0, LDf4;->birdYellow:I

    goto :goto_0

    :cond_2
    sget p0, LDf4;->birdGreen:I

    :goto_0
    invoke-static {p1, p0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$titleColor(Lco/bird/android/model/constant/VehicleHibernationCategory;Landroid/content/Context;)I
    .locals 0

    invoke-static {p0, p1}, LhM1;->a(Lco/bird/android/model/constant/VehicleHibernationCategory;Landroid/content/Context;)I

    move-result p0

    return p0
.end method
