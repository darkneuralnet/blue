.class public final Lco/bird/android/model/VehicleConnection$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/VehicleConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVehicleConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleConnection.kt\nco/bird/android/model/VehicleConnection$DefaultImpls\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,96:1\n11345#2:97\n11680#2,3:98\n*S KotlinDebug\n*F\n+ 1 VehicleConnection.kt\nco/bird/android/model/VehicleConnection$DefaultImpls\n*L\n93#1:97\n93#1:98,3\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->queryDisplayFirmware$lambda$6()V

    return-void
.end method

.method public static final synthetic access$subBytes(Lco/bird/android/model/VehicleConnection;[BII)[B
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->subBytes(Lco/bird/android/model/VehicleConnection;[BII)[B

    move-result-object p0

    return-object p0
.end method

.method public static alarm(Lco/bird/android/model/VehicleConnection;Ljava/lang/String;)Lio/reactivex/c;
    .locals 0

    const-string p0, "token"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance p1, LPk6;

    invoke-direct {p1}, LPk6;-><init>()V

    invoke-virtual {p0, p1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string p1, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static alarm$lambda$0()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "alarm() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->refreshStatus$lambda$2()V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->resetServiceIndicator$lambda$5()V

    return-void
.end method

.method public static synthetic d()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->queryBMSFirmware$lambda$8()V

    return-void
.end method

.method public static synthetic e()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->resetTotalOdometer$lambda$4()V

    return-void
.end method

.method public static synthetic f()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->resetTripOdometer$lambda$3()V

    return-void
.end method

.method public static synthetic g()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->queryECUFirmware$lambda$7()V

    return-void
.end method

.method public static synthetic h()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->alarm$lambda$0()V

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->requestToken$lambda$1()V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->writeData$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static queryBMSFirmware(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LOk6;

    invoke-direct {v0}, LOk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static queryBMSFirmware$lambda$8()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "queryBMSFirmware() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static queryDisplayFirmware(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LQk6;

    invoke-direct {v0}, LQk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static queryDisplayFirmware$lambda$6()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "queryDisplayFirmware() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static queryECUFirmware(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LJk6;

    invoke-direct {v0}, LJk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static queryECUFirmware$lambda$7()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "queryECUFirmware() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static refreshStatus(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LKk6;

    invoke-direct {v0}, LKk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static refreshStatus$lambda$2()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "refreshStatus() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static requestToken(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LMk6;

    invoke-direct {v0}, LMk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static requestToken$lambda$1()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "requestToken() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static resetServiceIndicator(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LNk6;

    invoke-direct {v0}, LNk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static resetServiceIndicator$lambda$5()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "resetServiceIndicator() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static resetTotalOdometer(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LIk6;

    invoke-direct {v0}, LIk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static resetTotalOdometer$lambda$4()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "resetTotalOdometer() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static resetTripOdometer(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/c;
    .locals 1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LHk6;

    invoke-direct {v0}, LHk6;-><init>()V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "complete().doOnComplete \u2026 this type, ignoring.\") }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static resetTripOdometer$lambda$3()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "resetTripOdometer() called but not supported for this type, ignoring."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static setCurrentSessionToken(Lco/bird/android/model/VehicleConnection;[B)V
    .locals 0

    const-string p0, "currentSessionToken"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static subBytes(Lco/bird/android/model/VehicleConnection;[BII)[B
    .locals 1

    new-array p0, p3, [B

    const/4 v0, 0x0

    invoke-static {p1, p2, p0, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static toHex(Lco/bird/android/model/VehicleConnection;B)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lkotlin/UByte;->constructor-impl(B)B

    move-result p0

    const/16 p1, 0x10

    invoke-static {p0, p1}, Lkotlin/text/UStringsKt;->toString-LxnNnR4(BI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toHex(Lco/bird/android/model/VehicleConnection;[B)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleConnection;",
            "[B)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v3, p1, v2

    invoke-interface {p0, v3}, Lco/bird/android/model/VehicleConnection;->toHex(B)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static writeData(Lco/bird/android/model/VehicleConnection;[BLjava/util/UUID;)Lio/reactivex/c;
    .locals 15

    move-object/from16 v2, p1

    const-string v0, "data"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristicUuid"

    move-object/from16 v5, p2

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p1}, Lco/bird/android/model/VehicleConnection;->toHex([B)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writing data: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    array-length v0, v2

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    iput v0, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    array-length v0, v2

    int-to-float v0, v0

    const/high16 v1, 0x41800000    # 16.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    const-wide/16 v6, 0x0

    int-to-long v8, v0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x64

    sget-object v14, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static/range {v6 .. v14}, Lio/reactivex/Observable;->intervalRange(JJJJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v6

    new-instance v7, Lco/bird/android/model/VehicleConnection$writeData$1;

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/VehicleConnection$writeData$1;-><init>(Lco/bird/android/model/VehicleConnection;[BLkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/UUID;)V

    new-instance v0, LLk6;

    invoke-direct {v0, v7}, LLk6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6, v0}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fun writeData(data: Byte\u2026    .ignoreElements()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static writeData$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method
