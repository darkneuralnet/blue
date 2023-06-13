.class public final synthetic LMV4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMV4;->b:Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;

    iput p2, p0, LMV4;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LMV4;->b:Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;

    iget v1, p0, LMV4;->c:I

    invoke-static {v0, v1}, Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;->P(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;I)V

    return-void
.end method
