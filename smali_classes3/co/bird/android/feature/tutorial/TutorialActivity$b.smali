.class public final Lco/bird/android/feature/tutorial/TutorialActivity$b;
.super Landroidx/recyclerview/widget/RecyclerView$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/tutorial/TutorialActivity;->onCreate(Landroid/os/Bundle;)V
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
        "co/bird/android/feature/tutorial/TutorialActivity$b",
        "Landroidx/recyclerview/widget/RecyclerView$j;",
        "",
        "onChanged",
        "co.bird.android.feature.tutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/feature/tutorial/TutorialActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/tutorial/TutorialActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/tutorial/TutorialActivity$b;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$j;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity$b;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v0}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;

    move-result-object v0

    invoke-virtual {v0}, LDa6;->getItemCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lco/bird/android/feature/tutorial/TutorialActivity$b;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v0}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lo6;->d:Lme/relex/circleindicator/CircleIndicator3;

    iget-object v3, p0, Lco/bird/android/feature/tutorial/TutorialActivity$b;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v3}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getAdapter$p(Lco/bird/android/feature/tutorial/TutorialActivity;)LDa6;

    move-result-object v3

    invoke-virtual {v3}, LDa6;->getItemCount()I

    move-result v3

    iget-object v4, p0, Lco/bird/android/feature/tutorial/TutorialActivity$b;->a:Lco/bird/android/feature/tutorial/TutorialActivity;

    invoke-static {v4}, Lco/bird/android/feature/tutorial/TutorialActivity;->access$getBinding$p(Lco/bird/android/feature/tutorial/TutorialActivity;)Lo6;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    iget-object v1, v1, Lo6;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result v1

    invoke-virtual {v0, v3, v1}, Lme/relex/circleindicator/CircleIndicator3;->f(II)V

    :cond_2
    return-void
.end method
