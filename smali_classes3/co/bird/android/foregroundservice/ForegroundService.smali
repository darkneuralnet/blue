.class public final Lco/bird/android/foregroundservice/ForegroundService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/foregroundservice/ForegroundService$a;,
        Lco/bird/android/foregroundservice/ForegroundService$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u000e2\u00020\u0001:\u0002\'\u000cB\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R-\u0010\u0012\u001a\r\u0012\t\u0012\u00070\n\u00a2\u0006\u0002\u0008\u000b0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R.\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u001c*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/foregroundservice/ForegroundService;",
        "Landroid/app/Service;",
        "",
        "onCreate",
        "onDestroy",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "",
        "Lqx1;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "b",
        "Ljava/util/Set;",
        "f",
        "()Ljava/util/Set;",
        "setPlugins",
        "(Ljava/util/Set;)V",
        "plugins",
        "LOh;",
        "c",
        "LOh;",
        "e",
        "()LOh;",
        "setAppBuildConfig",
        "(LOh;)V",
        "appBuildConfig",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "d",
        "Lio/reactivex/subjects/a;",
        "activePlugins",
        "Lgv5;",
        "Lkotlin/Lazy;",
        "g",
        "()Lgv5;",
        "scopeProvider",
        "<init>",
        "()V",
        "a",
        "foreground-service_release"
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
        "SMAP\nForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,127:1\n1855#2,2:128\n1549#2:130\n1620#2,3:131\n180#3:134\n180#3:135\n*S KotlinDebug\n*F\n+ 1 ForegroundService.kt\nco/bird/android/foregroundservice/ForegroundService\n*L\n60#1:128,2\n64#1:130\n64#1:131,3\n71#1:134\n85#1:135\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lco/bird/android/foregroundservice/ForegroundService$a;

.field public static final g:Lgx1;


# instance fields
.field public b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lqx1;",
            ">;"
        }
    .end annotation
.end field

.field public c:LOh;

.field public final d:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/util/Set<",
            "Lqx1;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/foregroundservice/ForegroundService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/foregroundservice/ForegroundService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/foregroundservice/ForegroundService;->f:Lco/bird/android/foregroundservice/ForegroundService$a;

    new-instance v0, Lgx1;

    const-class v1, Lco/bird/android/foregroundservice/ForegroundService;

    invoke-direct {v0, v1}, Lgx1;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lco/bird/android/foregroundservice/ForegroundService;->g:Lgx1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "create<Set<ForegroundServicePlugin>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->d:Lio/reactivex/subjects/a;

    sget-object v0, Lco/bird/android/foregroundservice/ForegroundService$g;->g:Lco/bird/android/foregroundservice/ForegroundService$g;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->e:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getActivePlugins$p(Lco/bird/android/foregroundservice/ForegroundService;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/foregroundservice/ForegroundService;->d:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getLAUNCHER$cp()Lgx1;
    .locals 1

    sget-object v0, Lco/bird/android/foregroundservice/ForegroundService;->g:Lgx1;

    return-object v0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()LOh;
    .locals 1

    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->c:LOh;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appBuildConfig"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lqx1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->b:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "plugins"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Lgv5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgv5;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 5

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Lgv5;->i(Landroidx/lifecycle/f$a;)V

    invoke-static {}, Lco/bird/android/foregroundservice/a;->a()Lco/bird/android/foregroundservice/ForegroundService$b$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lco/bird/android/foregroundservice/ForegroundService$b$a;->a(LlG2;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/foregroundservice/ForegroundService$b;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/foregroundservice/ForegroundService$b;->a(Lco/bird/android/foregroundservice/ForegroundService;)V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqx1;

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->e()LOh;

    move-result-object v3

    invoke-interface {v3}, LOh;->k()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lqx1;->n(Lcom/uber/autodispose/ScopeProvider;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->f()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqx1;

    invoke-virtual {v2}, Lqx1;->l()Lio/reactivex/Observable;

    move-result-object v3

    new-instance v4, Lco/bird/android/foregroundservice/ForegroundService$c;

    invoke-direct {v4, v2}, Lco/bird/android/foregroundservice/ForegroundService$c;-><init>(Lqx1;)V

    new-instance v2, Lax1;

    invoke-direct {v2, v4}, Lax1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lio/reactivex/Observable;->merge(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->d()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(\n      plugins.map\u2026beOn(Schedulers.single())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/foregroundservice/ForegroundService$d;

    invoke-direct {v2, p0}, Lco/bird/android/foregroundservice/ForegroundService$d;-><init>(Lco/bird/android/foregroundservice/ForegroundService;)V

    new-instance v3, Lbx1;

    invoke-direct {v3, v2}, Lbx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundService;->d:Lio/reactivex/subjects/a;

    sget-object v2, Lco/bird/android/foregroundservice/ForegroundService$e;->g:Lco/bird/android/foregroundservice/ForegroundService$e;

    new-instance v3, Lcx1;

    invoke-direct {v3, v2}, Lcx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "activePlugins\n      .map\u2026cationPriority })\n      }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v2

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/foregroundservice/ForegroundService$f;

    invoke-direct {v1, p0}, Lco/bird/android/foregroundservice/ForegroundService$f;-><init>(Lco/bird/android/foregroundservice/ForegroundService;)V

    new-instance v2, Ldx1;

    invoke-direct {v2, v1}, Ldx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundService;->g()Lgv5;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {v0, v1}, Lgv5;->i(Landroidx/lifecycle/f$a;)V

    return-void
.end method
