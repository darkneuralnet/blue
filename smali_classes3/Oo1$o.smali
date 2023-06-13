.class public final LOo1$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOo1;->s(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/constant/FleetListActionKind;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "action",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/constant/FleetListActionKind;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOo1;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(LOo1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LOo1$o;->g:LOo1;

    iput-object p2, p0, LOo1$o;->h:Ljava/lang/String;

    iput-object p3, p0, LOo1$o;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LOo1$o;->c(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final c(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$fleetId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LOo1;->access$getAnalyticsManager$p(LOo1;)LEa;

    move-result-object p0

    new-instance v9, Lyo1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getVehicleId()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v8}, Lyo1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/constant/FleetListActionKind;",
            ">;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOo1$o;->g:LOo1;

    invoke-static {v0}, LOo1;->access$getFlightSheetDelegate$p(LOo1;)LAs1;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getVehicleId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LAs1$a;->populateFlightSheet$default(LAs1;Ljava/lang/String;ZILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LOo1$o;->g:LOo1;

    iget-object v2, p0, LOo1$o;->h:Ljava/lang/String;

    iget-object v3, p0, LOo1$o;->i:Ljava/lang/String;

    new-instance v4, LWo1;

    invoke-direct {v4, v1, p1, v2, v3}, LWo1;-><init>(LOo1;Lco/bird/android/model/persistence/nestedstructures/FleetListAction;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getKind()Lco/bird/android/model/constant/FleetListActionKind;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    invoke-virtual {p0, p1}, LOo1$o;->b(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
