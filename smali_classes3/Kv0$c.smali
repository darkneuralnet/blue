.class public final LKv0$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001b\u0010\u0011\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "LKv0$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Lre2;",
        "b",
        "Lre2;",
        "binding",
        "LZe4;",
        "c",
        "Lkotlin/Lazy;",
        "a",
        "()LZe4;",
        "adapter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LKv0;Landroid/view/View;)V",
        "co.bird.android.feature.configurabletutorial"
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
        "SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$QuizViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$QuizViewHolder\n*L\n124#1:189\n124#1:190,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lre2;

.field public final c:Lkotlin/Lazy;

.field public final synthetic d:LKv0;


# direct methods
.method public constructor <init>(LKv0;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKv0$c;->d:LKv0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lre2;->a(Landroid/view/View;)Lre2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKv0$c;->b:Lre2;

    sget-object p1, LKv0$c$a;->g:LKv0$c$a;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LKv0$c;->c:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final a()LZe4;
    .locals 1

    iget-object v0, p0, LKv0$c;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZe4;

    return-object v0
.end method

.method public bind(I)V
    .locals 5

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, LKv0$c;->d:LKv0;

    invoke-static {v0}, LKv0;->access$getAdapterData(LKv0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p0, LKv0$c;->d:LKv0;

    invoke-virtual {v3}, LKv0;->C()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p0}, LKv0$c;->a()LZe4;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LKv0$c;->d:LKv0;

    invoke-virtual {v1}, LKv0;->D()Lio/reactivex/subjects/d;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, LKv0$c;->d:LKv0;

    iget-object v1, p0, LKv0$c;->b:Lre2;

    iget-object v1, v1, Lre2;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, ""

    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LKv0$c;->b:Lre2;

    iget-object v1, v1, Lre2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v3, "binding.image"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    const/4 v4, 0x2

    invoke-static {v1, v3, v2, v4, v2}, LqD2;->setMedia$default(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;ILjava/lang/Object;)V

    iget-object v1, p0, LKv0$c;->b:Lre2;

    iget-object v1, v1, Lre2;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, LKv0$c;->a()LZe4;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, LKv0$c;->a()LZe4;

    move-result-object v1

    invoke-virtual {p1}, LKv0;->y()LPv0;

    move-result-object p1

    invoke-virtual {p1, v0}, LPv0;->a(Lco/bird/android/model/persistence/nestedstructures/TutorialPage;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_3
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    iget-object v0, p0, LKv0$c;->d:LKv0;

    invoke-virtual {p0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LKv0$c;->b:Lre2;

    iget-object v2, v2, Lre2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v3, "binding.image"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, LKv0;->access$startAnimation(LKv0;Ljava/lang/Integer;Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lw1;->onDetachedFromWindow()V

    iget-object v0, p0, LKv0$c;->d:LKv0;

    invoke-virtual {v0}, LKv0;->D()Lio/reactivex/subjects/d;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
