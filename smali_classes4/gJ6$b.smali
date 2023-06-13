.class public final LgJ6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgJ6;->S0(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;",
        "zoneFlightSheetDetails",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LgJ6;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LgJ6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LgJ6$b;->g:LgJ6;

    iput-object p2, p0, LgJ6$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;)Lio/reactivex/h;
    .locals 2

    const-string v0, "zoneFlightSheetDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LgJ6$b;->g:LgJ6;

    invoke-static {v0}, LgJ6;->access$getZoneFlightSheetDao$p(LgJ6;)LMI6;

    move-result-object v0

    iget-object v1, p0, LgJ6$b;->h:Ljava/lang/String;

    invoke-static {p1, v1}, LJI6;->a(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    move-result-object p1

    invoke-virtual {v0, p1}, LMI6;->a(Lco/bird/android/model/persistence/ZoneFlightSheetDetails;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;

    invoke-virtual {p0, p1}, LgJ6$b;->a(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
