.class public final Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/birdplus/v1/details/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;,
        Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;,
        Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;,
        Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;,
        Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0005HIJ\u001dKB\u0007\u00a2\u0006\u0004\u0008E\u0010FJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0017H\u0016J\u000e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u0017H\u0016R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\"\u0010;\u001a\u0010\u0012\u000c\u0012\n 8*\u0004\u0018\u00010\u00180\u0018078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\"\u0010?\u001a\u0010\u0012\u000c\u0012\n 8*\u0004\u0018\u00010\u00050\u00050<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\"\u0010A\u001a\u0010\u0012\u000c\u0012\n 8*\u0004\u0018\u00010\u00050\u00050<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010>R.\u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001f 8*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010B0B0<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010>\u00a8\u0006L"
    }
    d2 = {
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lco/bird/android/feature/birdplus/v1/details/b;",
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
        "LtQ;",
        "state",
        "Y",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
        "z3",
        "e0",
        "b1",
        "g0",
        "d",
        "c0",
        "",
        "s9",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "z7",
        "Lco/bird/android/feature/birdplus/v1/details/a;",
        "j",
        "Lco/bird/android/feature/birdplus/v1/details/a;",
        "X",
        "()Lco/bird/android/feature/birdplus/v1/details/a;",
        "setPresenter",
        "(Lco/bird/android/feature/birdplus/v1/details/a;)V",
        "presenter",
        "La3;",
        "k",
        "La3;",
        "binding",
        "LHP;",
        "l",
        "LHP;",
        "converter",
        "LGP;",
        "m",
        "LGP;",
        "adapter",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "n",
        "LAG;",
        "birdPlusIdentifierRelay",
        "Lma4;",
        "o",
        "Lma4;",
        "paymentSuccessRelay",
        "p",
        "infoClicksRelay",
        "Lco/bird/android/buava/Optional;",
        "q",
        "purchaseEventRelay",
        "<init>",
        "()V",
        "r",
        "a",
        "b",
        "c",
        "e",
        "bird-plus_release"
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
        "SMAP\nBirdPlusDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsActivity.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"
    }
.end annotation


# static fields
.field public static final r:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;

.field public static final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public j:Lco/bird/android/feature/birdplus/v1/details/a;

.field public k:La3;

.field public final l:LHP;

.field public final m:LGP;

