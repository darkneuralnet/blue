.class public final Loe3$a;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loe3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Loe3$a;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lne3;",
        "item",
        "",
        "a",
        "LMd2;",
        "b",
        "LMd2;",
        "binding",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Loe3;Landroid/view/View;)V",
        "bird-pay_release"
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
        "SMAP\nOfferAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferAdapter.kt\nco/bird/android/feature/rider/birdpay/place/adapter/OfferAdapter$OfferHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n262#2,2:73\n*S KotlinDebug\n*F\n+ 1 OfferAdapter.kt\nco/bird/android/feature/rider/birdpay/place/adapter/OfferAdapter$OfferHolder\n*L\n68#1:73,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LMd2;

.field public final synthetic c:Loe3;


# direct methods
.method public constructor <init>(Loe3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Loe3$a;->c:Loe3;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LMd2;->a(Landroid/view/View;)LMd2;

    move-result-object p2

    const-string v0, "bind(itemView)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Loe3$a;->b:LMd2;

    iget-object p2, p2, LMd2;->b:Landroid/widget/Button;

    const-string v0, "binding.actionButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loe3$a$a;

    invoke-direct {v0, p0, p1}, Loe3$a$a;-><init>(Loe3$a;Loe3;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Lne3;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loe3$a;->b:LMd2;

    iget-object v0, v0, LMd2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lne3;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Loe3$a;->b:LMd2;

    iget-object v0, v0, LMd2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lne3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Loe3$a;->b:LMd2;

    iget-object v0, v0, LMd2;->c:Landroid/widget/FrameLayout;

    const-string v1, "binding.actionButtonContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lne3;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
