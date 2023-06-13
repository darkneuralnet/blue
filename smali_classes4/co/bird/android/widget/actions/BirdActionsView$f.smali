.class public final Lco/bird/android/widget/actions/BirdActionsView$f;
.super Lkotlin/properties/ObservableProperty;
.source "SourceFile"


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
        "Lkotlin/properties/ObservableProperty<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00b8\u0006\u0000"
    }
    d2 = {
        "kotlin/properties/Delegates$observable$1",
        "Lkotlin/properties/ObservableProperty;",
        "Lkotlin/reflect/KProperty;",
        "property",
        "oldValue",
        "newValue",
        "",
        "afterChange",
        "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
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
        "SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n*L\n1#1,70:1\n121#2,25:71\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/BirdActionsView;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lco/bird/android/widget/actions/BirdActionsView;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    iput-object p3, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->c:Landroid/content/Context;

    invoke-direct {p0, p1}, Lkotlin/properties/ObservableProperty;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KProperty<",
            "*>;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    const/4 p1, 0x1

    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    iget-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p2, p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$showWakeDelay(Lco/bird/android/widget/actions/BirdActionsView;Z)V

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p2, v0}, Lco/bird/android/widget/actions/BirdActionsView;->access$showWakeDelay(Lco/bird/android/widget/actions/BirdActionsView;Z)V

    iget-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    const/4 v1, 0x0

    invoke-static {p2, v1}, Lco/bird/android/widget/actions/BirdActionsView;->access$setWakeDelayTimeLeft(Lco/bird/android/widget/actions/BirdActionsView;Ljava/lang/Integer;)V

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_2

    iget-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p2}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayProgress$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;

    move-result-object p2

    iget-object v1, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {v1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayTotalTime$p(Lco/bird/android/widget/actions/BirdActionsView;)I

    move-result v1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {v2}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayTotalTime$p(Lco/bird/android/widget/actions/BirdActionsView;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p2, v1}, Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;->setProgress(F)V

    iget-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p2}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayBody$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/TextView;

    move-result-object p2

    iget-object v1, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->c:Landroid/content/Context;

    sget v2, Lnl4;->bird_actions_view_wake_delay_body:I

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p1, v0

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$f;->b:Lco/bird/android/widget/actions/BirdActionsView;

    new-instance p2, Lco/bird/android/widget/actions/BirdActionsView$h;

    invoke-direct {p2, p1, p3}, Lco/bird/android/widget/actions/BirdActionsView$h;-><init>(Lco/bird/android/widget/actions/BirdActionsView;Ljava/lang/Integer;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method
