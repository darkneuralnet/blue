.class public final LOI$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOI;->e(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lokhttp3/ResponseBody;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lokhttp3/ResponseBody;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lio/reactivex/h;"
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

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;

.field public final synthetic i:Lco/bird/android/model/persistence/VehicleVersion;

.field public final synthetic j:LXn1$a;


# direct methods
.method public constructor <init>(LOI;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;LXn1$a;)V
    .locals 0

    iput-object p1, p0, LOI$c;->g:LOI;

    iput-object p2, p0, LOI$c;->h:Lco/bird/android/model/persistence/Bird;

    iput-object p3, p0, LOI$c;->i:Lco/bird/android/model/persistence/VehicleVersion;

    iput-object p4, p0, LOI$c;->j:LXn1$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lokhttp3/ResponseBody;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LOI$c;->g:LOI;

    iget-object v2, p0, LOI$c;->h:Lco/bird/android/model/persistence/Bird;

    iget-object v3, p0, LOI$c;->i:Lco/bird/android/model/persistence/VehicleVersion;

    iget-object v4, p0, LOI$c;->j:LXn1$a;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/ResponseBody;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokhttp3/ResponseBody;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v6, p1

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    move-object v5, v0

    invoke-static/range {v1 .. v6}, LOI;->access$setupFirmwareUpdateState(LOI;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;LXn1$a;Ljava/io/InputStream;Ljava/lang/Long;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LOI$c;->a(LHM4;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
