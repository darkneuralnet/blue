.class public final synthetic Lh95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/buava/Optional;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/buava/Optional;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh95;->b:Lco/bird/android/buava/Optional;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lh95;->b:Lco/bird/android/buava/Optional;

    invoke-static {v0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->a(Lco/bird/android/buava/Optional;)V

    return-void
.end method
