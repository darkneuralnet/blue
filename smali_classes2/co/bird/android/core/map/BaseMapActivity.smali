.class public abstract Lco/bird/android/core/map/BaseMapActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"

# interfaces
.implements LUg3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010H\u001a\u00020G\u00a2\u0006\u0004\u0008I\u0010JJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0017J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0017J*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\u0011\u001a\u00020\u0005H\u0004J\u0008\u0010\u0012\u001a\u00020\u0005H\u0014J\u0008\u0010\u0013\u001a\u00020\u0005H\u0014J\u0008\u0010\u0014\u001a\u00020\u0005H\u0014J\u0008\u0010\u0015\u001a\u00020\u0005H\u0014J\u0008\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\"\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004J\u001a\u0010\u001e\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000bJ\u0008\u0010 \u001a\u00020\u0005H\u0002R\u0017\u0010&\u001a\u00020!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010,\u001a\u00020\'8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00050-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\"\u0010\u0008\u001a\u0010\u0012\u000c\u0012\n 2*\u0004\u0018\u00010\u00070\u0007018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001c\u00109\u001a\u0008\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001c\u0010?\u001a\u0004\u0018\u00010:8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u0014\u0010B\u001a\u00020\u000b8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010E\u00a8\u0006K"
    }
    d2 = {
        "Lco/bird/android/core/map/BaseMapActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "LUg3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LcD1;",
        "map",
        "onMapReady",
        "A0",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "q0",
        "onResume",
        "onStart",
        "onStop",
        "onPause",
        "onDestroy",
        "onLowMemory",
        "outState",
        "onSaveInstanceState",
        "onActivityResult",
        "Landroid/view/View;",
        "view",
        "Landroid/view/ViewGroup$LayoutParams;",
        "params",
        "setContentView",
        "layoutResID",
        "t0",
        "Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;",
        "B",
        "Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;",
        "getMapActivityScopeProvider",
        "()Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;",
        "mapActivityScopeProvider",
        "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
        "C",
        "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
        "p0",
        "()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;",
        "mapScopeProvider",
        "Lio/reactivex/subjects/a;",
        "D",
        "Lio/reactivex/subjects/a;",
        "onResumeSubject",
        "Lio/reactivex/subjects/g;",
        "kotlin.jvm.PlatformType",
        "E",
        "Lio/reactivex/subjects/g;",
        "",
        "Ls5;",
        "F",
        "Ljava/util/List;",
        "activityResults",
        "LKp6;",
        "G",
        "LKp6;",
        "getLayoutBinding",
        "()LKp6;",
        "layoutBinding",
        "o0",
        "()I",
        "layoutResource",
        "Lcom/google/android/gms/maps/MapView;",
        "n0",
        "()Lcom/google/android/gms/maps/MapView;",
        "googleMapView",
        "",
        "noActionBar",
        "<init>",
        "(Z)V",
        "core-basemap_release"
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
        "SMAP\nBaseMapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMapActivity.kt\nco/bird/android/core/map/BaseMapActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n160#2,5:176\n1855#3,2:181\n*S KotlinDebug\n*F\n+ 1 BaseMapActivity.kt\nco/bird/android/core/map/BaseMapActivity\n*L\n65#1:176,5\n151#1:181,2\n*E\n"
    }
.end annotation


# instance fields
.field public final B:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

.field public final C:Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

.field public final D:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final E:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "LcD1;",
            ">;"
        }
    .end annotation
.end field

.field public F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls5;",
            ">;"
        }
    .end annotation
.end field

.field public final G:LKp6;


