.class public final Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LxW4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0007\u00a2\u0006\u0004\u0008Z\u0010[J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\"\u0010,\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010(0(0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\"\u0010.\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u00050\u00050\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010+R\"\u00100\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010+R\"\u00102\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u00050\u00050\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010+R\"\u00105\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u000103030\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010+R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00087\u00108R!\u0010?\u001a\u0008\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R!\u0010B\u001a\u0008\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010<\u001a\u0004\u0008A\u0010>R!\u0010E\u001a\u0008\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010<\u001a\u0004\u0008D\u0010>R \u0010I\u001a\u0008\u0012\u0004\u0012\u0002030:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010>R!\u0010M\u001a\u0008\u0012\u0004\u0012\u00020J0:8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008K\u0010<\u001a\u0004\u0008L\u0010>R \u0010P\u001a\u0008\u0012\u0004\u0012\u00020(0:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010G\u001a\u0004\u0008O\u0010>R \u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Q\u0010G\u001a\u0004\u0008R\u0010>R \u0010V\u001a\u0008\u0012\u0004\u0012\u00020\u000f0:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008T\u0010G\u001a\u0004\u0008U\u0010>R \u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008W\u0010G\u001a\u0004\u0008X\u0010>\u00a8\u0006\\"
    }
    d2 = {
        "Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LxW4;",
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
        "LyW4;",
        "state",
        "S",
        "LtW4;",
        "j",
        "LtW4;",
        "R",
        "()LtW4;",
        "setPresenter",
        "(LtW4;)V",
        "presenter",
        "LPV4;",
        "k",
        "LPV4;",
        "Q",
        "()LPV4;",
        "setAdapter",
        "(LPV4;)V",
        "adapter",
        "Lio/reactivex/subjects/d;",
        "LJa4;",
        "kotlin.jvm.PlatformType",
        "l",
        "Lio/reactivex/subjects/d;",
        "purchaseResultSubject",
        "m",
        "purchaseConfirmSubject",
        "n",
        "googlePayResultSubject",
        "o",
        "informationClicksSubject",
        "Lco/bird/android/model/persistence/RidePassView;",
        "p",
        "transferPassConfirmSubject",
        "LL5;",
        "q",
        "LL5;",
        "binding",
        "Lio/reactivex/Observable;",
        "r",
        "Lkotlin/Lazy;",
        "r7",
        "()Lio/reactivex/Observable;",
        "buyPassClicks",
        "s",
        "h3",
        "transferPassClicks",
        "t",
        "W8",
        "cancelPassClicks",
        "u",
        "Lio/reactivex/Observable;",
        "o8",
        "transferPassConfirm",
        "",
        "v",
        "T7",
        "rideNowClicks",
        "w",
        "W1",
        "purchaseResult",
        "x",
        "s3",
        "purchaseConfirm",
        "y",
        "P0",
        "googlePayResult",
        "z",
        "u7",
        "informationClicks",
        "<init>",
        "()V",
        "ride-pass_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public j:LtW4;

.field public k:LPV4;

.field public final l:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "LJa4;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation
.end field

.field public q:LL5;

.field public final r:Lkotlin/Lazy;

.field public final s:Lkotlin/Lazy;

.field public final t:Lkotlin/Lazy;

.field public final u:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lkotlin/Lazy;

.field public final w:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "LJa4;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final z:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<PurchasePaymentResult>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->l:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<Unit>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->m:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v3

    const-string v4, "create<Boolean>()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->n:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->o:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v2

    const-string v5, "create<RidePassView>()"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->p:Lio/reactivex/subjects/d;

    new-instance v5, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$a;

    invoke-direct {v5, p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$a;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    invoke-static {v5}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v5

    iput-object v5, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->r:Lkotlin/Lazy;

    new-instance v5, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$f;

    invoke-direct {v5, p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$f;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    invoke-static {v5}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v5

    iput-object v5, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->s:Lkotlin/Lazy;

    new-instance v5, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$b;

    invoke-direct {v5, p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$b;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    invoke-static {v5}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v5

    iput-object v5, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->t:Lkotlin/Lazy;

    invoke-virtual {v2}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v2

    const-string v5, "transferPassConfirmSubject.hide()"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->u:Lio/reactivex/Observable;

    new-instance v2, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$e;

    invoke-direct {v2, p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$e;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->v:Lkotlin/Lazy;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "purchaseResultSubject.hide()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->w:Lio/reactivex/Observable;

    invoke-virtual {v1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "purchaseConfirmSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->x:Lio/reactivex/Observable;

    invoke-virtual {v3}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "googlePayResultSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->y:Lio/reactivex/Observable;

    invoke-virtual {v4}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "informationClicksSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->z:Lio/reactivex/Observable;

    return-void
.end method

.method public static synthetic P(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->U(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V

    return-void
.end method

.method public static final U(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    if-nez p0, :cond_0

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    iget-object p0, p0, LL5;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)LL5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    return-object p0
.end method

.method public static final synthetic access$getPurchaseConfirmSubject$p(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->m:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getTransferPassConfirmSubject$p(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->p:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public P0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->y:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final Q()LPV4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->k:LPV4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()LtW4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->j:LtW4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public S(LyW4;)V
    .locals 13

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LcA5;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v1

    sget-object v2, LGV4;->d:LGV4;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$c;

    invoke-direct {v5, p0, p1}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$c;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;LyW4;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x74

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, LbA5;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v1

    sget-object v2, LCV4;->d:LCV4;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$d;

    invoke-direct {v5, p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity$d;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x74

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, LoA5;

    const-string v1, "binding"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    iget-object v0, v0, LL5;->d:Landroid/widget/Button;

    const-string v1, "binding.rideNow"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LoA5;

    invoke-virtual {p1}, LoA5;->b()Z

    move-result p1

    invoke-static {v0, p1, v3, v2, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    instance-of v0, p1, LLv5;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->Q()LPV4;

    move-result-object v0

    check-cast p1, LLv5;

    invoke-virtual {p1}, LLv5;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v0, v2}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->Q()LPV4;

    move-result-object v0

    invoke-virtual {p1}, LLv5;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LPV4;->y(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v4, v0

    :goto_0
    iget-object v0, v4, LL5;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, LMV4;

    invoke-direct {v1, p0, p1}, LMV4;-><init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    :cond_5
    instance-of v0, p1, LKE1;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->Q()LPV4;

    move-result-object v0

    check-cast p1, LKE1;

    invoke-virtual {p1}, LKE1;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    goto/16 :goto_1

    :cond_6
    instance-of v0, p1, LJt2;

    if-eqz v0, :cond_8

    check-cast p1, LJt2;

    invoke-virtual {p1}, LJt2;->a()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    invoke-virtual {p1}, LXC;->startProgress()V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v3, v0, v4}, LS74$a;->stopProgress$default(LS74;IILjava/lang/Object;)V

    goto :goto_1

    :cond_8
    instance-of v0, p1, LYx0;

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, LYx0;

    invoke-virtual {p1}, LYx0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LXC;->success(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    instance-of v0, p1, LiM3;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, LiM3;

    invoke-virtual {p1}, LiM3;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    sget p1, Lnl4;->error_generic_body:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "this.getString(L.string.error_generic_body)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/String;)V

    goto :goto_1

    :cond_b
    instance-of v0, p1, Le86;

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v5

    check-cast p1, Le86;

    invoke-virtual {p1}, Le86;->b()Ljava/lang/Throwable;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->w()Le13;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {p1}, Le86;->a()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, LZf5;->displayStyledError$default(LXC;Ljava/lang/Throwable;Le13;Lco/bird/android/model/constant/MapMode;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_1

    :cond_c
    instance-of v0, p1, Lk96;

    if-nez v0, :cond_d

    instance-of p1, p1, Lsm1;

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->w()Le13;

    move-result-object p1

    const/4 v0, -0x1

    invoke-static {p1, v0, v4, v2, v4}, Le13$a;->closeDownWithResult$default(Le13;ILandroid/content/Intent;ILjava/lang/Object;)V

    :cond_d
    :goto_1
    return-void
.end method

.method public T7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->v:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-rideNowClicks>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public W1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LJa4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->w:Lio/reactivex/Observable;

    return-object v0
.end method

.method public W8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->t:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public h3()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->s:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public o8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->u:Lio/reactivex/Observable;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x272e

    if-eq p1, v1, :cond_2

    const/16 v1, 0x273e

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->l:Lio/reactivex/subjects/d;

    new-instance p2, LJa4;

    invoke-direct {p2, v0, p3}, LJa4;-><init>(ZLandroid/content/Intent;)V

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->n:Lio/reactivex/subjects/d;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/ridepass/v2/list/a;->a()Lco/bird/android/feature/ridepass/v2/list/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "ride_pass_link_code"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lnl4;->ride_pass_left_navigation_title:I

    invoke-interface {p1, v0, p0, v1, v2}, Lco/bird/android/feature/ridepass/v2/list/b$a;->a(LlG2;Landroid/app/Activity;Ljava/lang/String;I)Lco/bird/android/feature/ridepass/v2/list/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/ridepass/v2/list/b;->a(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LL5;->c(Landroid/view/LayoutInflater;)LL5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LL5;->b()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->q:LL5;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LL5;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->Q()LPV4;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->R()LtW4;

    move-result-object p1

    invoke-virtual {p1, p0}, LtW4;->S(LxW4;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LQk4;->menu_ride_pass_v2:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, LTh4;->help:I

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->o:Lio/reactivex/subjects/d;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public r7()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->r:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LyW4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->S(LyW4;)V

    return-void
.end method

.method public s3()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->x:Lio/reactivex/Observable;

    return-object v0
.end method

.method public u7()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->z:Lio/reactivex/Observable;

    return-object v0
.end method
