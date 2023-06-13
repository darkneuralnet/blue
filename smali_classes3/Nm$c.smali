.class public final LNm$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "LNm$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "b",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "refreshView",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LNm;Landroid/view/View;)V",
        "co.bird.android.feature.operator.bottomsheets"
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
        "SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$RefreshViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,205:1\n1#2:206\n18#3:207\n9#4,4:208\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$RefreshViewHolder\n*L\n162#1:207\n162#1:208,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final synthetic c:LNm;


# direct methods
.method public constructor <init>(LNm;Landroid/view/View;)V
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

    iput-object p1, p0, LNm$c;->c:LNm;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, LNm$c;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Leh4;->refreshButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_0

    new-instance v0, LNm$c$a;

    invoke-direct {v0, p1}, LNm$c$a;-><init>(LNm;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object p1, p0, LNm$c;->c:LNm;

    invoke-static {p1}, LNm;->access$getAreaBottomSheet$p(LNm;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->X(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 14

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    iget-object v0, p0, LNm$c;->c:LNm;

    invoke-static {v0}, LNm;->access$getAdapterData(LNm;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6;

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lorg/joda/time/DateTime;

    if-eqz v1, :cond_2

    move-object v2, v0

    :cond_2
    check-cast v2, Lorg/joda/time/DateTime;

    if-nez v2, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, LNm$c;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, Leh4;->lastUpdateTextView:I

    invoke-static {v0, v1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lco/bird/android/widget/CountdownView;

    if-nez v3, :cond_4

    return-void

    :cond_4
    invoke-static {v2}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xfe

    const/4 v13, 0x0

    invoke-static/range {v3 .. v13}, Lco/bird/android/widget/CountdownView;->init$default(Lco/bird/android/widget/CountdownView;ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lw1;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Leh4;->lastUpdateTextView:I

    invoke-static {v0, v1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/CountdownView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/widget/CountdownView;->x()V

    :cond_0
    return-void
.end method
