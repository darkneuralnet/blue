.class public final Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "l",
        "Landroid/app/Application;",
        "b",
        "Landroid/app/Application;",
        "application",
        "Ldagger/Lazy;",
        "Lfx1;",
        "c",
        "Ldagger/Lazy;",
        "foregroundServiceLauncher",
        "d",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "<init>",
        "(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)V",
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
        "SMAP\nForegroundServiceLifecycleObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceLifecycleObserver.kt\nco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,65:1\n44#2:66\n199#3:67\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceLifecycleObserver.kt\nco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver\n*L\n58#1:66\n58#1:67\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/app/Application;

.field public final c:Ldagger/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/Lazy<",
            "Lfx1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LLifecycleOwner;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ldagger/Lazy;LLifecycleOwner;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ldagger/Lazy<",
            "Lfx1;",
            ">;",
            "LLifecycleOwner;",
            ")V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "foregroundServiceLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->b:Landroid/app/Application;

    iput-object p2, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->c:Ldagger/Lazy;

    iput-object p3, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->d:LLifecycleOwner;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getApplication$p(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->b:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic access$getForegroundServiceLauncher$p(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ldagger/Lazy;
    .locals 0

    iget-object p0, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->c:Ldagger/Lazy;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->n(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->b:Landroid/app/Application;

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/app/ActivityManager;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/ActivityManager;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz p0, :cond_1

    iget p0, p0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    goto :goto_1

    :cond_1
    const/16 p0, 0x3e8

    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Lhx1;

    invoke-direct {v0, p0}, Lhx1;-><init>(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->d()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$a;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$a;

    new-instance v2, Lix1;

    invoke-direct {v2, v1}, Lix1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$b;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$b;

    new-instance v2, Ljx1;

    invoke-direct {v2, v1}, Ljx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;

    invoke-direct {v1, p0}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$c;-><init>(Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;)V

    new-instance v2, Lkx1;

    invoke-direct {v2, v1}, Lkx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$d;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$d;

    new-instance v2, Llx1;

    invoke-direct {v2, v1}, Llx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->W(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "private fun initForegrou\u2026application) {}\n    }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->d:LLifecycleOwner;

    invoke-static {v1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$e;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$e;

    new-instance v2, Lmx1;

    invoke-direct {v2, v1}, Lmx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$f;->b:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$f;

    new-instance v3, Lnx1;

    invoke-direct {v3, v1}, Lnx1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->c:Ldagger/Lazy;

    invoke-interface {v0}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfx1;

    iget-object v1, p0, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->b:Landroid/app/Application;

    sget-object v2, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$g;->g:Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver$g;

    invoke-interface {v0, v1, v2}, Lfx1;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/foregroundservice/ForegroundServiceLifecycleObserver;->l()V

    return-void
.end method
