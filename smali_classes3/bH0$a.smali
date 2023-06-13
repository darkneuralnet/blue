.class public final LbH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsP;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LbH0$a;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LbH0$a;->b:LbH0$a;

    iput-object p1, p0, LbH0$a;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LaH0;)V
    .locals 0

    invoke-direct {p0, p1}, LbH0$a;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LbH0$a;->g(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;

    return-void
.end method

.method public b(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LbH0$a;->i(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;)Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;

    return-void
.end method

.method public c(Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LbH0$a;->h(Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;)Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;

    return-void
.end method

.method public final d()Lco/bird/android/feature/birdplus/v1/details/a;
    .locals 8

    new-instance v7, Lco/bird/android/feature/birdplus/v1/details/a;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->L()LJQ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LJQ;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->t()LAM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LAM3;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->W2()LiD1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LiD1;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LEa;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/feature/birdplus/v1/details/a;-><init>(LJQ;LAM3;LiD1;LEa;Le13;LTq4;)V

    return-object v7
.end method

.method public final e()LFQ;
    .locals 4

    new-instance v0, LFQ;

    iget-object v1, p0, LbH0$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->L()LJQ;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJQ;

    iget-object v2, p0, LbH0$a;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LbH0$a;->a:LlG2;

    invoke-interface {v3}, LlG2;->d0()LEa;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEa;

    invoke-direct {v0, v1, v2, v3}, LFQ;-><init>(LJQ;Le13;LEa;)V

    return-object v0
.end method

.method public final f()LdR;
    .locals 4

    new-instance v0, LdR;

    iget-object v1, p0, LbH0$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->L()LJQ;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJQ;

    iget-object v2, p0, LbH0$a;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LbH0$a;->a:LlG2;

    invoke-interface {v3}, LlG2;->d0()LEa;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEa;

    invoke-direct {v0, v1, v2, v3}, LdR;-><init>(LJQ;Le13;LEa;)V

    return-object v0
.end method

.method public final g(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;
    .locals 1

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LbH0$a;->d()Lco/bird/android/feature/birdplus/v1/details/a;

    move-result-object v0

    invoke-static {p1, v0}, LFP;->b(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;Lco/bird/android/feature/birdplus/v1/details/a;)V

    return-object p1
.end method

.method public final h(Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;)Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;
    .locals 1

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LbH0$a;->e()LFQ;

    move-result-object v0

    invoke-static {p1, v0}, LyQ;->b(Lco/bird/android/feature/birdplus/v1/list/BirdPlusLandingActivity;LFQ;)V

    return-object p1
.end method

.method public final i(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;)Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;
    .locals 1

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LbH0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LbH0$a;->f()LdR;

    move-result-object v0

    invoke-static {p1, v0}, LWQ;->b(Lco/bird/android/feature/birdplus/v1/purchased/BirdPlusPurchasedActivity;LdR;)V

    return-object p1
.end method
