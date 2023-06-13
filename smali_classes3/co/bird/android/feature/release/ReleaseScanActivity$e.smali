.class public final Lco/bird/android/feature/release/ReleaseScanActivity$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/release/ReleaseScanActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
        "SMAP\nReleaseScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$onCreate$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,277:1\n218#2:278\n*S KotlinDebug\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$onCreate$2\n*L\n117#1:278\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/release/ReleaseScanActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/release/ReleaseScanActivity$e;->g:Lco/bird/android/feature/release/ReleaseScanActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity$e;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity$e;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/release/ReleaseScanActivity$e;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity$e;->g:Lco/bird/android/feature/release/ReleaseScanActivity;

    invoke-virtual {v0}, Lco/bird/android/feature/release/ReleaseScanActivity;->q0()LAv4;

    move-result-object v0

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKv4;

    iget-object v1, p0, Lco/bird/android/feature/release/ReleaseScanActivity$e;->g:Lco/bird/android/feature/release/ReleaseScanActivity;

    invoke-virtual {v1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    new-instance v3, LGu4;

    invoke-virtual {v0}, LKv4;->s()Lco/bird/android/model/wire/WireNest;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, LKv4;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v3, v1, v0}, LGu4;-><init>(ZI)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/release/ReleaseScanActivity$e$a;->g:Lco/bird/android/feature/release/ReleaseScanActivity$e$a;

    new-instance v2, LSu4;

    invoke-direct {v2, v1}, LSu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    const-string v1, "rendererDelegate.birdDia\u2026se == DialogResponse.OK }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/release/ReleaseScanActivity$e;->g:Lco/bird/android/feature/release/ReleaseScanActivity;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/release/ReleaseScanActivity$e$b;

    iget-object v2, p0, Lco/bird/android/feature/release/ReleaseScanActivity$e;->g:Lco/bird/android/feature/release/ReleaseScanActivity;

    invoke-direct {v1, v2}, Lco/bird/android/feature/release/ReleaseScanActivity$e$b;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance v2, LTu4;

    invoke-direct {v2, v1}, LTu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
