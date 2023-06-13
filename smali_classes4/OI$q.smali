.class public final LOI$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOI;->w0(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "count",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Long;)Lio/reactivex/h;",
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
.field public final synthetic g:LOI;

.field public final synthetic h:Lco/bird/android/model/VehicleDescriptor;

.field public final synthetic i:[B

.field public final synthetic j:LXn1$b;


# direct methods
.method public constructor <init>(LOI;Lco/bird/android/model/VehicleDescriptor;[BLXn1$b;)V
    .locals 0

    iput-object p1, p0, LOI$q;->g:LOI;

    iput-object p2, p0, LOI$q;->h:Lco/bird/android/model/VehicleDescriptor;

    iput-object p3, p0, LOI$q;->i:[B

    iput-object p4, p0, LOI$q;->j:LXn1$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Lio/reactivex/h;
    .locals 8

    const-string v0, "count"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BirdAirOTAUpdate.initiatePCMUpdate.count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int p1, v0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object v1, p0, LOI$q;->g:LOI;

    const-wide/16 v2, 0x1f4

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, p1}, Lio/reactivex/c;->c0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v2

    const-string p1, "timer(PCM_FIRMWARE_MPC_R\u2026S, TimeUnit.MILLISECONDS)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LOI$q;->j:LXn1$b;

    const-string v4, "pcm_did_not_receive_mpc_response"

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, LOI;->a0(LOI;Lio/reactivex/c;LXn1$b;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOI$q;->g:LOI;

    invoke-static {p1}, LOI;->access$getRxBleBirdBluetoothManager$p(LOI;)Lrd5;

    move-result-object p1

    iget-object v0, p0, LOI$q;->h:Lco/bird/android/model/VehicleDescriptor;

    iget-object v1, p0, LOI$q;->i:[B

    invoke-interface {p1, v0, v1}, Lrd5;->f(Lco/bird/android/model/VehicleDescriptor;[B)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LOI$q;->invoke(Ljava/lang/Long;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
