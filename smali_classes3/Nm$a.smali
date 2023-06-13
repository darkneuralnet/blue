.class public final LNm$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "LNm$a;",
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
        "capRestrictionView",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "c",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "location",
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
        "SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n18#2:206\n18#2:212\n9#3,4:207\n9#3,4:213\n1#4:211\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$CapRestrictionViewHolder\n*L\n122#1:206\n133#1:212\n122#1:207,4\n133#1:213,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public c:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

.field public final synthetic d:LNm;


# direct methods
.method public constructor <init>(LNm;Landroid/view/View;)V
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

    iput-object p1, p0, LNm$a;->d:LNm;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    move-object v0, p2

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, LNm$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Leh4;->directionsButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    new-instance v1, LNm$a$a;

    invoke-direct {v1, p0, p1}, LNm$a$a;-><init>(LNm$a;LNm;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    sget v0, Leh4;->refreshButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_1

    new-instance v0, LNm$a$b;

    invoke-direct {v0, p1}, LNm$a$b;-><init>(LNm;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public static final synthetic a(LNm$a;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 0

    iget-object p0, p0, LNm$a;->c:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LNm$a;->d:LNm;

    invoke-static {v0}, LNm;->access$getAreaBottomSheet$p(LNm;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LNm$a;->d:LNm;

    invoke-static {v1}, LNm;->access$getAdapterData(LNm;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lze0;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lze0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lze0;->f()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v1

    iput-object v1, p0, LNm$a;->c:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v1, p0, LNm$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v1}, Lze0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->X(Landroid/view/View;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 13

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

    move-result v0

    iget-object v1, p0, LNm$a;->d:LNm;

    invoke-static {v1}, LNm;->access$getAdapterData(LNm;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6;

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lze0;

    if-eqz v1, :cond_2

    move-object v2, v0

    :cond_2
    check-cast v2, Lze0;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lze0;->e()Lorg/joda/time/DateTime;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v1, p0, LNm$a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v2, Leh4;->lastUpdateTextView:I

    invoke-static {v1, v2}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/widget/CountdownView;

    if-nez v2, :cond_4

    return-void

    :cond_4
    invoke-static {v0}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xfe

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lco/bird/android/widget/CountdownView;->init$default(Lco/bird/android/widget/CountdownView;ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;ILjava/lang/Object;)V

    :cond_5
    :goto_2
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
