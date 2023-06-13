.class public final LEk3$N;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEk3;->P0(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEk3;


# direct methods
.method public constructor <init>(LEk3;)V
    .locals 0

    iput-object p1, p0, LEk3$N;->g:LEk3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)V
    .locals 2

    iget-object v0, p0, LEk3$N;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object v0

    new-instance v1, LQk3$a;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getMapButtonOverrides()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, LQk3$a;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, LRk3;->xd(LQk3;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BountyFlightSheetDetails;

    invoke-virtual {p0, p1}, LEk3$N;->a(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
