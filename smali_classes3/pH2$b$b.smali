.class public final LpH2$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpH2$b;-><init>(LpH2;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LpH2$b;

.field public final synthetic h:LpH2;


# direct methods
.method public constructor <init>(LpH2$b;LpH2;)V
    .locals 0

    iput-object p1, p0, LpH2$b$b;->g:LpH2$b;

    iput-object p2, p0, LpH2$b$b;->h:LpH2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LpH2$b$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LpH2$b$b;->g:LpH2$b;

    invoke-static {p1}, LpH2$b;->a(LpH2$b;)Lco/bird/android/model/SelectedRideButton;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LpH2$b$b;->h:LpH2;

    invoke-static {v0, p1}, LpH2;->access$onClick(LpH2;Lco/bird/android/model/RideStatusBottomSheetButton;)V

    :cond_0
    return-void
.end method
