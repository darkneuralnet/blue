.class public final Lhs2$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhs2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhs2$c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhs2$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;",
        "b",
        "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;",
        "inspectionCard",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lhs2;Landroid/view/View;)V",
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
        "SMAP\nListQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$InspectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n41#4:120\n1#5:121\n*S KotlinDebug\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$InspectionItemViewHolder\n*L\n71#1:115\n71#1:116,4\n81#1:120\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

.field public final synthetic c:Lhs2;


# direct methods
.method public constructor <init>(Lhs2;Landroid/view/View;)V
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

    iput-object p1, p0, Lhs2$c;->c:Lhs2;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    iput-object p2, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    new-instance v0, Lhs2$c$a;

    invoke-direct {v0, p1, p0}, Lhs2$c$a;-><init>(Lhs2;Lhs2$c;)V

    invoke-virtual {p2, v0}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->C(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Lhs2$c;->c:Lhs2;

    invoke-static {v0}, Lhs2;->access$getAdapterData(Lhs2;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

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

    iget-object v0, p0, Lhs2$c;->c:Lhs2;

    iget-object v2, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setDescription(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object v3

    sget-object v4, Lhs2$c$b;->$EnumSwitchMapping$0:[I

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
    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setAccepted(Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getAssetId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lhs2;->access$getLocalAssetManager$p(Lhs2;)Lsu2;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/AssetManagerType;->REPAIR:Lco/bird/android/model/constant/AssetManagerType;

    sget-object v4, Lco/bird/android/model/constant/TaskPriority;->IMMEDIATE:Lco/bird/android/model/constant/TaskPriority;

    invoke-interface {v2, p1, v3, v4}, Lsu2;->a(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Lco/bird/android/model/constant/TaskPriority;)Lio/reactivex/F;

    move-result-object p1

    iget-object v2, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {v2}, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;->E()Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0}, Lhs2;->access$getRecyclerView$p(Lhs2;)Landroidx/recyclerview/widget/RecyclerView;

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

    iget-object p1, p0, Lhs2$c;->b:Lco/bird/android/widget/standardcomponents/InspectionV2CardView;

    invoke-virtual {p1}, Lco/bird/android/widget/standardcomponents/InspectionV2CardView;->E()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    return-void
.end method
