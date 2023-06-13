.class public final LVu4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVu4;
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
        "LVu4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ltf2;",
        "b",
        "Ltf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVu4;Landroid/view/View;)V",
        "release_release"
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
        "SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$HeaderViewHolder\n*L\n85#1:161\n85#1:162,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ltf2;

.field public final synthetic c:LVu4;


# direct methods
.method public constructor <init>(LVu4;Landroid/view/View;)V
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

    iput-object p1, p0, LVu4$b;->c:LVu4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ltf2;->a(Landroid/view/View;)Ltf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LVu4$b;->b:Ltf2;

    iget-object p2, p2, Ltf2;->b:Landroid/widget/Button;

    const-string v0, "binding.button"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVu4$b$a;

    invoke-direct {v0, p1}, LVu4$b$a;-><init>(LVu4;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LVu4$b;->c:LVu4;

    invoke-static {v0}, LVu4;->access$getAdapterData(LVu4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LHu4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LHu4;

    if-eqz p1, :cond_1

    iget-object v0, p0, LVu4$b;->c:LVu4;

    iget-object v2, p0, LVu4$b;->b:Ltf2;

    iget-object v2, v2, Ltf2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LHu4;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LVu4$b;->b:Ltf2;

    iget-object v2, v2, Ltf2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, LHu4;->d()Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    iget-object v2, p0, LVu4$b;->b:Ltf2;

    iget-object v2, v2, Ltf2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, LHu4;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LVu4$b;->b:Ltf2;

    iget-object v2, v2, Ltf2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, LHu4;->c()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v2, p1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LVu4$b;->b:Ltf2;

    iget-object p1, p1, Ltf2;->b:Landroid/widget/Button;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, LVu4$b;->b:Ltf2;

    iget-object v3, v3, Ltf2;->b:Landroid/widget/Button;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    float-to-int v1, v1

    iget-object v4, p0, LVu4$b;->b:Ltf2;

    iget-object v4, v4, Ltf2;->b:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {v0}, LVu4;->v()LYP3;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "header"

    invoke-virtual {p1, v1, v0}, LYP3;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_1
    return-void
.end method
