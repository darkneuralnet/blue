.class public final Ln60$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60;->L(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/Bird;",
        "birds",
        "Lio/reactivex/K;",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "g",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBulkStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1549#2:333\n1620#2,3:334\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportPresenter$onCreate$11\n*L\n166#1:333\n166#1:334,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ln60;

.field public final synthetic h:Lco/bird/android/model/wire/WireBatch;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ln60;Lco/bird/android/model/wire/WireBatch;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ln60$f;->g:Ln60;

    iput-object p2, p0, Ln60$f;->h:Lco/bird/android/model/wire/WireBatch;

    iput-object p3, p0, Ln60$f;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ln60$f;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Ln60;Ljava/util/List;Lco/bird/android/model/wire/WireBatch;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln60$f;->l(Ln60;Ljava/util/List;Lco/bird/android/model/wire/WireBatch;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ln60$f;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ln60$f;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ln60$f;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Ln60;)V
    .locals 0

    invoke-static {p0}, Ln60$f;->m(Ln60;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final l(Ln60;Ljava/util/List;Lco/bird/android/model/wire/WireBatch;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$batch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ln60;->access$getConverter$p(Ln60;)LH50;

    move-result-object p0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBatch;->getDescription()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, p3, p1, p2}, LH50;->b(ZILjava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ln60;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ln60;->access$getUi$p(Ln60;)LH60;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, LH60;->Rc(Z)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/util/List;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln60$f;->g:Ln60;

    invoke-static {v0}, Ln60;->access$getBatchManager$p(Ln60;)LfF;

    move-result-object v0

    iget-object v1, p0, Ln60$f;->h:Lco/bird/android/model/wire/WireBatch;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBatch;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, v3}, LfF;->b(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ln60$f$a;

    invoke-direct {v1, p1}, Ln60$f$a;-><init>(Ljava/util/List;)V

    new-instance v2, Lo60;

    invoke-direct {v2, v1}, Lo60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "birds ->\n            bat\u2026}\n              .retry(1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ln60$f;->g:Ln60;

    invoke-static {v1}, Ln60;->access$getUi$p(Ln60;)LH60;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ln60$f$b;

    iget-object v2, p0, Ln60$f;->g:Ln60;

    iget-object v3, p0, Ln60$f;->i:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Ln60$f$b;-><init>(Ln60;Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lp60;

    invoke-direct {v2, v1}, Lp60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ln60$f$c;

    iget-object v2, p0, Ln60$f;->g:Ln60;

    iget-object v3, p0, Ln60$f;->i:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Ln60$f$c;-><init>(Ln60;Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lq60;

    invoke-direct {v2, v1}, Lq60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ln60$f$d;

    iget-object v2, p0, Ln60$f;->g:Ln60;

    iget-object v3, p0, Ln60$f;->h:Lco/bird/android/model/wire/WireBatch;

    invoke-direct {v1, v2, p1, v3}, Ln60$f$d;-><init>(Ln60;Ljava/util/List;Lco/bird/android/model/wire/WireBatch;)V

    new-instance v2, Lr60;

    invoke-direct {v2, v1}, Lr60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Ln60$f;->g:Ln60;

    iget-object v2, p0, Ln60$f;->h:Lco/bird/android/model/wire/WireBatch;

    new-instance v3, Ls60;

    invoke-direct {v3, v1, p1, v2}, Ls60;-><init>(Ln60;Ljava/util/List;Lco/bird/android/model/wire/WireBatch;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, Ln60$f;->g:Ln60;

    new-instance v1, Lt60;

    invoke-direct {v1, v0}, Lt60;-><init>(Ln60;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->r(Lio/reactivex/functions/a;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ln60$f;->g(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
