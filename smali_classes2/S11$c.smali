.class public final LS11$c;
.super Lkotlin/properties/ObservableProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS11;-><init>(Landroid/app/Activity;LF5;LG95;Ldr4;LTq4;)V
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
        "SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n166#2,4:71\n170#2:77\n172#2,5:80\n262#3,2:75\n262#3,2:78\n*S KotlinDebug\n*F\n+ 1 DestinationUi.kt\nco/bird/android/app/feature/destination/DestinationUiImpl\n*L\n169#1:75,2\n170#1:78,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LS11;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LS11;)V
    .locals 0

    iput-object p2, p0, LS11$c;->b:LS11;

    invoke-direct {p0, p1}, Lkotlin/properties/ObservableProperty;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
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

    if-eq p2, p1, :cond_4

    iget-object p2, p0, LS11$c;->b:LS11;

    invoke-static {p2}, LS11;->access$getDestinationBalloon$p(LS11;)Lcom/skydoves/balloon/Balloon;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon;->O()V

    :cond_0
    iget-object p2, p0, LS11$c;->b:LS11;

    const/4 p3, 0x0

    invoke-static {p2, p3}, LS11;->access$setDestinationBalloon$p(LS11;Lcom/skydoves/balloon/Balloon;)V

    iget-object p2, p0, LS11$c;->b:LS11;

    invoke-static {p2}, LS11;->access$getBinding$p(LS11;)LF5;

    move-result-object p2

    iget-object p2, p2, LF5;->G:Landroid/widget/ImageView;

    const-string p3, "binding.selectDestinationButton"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 p3, p1, 0x1

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p3, :cond_1

    move p3, v0

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, p0, LS11$c;->b:LS11;

    invoke-static {p2}, LS11;->access$getBinding$p(LS11;)LF5;

    move-result-object p2

    iget-object p2, p2, LF5;->l:LRq6;

    invoke-virtual {p2}, LRq6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string p3, "binding.destinationSelectionView.root"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, p0, LS11$c;->b:LS11;

    invoke-static {p2}, LS11;->access$getBottomsheetBehavior$p(LS11;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p2

    if-eqz p1, :cond_3

    const/4 p1, 0x3

    goto :goto_2

    :cond_3
    const/4 p1, 0x4

    :goto_2
    invoke-virtual {p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    :cond_4
    return-void
.end method
