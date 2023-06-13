.class public final Lnr1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnr1;->A1(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/FleetStatusResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/FleetStatusResponse;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/FleetStatusResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lnr1;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnr1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnr1$b;->g:Lnr1;

    iput-object p2, p0, Lnr1$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/FleetStatusResponse;)Lio/reactivex/h;
    .locals 5

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/FleetStatusResponse;->component1()Lco/bird/android/model/wire/WireFleetStatus;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Lnr1$b;->g:Lnr1;

    invoke-static {v1}, Lnr1;->access$getFleetStatusDao$p(Lnr1;)Lwq1;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Lco/bird/android/model/persistence/FleetStatus;

    iget-object v4, p0, Lnr1$b;->h:Ljava/lang/String;

    invoke-static {p1, v4}, Luq1;->d(Lco/bird/android/model/wire/WireFleetStatus;Ljava/lang/String;)Lco/bird/android/model/persistence/FleetStatus;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v3}, Lwq1;->d([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;

    move-result-object p1

    aput-object p1, v0, v4

    iget-object p1, p0, Lnr1$b;->g:Lnr1;

    invoke-static {p1}, Lnr1;->access$getFleetStatusDao$p(Lnr1;)Lwq1;

    move-result-object p1

    iget-object v1, p0, Lnr1$b;->h:Ljava/lang/String;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    const-string v4, "now()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1, v3}, Lwq1;->e(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/c;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/FleetStatusResponse;

    invoke-virtual {p0, p1}, Lnr1$b;->a(Lco/bird/api/response/FleetStatusResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
