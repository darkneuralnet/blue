.class public final LoG1$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG1;->e0(Lco/bird/api/request/HardCountCreateRequest;LHM4;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/HardCountScan;",
        "hardCountScan",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoG1;


# direct methods
.method public constructor <init>(LoG1;)V
    .locals 0

    iput-object p1, p0, LoG1$o;->g:LoG1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/h;
    .locals 14

    const-string v0, "hardCountScan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/HardCountScan;->getLapId()J

    move-result-wide v0

    iget-object v2, p0, LoG1$o;->g:LoG1;

    invoke-static {v2}, LoG1;->access$getCurrentLapId$p(LoG1;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LoG1$o;->g:LoG1;

    invoke-static {v0}, LoG1;->access$incrementCurrentLapScanCount(LoG1;)V

    iget-object v0, p0, LoG1$o;->g:LoG1;

    invoke-static {v0}, LoG1;->access$getHardCountScanDao$p(LoG1;)LlH1;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v1, p0, LoG1$o;->g:LoG1;

    invoke-static {v1}, LoG1;->access$getCurrentLapId$p(LoG1;)J

    move-result-wide v9

    const/4 v11, 0x0

    const/16 v12, 0x17f

    const/4 v13, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, Lco/bird/android/model/persistence/HardCountScan;->copy$default(Lco/bird/android/model/persistence/HardCountScan;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;JZILjava/lang/Object;)Lco/bird/android/model/persistence/HardCountScan;

    move-result-object p1

    invoke-virtual {v0, p1}, LlH1;->e(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/HardCountScan;

    invoke-virtual {p0, p1}, LoG1$o;->a(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
