.class public final Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;
.super Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;",
        "Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;",
        "",
        "layoutId",
        "Landroid/view/View;",
        "view",
        "LeT0;",
        "a",
        "Landroidx/recyclerview/widget/RecyclerView$o;",
        "q3",
        "<init>",
        "()V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;)LeT0;
    .locals 1

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lkk4;->item_status_message:I

    if-ne p1, v0, :cond_0

    new-instance p1, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;

    invoke-direct {p1, p0, p2}, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;-><init>(Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;->a(ILandroid/view/View;)LeT0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic getViewHolderForLayout(ILandroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;->a(ILandroid/view/View;)LeT0;

    move-result-object p1

    return-object p1
.end method

.method public q3()Landroidx/recyclerview/widget/RecyclerView$o;
    .locals 1

    new-instance v0, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$b;

    invoke-direct {v0}, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$b;-><init>()V

    return-object v0
.end method
