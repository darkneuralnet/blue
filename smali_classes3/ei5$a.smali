.class public final Lei5$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei5;
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
        "Lei5$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lsf2;",
        "b",
        "Lsf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lei5;Landroid/view/View;)V",
        "save-money_release"
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
        "SMAP\nSaveMoneyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$SaveMoneyCardViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$SaveMoneyCardViewHolder\n*L\n39#1:64\n39#1:65,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lsf2;

.field public final synthetic c:Lei5;


# direct methods
.method public constructor <init>(Lei5;Landroid/view/View;)V
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

    iput-object p1, p0, Lei5$a;->c:Lei5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lsf2;->a(Landroid/view/View;)Lsf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lei5$a;->b:Lsf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, Lei5$a;->c:Lei5;

    invoke-static {v0}, Lei5;->access$getAdapterData(Lei5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lhi5;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lhi5;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lei5$a;->c:Lei5;

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1}, Lhi5;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lhi5;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lhi5;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lhi5;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->c:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lhi5;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v1, p0, Lei5$a;->b:Lsf2;

    iget-object v1, v1, Lsf2;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "binding.mainContainer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lei5$a$a;

    invoke-direct {v2, v0, p1}, Lei5$a$a;-><init>(Lei5;Lhi5;)V

    invoke-static {v1, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method