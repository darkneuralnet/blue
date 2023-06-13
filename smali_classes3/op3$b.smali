.class public final Lop3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lop3;
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
        "Lop3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LQd2;",
        "b",
        "LQd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lop3;Landroid/view/View;)V",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nOperatorOrderLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,76:1\n18#2:77\n9#3,4:78\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingAdapter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapter$OrderViewHolder\n*L\n66#1:77\n66#1:78,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LQd2;

.field public final synthetic c:Lop3;


# direct methods
.method public constructor <init>(Lop3;Landroid/view/View;)V
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

    iput-object p1, p0, Lop3$b;->c:Lop3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LQd2;->a(Landroid/view/View;)LQd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lop3$b;->b:LQd2;

    invoke-virtual {p2}, LQd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lop3$b$a;

    invoke-direct {v0, p1, p0}, Lop3$b$a;-><init>(Lop3;Lop3$b;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, Lop3$b;->c:Lop3;

    invoke-static {v0}, Lop3;->access$getAdapterData(Lop3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LUp3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LUp3;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lop3$b;->b:LQd2;

    iget-object v0, v0, LQd2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LUp3;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lop3$b;->b:LQd2;

    iget-object v0, v0, LQd2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, LUp3;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lop3$b;->b:LQd2;

    iget-object v0, v0, LQd2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LUp3;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lop3$b;->b:LQd2;

    iget-object v0, v0, LQd2;->d:Landroid/widget/TextView;

    const-string v2, "binding.details"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LUp3;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    return-void
.end method
