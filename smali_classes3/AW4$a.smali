.class public final LAW4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAW4;
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
        "LAW4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lmf2;",
        "b",
        "Lmf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LAW4;Landroid/view/View;)V",
        "ride-pass_release"
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
        "SMAP\nRidePassV4Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n*S KotlinDebug\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder\n*L\n52#1:78\n52#1:79,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lmf2;

.field public final synthetic c:LAW4;


# direct methods
.method public constructor <init>(LAW4;Landroid/view/View;)V
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

    iput-object p1, p0, LAW4$a;->c:LAW4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lmf2;->a(Landroid/view/View;)Lmf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LAW4$a;->b:Lmf2;

    invoke-virtual {p2}, Lmf2;->b()Lcom/google/android/material/card/MaterialCardView;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LAW4$a$a;

    invoke-direct {v0, p1, p0}, LAW4$a$a;-><init>(LAW4;LAW4$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LAW4$a;->c:LAW4;

    invoke-static {v0}, LAW4;->access$getAdapterData(LAW4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LFX4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LFX4;

    if-eqz p1, :cond_5

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->i:Landroid/widget/TextView;

    const-string v2, "binding.tag"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFX4;->h()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, LFX4;->g()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LFX4;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, LFX4;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->g:Landroid/widget/TextView;

    const-string v2, "binding.subscription"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFX4;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    move v2, v5

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LFX4;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->f:Landroid/widget/TextView;

    const-string v2, "binding.promoTag"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFX4;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, LFX4;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    move v2, v5

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, LFX4;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->h:Landroid/widget/TextView;

    const-string v2, "binding.subscriptionInfo"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFX4;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    move v2, v5

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LAW4$a;->b:Lmf2;

    iget-object v0, v0, Lmf2;->e:Landroid/view/View;

    const-string v2, "binding.divider"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFX4;->f()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    move v5, v3

    :goto_4
    invoke-static {v0, v5, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_5
    return-void
.end method
