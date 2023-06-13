.class public final LiD6$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiD6;
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
        "LiD6$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LQa2;",
        "b",
        "LQa2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LiD6;Landroid/view/View;)V",
        "workorders_release"
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
        "SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$BirdInfoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$BirdInfoViewHolder\n*L\n66#1:140\n66#1:141,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LQa2;

.field public final synthetic c:LiD6;


# direct methods
.method public constructor <init>(LiD6;Landroid/view/View;)V
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

    iput-object p1, p0, LiD6$b;->c:LiD6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LQa2;->a(Landroid/view/View;)LQa2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LiD6$b;->b:LQa2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LiD6$b;->c:LiD6;

    invoke-static {v0}, LiD6;->access$getAdapterData(LiD6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/BirdSummaryViewModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/BirdSummaryViewModel;

    if-eqz p1, :cond_2

    iget-object v0, p0, LiD6$b;->b:LQa2;

    iget-object v0, v0, LQa2;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/BirdSummaryViewModel;->getModel()Lco/bird/android/model/constant/BirdModel;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "itemView.context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LiD6$b;->b:LQa2;

    iget-object v0, v0, LQa2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/BirdSummaryViewModel;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LiD6$b;->b:LQa2;

    iget-object v0, v0, LQa2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/BirdSummaryViewModel;->getDisplayModel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method