.field public final n:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
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

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->r:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;

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

    sput-object v0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->s:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LHP;

    invoke-direct {v0}, LHP;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->l:LHP;

    new-instance v0, LGP;

    invoke-direct {v0}, LGP;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->m:LGP;

    invoke-static {}, LAG;->g()LAG;

    move-result-object v0

    const-string v1, "create<BirdPlusViewIdentifier>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->n:LAG;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->o:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->p:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->q:Lma4;

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

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

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)La3;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

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
.method public final X()Lco/bird/android/feature/birdplus/v1/details/a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->j:Lco/bird/android/feature/birdplus/v1/details/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Y(LtQ;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {p1}, LtQ;->f()Z

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
    invoke-virtual {p1}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getDisplay()Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getPlanName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p1}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move v0, v1

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

    iget-object v5, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->l:LHP;

    invoke-virtual {v5, v0}, LHP;->a(LtQ;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v5, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->m:LGP;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v5, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_4
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    const-string v5, "binding"

    if-nez v0, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    iget-object v0, v0, La3;->f:Landroid/widget/Button;

    invoke-virtual {p1}, LtQ;->c()Z

    move-result v6

    if-eqz v6, :cond_6

    sget v6, Lnl4;->renew_membership:I

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, LtQ;->d()Z

    move-result v6

    if-eqz v6, :cond_7

    sget v6, Lnl4;->start_free_trial_now:I

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_7
    sget v6, Lnl4;->subscribe:I

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez v0, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_8
    iget-object v0, v0, La3;->f:Landroid/widget/Button;

    invoke-virtual {p1}, LtQ;->k()Z

    move-result v6

    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez v0, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_9
    iget-object v0, v0, La3;->f:Landroid/widget/Button;

    const-string v6, "binding.subscribe"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LtQ;->i()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {p1}, LtQ;->c()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {p1}, LtQ;->d()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    move v6, v2

    goto :goto_6

    :cond_b
    :goto_5
    move v6, v1

    :goto_6
    invoke-static {v0, v6, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez v0, :cond_c

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_c
    iget-object v0, v0, La3;->c:Landroid/widget/Button;

    const-string v6, "binding.cancel"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LtQ;->h()Z

    move-result v6

    invoke-static {v0, v6, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez v0, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_d
    iget-object v0, v0, La3;->c:Landroid/widget/Button;

    invoke-virtual {p1}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getTrial()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    move-result-object v6

    goto :goto_7

    :cond_e
    move-object v6, v4

    :goto_7
    if-eqz v6, :cond_f

    move v6, v1

    goto :goto_8

    :cond_f
    move v6, v2

    :goto_8
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez v0, :cond_10

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_10
    iget-object v0, v0, La3;->g:Landroid/widget/Button;

    const-string v5, "binding.transfer"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LtQ;->j()Z

    move-result v5

    invoke-static {v0, v5, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LtQ;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v3

    invoke-static {v3, v0}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_11
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->q:Lma4;

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-virtual {v5}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-virtual {v5}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-virtual {p1}, LtQ;->f()Z

    move-result v6

    if-nez v6, :cond_12

    invoke-virtual {p1}, LtQ;->g()Z

    move-result p1

    if-eqz p1, :cond_12

    move v2, v1

    :cond_12
    if-eqz v2, :cond_13

    move-object v4, v5

    :cond_13
    invoke-virtual {v3, v4}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

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

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->o:Lma4;

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

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, La3;->g:Landroid/widget/Button;

    const-string v2, "binding.transfer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$i;

    invoke-direct {v1, p0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$i;-><init>(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)V

    new-instance v2, LAP;

    invoke-direct {v2, v1}, LAP;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$j;->g:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$j;

    new-instance v2, LBP;

    invoke-direct {v2, v1}, LBP;-><init>(Lkotlin/jvm/functions/Function1;)V

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

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, La3;->c:Landroid/widget/Button;

    const-string v2, "binding.cancel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$f;

    invoke-direct {v1, p0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$f;-><init>(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)V

    new-instance v2, LzP;

    invoke-direct {v2, v1}, LzP;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun cancelClick\u2026}\n          }\n      }\n  }"

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

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, La3;->f:Landroid/widget/Button;

    const-string v2, "binding.subscribe"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$h;

    invoke-direct {v1, p0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$h;-><init>(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)V

    new-instance v2, LyP;

    invoke-direct {v2, v1}, LyP;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun subscribeCl\u2026        }\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "infoClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    sget-object p3, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->s:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->o:Lma4;

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

    invoke-static {p1}, La3;->c(Landroid/view/LayoutInflater;)La3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    const-string v0, "binding"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-virtual {p1}, La3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LbH0;->a()LsP$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v2

    invoke-interface {p1, v2}, LsP$a;->a(LlG2;)LsP;

    move-result-object p1

    invoke-interface {p1, p0}, LsP;->a(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    iget-object p1, p1, La3;->e:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->m:LGP;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_2
    iget-object p1, p1, La3;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->k:La3;

    if-nez p1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_3
    iget-object p1, p1, La3;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->X()Lco/bird/android/feature/birdplus/v1/details/a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lco/bird/android/feature/birdplus/v1/details/a;->D(Lco/bird/android/feature/birdplus/v1/details/b;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bird_plus_user_subscription_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_5

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->n:LAG;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;->box-impl(Ljava/lang/String;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bird_plus_subscription_plan_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_7

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->n:LAG;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;->box-impl(Ljava/lang/String;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bird_plus_codename"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_8

    move-object v1, p1

    :cond_8
    if-eqz v1, :cond_9

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->n:LAG;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->box-impl(Ljava/lang/String;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    move-result-object v0

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    :cond_9
    :goto_2
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

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->p:Lma4;

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

    check-cast p1, LtQ;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->Y(LtQ;)V

    return-void
.end method

.method public s9()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->q:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "purchaseEventRelay\n    .\u2026  .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$g;->g:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$g;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public z3()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->n:LAG;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "birdPlusIdentifierRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z7()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;->m:LGP;

    invoke-virtual {v0}, LGP;->z7()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
