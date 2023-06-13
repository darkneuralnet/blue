.class public final Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;->b(Landroid/view/View;Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;Lco/bird/android/model/constant/BirdAction;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;

.field public final synthetic h:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;

.field public final synthetic i:Lco/bird/android/model/constant/BirdAction;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;Lco/bird/android/model/constant/BirdAction;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->g:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;

    iput-object p2, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->h:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;

    iput-object p3, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->i:Lco/bird/android/model/constant/BirdAction;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 3

    iget-object p1, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->g:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;

    invoke-static {p1}, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;->access$getOptionsClicks$p(Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;)Lio/reactivex/subjects/d;

    move-result-object p1

    new-instance v0, Lkotlin/Pair;

    iget-object v1, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->h:Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;

    iget-object v2, p0, Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$b;->i:Lco/bird/android/model/constant/BirdAction;

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
