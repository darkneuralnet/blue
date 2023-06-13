.class public final LcR1$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1;->W0(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;)V
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
        "Lco/bird/android/model/wire/WirePart;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WirePart;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WirePart;",
        "swappedParts",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LcR1;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:[Lco/bird/android/model/wire/WirePart;


# direct methods
.method public constructor <init>(LcR1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;)V
    .locals 0

    iput-object p1, p0, LcR1$h;->g:LcR1;

    iput-object p2, p0, LcR1$h;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LcR1$h;->i:[Lco/bird/android/model/wire/WirePart;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LcR1;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-static {p0, p1}, LcR1$h;->e(LcR1;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LcR1$h;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcR1$h;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(LcR1;Lco/bird/android/model/wire/WireBird;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LcR1;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WirePart;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/util/List;)Lio/reactivex/K;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation

    const-string v0, "swappedParts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LcR1$h;->g:LcR1;

    invoke-static {v0}, LcR1;->access$getOption(LcR1;)Lco/bird/android/model/IdToolOption;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/IdToolOption;->BRAIN:Lco/bird/android/model/IdToolOption;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, LcR1$h;->g:LcR1;

    invoke-static {v1}, LcR1;->access$getBrainSwapManager$p(LcR1;)Ln10;

    move-result-object v1

    iget-object v2, p0, LcR1$h;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ln10;->h0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, LcR1$h;->g:LcR1;

    invoke-static {v1}, LcR1;->access$getBrainSwapManager$p(LcR1;)Ln10;

    move-result-object v1

    new-instance v11, Lco/bird/android/model/persistence/BrainSwapRecord;

    iget-object v3, p0, LcR1$h;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, LcR1$h;->i:[Lco/bird/android/model/wire/WirePart;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lco/bird/android/model/wire/WirePart;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object v3, p0, LcR1$h;->i:[Lco/bird/android/model/wire/WirePart;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WirePart;->getKey()Ljava/lang/String;

    move-result-object v6

    iget-object v2, p0, LcR1$h;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v7

    iget-object v2, p0, LcR1$h;->i:[Lco/bird/android/model/wire/WirePart;

    invoke-static {v2}, Lkotlin/collections/ArraysKt;->first([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WirePart;

    invoke-static {v2}, LvC6;->a(Lco/bird/android/model/wire/WirePart;)Lco/bird/android/model/persistence/nestedstructures/Part;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v10

    const-string v2, "now()"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lco/bird/android/model/persistence/BrainSwapRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Part;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    invoke-interface {v1, v11}, Ln10;->l0(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LcR1$h;->g:LcR1;

    iget-object v2, p0, LcR1$h;->h:Lco/bird/android/model/wire/WireBird;

    new-instance v3, LhR1;

    invoke-direct {v3, v1, v2}, LhR1;-><init>(LcR1;Lco/bird/android/model/wire/WireBird;)V

    invoke-virtual {v0, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LcR1$h;->g:LcR1;

    invoke-static {v1}, LcR1;->access$getUi(LcR1;)LGR1;

    move-result-object v2

    new-instance v3, Lv10;

    iget-object v1, p0, LcR1$h;->g:LcR1;

    invoke-static {v1}, LcR1;->access$getBrainSwapTimeoutMin(LcR1;)I

    move-result v1

    invoke-direct {v3, v1}, Lv10;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LcR1$h$a;

    iget-object v3, p0, LcR1$h;->g:LcR1;

    invoke-direct {v2, v3}, LcR1$h$a;-><init>(LcR1;)V

    new-instance v3, LiR1;

    invoke-direct {v3, v2}, LiR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LcR1$h$b;

    invoke-direct {v2, p1}, LcR1$h$b;-><init>(Ljava/util/List;)V

    new-instance p1, LjR1;

    invoke-direct {p1, v2}, LjR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LcR1$h;->d(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
