.class public final Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;
.super Landroidx/core/app/JobIntentService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;",
        "Landroidx/core/app/JobIntentService;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "g",
        "onDestroy",
        "",
        "k",
        "Z",
        "destroyed",
        "Lio/reactivex/disposables/b;",
        "l",
        "Lio/reactivex/disposables/b;",
        "disposables",
        "Lio/reactivex/subjects/d;",
        "",
        "kotlin.jvm.PlatformType",
        "m",
        "Lio/reactivex/subjects/d;",
        "deletionSubject",
        "<init>",
        "()V",
        "n",
        "e",
        "local-asset_release"
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
        "SMAP\nLocalAssetDeletionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDeletionService.kt\nco/bird/android/manager/localasset/services/LocalAssetDeletionService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1855#2,2:55\n*S KotlinDebug\n*F\n+ 1 LocalAssetDeletionService.kt\nco/bird/android/manager/localasset/services/LocalAssetDeletionService\n*L\n45#1:55,2\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;


# instance fields
.field public k:Z

.field public final l:Lio/reactivex/disposables/b;

.field public final m:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->n:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V

    new-instance v0, Lio/reactivex/disposables/b;

    invoke-direct {v0}, Lio/reactivex/disposables/b;-><init>()V

    iput-object v0, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->l:Lio/reactivex/disposables/b;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<String>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->m:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$a;->g:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$a;

    new-instance v3, LPt2;

    invoke-direct {v3, v2}, LPt2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$b;->b:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$b;

    new-instance v3, LQt2;

    invoke-direct {v3, v2}, LQt2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->onErrorReturnItem(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$c;->g:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$c;

    new-instance v3, LRt2;

    invoke-direct {v3, v2}, LRt2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$d;->b:Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$d;

    new-instance v4, LSt2;

    invoke-direct {v4, v2}, LSt2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3, v4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v1

    const-string v2, "deletionSubject\n      .s\u2026.subscribe({}, Timber::e)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lio/reactivex/rxkotlin/a;->a(Lio/reactivex/disposables/c;Lio/reactivex/disposables/b;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public g(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->k:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "asset_paths"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->m:Lio/reactivex/subjects/d;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/core/app/JobIntentService;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->k:Z

    iget-object v0, p0, Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;->l:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    return-void
.end method
