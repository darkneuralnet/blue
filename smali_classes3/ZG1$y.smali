.class public final LZG1$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZG1;->a(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "Ljava/util/Set<",
        "+",
        "Lco/bird/android/model/persistence/HardCountScan;",
        ">;+",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;+",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/HardCountScan;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\t \u0003*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00080\u0008 \u0003* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\t \u0003*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00080\u0008\u0018\u00010\u00070\u00072n\u0010\u0006\u001aj\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lwb4;",
        "",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/buava/Optional;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "",
        "LH6;",
        "a",
        "(Lwb4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZG1;


# direct methods
.method public constructor <init>(LZG1;)V
    .locals 0

    iput-object p1, p0, LZG1$y;->g:LZG1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "+",
            "Ljava/util/Set<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;+",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;+",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object v3, p0, LZG1$y;->g:LZG1;

    invoke-static {v3}, LZG1;->access$getConverter$p(LZG1;)LeF1;

    move-result-object v3

    const-string v4, "completedBirds"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "failedScanIdentifiers"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "pendingScanIdentifiers"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/HardCountScan;

    invoke-interface {v3, v0, v1, v2, p1}, LeF1;->a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LZG1$y;->a(Lwb4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
