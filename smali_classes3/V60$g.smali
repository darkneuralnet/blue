.class public final LV60$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV60;->i(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/OperatorScanIntent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        "+",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001az\u00126\u0008\u0001\u00122\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00080\u0008 \u0003*<\u00126\u0008\u0001\u00122\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00080\u0008\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/persistence/Bird;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/DialogResponse;",
        "b",
        "(Lkotlin/Triple;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LV60;


# direct methods
.method public constructor <init>(LV60;)V
    .locals 0

    iput-object p1, p0, LV60$g;->g:LV60;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LV60$g;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Triple;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Unit;",
            "+",
            "Lco/bird/api/response/OpsBatchJobActionKind;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/DialogResponse;",
            "Lco/bird/api/response/OpsBatchJobActionKind;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, LV60$g;->g:LV60;

    invoke-static {v1}, LV60;->access$getUi$p(LV60;)LY60;

    move-result-object v2

    new-instance v3, LL60;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v1, "lastAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, p1, v0}, LL60;-><init>(ILco/bird/api/response/OpsBatchJobActionKind;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LV60$g$a;

    invoke-direct {v1, v0}, LV60$g$a;-><init>(Lco/bird/api/response/OpsBatchJobActionKind;)V

    new-instance v0, LW60;

    invoke-direct {v0, v1}, LW60;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LV60$g;->b(Lkotlin/Triple;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
