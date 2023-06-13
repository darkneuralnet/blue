.class public final Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;
.super Lco/bird/android/bottomsheet/BaseBottomSheet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/bottomsheet/BaseBottomSheet<",
        "Lco/bird/android/model/BottomSheetButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0011\u0008\u0016\u0012\u0006\u00103\u001a\u000202\u00a2\u0006\u0004\u00084\u00105B\u0019\u0008\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00084\u00108B!\u0008\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u00a2\u0006\u0004\u00084\u0010;J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0003H\u0016J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007J\u0014\u0010\u000e\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u0014\u0010\u000f\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u0014\u0010\u0010\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u0014\u0010\u0011\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u0014\u0010\u0012\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u001a\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002R(\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00030\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R$\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00148\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0011\u00101\u001a\u00020.8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100\u00a8\u0006="
    }
    d2 = {
        "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;",
        "Lco/bird/android/bottomsheet/BaseBottomSheet;",
        "Lco/bird/android/model/BottomSheetButton;",
        "LwZ;",
        "A",
        "",
        "D",
        "LRm;",
        "model",
        "",
        "h0",
        "",
        "LH6;",
        "sections",
        "d0",
        "c0",
        "e0",
        "f0",
        "g0",
        "Lkotlin/Function1;",
        "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
        "listener",
        "a0",
        "type",
        "b0",
        "",
        "n",
        "Ljava/util/Map;",
        "bottomSheets",
        "LPm;",
        "o",
        "LPm;",
        "areaConverter",
        "p",
        "Lkotlin/jvm/functions/Function1;",
        "typeListener",
        "<set-?>",
        "q",
        "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
        "Y",
        "()Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
        "bottomSheetType",
        "Lg46$b;",
        "w",
        "()Lg46$b;",
        "logger",
        "LYs1;",
        "Z",
        "()LYs1;",
        "flightSheetAdapter",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "a",
        "co.bird.android.feature.operator.bottomsheets"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
            "LwZ<",
            "+",
            "Lco/bird/android/model/BottomSheetButton;",
            ">;>;"
        }
    .end annotation
.end field

.field public final o:LPm;

.field public p:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x6

    new-array p1, p1, [Lkotlin/Pair;

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v2, LMm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, LMm;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->c:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v2, LF00;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, LF00;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p1, v2

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->d:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lqs1;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, p1, v3

    sget-object v2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->e:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v3, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, p1, v3

    sget-object v2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->f:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v3, LGy6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, LGy6;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, p1, v3

    sget-object v2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v3, LII6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, LII6;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, p1, v3

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->n:Ljava/util/Map;

    new-instance p1, LPm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v2}, LPm;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    sget-object p1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->p:Lkotlin/jvm/functions/Function1;

    iput-object v1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/bottomsheet/BaseBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x6

    new-array p1, p1, [Lkotlin/Pair;

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v1, LMm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LMm;-><init>(Landroid/content/Context;)V

    invoke-static {p2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, p1, v1

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->c:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v1, LF00;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LF00;-><init>(Landroid/content/Context;)V

    invoke-static {p2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v1, 0x1

    aput-object p2, p1, v1

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->d:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lqs1;

    invoke-static {p2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, p1, v2

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->e:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v2, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, p1, v2

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->f:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v2, LGy6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, LGy6;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, p1, v2

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v2, LII6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, LII6;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, p1, v2

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->n:Ljava/util/Map;

    new-instance p1, LPm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, LPm;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    sget-object p1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->p:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/bottomsheet/BaseBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x6

    new-array p1, p1, [Lkotlin/Pair;

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance p3, LMm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v1}, LMm;-><init>(Landroid/content/Context;)V

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x0

    aput-object p2, p1, p3

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->c:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance p3, LF00;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v1}, LF00;-><init>(Landroid/content/Context;)V

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    sget-object p2, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->d:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object p3

    const-string v1, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lqs1;

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v1, 0x2

    aput-object p3, p1, v1

    sget-object p3, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->e:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v1, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;-><init>(Landroid/content/Context;)V

    invoke-static {p3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v1, 0x3

    aput-object p3, p1, v1

    sget-object p3, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->f:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v1, LGy6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LGy6;-><init>(Landroid/content/Context;)V

    invoke-static {p3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v1, 0x4

    aput-object p3, p1, v1

    sget-object p3, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    new-instance v1, LII6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LII6;-><init>(Landroid/content/Context;)V

    invoke-static {p3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v1, 0x5

    aput-object p3, p1, v1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->n:Ljava/util/Map;

    new-instance p1, LPm;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p3}, LPm;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    sget-object p1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$b;

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->p:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    return-void
.end method

.method private final w()Lg46$b;
    .locals 2

    const-string v0, "BottomSheet"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"BottomSheet\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public A()LwZ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LwZ<",
            "+",
            "Lco/bird/android/model/BottomSheetButton;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqs1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lqs1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public D()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Y()Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    return-object v0
.end method

.method public final Z()LYs1;
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->n:Ljava/util/Map;

    sget-object v1, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->d:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, LwZ;

    invoke-virtual {v0}, LwZ;->getAdapter()LyS0;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type co.bird.android.flightsheet.v2.adapters.FlightSheetV2Adapter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LYs1;

    return-object v0
.end method

.method public final a0(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->p:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->w()Lg46$b;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Populating Adapter for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " sections"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->q:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LwZ;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->w()Lg46$b;

    move-result-object v1

    const-string v3, "Adapter found!"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->w()Lg46$b;

    move-result-object v1

    const-string v3, "Setting adapter to BottomSheet"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->setBottomSheetAdapter(LwZ;)V

    iget-object v1, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->p:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0, p2}, LwZ;->c(Ljava/util/List;)V

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->w()Lg46$b;

    move-result-object p1

    const-string p2, "Sliding bottom sheet up to become visible"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->W()V

    :cond_1
    return-void
.end method

.method public final c0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->c:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method

.method public final d0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->d:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method

.method public final e0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->e:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method

.method public final f0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->f:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method

.method public final g0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->g:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method

.method public final h0(LRm;)V
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    check-cast p1, Lgo;

    invoke-virtual {v0, p1}, LPm;->r(Lgo;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LMn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    check-cast p1, LMn;

    invoke-virtual {v0, p1}, LPm;->u(LMn;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Le01;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    check-cast p1, Le01;

    invoke-virtual {v0, p1}, LPm;->s(Le01;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LOj6;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    check-cast p1, LOj6;

    invoke-virtual {v0, p1}, LPm;->v(LOj6;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lds4;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->o:LPm;

    check-cast p1, Lds4;

    invoke-virtual {v0, p1}, LPm;->t(Lds4;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    sget-object v0, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;->b:Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;->b0(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;Ljava/util/List;)V

    return-void
.end method
