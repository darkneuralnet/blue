.class public final Lco/bird/android/widget/CallToActionLayout$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/CallToActionLayout;->onLayout(ZIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "scrollable",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/CallToActionLayout;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CallToActionLayout;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/CallToActionLayout$b;->invoke(Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-static {p1}, Lco/bird/android/widget/CallToActionLayout;->access$getBinding$p(Lco/bird/android/widget/CallToActionLayout;)LTp6;

    move-result-object p1

    iget-object p1, p1, LTp6;->c:Landroidx/cardview/widget/CardView;

    iget-object v0, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LYf4;->button_container_scrollable_elevation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/cardview/widget/CardView;->setCardElevation(F)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-static {p1}, Lco/bird/android/widget/CallToActionLayout;->access$getBinding$p(Lco/bird/android/widget/CallToActionLayout;)LTp6;

    move-result-object p1

    iget-object p1, p1, LTp6;->c:Landroidx/cardview/widget/CardView;

    iget-object v0, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LYf4;->button_container_zero_elevation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/cardview/widget/CardView;->setCardElevation(F)V

    iget-object p1, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-static {p1}, Lco/bird/android/widget/CallToActionLayout;->access$getBinding$p(Lco/bird/android/widget/CallToActionLayout;)LTp6;

    move-result-object p1

    iget-object p1, p1, LTp6;->c:Landroidx/cardview/widget/CardView;

    iget-object v0, p0, Lco/bird/android/widget/CallToActionLayout$b;->g:Lco/bird/android/widget/CallToActionLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x106000d

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    :goto_0
    return-void
.end method
