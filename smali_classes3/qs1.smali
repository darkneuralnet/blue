.class public final Lqs1;
.super LwZ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LwZ<",
        "Lco/bird/android/model/FlightSheetButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000eR \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lqs1;",
        "LwZ;",
        "Lco/bird/android/model/FlightSheetButton;",
        "LEa;",
        "c",
        "LEa;",
        "e",
        "()LEa;",
        "setAnalyticsManager",
        "(LEa;)V",
        "analyticsManager",
        "LYs1;",
        "d",
        "LYs1;",
        "()LYs1;",
        "adapter",
        "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;",
        "Lw1;",
        "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;",
        "f",
        "()Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;",
        "layoutManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public c:LEa;

.field public final d:LYs1;

.field public final e:Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager<",
            "Lw1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LwZ;-><init>(Landroid/content/Context;)V

    invoke-static {}, LDJ0;->a()Lrs1$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context.applicationContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-interface {v0, v1}, Lrs1$a;->a(LlG2;)Lrs1;

    move-result-object v0

    invoke-interface {v0, p0}, Lrs1;->a(Lqs1;)V

    new-instance v0, LYs1;

    invoke-virtual {p0}, Lqs1;->e()LEa;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, LYs1;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;LEa;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lqs1;->d:LYs1;

    invoke-virtual {p0}, Lqs1;->d()LYs1;

    move-result-object v0

    new-instance v1, Lqs1$a;

    invoke-direct {v1, p0}, Lqs1$a;-><init>(Lqs1;)V

    invoke-virtual {v0, v1}, LYs1;->C(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;

    invoke-virtual {p0}, Lqs1;->d()LYs1;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;-><init>(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V

    iput-object v0, p0, Lqs1;->e:Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;

    return-void
.end method

.method public static final synthetic access$getOnClick(Lqs1;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-virtual {p0}, LwZ;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()LYs1;
    .locals 1

    iget-object v0, p0, Lqs1;->d:LYs1;

    return-object v0
.end method

.method public final e()LEa;
    .locals 1

    iget-object v0, p0, Lqs1;->c:LEa;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "analyticsManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager<",
            "Lw1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqs1;->e:Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;

    return-object v0
.end method

.method public bridge synthetic getAdapter()LyS0;
    .locals 1

    invoke-virtual {p0}, Lqs1;->d()LYs1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1

    invoke-virtual {p0}, Lqs1;->f()Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;

    move-result-object v0

    return-object v0
.end method
