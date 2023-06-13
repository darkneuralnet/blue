.class public final LtC3$N$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3$N;->e(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LH31$b;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LH31$b;",
        "dialogResponse",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LH31$b;)Lio/reactivex/K;"
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

.field public final synthetic h:Lco/bird/api/response/WireBirdActionPairResponse;


# direct methods
.method public constructor <init>(LtC3;Lco/bird/api/response/WireBirdActionPairResponse;)V
    .locals 0

    iput-object p1, p0, LtC3$N$d;->g:LtC3;

    iput-object p2, p0, LtC3$N$d;->h:Lco/bird/api/response/WireBirdActionPairResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LH31$b;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH31$b;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/WireBirdActionPairResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "dialogResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LH31$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, LtC3$N$d;->g:LtC3;

    invoke-static {v0}, LtC3;->access$getExplicitParts$p(LtC3;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/PartKind;->CHASSIS:Lco/bird/android/model/constant/PartKind;

    check-cast p1, LH31$b$c;

    invoke-virtual {p1}, LH31$b$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LtC3$N$d;->g:LtC3;

    invoke-static {p1}, LtC3;->access$getUpdatedExplicitParts$p(LtC3;)LAG;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LtC3$N$d;->h:Lco/bird/api/response/WireBirdActionPairResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LtC3$N$d;->h:Lco/bird/api/response/WireBirdActionPairResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LH31$b;

    invoke-virtual {p0, p1}, LtC3$N$d;->a(LH31$b;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
