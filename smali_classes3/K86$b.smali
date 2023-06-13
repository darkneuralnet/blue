.class public final LK86$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK86;->Tl()Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/r<",
        "Lkotlin/Pair<",
        "+",
        "Lorg/joda/time/DateTime;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/reactivex/r;",
        "Lkotlin/Pair;",
        "Lorg/joda/time/DateTime;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/r;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LK86;


# direct methods
.method public constructor <init>(LK86;)V
    .locals 0

    iput-object p1, p0, LK86$b;->g:LK86;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lio/reactivex/r;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LK86$b;->d(Lio/reactivex/r;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LK86$b;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lio/reactivex/r;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LK86$b;->e(Lio/reactivex/r;Landroid/view/View;)V

    return-void
.end method

.method public static final d(Lio/reactivex/r;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/reactivex/r;->onComplete()V

    return-void
.end method

.method public static final e(Lio/reactivex/r;Landroid/view/View;)V
    .locals 0

    const-string p1, "$emitter"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/reactivex/r;->onComplete()V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/r;

    invoke-virtual {p0, p1}, LK86$b;->invoke(Lio/reactivex/r;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/r;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/r<",
            "Lkotlin/Pair<",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/material/datepicker/c$g;->d()Lcom/google/android/material/datepicker/c$g;

    move-result-object v0

    iget-object v1, p0, LK86$b;->g:LK86;

    invoke-virtual {v1}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->transfer_order_select_date_label:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c$g;->f(Ljava/lang/CharSequence;)Lcom/google/android/material/datepicker/c$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/c$g;->a()Lcom/google/android/material/datepicker/c;

    move-result-object v0

    const-string v1, "dateRangePicker()\n      \u2026_label))\n        .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LL86;

    invoke-direct {v1, p1}, LL86;-><init>(Lio/reactivex/r;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c;->G9(Landroid/content/DialogInterface$OnCancelListener;)Z

    new-instance v1, LM86;

    invoke-direct {v1, p1}, LM86;-><init>(Lio/reactivex/r;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/c;->I9(Landroid/view/View$OnClickListener;)Z

    new-instance v1, LK86$b$a;

    invoke-direct {v1, p1}, LK86$b$a;-><init>(Lio/reactivex/r;)V

    new-instance p1, LN86;

    invoke-direct {p1, v1}, LN86;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/c;->J9(LMM2;)Z

    iget-object p1, p0, LK86$b;->g:LK86;

    invoke-virtual {p1}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v1, "MaterialDatePicker"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
