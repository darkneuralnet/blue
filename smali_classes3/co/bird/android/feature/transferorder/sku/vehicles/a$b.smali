.class public final Lco/bird/android/feature/transferorder/sku/vehicles/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/transferorder/sku/vehicles/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/transferorder/sku/vehicles/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/transferorder/sku/vehicles/a$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->b:Lco/bird/android/feature/transferorder/sku/vehicles/a$b;

    iput-object p1, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LAQ0;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->b(Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;)Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;)Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->d()LMC5;

    move-result-object v0

    invoke-static {p1, v0}, LEC5;->c(Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;LMC5;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->c()LGC5;

    move-result-object v0

    invoke-static {p1, v0}, LEC5;->a(Lco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesActivity;LGC5;)V

    return-object p1
.end method

.method public final c()LGC5;
    .locals 2

    new-instance v0, LGC5;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LGC5;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LMC5;
    .locals 2

    new-instance v0, LMC5;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/sku/vehicles/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    invoke-direct {v0, v1}, LMC5;-><init>(LO86;)V

    return-object v0
.end method
