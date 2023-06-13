.class public final LPz0;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0014\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cJ\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\tJ\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011J\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006!"
    }
    d2 = {
        "LPz0;",
        "LxE;",
        "LH31;",
        "",
        "LH6;",
        "sections",
        "",
        "b",
        "Lio/reactivex/Observable;",
        "",
        "Ul",
        "Pl",
        "",
        "show",
        "enabled",
        "Ql",
        "containerOrderId",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "Sl",
        "Tl",
        "Rl",
        "Lr3;",
        "Lr3;",
        "binding",
        "Lyz0;",
        "c",
        "Lyz0;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lr3;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lr3;

.field public final c:Lyz0;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lr3;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LPz0;->b:Lr3;

    new-instance p1, Lyz0;

    invoke-direct {p1}, Lyz0;-><init>()V

    iput-object p1, p0, LPz0;->c:Lyz0;

    iget-object p2, p2, Lr3;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method


# virtual methods
.method public final Pl()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LPz0;->b:Lr3;

    iget-object v0, v0, Lr3;->b:Landroid/widget/Button;

    const-string v1, "binding.addBol"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Ql(ZZ)V
    .locals 4

    iget-object v0, p0, LPz0;->b:Lr3;

    iget-object v0, v0, Lr3;->c:Landroid/widget/FrameLayout;

    const-string v1, "binding.buttonContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LPz0;->b:Lr3;

    iget-object p1, p1, Lr3;->b:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final Rl()Lio/reactivex/F;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    sget v1, Lmk4;->dialog_custom_cta:I

    sget v2, Lzi4;->primaryButton:I

    sget v3, Lzi4;->secondaryButton:I

    sget v5, Lzi4;->title:I

    sget v6, Lzi4;->body:I

    sget v4, Lnl4;->yes_uppercased:I

    const/4 v8, 0x0

    new-array v7, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v7}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    sget v4, Lnl4;->container_order_checked_in_confirmation_dialog_title:I

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v9}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    sget v4, Lnl4;->container_order_checked_in_confirmation_dialog_description:I

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v9}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    sget v4, Lnl4;->container_order_in_transit_confirmation_dialog_negative:I

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v8}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x7908

    const/16 v17, 0x0

    invoke-static/range {v0 .. v17}, LH31$a;->dialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Sl(Ljava/lang/String;)Lio/reactivex/F;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v11, p1

    move-object/from16 v0, p0

    const-string v1, "containerOrderId"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lmk4;->dialog_custom_cta:I

    sget v2, Lzi4;->primaryButton:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Lzi4;->title:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget v6, Lzi4;->body:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget v7, Lnl4;->general_got_it:I

    const/4 v12, 0x0

    new-array v8, v12, [Ljava/lang/Object;

    invoke-virtual {v15, v7, v8}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget v10, Lnl4;->container_order_not_booked_dialog_title:I

    new-array v13, v12, [Ljava/lang/Object;

    invoke-virtual {v15, v10, v13}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v13

    sget v14, Lnl4;->container_order_not_booked_dialog_description:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v11, v3, v12

    invoke-virtual {v13, v14, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, LwN1;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move-object v15, v3

    const/16 v16, 0x798c

    const/16 v17, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v17}, LH31$a;->dialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Tl()Lio/reactivex/F;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    sget v1, Lmk4;->dialog_custom_cta:I

    sget v2, Lzi4;->primaryButton:I

    sget v3, Lzi4;->secondaryButton:I

    sget v5, Lzi4;->title:I

    sget v6, Lzi4;->body:I

    sget v4, Lnl4;->yes_uppercased:I

    const/4 v8, 0x0

    new-array v7, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v7}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    sget v4, Lnl4;->container_order_in_transit_confirmation_dialog_title:I

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v9}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    sget v4, Lnl4;->container_order_in_transit_confirmation_dialog_description:I

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v9}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    sget v4, Lnl4;->container_order_in_transit_confirmation_dialog_negative:I

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v15, v4, v8}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x7908

    const/16 v17, 0x0

    invoke-static/range {v0 .. v17}, LH31$a;->dialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Ul()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LPz0;->c:Lyz0;

    invoke-virtual {v0}, Lf86;->x()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LPz0;->c:Lyz0;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    return-void
.end method
