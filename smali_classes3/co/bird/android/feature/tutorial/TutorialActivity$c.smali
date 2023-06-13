.class public final Lco/bird/android/feature/tutorial/TutorialActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/tutorial/TutorialActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
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
.field public final synthetic g:Lco/bird/android/feature/tutorial/TutorialActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$c;->g:Lco/bird/android/feature/tutorial/TutorialActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/tutorial/TutorialActivity$c;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$c;->g:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {p1}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    iget-object p1, p1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iget-object v2, p0, Lco/bird/android/feature/tutorial/TutorialActivity$c;->g:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v2}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;

    move-result-object v2

    invoke-virtual {v2}, LDa6;->getItemCount()I

    move-result v2

    if-ge p1, v2, :cond_2

    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$c;->g:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {p1}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    iget-object p1, v0, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$c;->g:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {p1}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getTutorialFinishSubject$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lio/reactivex/subjects/g;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/g;->onSuccess(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
