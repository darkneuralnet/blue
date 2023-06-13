.class public final LAT1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAT1;->i(Lco/bird/android/model/identification/IdentificationRequestIdentifier;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LZV1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZV1;",
        "kotlin.jvm.PlatformType",
        "state",
        "",
        "a",
        "(LZV1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAT1;


# direct methods
.method public constructor <init>(LAT1;)V
    .locals 0

    iput-object p1, p0, LAT1$f;->g:LAT1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZV1;)V
    .locals 3

    iget-object v0, p0, LAT1$f;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getApiResponseIdentificationStatusRelay$p(LAT1;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    const-string v2, "state"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v0, v2}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LAT1$f;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getUploadingInBackgroundIdentificationStatusRelay$p(LAT1;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LAT1$f;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getMutableIdentificationStatus$p(LAT1;)La94;

    move-result-object v0

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LAT1$f;->g:LAT1;

    invoke-static {v0, p1}, LAT1;->access$maybeTrackResultReturned(LAT1;LZV1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZV1;

    invoke-virtual {p0, p1}, LAT1$f;->a(LZV1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
