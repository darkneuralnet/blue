.class public final LeF;
.super LxE;
.source "SourceFile"

# interfaces
.implements LdF;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006%"
    }
    d2 = {
        "LeF;",
        "LxE;",
        "LdF;",
        "",
        "enabled",
        "",
        "xf",
        "B9",
        "Lio/reactivex/k;",
        "Tf",
        "yi",
        "LX2;",
        "b",
        "LX2;",
        "binding",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "c",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "p1",
        "()Lco/bird/android/widget/OperatorInfoCard;",
        "operatorInfoCard",
        "Landroid/widget/Button;",
        "d",
        "Landroid/widget/Button;",
        "Ra",
        "()Landroid/widget/Button;",
        "settingsButton",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "e",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "P9",
        "()Lco/bird/android/widget/BlockingEnterLocationView;",
        "blockingEnterLocationOverlay",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LX2;)V",
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
.field public final b:LX2;

.field public final c:Lco/bird/android/widget/OperatorInfoCard;

.field public final d:Landroid/widget/Button;

.field public final e:Lco/bird/android/widget/BlockingEnterLocationView;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LX2;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LeF;->b:LX2;

    iget-object p1, p2, LX2;->g:Lco/bird/android/widget/OperatorInfoCard;

    const-string v0, "binding.operatorInfoCard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LeF;->c:Lco/bird/android/widget/OperatorInfoCard;

    iget-object p1, p2, LX2;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    invoke-virtual {p1}, Lco/bird/android/widget/BlockingEnterLocationView;->a()Landroid/widget/Button;

    move-result-object p1

    iput-object p1, p0, LeF;->d:Landroid/widget/Button;

    iget-object p1, p2, LX2;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    const-string p2, "binding.blockEnterLocationOverlay"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LeF;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    return-void
.end method


# virtual methods
.method public B9(Z)V
    .locals 4

    iget-object v0, p0, LeF;->b:LX2;

    iget-object v0, v0, LX2;->h:Landroid/widget/Button;

    const-string v1, "binding.searchAllBatchesButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

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

    invoke-static {p0}, LdF$a;->a(LdF;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Df(Lco/bird/android/model/User;)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->c(LdF;Lco/bird/android/model/User;)V

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

    invoke-static {p0, p1, p2}, LdF$a;->i(LdF;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public I9(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->f(LdF;Ljava/lang/String;)V

    return-void
.end method

.method public P9()Lco/bird/android/widget/BlockingEnterLocationView;
    .locals 1

    iget-object v0, p0, LeF;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    return-object v0
.end method

.method public Ra()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, LeF;->d:Landroid/widget/Button;

    return-object v0
.end method

.method public S9(Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->d(LdF;Lco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public Tf()Lio/reactivex/k;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LeF;->b:LX2;

    iget-object v0, v0, LX2;->b:Landroid/widget/Button;

    const-string v1, "binding.addToBatchButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "binding.addToBatchButton\u2026s.mainThread(), false, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public Zd(Z)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->h(LdF;Z)V

    return-void
.end method

.method public p1()Lco/bird/android/widget/OperatorInfoCard;
    .locals 1

    iget-object v0, p0, LeF;->c:Lco/bird/android/widget/OperatorInfoCard;

    return-object v0
.end method

.method public rf(Z)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->g(LdF;Z)V

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

    invoke-static {p0}, LdF$a;->b(LdF;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public xf(Z)V
    .locals 4

    iget-object v0, p0, LeF;->b:LX2;

    iget-object v0, v0, LX2;->b:Landroid/widget/Button;

    const-string v1, "binding.addToBatchButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public yi()Lio/reactivex/k;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LeF;->b:LX2;

    iget-object v0, v0, LX2;->h:Landroid/widget/Button;

    const-string v1, "binding.searchAllBatchesButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "binding.searchAllBatches\u2026s.mainThread(), false, 1)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z7(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LdF$a;->e(LdF;Ljava/lang/String;)V

    return-void
.end method
