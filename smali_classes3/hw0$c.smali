.class public final Lhw0$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhw0;->u(Liw0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Tutorial;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "tutorials",
        "",
        "Lco/bird/android/model/persistence/Tutorial;",
        "kotlin.jvm.PlatformType",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConfigurableTutorialGroupPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupPresenter.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupPresenter$consume$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lhw0;


# direct methods
.method public constructor <init>(Lhw0;)V
    .locals 0

    iput-object p1, p0, Lhw0$c;->g:Lhw0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lhw0$c;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lhw0$c;->g:Lhw0;

    new-instance v1, LrY3;

    const-string v2, "tutorials"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, LrY3;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/Tutorial;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getGroupTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lhw0$c;->g:Lhw0;

    new-instance v2, LWv5;

    invoke-direct {v2, v0}, LWv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getGroupMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lhw0$c;->g:Lhw0;

    new-instance v2, LVv5;

    invoke-direct {v2, v0}, LVv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getGroupButtonText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lhw0$c;->g:Lhw0;

    new-instance v2, LTv5;

    invoke-direct {v2, v0}, LTv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getGroupHeader()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lhw0$c;->g:Lhw0;

    new-instance v1, LUv5;

    invoke-direct {v1, p1}, LUv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
