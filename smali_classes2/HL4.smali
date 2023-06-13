.class public final LHL4;
.super LxE;
.source "SourceFile"

# interfaces
.implements LGL4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u0016J.\u0010\u0014\u001a\u00020\u00052\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00050\u00050\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006&"
    }
    d2 = {
        "LHL4;",
        "LxE;",
        "LGL4;",
        "",
        "show",
        "",
        "k",
        "",
        "subtitle",
        "",
        "titleRes",
        "Lio/reactivex/p;",
        "Lco/bird/android/widget/c$b;",
        "i4",
        "Lkotlin/Function0;",
        "onReportIssueClick",
        "charged",
        "applyTax",
        "Lco/bird/android/model/Reservation;",
        "reservation",
        "l6",
        "bodyText",
        "qg",
        "Lio/reactivex/Observable;",
        "h5",
        "Landroid/widget/ProgressBar;",
        "b",
        "Landroid/widget/ProgressBar;",
        "progressBar",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "reservationBottomModalShownRelay",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ProgressBar;)V",
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
.field public final b:Landroid/widget/ProgressBar;

.field public final c:Lma4;
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
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ProgressBar;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LHL4;->b:Landroid/widget/ProgressBar;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LHL4;->c:Lma4;

    return-void
.end method


# virtual methods
.method public h5()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHL4;->c:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reservationBottomModalShownRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i4(Ljava/lang/String;I)Lio/reactivex/p;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/p<",
            "Lco/bird/android/widget/c$b;",
            ">;"
        }
    .end annotation

    const-string v0, "subtitle"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/widget/c;

    invoke-direct {v0}, Lco/bird/android/widget/c;-><init>()V

    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    new-instance v14, Lco/bird/android/widget/BottomModalSheetModel;

    const/4 v2, 0x0

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v5, Lco/bird/android/widget/BottomModalSheetLayout$a;->d:Lco/bird/android/widget/BottomModalSheetLayout$a;

    sget v1, Lnl4;->reservation_cancel:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget v1, Lnl4;->reservation_reserve:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget v1, LHg4;->button_primary:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget v1, LDf4;->white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1cc1

    const/16 v18, 0x0

    move-object v1, v14

    move-object/from16 v19, v14

    move-object/from16 v14, v16

    move-object/from16 v20, v15

    move/from16 v15, v17

    move-object/from16 v16, v18

    invoke-direct/range {v1 .. v16}, Lco/bird/android/widget/BottomModalSheetModel;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/widget/BottomModalSheetLayout$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "bottom_modal_sheet_model"

    move-object/from16 v3, v19

    move-object/from16 v2, v20

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "BottomModalSheetFragment"

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, LHL4;->c:Lma4;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v2, v3}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/widget/c;->B9()Lio/reactivex/p;

    move-result-object v0

    return-object v0
.end method

.method public k(Z)V
    .locals 4

    iget-object v0, p0, LHL4;->b:Landroid/widget/ProgressBar;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public l6(Lkotlin/jvm/functions/Function0;ZZLco/bird/android/model/Reservation;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Lco/bird/android/model/Reservation;",
            ")V"
        }
    .end annotation

    const-string v0, "onReportIssueClick"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reservation"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual/range {p4 .. p4}, Lco/bird/android/model/Reservation;->getPrice()J

    move-result-wide v2

    invoke-virtual/range {p4 .. p4}, Lco/bird/android/model/Reservation;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v5, LUx1;->d:LUx1;

    invoke-virtual {v0, v2, v3, v4, v5}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p4 .. p4}, Lco/bird/android/model/Reservation;->getBilledMinutes()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static/range {p4 .. p4}, Lco/bird/android/model/Model_Kt;->durationSeconds(Lco/bird/android/model/Reservation;)I

    move-result v1

    invoke-static {v1}, LAA1;->a(I)I

    move-result v1

    :goto_0
    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4}, Lxx1;->k(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v5

    sget v6, Lnl4;->reservation_canceled_charged_with_tax:I

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v4

    aput-object v0, v3, v1

    invoke-virtual {v5, v6, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v5

    sget v6, Lnl4;->reservation_canceled_charged:I

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v4

    aput-object v0, v3, v1

    invoke-virtual {v5, v6, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, Lnl4;->reservation_no_charge_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "if (charged) {\n      val\u2026tion_no_charge_new)\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcj4;->dialog_reservation_canceled:I

    sget v1, LVg4;->mainText:I

    sget v12, LVg4;->positiveButton:I

    sget v13, LVg4;->negativeButton:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x7716e

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object v11, v0

    move-object/from16 v17, p1

    invoke-static/range {v1 .. v22}, LH31$a;->showCustomDialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    return-void
.end method

.method public qg(Ljava/lang/String;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const-string v1, "bodyText"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lcj4;->dialog_reservation:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget v7, LVg4;->header:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget v8, LVg4;->body:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v9

    sget v11, Lnl4;->reservation_ended_new:I

    invoke-virtual {v9, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    sget v11, LVg4;->primaryButton:I

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x7f83e

    const/16 v21, 0x0

    invoke-static/range {v0 .. v21}, LH31$a;->showCustomDialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    return-void
.end method
