.class public final LYs1$p;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "p"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LYs1$p;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lmg2;",
        "b",
        "Lmg2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LYs1;Landroid/view/View;)V",
        "flight-sheet_release"
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
        "SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder\n*L\n576#1:670\n576#1:671,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lmg2;

.field public final synthetic c:LYs1;


# direct methods
.method public constructor <init>(LYs1;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$p;->c:LYs1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lmg2;->a(Landroid/view/View;)Lmg2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LYs1$p;->b:Lmg2;

    invoke-virtual {p2}, Lmg2;->b()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    invoke-virtual {p2}, Lmg2;->b()Landroid/widget/Button;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYs1$p$a;

    invoke-direct {v0, p1, p0}, LYs1$p$a;-><init>(LYs1;LYs1$p;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LYs1$p;->c:LYs1;

    invoke-static {v0}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/FlightSheetButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/FlightSheetButton;

    iget-object v0, p0, LYs1$p;->b:Lmg2;

    invoke-virtual {v0}, Lmg2;->b()Landroid/widget/Button;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/FlightSheetButton;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    instance-of v0, p1, Lco/bird/android/model/DrawableFlightSheetButton;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/DrawableFlightSheetButton;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/DrawableFlightSheetButton;->getDrawableStart()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v1}, Lco/bird/android/model/DrawableFlightSheetButton;->getDrawableTop()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1}, Lco/bird/android/model/DrawableFlightSheetButton;->getDrawableEnd()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/model/DrawableFlightSheetButton;->getDrawableBottom()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v3, p0, LYs1$p;->b:Lmg2;

    invoke-virtual {v3}, Lmg2;->b()Landroid/widget/Button;

    move-result-object v3

    invoke-virtual {v3, p1, v0, v2, v1}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void
.end method
