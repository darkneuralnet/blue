.class public final LOo1$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOo1;->s(Ljava/lang/String;Ljava/lang/String;)V
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
        "Lco/bird/android/model/persistence/FleetList;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/FleetListSection;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/FleetListVehicle;",
        ">;>;>;+",
        "LuN5;",
        ">;",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t \u0006*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00020\u00022X\u0010\u0008\u001aT\u0012\u0004\u0012\u00020\u0001\u0012<\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00020\u0003 \u0006*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/persistence/FleetList;",
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/FleetListSection;",
        "Lco/bird/android/model/persistence/FleetListVehicle;",
        "kotlin.jvm.PlatformType",
        "LuN5;",
        "<name for destructuring parameter 0>",
        "LH6;",
        "a",
        "(Lkotlin/Triple;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOo1;


# direct methods
.method public constructor <init>(LOo1;)V
    .locals 0

    iput-object p1, p0, LOo1$m;->g:LOo1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/persistence/FleetList;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/FleetListSection;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetListVehicle;",
            ">;>;>;+",
            "LuN5;",
            ">;)",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/FleetList;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LuN5;

    iget-object v2, p0, LOo1$m;->g:LOo1;

    invoke-static {v2}, LOo1;->access$getConverter$p(LOo1;)Lvo1;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetList;->getMessage()Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;

    move-result-object v0

    const-string v3, "sections"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sortOrdering"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1, p1}, Lvo1;->a(Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;Ljava/util/List;LuN5;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LOo1$m;->a(Lkotlin/Triple;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
