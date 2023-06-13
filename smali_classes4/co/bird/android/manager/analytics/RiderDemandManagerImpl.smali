.class public final Lco/bird/android/manager/analytics/RiderDemandManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ85;
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001\tBc\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020\'\u0012\u0008\u0008\u0001\u0010-\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u00a2\u0006\u0004\u00089\u0010:J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010*\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00108\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u0006<"
    }
    d2 = {
        "Lco/bird/android/manager/analytics/RiderDemandManagerImpl;",
        "LZ85;",
        "LVX0;",
        "",
        "d",
        "",
        "source",
        "b",
        "",
        "a",
        "LLifecycleOwner;",
        "owner",
        "onStart",
        "Lgl;",
        "Lgl;",
        "preference",
        "LYR4;",
        "c",
        "LYR4;",
        "rideManager",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LTq4;",
        "e",
        "LTq4;",
        "reactiveConfig",
        "Llh6;",
        "f",
        "Llh6;",
        "userManager",
        "LRh6;",
        "g",
        "LRh6;",
        "userStream",
        "Lq54;",
        "h",
        "Lq54;",
        "privateBirdsManager",
        "Lbn;",
        "i",
        "Lbn;",
        "areaManager",
        "j",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "LAM3;",
        "k",
        "LAM3;",
        "paymentManagerV2",
        "Ldr4;",
        "l",
        "Ldr4;",
        "reactiveLocationManager",
        "m",
        "Z",
        "applicationLaunched",
        "<init>",
        "(Lgl;LYR4;LEa;LTq4;Llh6;LRh6;Lq54;Lbn;LLifecycleOwner;LAM3;Ldr4;)V",
        "n",
        "analytics_release"
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
        "SMAP\nRiderDemandManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,177:1\n199#2:178\n237#2:180\n237#2:182\n44#3:179\n44#3:181\n*S KotlinDebug\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl\n*L\n70#1:178\n136#1:180\n173#1:182\n136#1:179\n173#1:181\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;


# instance fields
.field public final b:Lgl;

.field public final c:LYR4;

.field public final d:LEa;

.field public final e:LTq4;

.field public final f:Llh6;

.field public final g:LRh6;

.field public final h:Lq54;

.field public final i:Lbn;

.field public final j:LLifecycleOwner;

.field public final k:LAM3;

.field public final l:Ldr4;

.field public m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->n:Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;

    return-void
.end method

.method public constructor <init>(Lgl;LYR4;LEa;LTq4;Llh6;LRh6;Lq54;Lbn;LLifecycleOwner;LAM3;Ldr4;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privateBirdsManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentManagerV2"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveLocationManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b:Lgl;

    iput-object p2, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->c:LYR4;

    iput-object p3, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->d:LEa;

    iput-object p4, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->e:LTq4;

    iput-object p5, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->f:Llh6;

    iput-object p6, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->g:LRh6;

    iput-object p7, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->h:Lq54;

    iput-object p8, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->i:Lbn;

    iput-object p9, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->j:LLifecycleOwner;

    iput-object p10, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->k:LAM3;

    iput-object p11, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->l:Ldr4;

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LEa;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->d:LEa;

    return-object p0
.end method

.method public static final synthetic access$getAreaManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lbn;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->i:Lbn;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getPrivateBirdsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lq54;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->h:Lq54;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->e:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getReactiveLocationManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->l:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LYR4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->c:LYR4;

    return-object p0
.end method

.method public static final synthetic access$getUserManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Llh6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->f:Llh6;

    return-object p0
.end method

.method public static final synthetic access$getUserStream$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LRh6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->g:LRh6;

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->n(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final n(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->c:LYR4;

    invoke-interface {v0}, LYR4;->N()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lio/reactivex/F;->f0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "timer(DELAY_AFTER_FOREGR\u2026ECONDS, TimeUnit.SECONDS)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v2, "UNBOUND"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;-><init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;Ljava/lang/String;)V

    new-instance p1, La95;

    invoke-direct {p1, v1}, La95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->j:LLifecycleOwner;

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 6

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b:Lgl;

    invoke-virtual {v0}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->m:Z

    if-nez v0, :cond_0

    const-string v0, "app_launch"

    invoke-virtual {p0, v0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->m:Z

    goto :goto_0

    :cond_0
    const-string v0, "app_open"

    invoke-virtual {p0, v0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;

    invoke-direct {v1, p0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;-><init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)V

    new-instance v2, Lb95;

    invoke-direct {v2, v1}, Lb95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun onStart(own\u2026))\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v2

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->k:LAM3;

    invoke-interface {v0}, LAM3;->e()LZ84;

    move-result-object v0

    sget-object v4, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$c;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl$c;

    new-instance v5, Lc95;

    invoke-direct {v5, v4}, Lc95;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->distinctUntilChanged(Lio/reactivex/functions/d;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v4, "paymentManagerV2.default\u2026stripePaymentMethod?.id }"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$d;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl$d;

    invoke-static {v0, v4}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v4, 0x1

    invoke-virtual {v0, v4, v5}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$e;

    invoke-direct {v4, p0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$e;-><init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)V

    new-instance v5, Ld95;

    invoke-direct {v5, v4}, Ld95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method
