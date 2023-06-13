.class public final LJF3$C$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3$C;->invoke(Lkotlin/Triple;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LbF0;",
        "LFH3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LbF0;",
        "currentParkingNest",
        "LFH3;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LbF0;)LFH3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LJF3;

.field public final synthetic i:Lco/bird/android/model/RiderAreaState;


# direct methods
.method public constructor <init>(Ljava/lang/String;LJF3;Lco/bird/android/model/RiderAreaState;)V
    .locals 0

    iput-object p1, p0, LJF3$C$a;->g:Ljava/lang/String;

    iput-object p2, p0, LJF3$C$a;->h:LJF3;

    iput-object p3, p0, LJF3$C$a;->i:Lco/bird/android/model/RiderAreaState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LbF0;)LFH3;
    .locals 4

    const-string v0, "currentParkingNest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJF3$g;

    iget-object v1, p0, LJF3$C$a;->g:Ljava/lang/String;

    iget-object v2, p0, LJF3$C$a;->h:LJF3;

    invoke-static {v2}, LJF3;->access$getReactiveConfig$p(LJF3;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    iget-object v3, p0, LJF3$C$a;->i:Lco/bird/android/model/RiderAreaState;

    invoke-direct {v0, v1, v2, v3}, LJF3$g;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RiderAreaState;)V

    iget-object v1, p0, LJF3$C$a;->h:LJF3;

    invoke-static {v1}, LJF3;->access$maybeStartParkingStatusTrace(LJF3;)V

    iget-object v1, p0, LJF3$C$a;->h:LJF3;

    invoke-static {v1, p1, v0}, LJF3;->access$determineParkingStatus(LJF3;LbF0;LJF3$g;)LFH3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LbF0;

    invoke-virtual {p0, p1}, LJF3$C$a;->a(LbF0;)LFH3;

    move-result-object p1

    return-object p1
.end method
