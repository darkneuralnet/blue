.class public final LQu3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQu3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LQu3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lns6;",
        "b",
        "Lns6;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LQu3;Landroid/view/View;)V",
        "task-list_release"
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
        "SMAP\nOperatorTaskAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskAdapter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskAdapter$TaskViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n18#2:153\n18#2:158\n9#3,4:154\n9#3,4:159\n*S KotlinDebug\n*F\n+ 1 OperatorTaskAdapter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskAdapter$TaskViewHolder\n*L\n108#1:153\n101#1:158\n108#1:154,4\n101#1:159,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lns6;

.field public final synthetic c:LQu3;


# direct methods
.method public constructor <init>(LQu3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQu3$b;->c:LQu3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lns6;->a(Landroid/view/View;)Lns6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQu3$b;->b:Lns6;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v0, LRu3;

    invoke-direct {v0, p1, p0}, LRu3;-><init>(LQu3;LQu3$b;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(LQu3;LQu3$b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, LQu3$b;->b(LQu3;LQu3$b;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LQu3;LQu3$b;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LQu3;->access$getAdapterData$p(LQu3;)LE6;

    move-result-object p2

    invoke-virtual {p2}, LE6;->h()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_1

    invoke-static {p0}, LQu3;->access$getTaskPublisher$p(LQu3;)Lio/reactivex/subjects/d;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, LQu3$b;->c:LQu3;

    invoke-static {v0}, LQu3;->access$getAdapterData$p(LQu3;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireBird;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireBird;

    iget-object v0, p0, LQu3$b;->b:Lns6;

    iget-object v0, v0, Lns6;->d:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v2

    iget-object v3, p0, LQu3$b;->b:Lns6;

    iget-object v3, v3, Lns6;->b:Landroid/widget/TextView;

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lnl4;->battery_percent:I

    new-array v6, v0, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LQu3$b;->b:Lns6;

    iget-object v3, v3, Lns6;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {v3, v2}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    :cond_2
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v5

    sub-long/2addr v3, v5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    cmp-long v2, v3, v7

    if-gez v2, :cond_3

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v5, Lnl4;->operator_task_elapsed_seconds:I

    new-array v6, v0, [Ljava/lang/Object;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v1

    invoke-virtual {v2, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    cmp-long v2, v3, v7

    if-gez v2, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v5, Lnl4;->operator_task_elapsed_minutes:I

    new-array v6, v0, [Ljava/lang/Object;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v1

    invoke-virtual {v2, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-gez v2, :cond_5

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v5, Lnl4;->operator_task_elapsed_hours:I

    new-array v6, v0, [Ljava/lang/Object;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v1

    invoke-virtual {v2, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v5, Lnl4;->operator_task_elapsed_days:I

    new-array v6, v0, [Ljava/lang/Object;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v6, v1

    invoke-virtual {v2, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    const-string v3, "when {\n          timeEla\u2026ElapsedMillis))\n        }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LQu3$b;->b:Lns6;

    iget-object v3, v3, Lns6;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isCollect(Lco/bird/android/model/wire/WireBird;)Z

    move-result v2

    if-ne v2, v0, :cond_7

    move v2, v0

    goto :goto_2

    :cond_7
    move v2, v1

    :goto_2
    if-eqz v2, :cond_8

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->operator_task_status_collect_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->birdRed:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->white:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_7

    :cond_8
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getSubmerged()Z

    move-result v2

    if-ne v2, v0, :cond_9

    move v2, v0

    goto :goto_3

    :cond_9
    move v2, v1

    :goto_3
    if-nez v2, :cond_d

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getDisconnected()Z

    move-result v2

    if-ne v2, v0, :cond_a

    move v2, v0

    goto :goto_4

    :cond_a
    move v2, v1

    :goto_4
    if-nez v2, :cond_d

    if-eqz p1, :cond_b

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isDamaged(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-ne p1, v0, :cond_b

    goto :goto_5

    :cond_b
    move v0, v1

    :goto_5
    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lnl4;->operator_task_status_ready_label:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->birdNewRoad:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_7

    :cond_d
    :goto_6
    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->operator_task_status_damaged_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->birdRed:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, LQu3$b;->b:Lns6;

    iget-object p1, p1, Lns6;->e:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->white:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_7
    return-void
.end method
