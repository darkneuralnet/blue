.class public final LKX3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKX3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "color",
        "",
        "alpha",
        "b",
        "Lco/bird/android/model/ZoomBehaviorable;",
        "Landroid/location/Location;",
        "userLocation",
        "zoomLevel",
        "LjJ6;",
        "a",
        "co.bird.android.feature.map"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/utility/misc/Polygon_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/ZoomBehaviorable;Landroid/location/Location;F)LjJ6;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lco/bird/android/model/persistence/Area;

    if-eqz v0, :cond_0

    check-cast p0, Lco/bird/android/model/persistence/Area;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    new-instance p0, LjJ6;

    invoke-direct {p0, v0, v0, v0}, LjJ6;-><init>(IZZ)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getZoomBehavior()Lco/bird/android/model/constant/ZoomBehavior;

    move-result-object v2

    sget-object v3, LKX3$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const v3, 0x41766666    # 15.4f

    const v4, 0x4169999a    # 14.6f

    const/high16 v5, 0x41880000    # 17.0f

    const v6, 0x3dcccccd    # 0.1f

    const/4 v7, 0x1

    packed-switch v2, :pswitch_data_0

    :goto_1
    :pswitch_0
    move p1, v0

    :goto_2
    move p0, v7

    goto/16 :goto_7

    :pswitch_1
    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/persistence/Area;Landroid/location/Location;)Z

    move-result p1

    if-nez p1, :cond_2

    cmpg-float p1, p2, v5

    if-gez p1, :cond_c

    :cond_2
    cmpl-float p1, p2, v4

    if-ltz p1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    invoke-static {p0, v6}, LKX3;->b(IF)I

    move-result p0

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    :goto_3
    move v1, p0

    goto :goto_1

    :pswitch_2
    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/persistence/Area;Landroid/location/Location;)Z

    move-result p1

    if-nez p1, :cond_4

    cmpl-float p1, p2, v5

    if-lez p1, :cond_c

    :cond_4
    cmpl-float p1, p2, v5

    if-lez p1, :cond_5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    invoke-static {p0, v6}, LKX3;->b(IF)I

    move-result p0

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    goto :goto_3

    :pswitch_3
    cmpg-float p1, p2, v5

    if-gez p1, :cond_6

    goto :goto_6

    :cond_6
    const p1, 0x41833333    # 16.4f

    cmpg-float p1, p2, p1

    if-gez p1, :cond_7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    invoke-static {p0, v6}, LKX3;->b(IF)I

    move-result p0

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    goto :goto_3

    :pswitch_4
    cmpl-float p1, p2, v3

    if-ltz p1, :cond_8

    goto :goto_6

    :cond_8
    cmpl-float p1, p2, v4

    if-lez p1, :cond_9

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    invoke-static {p0, v6}, LKX3;->b(IF)I

    move-result p0

    goto :goto_3

    :cond_9
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    goto :goto_3

    :pswitch_5
    cmpg-float p1, p2, v4

    if-gez p1, :cond_a

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    move v1, p0

    move p0, v0

    goto :goto_5

    :cond_a
    cmpg-float p1, p2, v3

    if-gez p1, :cond_b

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result p0

    invoke-static {p0, v6}, LKX3;->b(IF)I

    move-result p0

    move v1, p0

    goto :goto_4

    :cond_b
    move v1, v0

    :goto_4
    move p0, v7

    :goto_5
    move p1, p0

    goto/16 :goto_2

    :pswitch_6
    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/persistence/Area;Landroid/location/Location;)Z

    move-result p0

    move p1, v0

    goto :goto_7

    :cond_c
    :goto_6
    :pswitch_7
    move p0, v0

    move p1, p0

    :goto_7
    if-eqz p0, :cond_d

    if-nez p1, :cond_d

    move v0, v7

    :cond_d
    new-instance p1, LjJ6;

    invoke-direct {p1, v1, p0, v0}, LjJ6;-><init>(IZZ)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final b(IF)I
    .locals 1

    const/16 v0, 0xff

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    const v0, 0xffffff

    and-int/2addr p0, v0

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method
