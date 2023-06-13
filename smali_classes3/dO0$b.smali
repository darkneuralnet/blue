.class public final LdO0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv04;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LdO0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LdO0$b;->b:LdO0$b;

    iput-object p1, p0, LdO0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LeO0;)V
    .locals 0

    invoke-direct {p0, p1}, LdO0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, LdO0$b;->f(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;

    return-void
.end method

.method public b(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)V
    .locals 0

    invoke-virtual {p0, p1}, LdO0$b;->h(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;

    return-void
.end method

.method public c(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, LdO0$b;->g(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;)Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;

    return-void
.end method

.method public final d()LGs;
    .locals 2

    new-instance v0, LGs;

    iget-object v1, p0, LdO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LGs;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final e()LUs;
    .locals 5

    new-instance v0, LUs;

    iget-object v1, p0, LdO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->w2()Le13;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LdO0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->F()LVM3;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LVM3;

    iget-object v3, p0, LdO0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    iget-object v4, p0, LdO0$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->x1()Llh6;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llh6;

    invoke-direct {v0, v1, v2, v3, v4}, LUs;-><init>(Le13;LVM3;LTq4;Llh6;)V

    return-object v0
.end method

.method public final f(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;
    .locals 1

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LdO0$b;->d()LGs;

    move-result-object v0

    invoke-static {p1, v0}, LBs;->a(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LGs;)V

    invoke-virtual {p0}, LdO0$b;->e()LUs;

    move-result-object v0

    invoke-static {p1, v0}, LBs;->c(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;LUs;)V

    return-object p1
.end method

.method public final g(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;)Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;
    .locals 1

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LdO0$b;->i()Lx04;

    move-result-object v0

    invoke-static {p1, v0}, Lq04;->b(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;Lx04;)V

    return-object p1
.end method

.method public final h(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;)Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;
    .locals 1

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LdO0$b;->j()LP04;

    move-result-object v0

    invoke-static {p1, v0}, Lp04;->b(Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2ActivityVersionB;LP04;)V

    return-object p1
.end method

.method public final i()Lx04;
    .locals 5

    new-instance v0, Lx04;

    iget-object v1, p0, LdO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->w2()Le13;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LdO0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->r()Lgl;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl;

    iget-object v3, p0, LdO0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    iget-object v4, p0, LdO0$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->F()LVM3;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LVM3;

    invoke-direct {v0, v1, v2, v3, v4}, Lx04;-><init>(Le13;Lgl;LTq4;LVM3;)V

    return-object v0
.end method

.method public final j()LP04;
    .locals 12

    new-instance v11, LP04;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->W()Lw10;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lw10;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->W2()LiD1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LiD1;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le13;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t()LAM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LAM3;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->F()LVM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LVM3;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d2()LzN3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LzN3;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lgl;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, LTq4;

    iget-object v0, p0, LdO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Llh6;

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, LP04;-><init>(LEa;Lw10;LiD1;Le13;LAM3;LVM3;LzN3;Lgl;LTq4;Llh6;)V

    return-object v11
.end method
