.class public final LFe0;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFe0$a;,
        LFe0$b;,
        LFe0$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 *2\u00020\u0001:\u0003+,\u0010B\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0016\u0010\u000e\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR0\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006-"
    }
    d2 = {
        "LFe0;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "",
        "LH6;",
        "sections",
        "",
        "u",
        "LYP3;",
        "c",
        "LYP3;",
        "w",
        "()LYP3;",
        "A",
        "(LYP3;)V",
        "peekHelper",
        "Lkotlin/Function0;",
        "d",
        "Lkotlin/jvm/functions/Function0;",
        "v",
        "()Lkotlin/jvm/functions/Function0;",
        "y",
        "(Lkotlin/jvm/functions/Function0;)V",
        "buttonClicks",
        "Lkotlin/Function1;",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "e",
        "Lkotlin/jvm/functions/Function1;",
        "x",
        "()Lkotlin/jvm/functions/Function1;",
        "B",
        "(Lkotlin/jvm/functions/Function1;)V",
        "vehicleDotClicks",
        "<init>",
        "()V",
        "f",
        "a",
        "b",
        "bulk-scanner_release"
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
        "SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"
    }
.end annotation


# static fields
.field public static final f:LFe0$a;


# instance fields
.field public c:LYP3;

.field public d:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFe0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFe0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFe0;->f:LFe0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LyS0;-><init>()V

    sget-object v0, LFe0$d;->g:LFe0$d;

    iput-object v0, p0, LFe0;->d:Lkotlin/jvm/functions/Function0;

    sget-object v0, LFe0$e;->g:LFe0$e;

    iput-object v0, p0, LFe0;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LFe0;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(LYP3;)V
    .locals 0

    iput-object p1, p0, LFe0;->c:LYP3;

    return-void
.end method

.method public final B(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LFe0;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LFe0;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LTj4;->item_scan_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LFe0$b;

    invoke-direct {p2, p0, p1}, LFe0$b;-><init>(LFe0;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Lmk4;->item_fleet_status_vehicle:I

    if-ne p2, v0, :cond_1

    new-instance p2, LFe0$c;

    invoke-direct {p2, p0, p1}, LFe0$c;-><init>(LFe0;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LGe0;

    invoke-direct {v0}, LGe0;-><init>()V

    return-object v0
.end method

.method public u(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH6;

    invoke-virtual {v3}, LH6;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ge v2, v0, :cond_1

    invoke-virtual {p0}, LMy;->getItemCount()I

    move-result v2

    if-lt v2, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-super {p0, p1}, LMy;->u(Ljava/util/Collection;)V

    if-eqz v1, :cond_2

    iget-object p1, p0, LFe0;->c:LYP3;

    if-eqz p1, :cond_2

    const-string v0, "vehicle"

    invoke-virtual {p1, v0}, LYP3;->i(Ljava/lang/CharSequence;)Z

    :cond_2
    return-void
.end method

.method public final v()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFe0;->d:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final w()LYP3;
    .locals 1

    iget-object v0, p0, LFe0;->c:LYP3;

    return-object v0
.end method

.method public final x()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFe0;->e:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final y(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LFe0;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method
