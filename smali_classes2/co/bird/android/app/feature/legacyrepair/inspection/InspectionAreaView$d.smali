.class public final Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->setInspectionPoints(Ljava/util/List;)V
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
.field public final synthetic g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-static {v0}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->access$getBinding$p(Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;)Lur6;

    move-result-object v0

    iget-object v0, v0, Lur6;->b:Landroid/widget/CheckBox;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-static {p1}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->access$getBinding$p(Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;)Lur6;

    move-result-object p1

    iget-object p1, p1, Lur6;->b:Landroid/widget/CheckBox;

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LDf4;->mechanicRed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-static {p1}, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;->access$getBinding$p(Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;)Lur6;

    move-result-object p1

    iget-object p1, p1, Lur6;->b:Landroid/widget/CheckBox;

    iget-object v0, p0, Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$d;->g:Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LDf4;->mechanicBlack:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method
