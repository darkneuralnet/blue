.class public final LPy6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPy6;->H0(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;",
        "details",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LPy6;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LPy6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LPy6$a;->g:LPy6;

    iput-object p2, p0, LPy6$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;)Lio/reactivex/h;
    .locals 3

    const-string v0, "details"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LPy6$a;->g:LPy6;

    invoke-static {v0}, LPy6;->access$getWarehouseFlightSheetDao$p(LPy6;)LKy6;

    move-result-object v1

    iget-object v2, p0, LPy6$a;->h:Ljava/lang/String;

    invoke-static {p1, v2}, LHy6;->a(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;

    move-result-object p1

    invoke-virtual {v1, p1}, LKy6;->b(Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v1, "warehouseFlightSheetDao.\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LPy6;->K1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;

    invoke-virtual {p0, p1}, LPy6$a;->a(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
