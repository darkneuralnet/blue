.class public final LC03$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC03;->d(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field public final synthetic g:Lco/bird/android/model/User;

.field public final synthetic h:LC03;


# direct methods
.method public constructor <init>(Lco/bird/android/model/User;LC03;)V
    .locals 0

    iput-object p1, p0, LC03$z;->g:Lco/bird/android/model/User;

    iput-object p2, p0, LC03$z;->h:LC03;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC03$z;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 12

    iget-object v0, p0, LC03$z;->g:Lco/bird/android/model/User;

    invoke-static {v0}, Lco/bird/android/model/UserKt;->hasOperatorRole(Lco/bird/android/model/User;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC03$z;->g:Lco/bird/android/model/User;

    invoke-virtual {v0}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LC03$z;->h:LC03;

    sget-object v3, Lco/bird/android/model/constant/UserRole;->OPERATOR:Lco/bird/android/model/constant/UserRole;

    invoke-static {v1}, LC03;->access$getAnalyticsManager$p(LC03;)LEa;

    move-result-object v2

    new-instance v11, LOU2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, LOU2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {v1}, LC03;->access$getPreference$p(LC03;)Lgl;

    move-result-object v1

    new-instance v9, Lco/bird/android/model/UserRoleItem;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRole;->getRole()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v0}, Lco/bird/android/model/OperatorRole;->getTitle()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lco/bird/android/model/UserRoleItem;-><init>(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_0
    iget-object v0, p0, LC03$z;->h:LC03;

    invoke-static {v0}, LC03;->access$getNavigator$p(LC03;)Le13;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToOperator$default(Le13;ZLco/bird/android/model/GoOperatorMapDeeplinkParams;Ljava/util/List;ILjava/lang/Object;)V

    return-void
.end method
