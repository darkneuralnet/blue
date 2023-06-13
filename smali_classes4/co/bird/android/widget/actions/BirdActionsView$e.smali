.class public final Lco/bird/android/widget/actions/BirdActionsView$e;
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
        "Ljava/lang/Boolean;",
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
        "SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n93#2,4:71\n97#2:77\n98#2:80\n100#2:83\n101#2:86\n102#2:89\n104#2:92\n105#2:95\n107#2:98\n108#2:101\n109#2,4:104\n113#2:110\n114#2:113\n117#2:116\n262#3,2:75\n262#3,2:78\n262#3,2:81\n262#3,2:84\n262#3,2:87\n262#3,2:90\n262#3,2:93\n262#3,2:96\n262#3,2:99\n262#3,2:102\n262#3,2:108\n262#3,2:111\n262#3,2:114\n*S KotlinDebug\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n*L\n96#1:75,2\n97#1:78,2\n98#1:81,2\n100#1:84,2\n101#1:87,2\n102#1:90,2\n104#1:93,2\n105#1:96,2\n107#1:99,2\n108#1:102,2\n112#1:108,2\n113#1:111,2\n114#1:114,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/BirdActionsView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lco/bird/android/widget/actions/BirdActionsView;)V
    .locals 0

    iput-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-direct {p0, p1}, Lkotlin/properties/ObservableProperty;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KProperty<",
            "*>;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eq p2, p1, :cond_3

    const/4 p2, 0x0

    const/16 p3, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getLightsButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/SplitButton;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getAlarmButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/BirdActionButton;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getLockView$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/SlideToLockView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayTitle$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayBody$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayProgress$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getSleepingTitle$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getSleepingTitle$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getWakeDelayTimeLeft(Lco/bird/android/widget/actions/BirdActionsView;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    if-lez p1, :cond_2

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lco/bird/android/widget/actions/BirdActionsView;->access$showWakeDelay(Lco/bird/android/widget/actions/BirdActionsView;Z)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getLightsButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/SplitButton;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getAlarmButton$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/BirdActionButton;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$e;->b:Lco/bird/android/widget/actions/BirdActionsView;

    invoke-static {p1}, Lco/bird/android/widget/actions/BirdActionsView;->access$getLockView$p(Lco/bird/android/widget/actions/BirdActionsView;)Lco/bird/android/widget/actions/SlideToLockView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_1
    return-void
.end method
