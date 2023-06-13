.class public final Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">",
        "Landroidx/recyclerview/widget/GridLayoutManager;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000c*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\rB\u001d\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "T",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "X",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "adapter",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V",
        "Y",
        "b",
        "flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Y:Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;


# instance fields
.field public final X:Landroidx/recyclerview/widget/RecyclerView$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;->Y:Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;->X:Landroidx/recyclerview/widget/RecyclerView$h;

    new-instance p1, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$a;

    invoke-direct {p1, p0}, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$a;-><init>(Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->x3(Landroidx/recyclerview/widget/GridLayoutManager$b;)V

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$h;
    .locals 0

    iget-object p0, p0, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;->X:Landroidx/recyclerview/widget/RecyclerView$h;

    return-object p0
.end method
