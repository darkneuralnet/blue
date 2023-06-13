.class public final synthetic LwJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LTJ4;

.field public final synthetic c:Lco/bird/android/model/RideRequirement;


# direct methods
.method public synthetic constructor <init>(LTJ4;Lco/bird/android/model/RideRequirement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwJ4;->b:LTJ4;

    iput-object p2, p0, LwJ4;->c:Lco/bird/android/model/RideRequirement;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LwJ4;->b:LTJ4;

    iget-object v1, p0, LwJ4;->c:Lco/bird/android/model/RideRequirement;

    invoke-static {v0, v1}, LTJ4;->B(LTJ4;Lco/bird/android/model/RideRequirement;)Lio/reactivex/u;

    move-result-object v0

    return-object v0
.end method
