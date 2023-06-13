.class public final LKv0$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LKv0$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lpe2;",
        "b",
        "Lpe2;",
        "binding",
        "LuT2;",
        "c",
        "LuT2;",
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
        "SMAP\nConfigurableTutorialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$BulletListViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,188:1\n18#2:189\n9#3,4:190\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/ConfigurableTutorialAdapter$BulletListViewHolder\n*L\n155#1:189\n155#1:190,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lpe2;

.field public final c:LuT2;

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

    iput-object p1, p0, LKv0$a;->d:LKv0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lpe2;->a(Landroid/view/View;)Lpe2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKv0$a;->b:Lpe2;

    new-instance p1, LuT2;

    invoke-direct {p1}, LuT2;-><init>()V

    iput-object p1, p0, LKv0$a;->c:LuT2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LKv0$a;->d:LKv0;

    invoke-virtual {v1}, LKv0;->A()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, LKv0$a;->c:LuT2;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LKv0$a;->d:LKv0;

    invoke-virtual {v0}, LKv0;->B()Lio/reactivex/subjects/d;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LKv0$a;->d:LKv0;

    invoke-static {v0}, LKv0;->access$getAdapterData(LKv0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    if-eqz p1, :cond_1

    iget-object v0, p0, LKv0$a;->d:LKv0;

    iget-object v1, p0, LKv0$a;->b:Lpe2;

    invoke-virtual {v1}, Lpe2;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    iget-object v2, p0, LKv0$a;->c:LuT2;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v1, p0, LKv0$a;->c:LuT2;

    invoke-virtual {v0}, LKv0;->y()LPv0;

    move-result-object v0

    invoke-virtual {v0, p1}, LPv0;->a(Lco/bird/android/model/persistence/nestedstructures/TutorialPage;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_1
    return-void
.end method
