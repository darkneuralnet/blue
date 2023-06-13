.class public final LW32$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW32$a;-><init>(LW32;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "passed",
        "",
        "invoke",
        "(Ljava/lang/Boolean;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n18#2:181\n18#2:196\n9#3,4:182\n9#3,4:197\n1603#4,9:186\n1855#4:195\n1856#4:202\n1612#4:203\n766#4:204\n857#4,2:205\n1855#4,2:207\n1#5:201\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder$1\n*L\n99#1:181\n105#1:196\n99#1:182,4\n105#1:197,4\n105#1:186,9\n105#1:195\n105#1:202\n105#1:203\n106#1:204\n106#1:205,2\n107#1:207,2\n105#1:201\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LW32$a;

.field public final synthetic h:LW32;


# direct methods
.method public constructor <init>(LW32$a;LW32;)V
    .locals 0

    iput-object p1, p0, LW32$a$a;->g:LW32$a;

    iput-object p2, p0, LW32$a$a;->h:LW32;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LW32$a$a;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 6

    iget-object v0, p0, LW32$a$a;->g:LW32$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_9

    iget-object v1, p0, LW32$a$a;->g:LW32$a;

    invoke-static {v1}, LW32$a;->a(LW32$a;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, LW32$a$a;->h:LW32;

    invoke-static {v1}, LW32;->access$getAdapterData(LW32;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LQ32;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, LQ32;

    if-eqz v0, :cond_9

    iget-object v1, p0, LW32$a$a;->h:LW32;

    invoke-static {v1}, LW32;->access$getCategoryUpdatesSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object v3

    invoke-virtual {v0}, LQ32;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, LQ32;->e()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v1}, LW32;->access$getCategoryExpandsSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {v0}, LQ32;->f()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {v0}, LQ32;->j()LH6;

    move-result-object p1

    invoke-virtual {p1}, LH6;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LG6;

    invoke-virtual {v4}, LG6;->c()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lco/bird/android/model/InspectionIssue;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v4, v2

    :goto_2
    check-cast v4, Lco/bird/android/model/InspectionIssue;

    if-eqz v4, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/InspectionIssue;

    invoke-virtual {v4}, Lco/bird/android/model/InspectionIssue;->getSelected()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/InspectionIssue;

    invoke-static {v1}, LW32;->access$getIssueUpdatesSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/android/model/InspectionIssue;->getId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lco/bird/android/model/InspectionIssue;->getWarningMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {v1}, LW32;->access$getWarningDisplaysSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/android/model/InspectionIssue;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v4, v2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-static {v1}, LW32;->access$getCategoryExpandsSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {v0}, LQ32;->f()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    return-void
.end method
