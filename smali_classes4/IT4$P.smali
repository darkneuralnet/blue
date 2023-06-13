.class public final LIT4$P;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->V3(Lco/bird/android/model/wire/WireRide;LbF0;LvT3;Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/CompleteRideResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "it",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/CompleteRideResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;

.field public final synthetic i:LbF0;

.field public final synthetic j:LvT3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvT3<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;LbF0;LvT3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIT4;",
            "Lco/bird/android/model/wire/WireRide;",
            "LbF0;",
            "LvT3<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LIT4$P;->g:LIT4;

    iput-object p2, p0, LIT4$P;->h:Lco/bird/android/model/wire/WireRide;

    iput-object p3, p0, LIT4$P;->i:LbF0;

    iput-object p4, p0, LIT4$P;->j:LvT3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LIT4$P;->g:LIT4;

    iget-object v0, p0, LIT4$P;->h:Lco/bird/android/model/wire/WireRide;

    iget-object v1, p0, LIT4$P;->i:LbF0;

    invoke-virtual {p1, v0, v1}, LIT4;->a0(Lco/bird/android/model/wire/WireRide;LbF0;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, LIT4$P;->j:LvT3;

    invoke-static {p1, v0}, LMm4;->n(Lio/reactivex/F;LvT3;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LIT4$P;->a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
