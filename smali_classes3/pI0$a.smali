.class public final LpI0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpI0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LpI0$a;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LpI0$a;->b:LpI0$a;

    iput-object p1, p0, LpI0$a;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LoI0;)V
    .locals 0

    invoke-direct {p0, p1}, LpI0$a;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LpI0$a;->d(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    return-void
.end method

.method public final b()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;
    .locals 2

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    iget-object v1, p0, LpI0$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final c()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;
    .locals 7

    new-instance v6, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->C()LTB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTB0;

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Llh6;

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->K2()LSy6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LSy6;

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;-><init>(LTB0;Llh6;LSy6;LTq4;Le13;)V

    return-object v6
.end method

.method public final d(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;
    .locals 1

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LpI0$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LpI0$a;->c()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    move-result-object v0

    invoke-static {p1, v0}, LjC0;->c(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    invoke-virtual {p0}, LpI0$a;->b()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    move-result-object v0

    invoke-static {p1, v0}, LjC0;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;)V

    return-object p1
.end method
