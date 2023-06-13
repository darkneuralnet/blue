.class public final Lco/bird/android/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroid/content/res/ColorStateList;",
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/widget/BatteryViewV2$a;",
        "state",
        "",
        "a",
        "widget_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I
    .locals 3

    sget-object v0, Lco/bird/android/widget/b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_0

    new-array p2, v1, [I

    sget v1, Lsf4;->state_high_battery:I

    aput v1, p2, v0

    sget v0, LDf4;->birdGreen:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    goto :goto_0

    :cond_0
    new-array p2, v1, [I

    sget v1, Lsf4;->state_medium_battery:I

    aput v1, p2, v0

    sget v0, LDf4;->birdYellow:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    goto :goto_0

    :cond_1
    new-array p2, v1, [I

    sget v1, Lsf4;->state_low_battery:I

    aput v1, p2, v0

    sget v0, LDf4;->birdRed:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final synthetic access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/widget/b;->a(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result p0

    return p0
.end method
