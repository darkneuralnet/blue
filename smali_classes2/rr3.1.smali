.class public final synthetic Lrr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lts3;

.field public final synthetic c:Lco/bird/android/model/persistence/BirdMapMarker;


# direct methods
.method public synthetic constructor <init>(Lts3;Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr3;->b:Lts3;

    iput-object p2, p0, Lrr3;->c:Lco/bird/android/model/persistence/BirdMapMarker;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrr3;->b:Lts3;

    iget-object v1, p0, Lrr3;->c:Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-static {v0, v1}, Lts3;->S0(Lts3;Lco/bird/android/model/persistence/BirdMapMarker;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
