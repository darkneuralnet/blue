.class public final LU65$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU65;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU65$a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001e\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0018"
    }
    d2 = {
        "LU65$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Lb75;",
        "viewModel",
        "a",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "b",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "headerView",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lorg/joda/time/DateTime;",
        "bindTime",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LU65;Landroid/view/View;)V",
        "co.bird.android.feature.rider.bottomsheets"
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
        "SMAP\nRideStatusBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2:106\n18#2:112\n9#3,4:107\n9#3,4:113\n1#4:111\n*S KotlinDebug\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder\n*L\n75#1:106\n86#1:112\n75#1:107,4\n86#1:113,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public c:Lorg/joda/time/DateTime;

.field public final synthetic d:LU65;


# direct methods
.method public constructor <init>(LU65;Landroid/view/View;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LU65$a;->d:LU65;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    move-object v0, p2

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, LU65$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, LU65$a;->c:Lorg/joda/time/DateTime;

    sget v0, LWh4;->primaryButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/Button;

    if-eqz v1, :cond_0

    const-wide/16 v2, 0x0

    new-instance v4, LU65$a$a;

    invoke-direct {v4, p1}, LU65$a$a;-><init>(LU65;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LMs2;->onClickWithThrottle$default(Landroid/view/View;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
    sget v0, LWh4;->secondaryButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_1

    const-wide/16 v1, 0x0

    new-instance v3, LU65$a$b;

    invoke-direct {v3, p1}, LU65$a$b;-><init>(LU65;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LMs2;->onClickWithThrottle$default(Landroid/view/View;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lb75;)I
    .locals 3

    invoke-virtual {p1}, Lb75;->i()LR46;

    move-result-object v0

    sget-object v1, LU65$a$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const-string v2, "bindTime"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb75;->d()I

    move-result p1

    iget-object v0, p0, LU65$a;->c:Lorg/joda/time/DateTime;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v0

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lb75;->d()I

    move-result p1

    iget-object v0, p0, LU65$a;->c:Lorg/joda/time/DateTime;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v0

    add-int/2addr p1, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lb75;->d()I

    move-result p1

    :goto_0
    return p1
.end method

.method public bind(I)V
    .locals 2

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, LU65$a;->c:Lorg/joda/time/DateTime;

    iget-object v0, p0, LU65$a;->d:LU65;

    invoke-static {v0}, LU65;->access$getRideStatusBottomSheet$p(LU65;)Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v1, p0, LU65$a;->d:LU65;

    invoke-static {v1}, LU65;->access$getAdapterData(LU65;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lb75;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lb75;

    if-eqz p1, :cond_2

    iget-object v1, p0, LU65$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v1}, Lb75;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->X(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 15

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LU65$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v4, LWh4;->durationText:I

    invoke-static {v1, v4}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/widget/CountdownView;

    if-nez v4, :cond_2

    return-void

    :cond_2
    invoke-virtual {v4}, Lco/bird/android/widget/CountdownView;->x()V

    iget-object v1, p0, LU65$a;->d:LU65;

    invoke-static {v1}, LU65;->access$getAdapterData(LU65;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6;

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb75;

    if-eqz v1, :cond_3

    move-object v2, v0

    :cond_3
    check-cast v2, Lb75;

    if-nez v2, :cond_4

    return-void

    :cond_4
    invoke-virtual {v2}, Lb75;->i()LR46;

    move-result-object v0

    invoke-virtual {v2}, Lb75;->d()I

    move-result v1

    invoke-virtual {p0, v2}, LU65$a;->a(Lb75;)I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "TimerState: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with duration "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " with modified duration since bind "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Lb75;->i()LR46;

    move-result-object v0

    invoke-virtual {v4, v0}, Lco/bird/android/widget/CountdownView;->setTimerState(LR46;)V

    invoke-virtual {p0, v2}, LU65$a;->a(Lb75;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xfe

    const/4 v14, 0x0

    invoke-static/range {v4 .. v14}, Lco/bird/android/widget/CountdownView;->init$default(Lco/bird/android/widget/CountdownView;ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lw1;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LWh4;->durationText:I

    invoke-static {v0, v1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/CountdownView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/widget/CountdownView;->x()V

    :cond_0
    return-void
.end method
