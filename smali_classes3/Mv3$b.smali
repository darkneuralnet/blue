.class public final LMv3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMv3;
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
        "LMv3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LSb2;",
        "b",
        "LSb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LMv3;Landroid/view/View;)V",
        "task-list-v2_release"
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
        "SMAP\nOperatorTaskListV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Adapter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Adapter$TaskViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n18#2:108\n18#2:114\n9#3,4:109\n9#3,4:115\n1#4:113\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Adapter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Adapter$TaskViewHolder\n*L\n86#1:108\n78#1:114\n86#1:109,4\n78#1:115,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LSb2;

.field public final synthetic c:LMv3;


# direct methods
.method public constructor <init>(LMv3;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMv3$b;->c:LMv3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LSb2;->a(Landroid/view/View;)LSb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LMv3$b;->b:LSb2;

    invoke-virtual {p2}, LSb2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    new-instance v1, LNv3;

    invoke-direct {v1, p0, p1}, LNv3;-><init>(LMv3$b;LMv3;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p2, LSb2;->e:Landroid/widget/ImageView;

    const-string p2, "binding.more"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(LMv3$b;LMv3;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, LMv3$b;->b(LMv3$b;LMv3;Landroid/view/View;)V

    return-void
.end method

.method public static final b(LMv3$b;LMv3;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p1}, LMv3;->access$getAdapterData(LMv3;)LE6;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {p2, p0}, LE6;->e(I)LG6;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LG6;->c()Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    if-eqz p0, :cond_1

    invoke-static {p1}, LMv3;->access$getTaskPublisher$p(LMv3;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LMv3$b;->c:LMv3;

    invoke-static {v0}, LMv3;->access$getAdapterData(LMv3;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    if-eqz p1, :cond_6

    iget-object v0, p0, LMv3$b;->b:LSb2;

    iget-object v0, v0, LSb2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getBirdCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LMv3$b;->b:LSb2;

    iget-object v0, v0, LSb2;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LMv3$b;->b:LSb2;

    iget-object v0, v0, LSb2;->h:Landroid/widget/TextView;

    const-string v2, "binding.subtitle"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    const/4 v6, 0x2

    invoke-static {v0, v3, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getSubtitleColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    iget-object v3, p0, LMv3$b;->b:LSb2;

    iget-object v3, v3, LSb2;->h:Landroid/widget/TextView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getBatteryLevel()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    move v0, v5

    :goto_2
    iget-object v2, p0, LMv3$b;->b:LSb2;

    iget-object v2, v2, LSb2;->b:Lco/bird/android/widget/BatteryViewV2;

    int-to-float v3, v0

    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v3, v6

    invoke-virtual {v2, v3}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v2, p0, LMv3$b;->b:LSb2;

    iget-object v2, v2, LSb2;->c:Landroid/widget/TextView;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v6, Lnl4;->battery_percent:I

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v3, v6, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LMv3$b;->b:LSb2;

    iget-object v0, v0, LSb2;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getStatusIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "itemView.context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getStatusIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    iget-object v1, p0, LMv3$b;->b:LSb2;

    iget-object v1, v1, LSb2;->f:Landroid/widget/ImageView;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_5
    iget-object v0, p0, LMv3$b;->b:LSb2;

    iget-object v0, v0, LSb2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getStatusDisplayName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    return-void
.end method
