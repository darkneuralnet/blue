.class public final Llw3$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llw3;->z(Ltw3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;",
        "kotlin.jvm.PlatformType",
        "task",
        "",
        "a",
        "(Lco/bird/android/model/persistence/nestedstructures/OperatorTask;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorTaskListV2FragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n223#2,2:113\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$4\n*L\n77#1:113,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Llw3;


# direct methods
.method public constructor <init>(Llw3;)V
    .locals 0

    iput-object p1, p0, Llw3$j;->g:Llw3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/nestedstructures/OperatorTask;)V
    .locals 6

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getActions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/constant/BirdTaskAction;

    sget-object v2, Lco/bird/android/model/constant/BirdTaskAction;->Companion:Lco/bird/android/model/constant/BirdTaskAction$Companion;

    invoke-virtual {v2}, Lco/bird/android/model/constant/BirdTaskAction$Companion;->getCANCEL_ACTIONS()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Llw3$j;->g:Llw3;

    new-instance v2, LaA5;

    new-instance v3, LSc0;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getBirdCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;->getTaskId()Ljava/lang/String;

    move-result-object p1

    sget-object v5, Lco/bird/android/model/constant/BirdTaskAction;->CANCEL_TASK_DIRECT:Lco/bird/android/model/constant/BirdTaskAction;

    if-ne v1, v5, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v3, v4, p1, v1}, LSc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v2, v3}, LaA5;-><init>(LSc0;)V

    invoke-virtual {v0, v2}, Lf1;->h(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    invoke-virtual {p0, p1}, Llw3$j;->a(Lco/bird/android/model/persistence/nestedstructures/OperatorTask;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
