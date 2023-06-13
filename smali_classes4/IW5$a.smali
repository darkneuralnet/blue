.class public final LIW5$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIW5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIW5$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LIW5$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/qualitycontrol/widgets/InspectionCardView;",
        "b",
        "Lco/bird/android/qualitycontrol/widgets/InspectionCardView;",
        "inspectionCard",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LIW5;Landroid/view/View;)V",
        "qualitycontrol_release"
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
        "SMAP\nSwipeQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$InspectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n41#4:150\n1#5:151\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$InspectionItemViewHolder\n*L\n128#1:145\n128#1:146,4\n138#1:150\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

.field public final synthetic c:LIW5;


# direct methods
.method public constructor <init>(LIW5;Landroid/view/View;)V
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

    iput-object p1, p0, LIW5$a;->c:LIW5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    iput-object p2, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-static {p1}, LIW5;->access$getRecyclerView$p(LIW5;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "recyclerView"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    new-instance v0, LHW5;

    invoke-direct {v0, p0, p1}, LHW5;-><init>(LIW5$a;LIW5;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic a(LIW5$a;LIW5;)V
    .locals 0

    invoke-static {p0, p1}, LIW5$a;->b(LIW5$a;LIW5;)V

    return-void
.end method

.method public static final b(LIW5$a;LIW5;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {p1}, LIW5;->access$getRecyclerView$p(LIW5;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "recyclerView"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {p1}, LIW5;->access$getEdgeMargin$p(LIW5;)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v1, p1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object p0, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LIW5$a;->c:LIW5;

    invoke-static {v0}, LIW5;->access$getAdapterData(LIW5;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/QCInspection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/QCInspection;

    if-eqz p1, :cond_6

    iget-object v0, p0, LIW5$a;->c:LIW5;

    iget-object v2, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setDescription(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v3

    sget-object v4, LIW5$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-ne v3, v4, :cond_1

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    move-object v3, v1

    goto :goto_1

    :cond_3
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-virtual {v2, v3}, Lco/bird/android/qualitycontrol/widgets/InspectionCardView;->setAccepted(Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getAssetId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0}, LIW5;->access$getLocalAssetManager$p(LIW5;)Lsu2;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/AssetManagerType;->REPAIR:Lco/bird/android/model/constant/AssetManagerType;

    sget-object v4, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    invoke-interface {v2, p1, v3, v4}, Lsu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;

    move-result-object p1

    iget-object v2, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {v2}, Lco/bird/android/qualitycontrol/widgets/InspectionCardView;->A()Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0}, LIW5;->access$getRecyclerView$p(LIW5;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "recyclerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v3, "ViewScopeProvider.from(this)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2, v0}, LYf5;->L(Lio/reactivex/F;Landroid/widget/ImageView;Lcom/uber/autodispose/ScopeProvider;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_5
    move-object p1, v1

    :goto_2
    if-nez p1, :cond_6

    iget-object p1, p0, LIW5$a;->b:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-virtual {p1}, Lco/bird/android/qualitycontrol/widgets/InspectionCardView;->A()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    return-void
.end method
