.class public final Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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


# direct methods
.method public static synthetic create$default(Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a$a;LlG2;Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;ZLco/bird/android/model/constant/FlightSheetContext;ILjava/lang/Object;)Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a;
    .locals 7

    if-nez p8, :cond_2

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    sget-object p6, Lco/bird/android/model/constant/FlightSheetContext;->STANDARD:Lco/bird/android/model/constant/FlightSheetContext;

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v6}, Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a$a;->a(LlG2;Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;ZLco/bird/android/model/constant/FlightSheetContext;)Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: create"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
