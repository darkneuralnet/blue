.class public final Lz11$L$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz11$L;->invoke(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lco/bird/android/model/destination/Destination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "address",
        "Lco/bird/android/model/destination/Destination;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lco/bird/android/model/destination/Destination;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireLocation;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireLocation;)V
    .locals 0

    iput-object p1, p0, Lz11$L$a;->g:Lco/bird/android/model/wire/WireLocation;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lco/bird/android/model/destination/Destination;
    .locals 7

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/destination/Destination;

    iget-object v1, p0, Lz11$L$a;->g:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v2

    iget-object v1, p0, Lz11$L$a;->g:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v4

    move-object v1, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/destination/Destination;-><init>(DDLjava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz11$L$a;->b(Ljava/lang/String;)Lco/bird/android/model/destination/Destination;

    move-result-object p1

    return-object p1
.end method
