.class public final LpH2$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpH2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LpH2$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "b",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "entryView",
        "Lco/bird/android/model/SelectedRideButton;",
        "c",
        "Lco/bird/android/model/SelectedRideButton;",
        "selectedRideButton",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LpH2;Landroid/view/View;)V",
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
        "SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n18#2:132\n9#3,4:133\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder\n*L\n118#1:132\n118#1:133,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public c:Lco/bird/android/model/SelectedRideButton;

.field public final synthetic d:LpH2;


# direct methods
.method public constructor <init>(LpH2;Landroid/view/View;)V
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

    iput-object p1, p0, LpH2$b;->d:LpH2;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    move-object v0, p2

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, LpH2$b;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, LWh4;->button:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    new-instance v1, LpH2$b$a;

    invoke-direct {v1, p1}, LpH2$b$a;-><init>(LpH2;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    sget v0, LWh4;->radioButton:I

    invoke-static {p2, v0}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    if-eqz v0, :cond_1

    new-instance v1, LpH2$b$b;

    invoke-direct {v1, p0, p1}, LpH2$b$b;-><init>(LpH2$b;LpH2;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    new-instance v0, LpH2$b$c;

    invoke-direct {v0, p0, p1}, LpH2$b$c;-><init>(LpH2$b;LpH2;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LpH2$b;)Lco/bird/android/model/SelectedRideButton;
    .locals 0

    iget-object p0, p0, LpH2$b;->c:Lco/bird/android/model/SelectedRideButton;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 10

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, LpH2$b;->d:LpH2;

    invoke-static {v0}, LpH2;->access$getAdapterData(LpH2;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LuH2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LuH2;

    if-eqz p1, :cond_1

    iget-object v0, p0, LpH2$b;->d:LpH2;

    new-instance v9, Lco/bird/android/model/SelectedRideButton;

    invoke-virtual {p1}, LuH2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LuH2;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/SelectedRideButton;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, p0, LpH2$b;->c:Lco/bird/android/model/SelectedRideButton;

    iget-object v1, p0, LpH2$b;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v1}, LuH2;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    invoke-static {v0}, LpH2;->access$getManageGroupRidesBottomSheet$p(LpH2;)Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->X(Landroid/view/View;)V

    :cond_1
    return-void
.end method
