.class public final Lxz4$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz4;->N(Lco/bird/android/model/RepairType;Lco/bird/android/model/wire/WirePart;)V
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
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairTypeLock;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Issue;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/RepairTypeLock;",
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
        "SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lxz4;

.field public final synthetic h:Lco/bird/android/model/RepairType;


# direct methods
.method public constructor <init>(Lxz4;Lco/bird/android/model/RepairType;)V
    .locals 0

    iput-object p1, p0, Lxz4$r;->g:Lxz4;

    iput-object p2, p0, Lxz4$r;->h:Lco/bird/android/model/RepairType;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lxz4$r;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Issue;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Issue;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lxz4$r;->g:Lxz4;

    invoke-static {v1}, Lxz4;->access$getSupertypeSubject$p(Lxz4;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, Lxz4$r;->g:Lxz4;

    invoke-static {v0}, Lxz4;->access$getSelectedRepairsSubject$p(Lxz4;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lxz4$r;->h:Lco/bird/android/model/RepairType;

    invoke-virtual {p1}, Lco/bird/android/model/RepairType;->getIdToolDisplay()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lxz4$r;->g:Lxz4;

    invoke-static {v0}, Lxz4;->access$getUi$p(Lxz4;)LFz4;

    move-result-object v0

    invoke-interface {v0, p1}, LFz4;->h7(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
