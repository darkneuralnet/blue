.class public interface abstract Lco/bird/android/widget/adapter/ViewHolderSupplier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/adapter/ViewHolderSupplier$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001f\u0010\u0008\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/widget/adapter/ViewHolderSupplier;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "T",
        "Landroid/os/Parcelable;",
        "",
        "layoutId",
        "Landroid/view/View;",
        "view",
        "getViewHolderForLayout",
        "(ILandroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;",
        "LF6;",
        "s2",
        "Landroidx/recyclerview/widget/RecyclerView$o;",
        "q3",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract getViewHolderForLayout(ILandroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract q3()Landroidx/recyclerview/widget/RecyclerView$o;
.end method

.method public abstract s2()LF6;
.end method
