.class public LND4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LND4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0092\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "LND4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/TextView;",
        "b",
        "Landroid/widget/TextView;",
        "a",
        "()Landroid/widget/TextView;",
        "item",
        "c",
        "I",
        "()I",
        "tint",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LND4;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nRepairSummarySectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummarySectionAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummarySectionAdapter$ItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,72:1\n18#2:73\n9#3,4:74\n*S KotlinDebug\n*F\n+ 1 RepairSummarySectionAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummarySectionAdapter$ItemViewHolder\n*L\n52#1:73\n52#1:74,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/TextView;

.field public final c:I

.field public final synthetic d:LND4;


# direct methods
.method public constructor <init>(LND4;Landroid/view/View;)V
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

    iput-object p1, p0, LND4$b;->d:LND4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LND4$b;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LND4;->v()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, LDf4;->birdGreen:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, LDf4;->birdRed:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    :goto_0
    iput p1, p0, LND4$b;->c:I

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, LND4$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LND4$b;->c:I

    return v0
.end method

.method public bind(I)V
    .locals 2

    iget-object v0, p0, LND4$b;->b:Landroid/widget/TextView;

    iget-object v1, p0, LND4$b;->d:LND4;

    invoke-static {v1}, LND4;->access$getAdapterData(LND4;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v1, p1, Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
