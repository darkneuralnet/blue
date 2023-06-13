.class public final LIE4$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIE4;->L(Ljava/lang/String;Ljava/lang/String;)V
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Repair;",
        "+",
        "Ljava/lang/Boolean;",
        ">;+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WirePart;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0004*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0004*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Repair;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "",
        "Lco/bird/android/model/wire/WirePart;",
        "e",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIE4;


# direct methods
.method public constructor <init>(LIE4;)V
    .locals 0

    iput-object p1, p0, LIE4$s;->g:LIE4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LIE4$s;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIE4$s;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(LIE4;Lco/bird/android/model/Repair;)V
    .locals 0

    invoke-static {p0, p1}, LIE4$s;->g(LIE4;Lco/bird/android/model/Repair;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LIE4$s;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final g(LIE4;Lco/bird/android/model/Repair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$repair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LIE4;->access$getRepairSelectionOverrideSubject$p(LIE4;)Lio/reactivex/subjects/d;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final e(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Repair;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Repair;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1}, Lco/bird/android/model/Repair;->getPartKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v2

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    iget-object v0, p0, LIE4$s;->g:LIE4;

    invoke-static {v0}, LIE4;->access$getUi$p(LIE4;)LSE4;

    move-result-object v0

    invoke-virtual {v0, v2}, LSE4;->Sl(Lco/bird/android/model/constant/PartKind;)Lio/reactivex/p;

    move-result-object v0

    new-instance v2, LIE4$s$a;

    iget-object v3, p0, LIE4$s;->g:LIE4;

    invoke-direct {v2, v3}, LIE4$s$a;-><init>(LIE4;)V

    new-instance v3, LLE4;

    invoke-direct {v3, v2}, LLE4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/p;->x(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    new-instance v2, LIE4$s$b;

    iget-object v3, p0, LIE4$s;->g:LIE4;

    invoke-direct {v2, v3, p1}, LIE4$s$b;-><init>(LIE4;Lco/bird/android/model/wire/WireBird;)V

    new-instance p1, LME4;

    invoke-direct {p1, v2}, LME4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->x(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    iget-object v0, p0, LIE4$s;->g:LIE4;

    new-instance v2, LNE4;

    invoke-direct {v2, v0, v1}, LNE4;-><init>(LIE4;Lco/bird/android/model/Repair;)V

    invoke-virtual {p1, v2}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object p1

    new-instance v0, LIE4$s$c;

    iget-object v2, p0, LIE4$s;->g:LIE4;

    invoke-direct {v0, v2, v1}, LIE4$s$c;-><init>(LIE4;Lco/bird/android/model/Repair;)V

    new-instance v1, LOE4;

    invoke-direct {v1, v0}, LOE4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LIE4$s;->e(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