# direct methods
.method public constructor <init>(Z)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    const-string v1, "lifecycle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;-><init>(Landroidx/lifecycle/f;)V

    iput-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->B:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_PAUSE:Landroidx/lifecycle/f$a;

    invoke-static {p1, v0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->k(Landroidx/lifecycle/f;Landroidx/lifecycle/f$a;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    const-string v0, "from(lifecycle, /* until\u2026Lifecycle.Event.ON_PAUSE)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->C:Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string v0, "create<Unit>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->D:Lio/reactivex/subjects/a;

    invoke-static {}, Lio/reactivex/subjects/g;->w0()Lio/reactivex/subjects/g;

    move-result-object p1

    const-string v0, "create<GoogleMap>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->E:Lio/reactivex/subjects/g;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->F:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$onActivityResults(Lco/bird/android/core/map/BaseMapActivity;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->t0()V

    return-void
.end method

.method public static synthetic j0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->w0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V

    return-void
.end method

.method public static synthetic k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->x0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V

    return-void
.end method

.method public static final onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final w0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->S()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LwB;

    invoke-direct {v1, p0, p1}, LwB;-><init>(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final x0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->onMapReady(LcD1;)V

    iget-object p0, p0, Lco/bird/android/core/map/BaseMapActivity;->E:Lio/reactivex/subjects/g;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/g;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A0(LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->B:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    sget-object v0, LtK2;->e:LtK2;

    invoke-virtual {p1, v0}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;->j(LtK2;)V

    return-void
.end method

.method public getLayoutBinding()LKp6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->G:LKp6;

    return-object v0
.end method

.method public abstract n0()Lcom/google/android/gms/maps/MapView;
.end method

.method public abstract o0()I
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->F:Ljava/util/List;

    new-instance v1, Ls5;

    invoke-direct {v1, p1, p2, p3}, Ls5;-><init>(IILandroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->t0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->B:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    sget-object v1, LtK2;->b:LtK2;

    invoke-virtual {v0, v1}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;->j(LtK2;)V

    invoke-static {p0}, LbM2;->a(Landroid/content/Context;)I

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->getLayoutBinding()LKp6;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->getLayoutBinding()LKp6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LKp6;->getRoot()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-super {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->o0()I

    move-result v0

    invoke-super {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    :goto_1
    if-eqz p1, :cond_2

    const-string v0, "map"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object p1

    new-instance v0, LuB;

    invoke-direct {v0, p0}, LuB;-><init>(Lco/bird/android/core/map/BaseMapActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/MapView;->a(LUg3;)V

    sget-object p1, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->E:Lio/reactivex/subjects/g;

    invoke-virtual {v0}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "map.toObservable()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/core/map/BaseMapActivity;->D:Lio/reactivex/subjects/a;

    invoke-virtual {p1, v0, v2}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "Observables.combineLates\u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026er.from(lifecycleOwner)))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/core/map/BaseMapActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/core/map/BaseMapActivity$a;-><init>(Lco/bird/android/core/map/BaseMapActivity;)V

    new-instance v2, LvB;

    invoke-direct {v2, v0}, LvB;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/MapView;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->c()V

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->d()V

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    return-void
.end method

.method public onMapReady(LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/core/map/BaseMapActivity;->B:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    sget-object v0, LtK2;->c:LtK2;

    invoke-virtual {p1, v0}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;->j(LtK2;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->e()V

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->f()V

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->D:Lio/reactivex/subjects/a;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->g(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->h()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->i()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    return-void
.end method

.method public final p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->C:Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    return-object v0
.end method

.method public q0(IILandroid/content/Intent;LcD1;)V
    .locals 0

    const-string p1, "map"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "BaseMapActivity: Do not call setContentView manually. Override val layoutResource instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t0()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->E:Lio/reactivex/subjects/g;

    invoke-virtual {v0}, Lio/reactivex/subjects/g;->x0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LcD1;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lco/bird/android/core/map/BaseMapActivity;->F:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls5;

    invoke-virtual {v2}, Ls5;->a()I

    move-result v3

    invoke-virtual {v2}, Ls5;->b()I

    move-result v4

    invoke-virtual {v2}, Ls5;->c()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v3, v4, v2, v0}, Lco/bird/android/core/map/BaseMapActivity;->q0(IILandroid/content/Intent;LcD1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/core/map/BaseMapActivity;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method
