.class public final LYq1$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYq1;->E(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYq1$q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;",
        ">;+",
        "Lco/bird/android/model/persistence/FleetStatus;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0097\u0001\u0010\u0002\u001a\u0092\u0001\u00124\u00122\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007 \u0005*H\u00124\u00122\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;",
        "Lco/bird/android/model/persistence/FleetStatus;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LYq1;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LYq1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYq1$q;->g:LYq1;

    iput-object p2, p0, LYq1$q;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LYq1$q;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;",
            ">;",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;->getKind()Lco/bird/android/model/constant/FleetStatusActionKind;

    move-result-object v0

    sget-object v1, LYq1$q$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;->getListAction()Lco/bird/android/model/persistence/nestedstructures/FleetStatusListAction;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusListAction;->getSubstate()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, LYq1$q;->g:LYq1;

    iget-object v1, p0, LYq1$q;->h:Ljava/lang/String;

    invoke-static {v0}, LYq1;->access$getNavigator$p(LYq1;)Le13;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Le13;->d0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LYq1$q;->g:LYq1;

    invoke-static {v0}, LYq1;->access$getNavigator$p(LYq1;)Le13;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;->getMapAction()Lco/bird/android/model/persistence/nestedstructures/FleetStatusMapAction;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusMapAction;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Ldr1;->access$toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    move-object v4, p1

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToOperator$default(Le13;ZLco/bird/android/model/GoOperatorMapDeeplinkParams;Ljava/util/List;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
