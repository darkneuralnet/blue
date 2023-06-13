.class public final Lco/bird/android/feature/ar/resolution/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/ar/resolution/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/ar/resolution/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/model/wire/WireBird;

.field public final c:Ljava/lang/String;

.field public final d:Lco/bird/android/feature/ar/resolution/a$b;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;LDQ3;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/ar/resolution/a$b;->d:Lco/bird/android/feature/ar/resolution/a$b;

    iput-object p1, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    iput-object p4, p0, Lco/bird/android/feature/ar/resolution/a$b;->b:Lco/bird/android/model/wire/WireBird;

    iput-object p5, p0, Lco/bird/android/feature/ar/resolution/a$b;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;LDQ3;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;LGR0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lco/bird/android/feature/ar/resolution/a$b;-><init>(LlG2;Landroid/app/Activity;LDQ3;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/resolution/a$b;->b(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lco/bird/android/feature/ar/resolution/VpsResolveActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lco/bird/android/feature/ar/resolution/VpsResolveActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/a$b;->c()LWv6;

    move-result-object v0

    invoke-static {p1, v0}, Lwv6;->d(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LWv6;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k2()Landroid/hardware/SensorManager;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    invoke-static {p1, v0}, Lwv6;->e(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;Landroid/hardware/SensorManager;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k1()LRh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh6;

    invoke-static {p1, v0}, Lwv6;->f(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LRh6;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t0()LOh;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOh;

    invoke-static {p1, v0}, Lwv6;->a(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LOh;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, Lwv6;->b(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;Lgl;)V

    return-object p1
.end method

.method public final c()LWv6;
    .locals 13

    new-instance v12, LWv6;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->e0()Lbn;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lbn;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->A()Ltm;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ltm;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ldr4;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k1()LRh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LRh6;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    iget-object v7, p0, Lco/bird/android/feature/ar/resolution/a$b;->b:Lco/bird/android/model/wire/WireBird;

    iget-object v8, p0, Lco/bird/android/feature/ar/resolution/a$b;->c:Ljava/lang/String;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/os/Handler;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lgl;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t0()LOh;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, LOh;

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LWv6;-><init>(LTq4;Lbn;Ltm;Ldr4;LRh6;Le13;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Landroid/os/Handler;Lgl;LOh;)V

    return-object v12
.end method
