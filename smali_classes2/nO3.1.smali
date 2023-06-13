.class public final LnO3;
.super LxE;
.source "SourceFile"

# interfaces
.implements LlO3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0008\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\""
    }
    d2 = {
        "LnO3;",
        "LxE;",
        "LlO3;",
        "",
        "Lco/bird/android/model/BirdPayment;",
        "birds",
        "",
        "U8",
        "defaultBirdPayment",
        "ke",
        "Lio/reactivex/Observable;",
        "Oh",
        "",
        "show",
        "",
        "hiddenState",
        "showProgress",
        "Z4",
        "Lco/bird/android/widget/PaymentMethodsView;",
        "b",
        "Lco/bird/android/widget/PaymentMethodsView;",
        "view",
        "LmX5;",
        "c",
        "LmX5;",
        "swipeToRemoveHelper",
        "Landroidx/recyclerview/widget/l;",
        "d",
        "Landroidx/recyclerview/widget/l;",
        "itemTouchHelper",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;)V",
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
.field public final b:Lco/bird/android/widget/PaymentMethodsView;

.field public final c:LmX5;

.field public final d:Landroidx/recyclerview/widget/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    sget v0, LVg4;->cardsView:I

    invoke-static {p1, v0}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/PaymentMethodsView;

    iput-object v0, p0, LnO3;->b:Lco/bird/android/widget/PaymentMethodsView;

    new-instance v8, LmX5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, LmX5;-><init>(Landroid/content/Context;ILkotlin/jvm/functions/Function1;LnX5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, p0, LnO3;->c:LmX5;

    new-instance p1, Landroidx/recyclerview/widget/l;

    invoke-direct {p1, v8}, Landroidx/recyclerview/widget/l;-><init>(Landroidx/recyclerview/widget/l$e;)V

    iput-object p1, p0, LnO3;->d:Landroidx/recyclerview/widget/l;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdPayment;
    .locals 0

    invoke-static {p0, p1}, LnO3;->Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdPayment;

    move-result-object p0

    return-object p0
.end method

.method public static final Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdPayment;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BirdPayment;

    return-object p0
.end method

.method public static final synthetic access$getView$p(LnO3;)Lco/bird/android/widget/PaymentMethodsView;
    .locals 0

    iget-object p0, p0, LnO3;->b:Lco/bird/android/widget/PaymentMethodsView;

    return-object p0
.end method


# virtual methods
.method public Oh()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdPayment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnO3;->b:Lco/bird/android/widget/PaymentMethodsView;

    invoke-virtual {v0}, Lco/bird/android/widget/PaymentMethodsView;->d()LxN3;

    move-result-object v0

    invoke-virtual {v0}, Lct4;->t()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public U8(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LnO3;->b:Lco/bird/android/widget/PaymentMethodsView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PaymentMethodsView;->setPaymentMethods(Ljava/util/List;)V

    return-void
.end method

.method public Z4()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdPayment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnO3;->c:LmX5;

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LnO3$a;

    invoke-direct {v1, p0}, LnO3$a;-><init>(LnO3;)V

    new-instance v2, LmO3;

    invoke-direct {v2, v1}, LmO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun onPaymentMe\u2026ter[position]\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public ke(Lco/bird/android/model/BirdPayment;)V
    .locals 1

    iget-object v0, p0, LnO3;->b:Lco/bird/android/widget/PaymentMethodsView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PaymentMethodsView;->setDefaultPaymentMethod(Lco/bird/android/model/BirdPayment;)V

    return-void
.end method

.method public showProgress(ZI)V
    .locals 0

    const/4 p2, 0x4

    invoke-super {p0, p1, p2}, LXC;->showProgress(ZI)V

    return-void
.end method
