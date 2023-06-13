.class public final Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "co/bird/android/widget/actions/OperatorTaskActionBottomSheet$a",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "",
        "onGlobalLayout",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;->b:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;->b:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-static {v0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->access$getBinding$p(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)LUZ;

    move-result-object v0

    iget-object v0, v0, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;->b:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-static {v0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->access$getBinding$p(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)LUZ;

    move-result-object v0

    iget-object v0, v0, LUZ;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;->b:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-static {v1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->access$getBinding$p(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)LUZ;

    move-result-object v1

    iget-object v1, v1, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x41a00000    # 20.0f

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method
