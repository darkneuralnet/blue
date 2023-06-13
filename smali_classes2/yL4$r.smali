.class public final LyL4$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyL4;->P(Lco/bird/api/response/ReservationCancelResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LyL4;

.field public final synthetic h:Lco/bird/api/response/ReservationCancelResponse;


# direct methods
.method public constructor <init>(LyL4;Lco/bird/api/response/ReservationCancelResponse;)V
    .locals 0

    iput-object p1, p0, LyL4$r;->g:LyL4;

    iput-object p2, p0, LyL4$r;->h:Lco/bird/api/response/ReservationCancelResponse;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LyL4$r;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, LyL4$r;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getNavigator$p(LyL4;)Le13;

    move-result-object v0

    iget-object v1, p0, LyL4$r;->h:Lco/bird/api/response/ReservationCancelResponse;

    invoke-virtual {v1}, Lco/bird/api/response/ReservationCancelResponse;->getReservationIssues()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, LyL4$r;->h:Lco/bird/api/response/ReservationCancelResponse;

    invoke-virtual {v2}, Lco/bird/api/response/ReservationCancelResponse;->getReservation()Lco/bird/android/model/Reservation;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Reservation;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LI35;->f:LI35;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-interface {v0, v1, v2, v3}, Le13;->u4(Ljava/util/List;Ljava/lang/String;I)V

    return-void
.end method
