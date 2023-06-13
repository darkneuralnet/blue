.class public final synthetic Lmd1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/manager/ride/EndRideManagerImpl;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd1;->b:Lco/bird/android/manager/ride/EndRideManagerImpl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmd1;->b:Lco/bird/android/manager/ride/EndRideManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/ride/EndRideManagerImpl;->G(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    return-void
.end method
