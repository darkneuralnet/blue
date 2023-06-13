.class public final LpG$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpG;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Landroid/widget/Button;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "it",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "",
        "Landroid/widget/Button;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/BeginnerModeOnboardingResponse;)Lio/reactivex/B;"
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
        "SMAP\nBeginnerModeBottomViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl$onTutorialStepShown$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 BeginnerModeBottomViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeBottomViewPresenterImpl$onTutorialStepShown$1\n*L\n46#1:77\n46#1:78,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LpG;


# direct methods
.method public constructor <init>(LpG;)V
    .locals 0

    iput-object p1, p0, LpG$a;->g:LpG;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LpG$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/BeginnerModeOnboardingResponse;)Lio/reactivex/B;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Landroid/widget/Button;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/BeginnerModeOnboardingResponse;->getActions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LpG$a;->g:LpG;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/BeginnerModeOnboardingAction;

    invoke-static {v0}, LpG;->access$getBeginnerModeBottomView$p(LpG;)Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeOnboardingAction;->getHighlighted()Z

    move-result v4

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeOnboardingAction;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;->a(ZLjava/lang/String;)Landroid/widget/Button;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-static {v3, v6, v7, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    new-instance v5, LpG$a$a;

    invoke-direct {v5, v2, v3}, LpG$a$a;-><init>(Lco/bird/api/response/BeginnerModeOnboardingAction;Landroid/widget/Button;)V

    new-instance v2, LoG;

    invoke-direct {v2, v5}, LoG;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lio/reactivex/rxkotlin/d;->a(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/BeginnerModeOnboardingResponse;

    invoke-virtual {p0, p1}, LpG$a;->b(Lco/bird/api/response/BeginnerModeOnboardingResponse;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
