.class public final Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LrX4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0007\u00a2\u0006\u0004\u0008>\u0010?J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0016\u0010*\u001a\u00020\'8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\"\u00107\u001a\u0010\u0012\u000c\u0012\n 4*\u0004\u0018\u00010\u00180\u0018038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\"\u0010;\u001a\u0010\u0012\u000c\u0012\n 4*\u0004\u0018\u00010\u00050\u0005088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\"\u0010=\u001a\u0010\u0012\u000c\u0012\n 4*\u0004\u0018\u00010\u00050\u0005088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010:\u00a8\u0006B"
    }
    d2 = {
        "Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LrX4;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "LsX4;",
        "state",
        "Z",
        "Lio/reactivex/Observable;",
        "",
        "P8",
        "e0",
        "b1",
        "g0",
        "d",
        "c0",
        "LbX4;",
        "j",
        "LbX4;",
        "Y",
        "()LbX4;",
        "setPresenter",
        "(LbX4;)V",
        "presenter",
        "LN5;",
        "k",
        "LN5;",
        "binding",
        "LLW4;",
        "l",
        "LLW4;",
        "converter",
        "LKW4;",
        "m",
        "LKW4;",
        "adapter",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "n",
        "LAG;",
        "linkCodeRelay",
        "Lma4;",
        "o",
        "Lma4;",
        "paymentSuccessRelay",
        "p",
        "infoClicksRelay",
        "<init>",
        "()V",
        "q",
        "a",
        "ride-pass_release"
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
        "SMAP\nRidePassV4DetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsActivity.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"
    }
.end annotation


# static fields
.field public static final q:Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;

.field public static final r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public j:LbX4;

.field public k:LN5;

.field public final l:LLW4;

.field public final m:LKW4;

.field public final n:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->q:Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$a;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x273e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x272e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->r:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LLW4;

    invoke-direct {v0}, LLW4;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->l:LLW4;

    new-instance v0, LKW4;

    invoke-direct {v0}, LKW4;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->m:LKW4;

    invoke-static {}, LAG;->g()LAG;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->n:LAG;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->o:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->p:Lma4;

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public P8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->n:LAG;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "linkCodeRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Y()LbX4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->j:LbX4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Z(LsX4;)V
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {p1}, LsX4;->c()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LsX4;->d()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/RidePassView;->getTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p1}, LsX4;->d()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v0, :cond_3

    move-object v0, p1

    goto :goto_3

    :cond_3
    move-object v0, v4

    :goto_3
    if-eqz v0, :cond_4

    iget-object v1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->l:LLW4;

    invoke-virtual {v1, v0}, LLW4;->a(LsX4;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->m:LKW4;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_4
    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    const-string v1, "binding"

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    iget-object v0, v0, LN5;->f:Landroid/widget/Button;

    invoke-virtual {p1}, LsX4;->d()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/persistence/RidePassView;->getSubscriptionPlan()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v5, v4

    :goto_4
    if-eqz v5, :cond_7

    sget v5, Lnl4;->subscribe:I

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_7
    sget v5, Lnl4;->ride_pass_buy_pass_button:I

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_5
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez v0, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_8
    iget-object v0, v0, LN5;->f:Landroid/widget/Button;

    invoke-virtual {p1}, LsX4;->i()Z

    move-result v5

    invoke-virtual {v0, v5}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez v0, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_9
    iget-object v0, v0, LN5;->f:Landroid/widget/Button;

    const-string v5, "binding.subscribe"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LsX4;->g()Z

    move-result v5

    invoke-static {v0, v5, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez v0, :cond_a

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_a
    iget-object v0, v0, LN5;->c:Landroid/widget/Button;

    const-string v5, "binding.cancel"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LsX4;->e()Z

    move-result v5

    invoke-static {v0, v5, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_b
    iget-object v0, v0, LN5;->g:Landroid/widget/Button;

    const-string v1, "binding.transfer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LsX4;->h()Z

    move-result v1

    invoke-static {v0, v1, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LsX4;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_c
    return-void
.end method

.method public b1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->o:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "paymentSuccessRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LN5;->g:Landroid/widget/Button;

    const-string v2, "binding.transfer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$d;

    invoke-direct {v1, p0}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$d;-><init>(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)V

    new-instance v2, LFW4;

    invoke-direct {v2, v1}, LFW4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$e;->g:Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$e;

    new-instance v2, LGW4;

    invoke-direct {v2, v1}, LGW4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun transferCli\u2026}\n      .map { Unit }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LN5;->c:Landroid/widget/Button;

    const-string v2, "binding.cancel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$b;

    invoke-direct {v1, p0}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$b;-><init>(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)V

    new-instance v2, LDW4;

    invoke-direct {v2, v1}, LDW4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$c;->g:Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity$c;

    new-instance v2, LEW4;

    invoke-direct {v2, v1}, LEW4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun cancelClick\u2026}\n      .map { Unit }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public e0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LN5;->f:Landroid/widget/Button;

    const-string v2, "binding.subscribe"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public g0()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "infoClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    sget-object p3, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->r:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->o:Lma4;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LN5;->c(Landroid/view/LayoutInflater;)LN5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LN5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LDP0;->a()LBW4$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v2

    invoke-interface {p1, v2}, LBW4$a;->a(LlG2;)LBW4;

    move-result-object p1

    invoke-interface {p1, p0}, LBW4;->a(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object p1, p1, LN5;->e:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->m:LKW4;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    iget-object p1, p1, LN5;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->k:LN5;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LN5;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->Y()LbX4;

    move-result-object p1

    invoke-virtual {p1, p0}, LbX4;->z(LrX4;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "ride_pass_link_code"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->n:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->general_info:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    sget v1, Lrg4;->ic_info:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setShowAsAction(I)V

    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->p:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LsX4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;->Z(LsX4;)V

    return-void
.end method
