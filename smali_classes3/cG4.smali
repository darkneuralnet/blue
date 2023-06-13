.class public final LcG4;
.super LxE;
.source "SourceFile"

# interfaces
.implements LbG4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008 \u0010!J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\""
    }
    d2 = {
        "LcG4;",
        "LxE;",
        "LbG4;",
        "Lio/reactivex/Observable;",
        "",
        "h",
        "n",
        "d0",
        "Lm5;",
        "b",
        "Lm5;",
        "binding",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "c",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "P9",
        "()Lco/bird/android/widget/BlockingEnterLocationView;",
        "blockingEnterLocationOverlay",
        "Landroid/widget/Button;",
        "d",
        "Landroid/widget/Button;",
        "Ra",
        "()Landroid/widget/Button;",
        "settingsButton",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "e",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "p1",
        "()Lco/bird/android/widget/OperatorInfoCard;",
        "operatorInfoCard",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lm5;)V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lm5;

.field public final c:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final d:Landroid/widget/Button;

.field public final e:Lco/bird/android/widget/OperatorInfoCard;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lm5;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LcG4;->b:Lm5;

    iget-object p1, p2, Lm5;->b:Lco/bird/android/widget/BlockingEnterLocationView;

    const-string v0, "binding.blockEnterLocationOverlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LcG4;->c:Lco/bird/android/widget/BlockingEnterLocationView;

    iget-object p1, p2, Lm5;->b:Lco/bird/android/widget/BlockingEnterLocationView;

    invoke-virtual {p1}, Lco/bird/android/widget/BlockingEnterLocationView;->a()Landroid/widget/Button;

    move-result-object p1

    iput-object p1, p0, LcG4;->d:Landroid/widget/Button;

    iget-object p1, p2, Lm5;->f:Lco/bird/android/widget/OperatorInfoCard;

    const-string p2, "binding.operatorInfoCard"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LcG4;->e:Lco/bird/android/widget/OperatorInfoCard;

    return-void
.end method


# virtual methods
.method public D0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LbG4$a;->a(LbG4;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Df(Lco/bird/android/model/User;)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->c(LbG4;Lco/bird/android/model/User;)V

    return-void
.end method

.method public G9(Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Warehouse;",
            "Lco/bird/android/model/Warehouse;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LbG4$a;->i(LbG4;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public I9(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->f(LbG4;Ljava/lang/String;)V

    return-void
.end method

.method public P9()Lco/bird/android/widget/BlockingEnterLocationView;
    .locals 1

    iget-object v0, p0, LcG4;->c:Lco/bird/android/widget/BlockingEnterLocationView;

    return-object v0
.end method

.method public Ra()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, LcG4;->d:Landroid/widget/Button;

    return-object v0
.end method

.method public S9(Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->d(LbG4;Lco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public Zd(Z)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->h(LbG4;Z)V

    return-void
.end method

.method public d0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LcG4;->b:Lm5;

    iget-object v0, v0, Lm5;->j:Landroid/widget/Button;

    const-string v1, "binding.useBluetoothButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public h()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LcG4;->b:Lm5;

    iget-object v0, v0, Lm5;->h:Landroid/widget/Button;

    const-string v1, "binding.scanButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public n()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LcG4;->b:Lm5;

    iget-object v0, v0, Lm5;->c:Landroid/widget/Button;

    const-string v1, "binding.enterCodeButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public p1()Lco/bird/android/widget/OperatorInfoCard;
    .locals 1

    iget-object v0, p0, LcG4;->e:Lco/bird/android/widget/OperatorInfoCard;

    return-object v0
.end method

.method public rf(Z)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->g(LbG4;Z)V

    return-void
.end method

.method public v1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LbG4$a;->b(LbG4;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public z7(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LbG4$a;->e(LbG4;Ljava/lang/String;)V

    return-void
.end method
