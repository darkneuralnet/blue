.class public final LRv2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRv2;->r(LSv2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTv2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTv2;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LTv2;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LRv2;


# direct methods
.method public constructor <init>(LRv2;)V
    .locals 0

    iput-object p1, p0, LRv2$a;->g:LRv2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTv2;)V
    .locals 13

    instance-of v0, p1, LyO5;

    const/4 v1, 0x0

    const-string v2, "sessionId"

    if-eqz v0, :cond_1

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getAnalyticsManager$p(LRv2;)LEa;

    move-result-object v0

    new-instance v11, Lmv2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v3, p0, LRv2$a;->g:LRv2;

    invoke-static {v3}, LRv2;->access$getSessionId(LRv2;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LRv2$a;->g:LRv2;

    invoke-static {v2}, LRv2;->access$getPreference$p(LRv2;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/User;->getRideCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    move-object v8, v1

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lmv2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object v0

    check-cast p1, LyO5;

    invoke-virtual {p1}, LyO5;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setHint(Ljava/lang/CharSequence;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object p1

    sget-object v0, Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;->OVERLAY:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setActivityMode(Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object p1

    sget-object v0, Lcom/google/android/libraries/places/api/model/Place$Field;->ADDRESS_COMPONENTS:Lcom/google/android/libraries/places/api/model/Place$Field;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setPlaceFields(Ljava/util/List;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object p1

    sget-object v0, Lcom/google/android/libraries/places/api/model/TypeFilter;->REGIONS:Lcom/google/android/libraries/places/api/model/TypeFilter;

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setTypeFilter(Lcom/google/android/libraries/places/api/model/TypeFilter;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object p1

    new-instance v0, LRv2$a$a;

    iget-object v1, p0, LRv2$a;->g:LRv2;

    invoke-direct {v0, v1}, LRv2$a$a;-><init>(LRv2;)V

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setOnPlaceSelectedListener(Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    goto/16 :goto_3

    :cond_1
    instance-of v0, p1, LNB5;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAnalyticsManager$p(LRv2;)LEa;

    move-result-object p1

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getSessionId(LRv2;)Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getAttemptedPlaceSearch$p(LRv2;)Z

    move-result v9

    new-instance v0, Llv2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x1

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v12}, Llv2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getNavigator$p(LRv2;)Le13;

    move-result-object p1

    sget-object v0, Le13$b;->c:Le13$b;

    new-array v1, v3, [Lkotlin/Pair;

    invoke-interface {p1, v0, v1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    goto/16 :goto_3

    :cond_2
    instance-of v0, p1, Lc0;

    if-eqz v0, :cond_3

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getAnalyticsManager$p(LRv2;)LEa;

    move-result-object p1

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getSessionId(LRv2;)Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getAttemptedPlaceSearch$p(LRv2;)Z

    move-result v9

    new-instance v0, Llv2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v12}, Llv2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getNavigator$p(LRv2;)Le13;

    move-result-object p1

    sget-object v0, Le13$b;->b:Le13$b;

    new-array v1, v3, [Lkotlin/Pair;

    invoke-interface {p1, v0, v1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    goto/16 :goto_3

    :cond_3
    instance-of v0, p1, LNU3;

    if-nez v0, :cond_9

    instance-of v0, p1, LVT3;

    if-eqz v0, :cond_8

    iget-object v0, p0, LRv2$a;->g:LRv2;

    invoke-static {v0}, LRv2;->access$getAnalyticsManager$p(LRv2;)LEa;

    move-result-object v0

    iget-object v2, p0, LRv2$a;->g:LRv2;

    invoke-static {v2}, LRv2;->access$getSessionId(LRv2;)Ljava/lang/String;

    move-result-object v8

    check-cast p1, LVT3;

    invoke-virtual {p1}, LVT3;->b()Lcom/google/android/libraries/places/api/model/Place;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, LLi1;->b(Lcom/google/android/libraries/places/api/model/Place;)Lcom/google/android/libraries/places/api/model/AddressComponent;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    move-object v2, v1

    :goto_0
    const-string v4, ""

    if-nez v2, :cond_5

    move-object v10, v4

    goto :goto_1

    :cond_5
    move-object v10, v2

    :goto_1
    invoke-virtual {p1}, LVT3;->b()Lcom/google/android/libraries/places/api/model/Place;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, LLi1;->a(Lcom/google/android/libraries/places/api/model/Place;)Lcom/google/android/libraries/places/api/model/AddressComponent;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v1

    :cond_6
    if-nez v1, :cond_7

    move-object v9, v4

    goto :goto_2

    :cond_7
    move-object v9, v1

    :goto_2
    new-instance p1, LAa5;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, LAa5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getLogger(LRv2;)Lg46$b;

    move-result-object p1

    const-string v0, "Match found!"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LRv2$a;->g:LRv2;

    invoke-static {p1}, LRv2;->access$getNavigator$p(LRv2;)Le13;

    move-result-object p1

    sget-object v0, Le13$b;->c:Le13$b;

    new-array v1, v3, [Lkotlin/Pair;

    invoke-interface {p1, v0, v1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    goto :goto_3

    :cond_8
    instance-of v0, p1, LVf1;

    if-nez v0, :cond_9

    sget-object v0, Li22;->a:Li22;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    instance-of p1, p1, LWT3;

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTv2;

    invoke-virtual {p0, p1}, LRv2$a;->a(LTv2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
