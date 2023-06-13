.class public final synthetic LWT4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lco/bird/android/model/CompleteRideResponse;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/CompleteRideResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWT4;->b:Lco/bird/android/model/CompleteRideResponse;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LWT4;->b:Lco/bird/android/model/CompleteRideResponse;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LIT4$Q;->a(Lco/bird/android/model/CompleteRideResponse;Ljava/lang/Throwable;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p1

    return-object p1
.end method
