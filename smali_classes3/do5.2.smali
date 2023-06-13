.class public final Ldo5;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lco5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010$\u001a\u00020#\u0012\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u0019\u0012\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\u0004\u0008%\u0010&J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001b\u001a\u0004\u0008 \u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Ldo5;",
        "LxE;",
        "Lco5;",
        "Lio/reactivex/Observable;",
        "",
        "h",
        "v0",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lco/bird/android/model/DialogResponse;",
        "lc",
        "Nb",
        "wk",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "b",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "p1",
        "()Lco/bird/android/widget/OperatorInfoCard;",
        "operatorInfoCard",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "c",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "P9",
        "()Lco/bird/android/widget/BlockingEnterLocationView;",
        "blockingEnterLocationOverlay",
        "Landroid/widget/Button;",
        "d",
        "Landroid/widget/Button;",
        "scan",
        "e",
        "code",
        "f",
        "Ra",
        "()Landroid/widget/Button;",
        "settingsButton",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;)V",
        "co.bird.android.feature.scrap"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/OperatorInfoCard;

.field public final c:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/widget/Button;

.field public final f:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 1

    const-string v0, "operatorInfoCard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingEnterLocationOverlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scan"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, Ldo5;->b:Lco/bird/android/widget/OperatorInfoCard;

    iput-object p2, p0, Ldo5;->c:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p4, p0, Ldo5;->d:Landroid/widget/Button;

    iput-object p5, p0, Ldo5;->e:Landroid/widget/Button;

    invoke-virtual {p0}, Ldo5;->P9()Lco/bird/android/widget/BlockingEnterLocationView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/widget/BlockingEnterLocationView;->a()Landroid/widget/Button;

    move-result-object p1

    iput-object p1, p0, Ldo5;->f:Landroid/widget/Button;

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

    invoke-static {p0}, Lco5$a;->a(Lco5;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Df(Lco/bird/android/model/User;)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->c(Lco5;Lco/bird/android/model/User;)V

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

    invoke-static {p0, p1, p2}, Lco5$a;->i(Lco5;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public I9(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->f(Lco5;Ljava/lang/String;)V

    return-void
.end method

.method public Nb(Lco/bird/android/model/wire/WireBird;)V
    .locals 9

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lzw3;->a:Lzw3$a;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v3, Lnl4;->scrap_pending_toast:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "activity.getString(L.str\u2026pending_toast, bird.code)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x30

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lzw3$a;->makeText$default(Lzw3$a;Landroid/content/Context;Ljava/lang/String;IILzw3$a$a;ILjava/lang/Object;)Lzw3;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public P9()Lco/bird/android/widget/BlockingEnterLocationView;
    .locals 1

    iget-object v0, p0, Ldo5;->c:Lco/bird/android/widget/BlockingEnterLocationView;

    return-object v0
.end method

.method public Ra()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Ldo5;->f:Landroid/widget/Button;

    return-object v0
.end method

.method public S9(Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->d(Lco5;Lco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public Zd(Z)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->h(Lco5;Z)V

    return-void
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

    iget-object v0, p0, Ldo5;->d:Landroid/widget/Button;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public lc(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LDn5;->d:LDn5$a;

    invoke-virtual {v0, p1}, LDn5$a;->a(Lco/bird/android/model/wire/WireBird;)LDn5;

    move-result-object p1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "ScrapInspectionConfirmationBottomSheet"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {p1}, LDn5;->N6()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public p1()Lco/bird/android/widget/OperatorInfoCard;
    .locals 1

    iget-object v0, p0, Ldo5;->b:Lco/bird/android/widget/OperatorInfoCard;

    return-object v0
.end method

.method public rf(Z)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->g(Lco5;Z)V

    return-void
.end method

.method public v0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldo5;->e:Landroid/widget/Button;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
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

    invoke-static {p0}, Lco5$a;->b(Lco5;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public wk(Lco/bird/android/model/wire/WireBird;)V
    .locals 9

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lzw3;->a:Lzw3$a;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v3, Lnl4;->scrap_approved_toast:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "activity.getString(L.str\u2026pproved_toast, bird.code)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x30

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lzw3$a;->makeText$default(Lzw3$a;Landroid/content/Context;Ljava/lang/String;IILzw3$a$a;ILjava/lang/Object;)Lzw3;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public z7(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lco5$a;->e(Lco5;Ljava/lang/String;)V

    return-void
.end method
