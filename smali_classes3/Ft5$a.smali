.class public final LFt5$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFt5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LFt5$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LBt6;",
        "b",
        "LBt6;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LFt5;Landroid/view/View;)V",
        "servicecenter_release"
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
        "SMAP\nServiceCenterListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceCenterListAdapter.kt\nco/bird/android/feature/servicecenter/ServiceCenterListAdapter$ServiceCenterListViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,61:1\n18#2:62\n9#3,4:63\n*S KotlinDebug\n*F\n+ 1 ServiceCenterListAdapter.kt\nco/bird/android/feature/servicecenter/ServiceCenterListAdapter$ServiceCenterListViewHolder\n*L\n50#1:62\n50#1:63,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LBt6;

.field public final synthetic c:LFt5;


# direct methods
.method public constructor <init>(LFt5;Landroid/view/View;)V
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

    iput-object p1, p0, LFt5$a;->c:LFt5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LBt6;->a(Landroid/view/View;)LBt6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LFt5$a;->b:LBt6;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFt5$a$a;

    invoke-direct {v0, p0, p1}, LFt5$a$a;-><init>(LFt5$a;LFt5;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, LFt5$a;->c:LFt5;

    invoke-static {v0}, LFt5;->access$getAdapterData$p(LFt5;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Warehouse;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/Warehouse;

    iget-object v0, p0, LFt5$a;->b:LBt6;

    iget-object v0, v0, LBt6;->b:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/Warehouse;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LFt5$a;->b:LBt6;

    iget-object v0, v0, LBt6;->d:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/Warehouse;->getAddress()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
