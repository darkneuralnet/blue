.class public final LpH2;
.super LUl0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpH2$a;,
        LpH2$b;,
        LpH2$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001:\u0003#$\u0019B\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006%"
    }
    d2 = {
        "LpH2;",
        "LUl0;",
        "",
        "rideId",
        "",
        "w",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "LF6;",
        "r",
        "Lkotlin/Function1;",
        "Lco/bird/android/model/RideStatusBottomSheetButton;",
        "listener",
        "x",
        "button",
        "y",
        "Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;",
        "c",
        "Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;",
        "manageGroupRidesBottomSheet",
        "d",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "e",
        "Lkotlin/jvm/functions/Function1;",
        "onClickListener",
        "<init>",
        "()V",
        "a",
        "b",
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
        "SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n9#2,4:132\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter\n*L\n55#1:132,4\n*E\n"
    }
.end annotation


# instance fields
.field public c:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

.field public d:Landroidx/recyclerview/widget/RecyclerView;

.field public e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/RideStatusBottomSheetButton;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LUl0;-><init>()V

    sget-object v0, LpH2$d;->g:LpH2$d;

    iput-object v0, p0, LpH2;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LpH2;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getManageGroupRidesBottomSheet$p(LpH2;)Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;
    .locals 0

    iget-object p0, p0, LpH2;->c:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    return-object p0
.end method

.method public static final synthetic access$onClick(LpH2;Lco/bird/android/model/RideStatusBottomSheetButton;)V
    .locals 0

    invoke-virtual {p0, p1}, LpH2;->y(Lco/bird/android/model/RideStatusBottomSheetButton;)V

    return-void
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p1, p0, LpH2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    iput-object v0, p0, LpH2;->c:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, LsH2;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "recyclerView.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LsH2;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LpH2;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LIj4;->item_manage_group_rides_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LpH2$c;

    invoke-direct {p2, p0, p1}, LpH2$c;-><init>(LpH2;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LIj4;->item_manage_group_rides_entry:I

    if-ne p2, v0, :cond_1

    new-instance p2, LpH2$b;

    invoke-direct {p2, p0, p1}, LpH2$b;-><init>(LpH2;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, Lmk4;->item_button:I

    if-ne p2, v0, :cond_2

    new-instance p2, LpH2$a;

    invoke-direct {p2, p0, p1}, LpH2$a;-><init>(LpH2;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final w(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LMy;->getItemCount()I

    move-result v1

    if-ltz v1, :cond_4

    move v2, v0

    :goto_0
    invoke-virtual {p0, v2}, LMy;->p(I)LG6;

    move-result-object v3

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, LuH2;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, LuH2;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, LuH2;->c()Ljava/lang/String;

    move-result-object v5

    :cond_2
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    if-eq v2, v1, :cond_4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final x(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/RideStatusBottomSheetButton;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LpH2;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final y(Lco/bird/android/model/RideStatusBottomSheetButton;)V
    .locals 1

    iget-object v0, p0, LpH2;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
