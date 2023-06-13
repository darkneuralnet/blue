.class public final LAv4$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAv4;->V(LJv4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/ReleaseValidationResult;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/ReleaseValidationResult;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/ReleaseValidationResult;",
        "",
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
        "SMAP\nReleaseScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,360:1\n1747#2,3:361\n1054#2:364\n37#3,2:365\n*S KotlinDebug\n*F\n+ 1 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter$consume$3\n*L\n106#1:361,3\n110#1:364\n119#1:365,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LAv4;


# direct methods
.method public constructor <init>(LAv4;)V
    .locals 0

    iput-object p1, p0, LAv4$i;->g:LAv4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LAv4$i;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/ReleaseValidationResult;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/ReleaseValidationResult;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/ReleaseValidationResult;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getFailureReason()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LAv4$i;->g:LAv4;

    new-instance v1, LAv4$i$a;

    invoke-direct {v1, v0}, LAv4$i$a;-><init>(Lco/bird/android/model/wire/ReleaseValidationResult;)V

    invoke-virtual {p1, v1}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_1

    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/ReleaseValidationResult;

    invoke-virtual {v4}, Lco/bird/android/model/wire/ReleaseValidationResult;->getBirdId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lco/bird/android/model/wire/ReleaseValidationResult;->getBirdId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_4

    iget-object p1, p0, LAv4$i;->g:LAv4;

    invoke-static {p1}, LAv4;->access$getValidatedItemsRelay$p(LAv4;)Lma4;

    move-result-object p1

    new-instance v2, LAv4$i$b;

    invoke-direct {v2, v0}, LAv4$i$b;-><init>(Lco/bird/android/model/wire/ReleaseValidationResult;)V

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, LAv4$i;->g:LAv4;

    invoke-static {v1}, LAv4;->access$getValidatedItemsRelay$p(LAv4;)Lma4;

    move-result-object v1

    new-instance v2, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Collection;

    new-array v0, v3, [Lco/bird/android/model/wire/ReleaseValidationResult;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result p1

    new-array p1, p1, [Lco/bird/android/model/wire/ReleaseValidationResult;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
