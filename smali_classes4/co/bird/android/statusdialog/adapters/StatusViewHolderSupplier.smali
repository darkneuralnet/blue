.class public Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/adapter/ViewHolderSupplier;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$b;,
        Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
        "LeT0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\t\u0010\n\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u00d6\u0001\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;",
        "Lco/bird/android/widget/adapter/ViewHolderSupplier;",
        "LeT0;",
        "",
        "layoutId",
        "Landroid/view/View;",
        "view",
        "a",
        "LF6;",
        "s2",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "<init>",
        "()V",
        "b",
        "c",
        "status-dialog_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$a;

    invoke-direct {v0}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$a;-><init>()V

    sput-object v0, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;)LeT0;
    .locals 0

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$c;

    invoke-direct {p1, p0, p2}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$c;-><init>(Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;Landroid/view/View;)V

    return-object p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic getViewHolderForLayout(ILandroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;->a(ILandroid/view/View;)LeT0;

    move-result-object p1

    return-object p1
.end method

.method public q3()Landroidx/recyclerview/widget/RecyclerView$o;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/adapter/ViewHolderSupplier$a;->a(Lco/bird/android/widget/adapter/ViewHolderSupplier;)Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    return-object v0
.end method

.method public s2()LF6;
    .locals 1

    new-instance v0, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$b;

    invoke-direct {v0}, Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$b;-><init>()V

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
