.class public final Lco/bird/android/feature/ridepass/v2/list/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/ridepass/v2/list/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/ridepass/v2/list/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Integer;

.field public final d:Lco/bird/android/feature/ridepass/v2/list/a$b;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->d:Lco/bird/android/feature/ridepass/v2/list/a$b;

    iput-object p1, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    iput-object p3, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;LBP0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/feature/ridepass/v2/list/a$b;-><init>(LlG2;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ridepass/v2/list/a$b;->b(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;)Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v2/list/a$b;->c()LtW4;

    move-result-object v0

    invoke-static {p1, v0}, LOV4;->c(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;LtW4;)V

    new-instance v0, LPV4;

    invoke-direct {v0}, LPV4;-><init>()V

    invoke-static {p1, v0}, LOV4;->a(Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;LPV4;)V

    return-object p1
.end method

.method public final c()LtW4;
    .locals 11

    new-instance v10, LtW4;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y1()LWU4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LWU4;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t()LAM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LAM3;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->W2()LiD1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LiD1;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LEa;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k1()LRh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LRh6;

    new-instance v6, LRV4;

    invoke-direct {v6}, LRV4;-><init>()V

    iget-object v7, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->b:Ljava/lang/String;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Le13;

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v2/list/a$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LtW4;-><init>(LWU4;LAM3;LiD1;LEa;LRh6;LRV4;Ljava/lang/String;Le13;I)V

    return-object v10
.end method
