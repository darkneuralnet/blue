.class public final LhP5;
.super LxE;
.source "SourceFile"

# interfaces
.implements LdP5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\'\u0010(J&\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\u0016J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u000cH\u0016J\u0008\u0010\u0013\u001a\u00020\u0008H\u0016J\u0010\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u000cH\u0016J\u0016\u0010\u0018\u001a\u00020\u00082\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0016H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006)"
    }
    d2 = {
        "LhP5;",
        "LxE;",
        "LdP5;",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/BirdInspectionPoint;",
        "v7",
        "",
        "o7",
        "A0",
        "rd",
        "",
        "id",
        "Lio/reactivex/subjects/a;",
        "",
        "Jk",
        "code",
        "ki",
        "J7",
        "birdCode",
        "m",
        "Ljava/util/ArrayList;",
        "inspectionPointList",
        "Ui",
        "Lk6;",
        "b",
        "Lk6;",
        "binding",
        "Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;",
        "c",
        "Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;",
        "repairDamageView",
        "Landroid/widget/Button;",
        "d",
        "Landroid/widget/Button;",
        "markRepairedButton",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lk6;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lk6;

.field public final c:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

.field public final d:Landroid/widget/Button;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lk6;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LhP5;->b:Lk6;

    sget p2, LVg4;->repairDamage:I

    invoke-static {p1, p2}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    iput-object p2, p0, LhP5;->c:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    sget p2, LVg4;->markRepaired:I

    invoke-static {p1, p2}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, LhP5;->d:Landroid/widget/Button;

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LhP5;->Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LhP5;->Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Rl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LhP5;->Ul(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final Ul(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getBinding$p(LhP5;)Lk6;
    .locals 0

    iget-object p0, p0, LhP5;->b:Lk6;

    return-object p0
.end method

.method public static final synthetic access$getMarkRepairedButton$p(LhP5;)Landroid/widget/Button;
    .locals 0

    iget-object p0, p0, LhP5;->d:Landroid/widget/Button;

    return-object p0
.end method

.method public static final synthetic access$getRepairDamageView$p(LhP5;)Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;
    .locals 0

    iget-object p0, p0, LhP5;->c:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    return-object p0
.end method


# virtual methods
.method public A0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->d:Landroid/widget/Button;

    const-string v1, "binding.cantFix"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public J7()V
    .locals 2

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->h:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    const-string v1, "neck_physical_lock"

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;->l(Ljava/lang/String;)V

    return-void
.end method

.method public Jk(Ljava/lang/String;)Lio/reactivex/subjects/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->h:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;->i(Ljava/lang/String;)Lio/reactivex/subjects/a;

    move-result-object p1

    return-object p1
.end method

.method public Ui(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lco/bird/android/model/BirdInspectionPoint;",
            ">;)V"
        }
    .end annotation

    const-string v0, "inspectionPointList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->h:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;->setInspectionPoints(Ljava/util/List;)V

    iget-object p1, p0, LhP5;->b:Lk6;

    iget-object p1, p1, Lk6;->h:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    invoke-virtual {p1}, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    sget-object v0, LhP5$b;->g:LhP5$b;

    new-instance v1, LfP5;

    invoke-direct {v1, v0}, LfP5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v1}, Lio/reactivex/Observable;->combineLatest(Ljava/lang/Iterable;Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LhP5$c;

    invoke-direct {v0, p0}, LhP5$c;-><init>(LhP5;)V

    new-instance v1, LgP5;

    invoke-direct {v1, v0}, LgP5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public ki(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->h:Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;

    const-string v1, "neck_physical_lock"

    invoke-virtual {v0, v1, p1}, Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;->k(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "birdCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public o7()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->j:Landroid/widget/Button;

    const-string v1, "binding.startOver"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public rd()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->c:Landroid/widget/Button;

    const-string v1, "binding.cancelTask"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public v7()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdInspectionPoint;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdInspectionPoint;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, LhP5;->b:Lk6;

    iget-object v0, v0, Lk6;->f:Landroid/widget/Button;

    const-string v1, "binding.markRepaired"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LhP5$a;

    invoke-direct {v1, p0}, LhP5$a;-><init>(LhP5;)V

    new-instance v2, LeP5;

    invoke-direct {v2, v1}, LeP5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun markRepairC\u2026eckedInspectionPoints() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
