.class public final LZx3$D;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZx3;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZx3;


# direct methods
.method public constructor <init>(LZx3;)V
    .locals 0

    iput-object p1, p0, LZx3$D;->g:LZx3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LZx3$D;->g:LZx3;

    invoke-static {p1}, LZx3;->access$getZoneManager$p(LZx3;)LQI6;

    move-result-object p1

    iget-object v0, p0, LZx3$D;->g:LZx3;

    invoke-static {v0}, LZx3;->access$getMapUi$p(LZx3;)Lco/bird/android/app/feature/map/ui/MapUi;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->viewport()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LQI6;->h0(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LZx3$D;->g:LZx3;

    invoke-static {v0}, LZx3;->access$getOperatorUi$p(LZx3;)LCw3;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LZx3$D;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
