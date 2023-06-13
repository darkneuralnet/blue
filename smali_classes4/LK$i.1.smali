.class public final LLK$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->R0(Lco/bird/android/model/Vehicle;ZLorg/joda/time/DateTime;ZZ)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/Vehicle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Vehicle;

.field public final synthetic h:LLK;

.field public final synthetic i:Z

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/Vehicle;LLK;ZZ)V
    .locals 0

    iput-object p1, p0, LLK$i;->g:Lco/bird/android/model/Vehicle;

    iput-object p2, p0, LLK$i;->h:LLK;

    iput-boolean p3, p0, LLK$i;->i:Z

    iput-boolean p4, p0, LLK$i;->j:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)V
    .locals 2

    iget-object p1, p0, LLK$i;->g:Lco/bird/android/model/Vehicle;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    iget-object v0, p0, LLK$i;->h:LLK;

    invoke-static {v0}, LLK;->access$getReactiveConfig$p(LLK;)LTq4;

    move-result-object v0

    invoke-static {v0, p1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    iget-boolean v1, p0, LLK$i;->i:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, LLK$i;->j:Z

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Lco/bird/android/model/wire/WireBirdKt;->shouldTrackInRideBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {p1, v0}, Lco/bird/android/model/wire/WireBirdKt;->shouldTrackOutOfRideBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, LLK$i;->h:LLK;

    iget-object v0, p0, LLK$i;->g:Lco/bird/android/model/Vehicle;

    iget-boolean v1, p0, LLK$i;->j:Z

    invoke-virtual {p1, v0, v1}, LLK;->G2(Lco/bird/android/model/Vehicle;Z)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LLK$i;->a(Lco/bird/android/model/Vehicle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
