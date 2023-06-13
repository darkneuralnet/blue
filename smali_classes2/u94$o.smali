.class public final Lu94$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu94;->b(Landroid/content/Intent;)V
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
        "Lkotlin/Unit;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/PropertyReport;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/PropertyReport;",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lu94;


# direct methods
.method public constructor <init>(Lu94;)V
    .locals 0

    iput-object p1, p0, Lu94$o;->g:Lu94;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lu94$o;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/PropertyReport;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-object p1, p0, Lu94$o;->g:Lu94;

    invoke-static {p1}, Lu94;->access$getBirdManager$p(Lu94;)LaM;

    move-result-object v0

    iget-object p1, p0, Lu94$o;->g:Lu94;

    invoke-static {p1}, Lu94;->access$getBird$p(Lu94;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "bird"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v3, "reportId"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lu94$o;->g:Lu94;

    invoke-static {v3}, Lu94;->access$getSelectedAction$p(Lu94;)Lco/bird/android/model/PropertyReportAction;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "selectedAction"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    iget-object v4, p0, Lu94$o;->g:Lu94;

    invoke-static {v4}, Lu94;->access$getSelectedNextStep$p(Lu94;)Lco/bird/android/model/PropertyReportNextStep;

    move-result-object v4

    if-nez v4, :cond_2

    const-string v4, "selectedNextStep"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v1, p0, Lu94$o;->g:Lu94;

    invoke-static {v1}, Lu94;->access$getUi$p(Lu94;)Lz94;

    move-result-object v1

    invoke-interface {v1}, Lz94;->U()Ljava/lang/String;

    move-result-object v5

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, LaM;->K0(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/PropertyReportAction;Lco/bird/android/model/PropertyReportNextStep;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lu94$o$a;

    iget-object v1, p0, Lu94$o;->g:Lu94;

    invoke-direct {v0, v1}, Lu94$o$a;-><init>(Lu94;)V

    new-instance v1, Lv94;

    invoke-direct {v1, v0}, Lv94;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lu94$o;->b(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
