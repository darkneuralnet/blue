.class public final LtC3$L;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->a()V
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
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "+",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a>\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008 \u0002*\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0018\u00010\u00070\u00072.\u0010\u0006\u001a*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "LH6;",
        "a",
        "(Lwb4;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$L;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)Lkotlin/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/model/persistence/Bird;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/BirdActionsAndSettings;",
            "Lco/bird/android/model/persistence/VehicleVersion;",
            ">;)",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/BirdActionsAndSettings;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/VehicleVersion;

    iget-object v3, p0, LtC3$L;->g:LtC3;

    invoke-virtual {v3}, LtC3;->Q0()Lq54;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lq54;->l(Ljava/lang/String;)Z

    move-result v3

    iget-object v4, p0, LtC3$L;->g:LtC3;

    invoke-virtual {v4}, LtC3;->N0()Lg46$b;

    move-result-object v4

    if-eqz v3, :cond_0

    const-string v3, "Showing"

    goto :goto_0

    :cond_0
    const-string v3, "Hiding"

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " the unpair button."

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v4, v3, v5}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, LtC3$L;->g:LtC3;

    const-string v4, "bird"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "vehicleVersion"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0, p1}, LtC3;->access$maybeTrackFirmwareUpdateAvailable(LtC3;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;)V

    iget-object v3, p0, LtC3$L;->g:LtC3;

    invoke-virtual {v3}, LtC3;->M0()LOA3;

    move-result-object v3

    const-string v4, "actionSettings"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0, p1, v2, v1}, LOA3;->a(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/BirdActionsAndSettings;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LtC3$L;->a(Lwb4;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
