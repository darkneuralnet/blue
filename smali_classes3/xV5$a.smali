.class public final LxV5$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxV5;
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
        "LxV5$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LAe2;",
        "b",
        "LAe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LxV5;Landroid/view/View;)V",
        "co.bird.android.feature.payment"
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
        "SMAP\nSupportedPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,66:1\n18#2:67\n9#3,4:68\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder\n*L\n46#1:67\n46#1:68,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LAe2;

.field public final synthetic c:LxV5;


# direct methods
.method public constructor <init>(LxV5;Landroid/view/View;)V
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

    iput-object p1, p0, LxV5$a;->c:LxV5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LAe2;->a(Landroid/view/View;)LAe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LxV5$a;->b:LAe2;

    invoke-virtual {p2}, LAe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LxV5$a$a;

    invoke-direct {v0, p1, p0}, LxV5$a$a;-><init>(LxV5;LxV5$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LxV5$a;->c:LxV5;

    invoke-static {v0}, LxV5;->access$getAdapterData(LxV5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LzV5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LzV5;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LzV5;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    iget-object v3, p0, LxV5$a;->b:LAe2;

    iget-object v3, v3, LAe2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, LzV5;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v3, p0, LxV5$a;->b:LAe2;

    iget-object v3, v3, LAe2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LzV5;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LxV5$a;->b:LAe2;

    iget-object v3, v3, LAe2;->c:Landroid/widget/TextView;

    const-string v4, "binding.paymentSubtitle"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LzV5;->d()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x2

    invoke-static {v3, p1, v2, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    const-string p1, "binding.sideIcon"

    const-string v1, "binding.root"

    if-eqz v0, :cond_2

    iget-object v0, p0, LxV5$a;->b:LAe2;

    invoke-virtual {v0}, LAe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LDf4;->colorPrimary:I

    invoke-static {v0, v1}, Ltu6;->j(Landroid/view/View;I)I

    move-result v0

    iget-object v1, p0, LxV5$a;->b:LAe2;

    iget-object v1, v1, LAe2;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, LxV5$a;->b:LAe2;

    iget-object v0, v0, LAe2;->e:Landroid/widget/ImageView;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, LxV5$a;->b:LAe2;

    invoke-virtual {v0}, LAe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LDf4;->passiveText:I

    invoke-static {v0, v1}, Ltu6;->j(Landroid/view/View;I)I

    move-result v0

    iget-object v1, p0, LxV5$a;->b:LAe2;

    iget-object v1, v1, LAe2;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, LxV5$a;->b:LAe2;

    iget-object v0, v0, LAe2;->e:Landroid/widget/ImageView;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    :cond_3
    :goto_2
    return-void
.end method
