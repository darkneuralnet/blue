.class public final LyA4$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyA4;->a(Lco/bird/android/model/wire/WireBird;)V
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
        "Lco/bird/android/model/Issue;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/LegacyRepair;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/RepairType;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0082\u0001\u0010\u0006\u001a~\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002 \u0004*>\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/Issue;",
        "",
        "Lco/bird/android/model/LegacyRepair;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/RepairType;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LyA4;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LyA4;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LyA4$w;->g:LyA4;

    iput-object p2, p0, LyA4$w;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/Issue;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/LegacyRepair;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Issue;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v2, p0, LyA4$w;->g:LyA4;

    invoke-static {v2}, LyA4;->access$getNavigator$p(LyA4;)Le13;

    move-result-object v2

    iget-object v3, p0, LyA4$w;->h:Lco/bird/android/model/wire/WireBird;

    const-string v4, "repairs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "repairTypes"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3, v0, v1, p1}, Le13;->h1(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LyA4$w;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
