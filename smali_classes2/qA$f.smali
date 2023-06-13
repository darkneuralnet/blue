.class public final LqA$f;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LqA$f;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lvb2;",
        "b",
        "Lvb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LqA;Landroid/view/View;)V",
        "co.bird.android.commandcenter"
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
        "SMAP\nBaseCommandCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$RepairLogViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,214:1\n18#2:215\n9#3,4:216\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapter$RepairLogViewHolder\n*L\n189#1:215\n189#1:216,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lvb2;

.field public final synthetic c:LqA;


# direct methods
.method public constructor <init>(LqA;Landroid/view/View;)V
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

    iput-object p1, p0, LqA$f;->c:LqA;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lvb2;->a(Landroid/view/View;)Lvb2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LqA$f;->b:Lvb2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LqA$f;->c:LqA;

    invoke-static {v0}, LqA;->access$getAdapterData(LqA;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RepairLog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/RepairLog;

    if-eqz p1, :cond_4

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairSubType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairerEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairerRole()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getCreatedAtTime()Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "itemView.context"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v5, v4, v3, v1}, LpT0;->getElapsedTime$default(Lorg/joda/time/DateTime;Landroid/content/Context;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getCreatedAt()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqA$f;->b:Lvb2;

    iget-object v0, v0, Lvb2;->f:Landroid/widget/TextView;

    const-string v2, "binding.subtype"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/RepairLog;->getRepairSubType()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v4

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v2

    :goto_3
    xor-int/2addr p1, v2

    invoke-static {v0, p1, v4, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_4
    return-void
.end method
