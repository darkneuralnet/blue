.class public final LeQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LeQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LeQ0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LeQ0$b;->b:LeQ0$b;

    iput-object p1, p0, LeQ0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LcQ0;)V
    .locals 0

    invoke-direct {p0, p1}, LeQ0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LeQ0$b;->b(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;
    .locals 1

    iget-object v0, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LeQ0$b;->d()LBy6;

    move-result-object v0

    invoke-static {p1, v0}, Lho5;->c(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;LBy6;)V

    invoke-virtual {p0}, LeQ0$b;->c()LAo5;

    move-result-object v0

    invoke-static {p1, v0}, Lho5;->b(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;LAo5;)V

    return-object p1
.end method

.method public final c()LAo5;
    .locals 5

    new-instance v0, LAo5;

    iget-object v1, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->x1()Llh6;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llh6;

    iget-object v3, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->K2()LSy6;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LSy6;

    iget-object v4, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->w2()Le13;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le13;

    invoke-direct {v0, v1, v2, v3, v4}, LAo5;-><init>(LO86;Llh6;LSy6;Le13;)V

    return-object v0
.end method

.method public final d()LBy6;
    .locals 5

    new-instance v0, LBy6;

    iget-object v1, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->x1()Llh6;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh6;

    iget-object v2, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->K2()LSy6;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSy6;

    iget-object v3, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    iget-object v4, p0, LeQ0$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->w2()Le13;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le13;

    invoke-direct {v0, v1, v2, v3, v4}, LBy6;-><init>(Llh6;LSy6;LTq4;Le13;)V

    return-object v0
.end method
