.class public final LGD6$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGD6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LGD6$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;",
        "b",
        "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;",
        "inspectionCard",
        "LDa2;",
        "c",
        "LDa2;",
        "adapter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LGD6;Landroid/view/View;)V",
        "workorders_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$InspectionViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n41#2:182\n41#2:184\n41#2:186\n41#2:209\n180#3:183\n180#3:185\n180#3:187\n18#4:188\n18#4:197\n9#5,4:189\n9#5,4:198\n1#6:193\n1549#7:194\n1620#7,2:195\n1622#7:202\n1747#7,3:203\n1747#7,3:206\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapter$InspectionViewHolder\n*L\n117#1:182\n123#1:184\n127#1:186\n153#1:209\n117#1:183\n123#1:185\n127#1:187\n132#1:188\n135#1:197\n132#1:189,4\n135#1:198,4\n135#1:194\n135#1:195,2\n135#1:202\n135#1:203,3\n138#1:206,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

.field public final c:LDa2;

.field public final synthetic d:LGD6;


# direct methods
.method public constructor <init>(LGD6;Landroid/view/View;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGD6$b;->d:LGD6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    move-object v0, p2

    check-cast v0, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    iput-object v0, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    new-instance v1, LDa2;

    invoke-direct {v1}, LDa2;-><init>()V

    iput-object v1, p0, LGD6$b;->c:LDa2;

    invoke-virtual {v0}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->z()Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->x()Lio/reactivex/Observable;

    move-result-object v3

    invoke-static {v2, v3}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v2

    new-instance v3, LGD6$b$a;

    invoke-direct {v3, p1, p0}, LGD6$b$a;-><init>(LGD6;LGD6$b;)V

    new-instance v4, LHD6;

    invoke-direct {v4, v3}, LHD6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    new-instance v3, LGD6$b$b;

    invoke-direct {v3, p2, p1, p0}, LGD6$b$b;-><init>(Landroid/view/View;LGD6;LGD6$b;)V

    new-instance p2, LID6;

    invoke-direct {p2, v3}, LID6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, p2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    const-string v2, "merge(inspectionCard.pas\u2026  }\n          }\n        }"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGD6;->access$getRecyclerView$p(LGD6;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "recyclerView"

    if-nez v2, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-static {v2}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    const-string v5, "ViewScopeProvider.from(this)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {p2, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v6, LGD6$b$c;

    invoke-static {p1}, LGD6;->access$getIssueUpdatesSubject$p(LGD6;)Lio/reactivex/subjects/d;

    move-result-object v7

    invoke-direct {v6, v7}, LGD6$b$c;-><init>(Ljava/lang/Object;)V

    new-instance v7, LJD6;

    invoke-direct {v7, v6}, LJD6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v7}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {v0, v1}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setAdapter(LMy;)V

    invoke-virtual {v1}, LDa2;->v()Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {p1}, LGD6;->access$getRecyclerView$p(LGD6;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LGD6$b$d;

    invoke-static {p1}, LGD6;->access$getIssueUpdatesSubject$p(LGD6;)Lio/reactivex/subjects/d;

    move-result-object v6

    invoke-direct {v0, v6}, LGD6$b$d;-><init>(Ljava/lang/Object;)V

    new-instance v6, LKD6;

    invoke-direct {v6, v0}, LKD6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {v1}, LDa2;->w()Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {p1}, LGD6;->access$getRecyclerView$p(LGD6;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v3, v0

    :goto_0
    invoke-static {v3}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LGD6$b$e;

    invoke-static {p1}, LGD6;->access$getToShowPriorityWarnDialogSubject$p(LGD6;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-direct {v0, p1}, LGD6$b$e;-><init>(Ljava/lang/Object;)V

    new-instance p1, LLD6;

    invoke-direct {p1, v0}, LLD6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGD6$b;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGD6$b;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LGD6$b;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGD6$b;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LGD6$b;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic p(LGD6$b;)Lco/bird/android/widget/standardcomponents/InspectionV2CardView;
    .locals 0

    iget-object p0, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 11

    iget-object v0, p0, LGD6$b;->d:LGD6;

    invoke-static {v0}, LGD6;->access$getAdapterData(LGD6;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LHa2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LHa2;

    if-eqz p1, :cond_11

    iget-object v0, p0, LGD6$b;->d:LGD6;

    invoke-virtual {p1}, LHa2;->a()Lco/bird/android/model/Issue;

    move-result-object v2

    invoke-virtual {p1}, LHa2;->b()Z

    move-result v3

    invoke-virtual {p1}, LHa2;->c()LH6;

    move-result-object v4

    invoke-virtual {p1}, LHa2;->d()Lco/bird/android/model/wire/WireServiceCenterCampaign;

    move-result-object p1

    iget-object v5, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v5, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setDescription(Ljava/lang/CharSequence;)V

    iget-object v5, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v3, :cond_7

    invoke-virtual {v4}, LH6;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LG6;

    invoke-virtual {v9}, LG6;->c()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Lkotlin/Pair;

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_1
    move-object v9, v1

    :goto_2
    check-cast v9, Lkotlin/Pair;

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    move v3, v7

    goto :goto_4

    :cond_4
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/Pair;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-ne v8, v6, :cond_6

    move v8, v6

    goto :goto_3

    :cond_6
    move v8, v7

    :goto_3
    if-eqz v8, :cond_5

    move v3, v6

    :goto_4
    if-nez v3, :cond_7

    move v3, v6

    goto :goto_5

    :cond_7
    move v3, v7

    :goto_5
    invoke-virtual {v5, v3}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setEnabled(Z)V

    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getSubtypes()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v5, v3, Ljava/util/Collection;

    if-eqz v5, :cond_8

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/Issue;

    invoke-virtual {v5}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/extension/IssueStatus_Kt;->isFailedStatus(Lco/bird/android/model/IssueStatus;)Z

    move-result v5

    if-eqz v5, :cond_9

    move v7, v6

    :cond_a
    :goto_6
    iget-object v3, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    if-eqz v7, :cond_b

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/extension/IssueStatus_Kt;->toBoolean(Lco/bird/android/model/IssueStatus;)Ljava/lang/Boolean;

    move-result-object v5

    :goto_7
    invoke-virtual {v3, v5}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setAccepted(Ljava/lang/Boolean;)V

    iget-object v3, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {v3}, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;->D()V

    if-eqz p1, :cond_c

    iget-object v3, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireServiceCenterCampaign;->getWirePriority()Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriorityKt;->getDisplayMessage(Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireServiceCenterCampaign;->getWirePriority()Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    move-result-object v8

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->getColor()I

    move-result v8

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireServiceCenterCampaign;->getWirePriority()Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;->getPriority()Lco/bird/android/model/constant/CampaignPriority;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/constant/CampaignPriority;->canPassFailIssue()Z

    move-result p1

    invoke-virtual {v3, v5, v8, p1}, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;->setVehicleCampaign(Ljava/lang/String;IZ)V

    :cond_c
    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getAssetId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-static {v0}, LGD6;->access$getLocalAssetManager$p(LGD6;)Lsu2;

    move-result-object v3

    sget-object v5, Lco/bird/android/model/constant/AssetManagerType;->REPAIR:Lco/bird/android/model/constant/AssetManagerType;

    sget-object v8, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    invoke-interface {v3, p1, v5, v8}, Lsu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;

    move-result-object p1

    iget-object v3, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->s()Landroid/widget/ImageView;

    move-result-object v3

    invoke-static {v0}, LGD6;->access$getRecyclerView$p(LGD6;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_d

    const-string v0, "recyclerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    move-object v1, v0

    :goto_8
    invoke-static {v1}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v1, "ViewScopeProvider.from(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3, v0}, LYf5;->L(Lio/reactivex/F;Landroid/widget/ImageView;Lcom/uber/autodispose/ScopeProvider;)V

    :cond_e
    invoke-virtual {v2}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/extension/IssueStatus_Kt;->isFailedStatus(Lco/bird/android/model/IssueStatus;)Z

    move-result p1

    if-nez p1, :cond_f

    if-eqz v7, :cond_10

    :cond_f
    invoke-virtual {v4}, LH6;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v6

    if-eqz p1, :cond_10

    iget-object p1, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->B(Ljava/util/List;)V

    goto :goto_9

    :cond_10
    iget-object p1, p0, LGD6$b;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->u()V

    :cond_11
    :goto_9
    return-void
.end method
