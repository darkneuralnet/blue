.class public final La04$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La04;
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
        "La04$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LDe2;",
        "b",
        "LDe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(La04;Landroid/view/View;)V",
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
        "SMAP\nPreloadAmountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,74:1\n18#2:75\n9#3,4:76\n*S KotlinDebug\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder\n*L\n58#1:75\n58#1:76,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LDe2;

.field public final synthetic c:La04;


# direct methods
.method public constructor <init>(La04;Landroid/view/View;)V
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

    iput-object p1, p0, La04$b;->c:La04;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LDe2;->a(Landroid/view/View;)LDe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, La04$b;->b:LDe2;

    invoke-virtual {p2}, LDe2;->b()Landroid/widget/FrameLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La04$b$a;

    invoke-direct {v0, p1, p0}, La04$b$a;-><init>(La04;La04$b;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, La04$b;->c:La04;

    invoke-static {v0}, La04;->access$getAdapterData(La04;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lc04;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lc04;

    if-eqz v0, :cond_3

    iget-object v1, p0, La04$b;->c:La04;

    invoke-static {v1}, La04;->access$getPositionSelected$p(La04;)I

    move-result v2

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v2, p0, La04$b;->b:LDe2;

    iget-object v2, v2, LDe2;->b:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Lc04;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, La04$b;->b:LDe2;

    iget-object v2, v2, LDe2;->b:Landroid/widget/RadioButton;

    invoke-virtual {v2, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-eqz p1, :cond_2

    invoke-static {}, La04;->access$getSelectedBg$cp()I

    move-result v2

    goto :goto_2

    :cond_2
    invoke-static {}, La04;->access$getUnselectedBg$cp()I

    move-result v2

    :goto_2
    iget-object v3, p0, La04$b;->b:LDe2;

    invoke-virtual {v3}, LDe2;->b()Landroid/widget/FrameLayout;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz p1, :cond_3

    invoke-static {v1, v0}, La04;->access$setSelectedPreloadAmount$p(La04;Lc04;)V

    :cond_3
    return-void
.end method
