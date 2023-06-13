.class public final LBj3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBj3;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/AreaBottomSheetButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/AreaBottomSheetButton;",
        "kotlin.jvm.PlatformType",
        "button",
        "",
        "a",
        "(Lco/bird/android/model/AreaBottomSheetButton;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBj3;


# direct methods
.method public constructor <init>(LBj3;)V
    .locals 0

    iput-object p1, p0, LBj3$b;->g:LBj3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/AreaBottomSheetButton;)V
    .locals 3

    instance-of v0, p1, Lco/bird/android/model/AreaDirectionsButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, LBj3$b;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getNavigator$p(LBj3;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/AreaDirectionsButton;

    invoke-virtual {p1}, Lco/bird/android/model/AreaDirectionsButton;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object p1

    invoke-static {p1}, LUB1;->c(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->x3(Lco/bird/android/model/wire/WireLocation;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/AreaRefreshButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, LBj3$b;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getAreaManager$p(LBj3;)Lbn;

    move-result-object p1

    new-instance v0, LNn;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, LNn;-><init>(Landroid/location/Location;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lbn;->a0(LNn;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/RefreshInfoButton;

    if-eqz v0, :cond_3

    iget-object p1, p0, LBj3$b;->g:LBj3;

    invoke-static {p1}, LBj3;->access$getUi$p(LBj3;)LCw3;

    move-result-object p1

    iget-object v0, p0, LBj3$b;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getAreaManager$p(LBj3;)Lbn;

    move-result-object v0

    invoke-interface {v0}, Lbn;->w()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTime;

    if-eqz v0, :cond_2

    invoke-static {v0}, LpT0;->g(Lorg/joda/time/DateTime;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-interface {p1, v1}, LCw3;->H6(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/LearnMoreButton;

    if-eqz v0, :cond_4

    iget-object v0, p0, LBj3$b;->g:LBj3;

    invoke-static {v0}, LBj3;->access$getNavigator$p(LBj3;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/LearnMoreButton;

    invoke-virtual {p1}, Lco/bird/android/model/LearnMoreButton;->getZendeskArticleId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Le13;->w3(J)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/AreaBottomSheetButton;

    invoke-virtual {p0, p1}, LBj3$b;->a(Lco/bird/android/model/AreaBottomSheetButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
