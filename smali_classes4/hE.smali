.class public LhE;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lco/bird/android/vehiclescanner/common/mrp/a<",
        "TS;>;S:",
        "Ljava/lang/Object;",
        ">",
        "Lf1<",
        "TR;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0016\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\u0008\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0006\u0010\u000f\u001a\u00028\u0001\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "LhE;",
        "Lco/bird/android/vehiclescanner/common/mrp/a;",
        "R",
        "S",
        "Lf1;",
        "renderer",
        "",
        "consume",
        "(Lco/bird/android/vehiclescanner/common/mrp/a;)V",
        "Ldm5;",
        "e",
        "Ldm5;",
        "n",
        "()Ldm5;",
        "scannerNavigator",
        "initialState",
        "<init>",
        "(Ljava/lang/Object;Ldm5;)V",
        "vehiclescanner_release"
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
        "SMAP\nBaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,24:1\n180#2:25\n*S KotlinDebug\n*F\n+ 1 BaseScanPresenter.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanPresenter\n*L\n19#1:25\n*E\n"
    }
.end annotation


# instance fields
.field public final e:Ldm5;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ldm5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Ldm5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LhE;->e:Ldm5;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ldm5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, LhE;-><init>(Ljava/lang/Object;Ldm5;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LhE;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public consume(Lco/bird/android/vehiclescanner/common/mrp/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    iget-object v0, p0, LhE;->e:Ldm5;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lco/bird/android/vehiclescanner/common/mrp/a;->G()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LhE$a;

    invoke-direct {v0, p0}, LhE$a;-><init>(LhE;)V

    new-instance v1, LeE;

    invoke-direct {v1, v0}, LeE;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_0
    return-void
.end method

.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Lco/bird/android/vehiclescanner/common/mrp/a;

    invoke-virtual {p0, p1}, LhE;->consume(Lco/bird/android/vehiclescanner/common/mrp/a;)V

    return-void
.end method

.method public final n()Ldm5;
    .locals 1

    iget-object v0, p0, LhE;->e:Ldm5;

    return-object v0
.end method
