.class public final synthetic Lat3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUg3;


# instance fields
.field public final synthetic b:Lbt3;

.field public final synthetic c:Lco/bird/android/model/OperatorRideHistoryItem;

.field public final synthetic d:Lco/bird/android/model/wire/WireLocation;


# direct methods
.method public synthetic constructor <init>(Lbt3;Lco/bird/android/model/OperatorRideHistoryItem;Lco/bird/android/model/wire/WireLocation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat3;->b:Lbt3;

    iput-object p2, p0, Lat3;->c:Lco/bird/android/model/OperatorRideHistoryItem;

    iput-object p3, p0, Lat3;->d:Lco/bird/android/model/wire/WireLocation;

    return-void
.end method


# virtual methods
.method public final onMapReady(LcD1;)V
    .locals 3

    iget-object v0, p0, Lat3;->b:Lbt3;

    iget-object v1, p0, Lat3;->c:Lco/bird/android/model/OperatorRideHistoryItem;

    iget-object v2, p0, Lat3;->d:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v0, v1, v2, p1}, Lbt3;->a(Lbt3;Lco/bird/android/model/OperatorRideHistoryItem;Lco/bird/android/model/wire/WireLocation;LcD1;)V

    return-void
.end method
