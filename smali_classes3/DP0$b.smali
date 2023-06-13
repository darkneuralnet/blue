.class public final LDP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBW4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDP0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LDP0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LDP0$b;->b:LDP0$b;

    iput-object p1, p0, LDP0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LEP0;)V
    .locals 0

    invoke-direct {p0, p1}, LDP0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LDP0$b;->d(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;

    return-void
.end method

.method public b(Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, LDP0$b;->c(Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;)Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;

    return-void
.end method

.method public final c(Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;)Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;
    .locals 1

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LDP0$b;->f()LxX4;

    move-result-object v0

    invoke-static {p1, v0}, LzW4;->b(Lco/bird/android/feature/ridepass/v4/list/RidePassV4Activity;LxX4;)V

    return-object p1
.end method

.method public final d(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;)Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;
    .locals 1

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LDP0$b;->e()LbX4;

    move-result-object v0

    invoke-static {p1, v0}, LJW4;->b(Lco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsActivity;LbX4;)V

    return-object p1
.end method

.method public final e()LbX4;
    .locals 8

    new-instance v7, LbX4;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y1()LWU4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LWU4;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t()LAM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LAM3;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->W2()LiD1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LiD1;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LEa;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    iget-object v0, p0, LDP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LbX4;-><init>(LWU4;LAM3;LiD1;LEa;Le13;LTq4;)V

    return-object v7
.end method

.method public final f()LxX4;
    .locals 3

    new-instance v0, LxX4;

    iget-object v1, p0, LDP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->y1()LWU4;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWU4;

    iget-object v2, p0, LDP0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-direct {v0, v1, v2}, LxX4;-><init>(LWU4;Le13;)V

    return-object v0
.end method
