.class public final LPy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a1\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\n\u0010\u0008\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0005\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "LFH3;",
        "",
        "isGuest",
        "shouldEndRide",
        "presentArParkingOption",
        "LQM4;",
        "e",
        "(LFH3;ZLjava/lang/Boolean;Z)LQM4;",
        "a",
        "b",
        "c",
        "",
        "fine",
        "",
        "currency",
        "d",
        "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;",
        "core-base_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LQM4;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LTZ1;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    instance-of v0, p0, LRZ1;

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    instance-of v0, p0, LVZ1;

    :goto_1
    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    instance-of v0, p0, LZZ1;

    :goto_2
    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    instance-of v0, p0, LlA3;

    :goto_3
    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    instance-of v0, p0, LPZ1;

    :goto_4
    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    instance-of v0, p0, LQZ1;

    :goto_5
    if-eqz v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    instance-of v0, p0, LWZ1;

    :goto_6
    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    instance-of v1, p0, LXZ1;

    :goto_7
    return v1
.end method

.method public static final b(LQM4;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final c(LQM4;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LYZ1;

    if-nez v0, :cond_1

    instance-of v0, p0, LUZ1;

    if-nez v0, :cond_1

    instance-of v0, p0, LlA3;

    if-nez v0, :cond_1

    instance-of v0, p0, LZZ1;

    if-nez v0, :cond_1

    instance-of v0, p0, LVZ1;

    if-nez v0, :cond_1

    instance-of p0, p0, LRZ1;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final d(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v1, p0

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final e(LFH3;ZLjava/lang/Boolean;Z)LQM4;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ltz6;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ltz6;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ltz6;->g()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Ltz6;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, LPy;->d(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    instance-of v2, p0, LCd1;

    if-eqz v2, :cond_2

    move-object v3, p0

    check-cast v3, LCd1;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LCd1;->j()Z

    move-result v3

    if-ne v3, v4, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    move v3, v5

    :goto_3
    if-eqz v2, :cond_4

    move-object v6, p0

    check-cast v6, LCd1;

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    if-eqz v6, :cond_5

    invoke-virtual {v6}, LCd1;->k()Z

    move-result v6

    if-ne v6, v4, :cond_5

    move v6, v4

    goto :goto_5

    :cond_5
    move v6, v5

    :goto_5
    if-eqz v2, :cond_6

    move-object v7, p0

    check-cast v7, LCd1;

    invoke-virtual {v7}, LCd1;->l()Z

    move-result v7

    if-nez v7, :cond_6

    move v7, v4

    goto :goto_6

    :cond_6
    move v7, v5

    :goto_6
    if-eqz v2, :cond_7

    move-object v8, p0

    check-cast v8, LCd1;

    goto :goto_7

    :cond_7
    move-object v8, v1

    :goto_7
    if-eqz v8, :cond_8

    invoke-virtual {v8}, LCd1;->l()Z

    move-result v8

    if-ne v8, v4, :cond_8

    move v8, v4

    goto :goto_8

    :cond_8
    move v8, v5

    :goto_8
    instance-of v9, p0, LKc0;

    if-eqz v9, :cond_9

    move-object v9, p0

    check-cast v9, LKc0;

    goto :goto_9

    :cond_9
    move-object v9, v1

    :goto_9
    if-eqz v9, :cond_a

    invoke-virtual {v9}, LKc0;->g()Z

    move-result v9

    if-ne v9, v4, :cond_a

    move v9, v4

    goto :goto_a

    :cond_a
    move v9, v5

    :goto_a
    if-eqz v2, :cond_b

    move-object v10, p0

    check-cast v10, LCd1;

    goto :goto_b

    :cond_b
    move-object v10, v1

    :goto_b
    if-eqz v10, :cond_c

    invoke-virtual {v10}, LCd1;->i()Z

    move-result v10

    if-ne v10, v4, :cond_c

    move v10, v4

    goto :goto_c

    :cond_c
    move v10, v5

    :goto_c
    if-eqz v2, :cond_d

    move-object v2, p0

    check-cast v2, LCd1;

    goto :goto_d

    :cond_d
    move-object v2, v1

    :goto_d
    if-eqz v2, :cond_e

    invoke-virtual {v2}, LCd1;->g()Z

    move-result v2

    if-ne v2, v4, :cond_e

    move v2, v4

    goto :goto_e

    :cond_e
    move v2, v5

    :goto_e
    if-eqz v2, :cond_f

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_f

    :cond_f
    move v4, v5

    :goto_f
    if-eqz v10, :cond_10

    new-instance v1, LTZ1;

    invoke-direct {v1, p1}, LTZ1;-><init>(Z)V

    goto/16 :goto_10

    :cond_10
    if-nez v4, :cond_1b

    if-eqz v9, :cond_11

    goto/16 :goto_10

    :cond_11
    if-eqz v3, :cond_12

    if-nez v9, :cond_12

    if-nez v8, :cond_12

    new-instance v1, LRZ1;

    invoke-direct {v1, p1, p3}, LRZ1;-><init>(ZZ)V

    goto/16 :goto_10

    :cond_12
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/IN_SLOW_AREA;->INSTANCE:Lco/bird/android/model/IN_SLOW_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    new-instance v1, LYZ1;

    invoke-direct {v1, p1}, LYZ1;-><init>(Z)V

    goto/16 :goto_10

    :cond_13
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/IN_NO_RIDE_NO_PARK_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_RIDE_NO_PARK_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    new-instance v1, LVZ1;

    invoke-direct {v1, p1, v0, p3}, LVZ1;-><init>(ZLjava/lang/String;Z)V

    goto :goto_10

    :cond_14
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/IN_SLOW_NO_PARK_AREA;->INSTANCE:Lco/bird/android/model/IN_SLOW_NO_PARK_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    new-instance v1, LZZ1;

    invoke-direct {v1, p1, v0}, LZZ1;-><init>(ZLjava/lang/String;)V

    goto :goto_10

    :cond_15
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/OUTSIDE_SERVICE_AREA;->INSTANCE:Lco/bird/android/model/OUTSIDE_SERVICE_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    new-instance v1, LlA3;

    invoke-direct {v1, p1, v0, p3}, LlA3;-><init>(ZLjava/lang/String;Z)V

    goto :goto_10

    :cond_16
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/IN_NO_RIDE_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_RIDE_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    new-instance v1, LUZ1;

    invoke-direct {v1, p1}, LUZ1;-><init>(Z)V

    goto :goto_10

    :cond_17
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/IN_NO_PARKING_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_PARKING_AREA;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    if-eqz v7, :cond_18

    if-eqz v6, :cond_18

    new-instance v1, LQZ1;

    invoke-direct {v1, p1, p3}, LQZ1;-><init>(ZZ)V

    goto :goto_10

    :cond_18
    if-eqz v7, :cond_19

    new-instance v1, LPZ1;

    invoke-direct {v1, p1, p3}, LPZ1;-><init>(ZZ)V

    goto :goto_10

    :cond_19
    new-instance v1, LWZ1;

    invoke-direct {v1, p1, p2}, LWZ1;-><init>(ZLjava/lang/Boolean;)V

    goto :goto_10

    :cond_1a
    invoke-virtual {p0}, LFH3;->e()Lco/bird/android/model/RiderAreaState;

    move-result-object p0

    instance-of p0, p0, Lco/bird/android/model/IN_RESTRICTED_PARKING_AREA;

    if-eqz p0, :cond_1b

    new-instance v1, LXZ1;

    invoke-direct {v1, p1, v0}, LXZ1;-><init>(ZLjava/lang/String;)V

    :cond_1b
    :goto_10
    return-object v1
.end method

.method public static synthetic toAlertDialog$default(LFH3;ZLjava/lang/Boolean;ZILjava/lang/Object;)LQM4;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LPy;->e(LFH3;ZLjava/lang/Boolean;Z)LQM4;

    move-result-object p0

    return-object p0
.end method
