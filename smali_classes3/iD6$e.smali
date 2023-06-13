.class public final LiD6$e;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiD6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LiD6$e;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LAc2;",
        "b",
        "LAc2;",
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
        "SMAP\nWorkOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$IssueHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n18#2:140\n9#3,4:141\n1#4:145\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapter$IssueHeaderViewHolder\n*L\n89#1:140\n89#1:141,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LAc2;

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

    iput-object p1, p0, LiD6$e;->c:LiD6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LAc2;->a(Landroid/view/View;)LAc2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LiD6$e;->b:LAc2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LiD6$e;->c:LiD6;

    invoke-static {v0}, LiD6;->access$getAdapterData(LiD6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/Issue;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/Issue;

    if-eqz p1, :cond_3

    iget-object v0, p0, LiD6$e;->b:LAc2;

    iget-object v0, v0, LAc2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LiD6$e;->b:LAc2;

    iget-object v0, v0, LAc2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getSourceDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LiD6$e;->b:LAc2;

    iget-object v0, v0, LAc2;->c:Landroid/widget/TextView;

    const-string v2, "binding.source"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getSourceDisplay()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LiD6$e;->b:LAc2;

    iget-object v0, v0, LAc2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatusDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/Issue;->getStatusColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, LiD6$e;->b:LAc2;

    iget-object v0, v0, LAc2;->d:Landroid/widget/TextView;

    const-string v1, "binding.status"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    return-void
.end method
