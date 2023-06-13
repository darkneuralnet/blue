.class public final Lht3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Let3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008#\u0010$J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0008\u0010\t\u001a\u00020\u0002H\u0016J\u0008\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\u000e\u001a\u00020\u0002H\u0016J\u0008\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\u000c\u0012\n  *\u0004\u0018\u00010\u00040\u00040\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lht3;",
        "Let3;",
        "",
        "a",
        "LbN4;",
        "rawResult",
        "handleResult",
        "Lio/reactivex/Observable;",
        "d4",
        "onResume",
        "onPause",
        "",
        "enabled",
        "a5",
        "f",
        "N6",
        "Lcom/uber/autodispose/ScopeProvider;",
        "b",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lhm5;",
        "c",
        "Lhm5;",
        "ui",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
        "d",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
        "scanView",
        "e",
        "Z",
        "shouldEnableScanner",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "Lio/reactivex/subjects/d;",
        "scanResultSubject",
        "<init>",
        "(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V",
        "scanner-delegate_release"
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
        "SMAP\nOperatorScannerDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorScannerDelegate.kt\nco/bird/android/library/scannerdelegate/OperatorScannerDelegateImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n180#2:98\n180#2:99\n*S KotlinDebug\n*F\n+ 1 OperatorScannerDelegate.kt\nco/bird/android/library/scannerdelegate/OperatorScannerDelegateImpl\n*L\n46#1:98\n49#1:99\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Lhm5;

.field public final d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

.field public e:Z

.field public final f:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "LbN4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V
    .locals 1

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lht3;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p2, p0, Lht3;->c:Lhm5;

    iput-object p3, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lht3;->e:Z

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p1

    const-string p2, "create<Result>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lht3;->f:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getUi$p(Lht3;)Lhm5;
    .locals 0

    iget-object p0, p0, Lht3;->c:Lhm5;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lht3;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lht3;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public N6()V
    .locals 1

    iget-object v0, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {v0, p0}, Lme/dm7/barcodescanner/zxing/ZXingScannerView;->resumeCameraPreview(Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;)V

    return-void
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, Lht3;->c:Lhm5;

    invoke-interface {v0}, Lhm5;->sa()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lht3;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lht3$a;

    invoke-direct {v2, p0}, Lht3$a;-><init>(Lht3;)V

    new-instance v3, Lft3;

    invoke-direct {v3, v2}, Lft3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lht3;->c:Lhm5;

    invoke-interface {v0}, Lhm5;->z1()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lht3;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lht3$b;

    invoke-direct {v1, p0}, Lht3$b;-><init>(Lht3;)V

    new-instance v2, Lgt3;

    invoke-direct {v2, v1}, Lgt3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lht3;->c:Lhm5;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lhm5$a;->initCodeEditor$default(Lhm5;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public a5(Z)V
    .locals 2

    iput-boolean p1, p0, Lht3;->e:Z

    if-eqz p1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {v1, v0}, Lme/dm7/barcodescanner/zxing/ZXingScannerView;->setResultHandler(Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {p1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->startCamera()V

    :cond_1
    return-void
.end method

.method public d4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LbN4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lht3;->f:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "scanResultSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-boolean v0, p0, Lht3;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {v0, p0}, Lme/dm7/barcodescanner/zxing/ZXingScannerView;->setResultHandler(Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;)V

    :cond_0
    iget-object v0, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->startCamera()V

    return-void
.end method

.method public handleResult(LbN4;)V
    .locals 1

    const-string v0, "rawResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lht3;->f:Lio/reactivex/subjects/d;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onPause"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {v0}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->stopCamera()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onResume"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lht3;->d:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v1}, Lme/dm7/barcodescanner/core/BarcodeScannerView;->setAspectTolerance(F)V

    invoke-virtual {p0}, Lht3;->f()V

    return-void
.end method
