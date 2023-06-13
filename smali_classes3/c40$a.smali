.class public final Lc40$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lc40$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Les6;",
        "b",
        "Les6;",
        "binding",
        "Ld40;",
        "()Ld40;",
        "viewModel",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lc40;Landroid/view/View;)V",
        "bulk-scanner_release"
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
        "SMAP\nBulkActionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,72:1\n18#2:73\n9#3,4:74\n*S KotlinDebug\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder\n*L\n36#1:73\n36#1:74,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Les6;

.field public final synthetic c:Lc40;


# direct methods
.method public constructor <init>(Lc40;Landroid/view/View;)V
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

    iput-object p1, p0, Lc40$a;->c:Lc40;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Les6;->a(Landroid/view/View;)Les6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lc40$a;->b:Les6;

    iget-object p2, p2, Les6;->b:Landroid/widget/RadioButton;

    const-string v0, "binding.actionRadioButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc40$a$a;

    invoke-direct {v0, p1, p0}, Lc40$a$a;-><init>(Lc40;Lc40$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lc40$a;)Ld40;
    .locals 0

    invoke-virtual {p0}, Lc40$a;->b()Ld40;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ld40;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    iget-object v1, p0, Lc40$a;->c:Lc40;

    invoke-static {v1}, Lc40;->access$getAdapterData(Lc40;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6;

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Ld40;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    move-object v2, v0

    :cond_1
    check-cast v2, Ld40;

    :cond_2
    return-object v2
.end method

.method public bind(I)V
    .locals 2

    invoke-virtual {p0}, Lc40$a;->b()Ld40;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lc40$a;->b:Les6;

    iget-object v0, v0, Les6;->b:Landroid/widget/RadioButton;

    invoke-virtual {p1}, Ld40;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v0, p0, Lc40$a;->b:Les6;

    iget-object v0, v0, Les6;->b:Landroid/widget/RadioButton;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Ld40;->c()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
