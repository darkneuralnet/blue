.class public final Lco/bird/android/widget/actions/BirdActionsView$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/actions/BirdActionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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
.field public final synthetic g:Lco/bird/android/widget/actions/BirdActionsView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/actions/BirdActionsView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$a;->g:Lco/bird/android/widget/actions/BirdActionsView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/BirdActionsView$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$a;->g:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getLightsButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/SplitButton;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lco/bird/android/widget/actions/SplitButton;->setLeftButtonSelected(Z)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$a;->g:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-virtual {p1}, Lco/bird/android/widget/actions/BirdActionsView;->C()Lco/bird/android/widget/actions/BirdActionsView$d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lco/bird/android/widget/actions/BirdActionsView$d;->c(Z)V

    :cond_0
    return-void
.end method
