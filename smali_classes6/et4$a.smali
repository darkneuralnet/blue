.class public final Let4$a;
.super Lio/reactivex/android/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Let4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0008\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Let4$a;",
        "Lio/reactivex/android/a;",
        "",
        "d",
        "Landroidx/recyclerview/widget/RecyclerView$t;",
        "c",
        "Landroidx/recyclerview/widget/RecyclerView$t;",
        "g",
        "()Landroidx/recyclerview/widget/RecyclerView$t;",
        "scrollListener",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Lio/reactivex/D;",
        "Ldt4;",
        "observer",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView;Lio/reactivex/D;)V",
        "rxbinding-recyclerview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final c:Landroidx/recyclerview/widget/RecyclerView$t;

.field public final d:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/reactivex/D;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lio/reactivex/D<",
            "-",
            "Ldt4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/android/a;-><init>()V

    iput-object p1, p0, Let4$a;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Let4$a$a;

    invoke-direct {p1, p0, p2}, Let4$a$a;-><init>(Let4$a;Lio/reactivex/D;)V

    iput-object p1, p0, Let4$a;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Let4$a;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Let4$a;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method

.method public final g()Landroidx/recyclerview/widget/RecyclerView$t;
    .locals 1

    iget-object v0, p0, Let4$a;->c:Landroidx/recyclerview/widget/RecyclerView$t;

    return-object v0
.end method
