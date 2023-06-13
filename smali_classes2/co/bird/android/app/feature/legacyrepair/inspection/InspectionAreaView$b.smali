.class public final Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->d(Lco/bird/android/model/BirdInspectionPoint;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:Landroid/widget/CheckBox;

.field public final synthetic h:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

.field public final synthetic i:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/CheckBox;Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;Lio/reactivex/subjects/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/CheckBox;",
            "Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;",
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->g:Landroid/widget/CheckBox;

    iput-object p2, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->h:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    iput-object p3, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->i:Lio/reactivex/subjects/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->g:Landroid/widget/CheckBox;

    iget-object v1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->h:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LDf4;->mechanicRed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->g:Landroid/widget/CheckBox;

    iget-object v1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->h:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LDf4;->mechanicBlack:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$b;->i:Lio/reactivex/subjects/a;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method
