.class public final LSs1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSs1;->n0(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireFlightSheetDetails;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFlightSheetDetails;",
        "wireFlightSheetDetails",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireFlightSheetDetails;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lco/bird/android/model/constant/FlightSheetContext;

.field public final synthetic i:LSs1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;LSs1;)V
    .locals 0

    iput-object p1, p0, LSs1$a;->g:Ljava/lang/String;

    iput-object p2, p0, LSs1$a;->h:Lco/bird/android/model/constant/FlightSheetContext;

    iput-object p3, p0, LSs1$a;->i:LSs1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireFlightSheetDetails;)Lio/reactivex/h;
    .locals 2

    const-string v0, "wireFlightSheetDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSs1$a;->g:Ljava/lang/String;

    iget-object v1, p0, LSs1$a;->h:Lco/bird/android/model/constant/FlightSheetContext;

    invoke-static {p1, v0, v1}, Lxs1;->a(Lco/bird/android/model/wire/WireFlightSheetDetails;Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lco/bird/android/model/persistence/FlightSheetDetails;

    move-result-object p1

    iget-object v0, p0, LSs1$a;->i:LSs1;

    invoke-static {v0}, LSs1;->access$getFlightSheetDetailsDao$p(LSs1;)LBs1;

    move-result-object v0

    invoke-virtual {v0, p1}, LBs1;->c(Lco/bird/android/model/persistence/FlightSheetDetails;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireFlightSheetDetails;

    invoke-virtual {p0, p1}, LSs1$a;->a(Lco/bird/android/model/wire/WireFlightSheetDetails;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
