.class public final Lco/bird/android/feature/release/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/release/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/release/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LDQ3;

.field public final c:Lco/bird/android/model/PhotoBannerViewModel;

.field public final d:Lco/bird/android/feature/release/a$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;Landroid/app/Activity;LDQ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/release/a$b;->d:Lco/bird/android/feature/release/a$b;

    iput-object p1, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    iput-object p4, p0, Lco/bird/android/feature/release/a$b;->b:LDQ3;

    iput-object p2, p0, Lco/bird/android/feature/release/a$b;->c:Lco/bird/android/model/PhotoBannerViewModel;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;Landroid/app/Activity;LDQ3;LGO0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/feature/release/a$b;-><init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;Landroid/app/Activity;LDQ3;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/release/ReleaseScanActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/release/a$b;->b(Lco/bird/android/feature/release/ReleaseScanActivity;)Lco/bird/android/feature/release/ReleaseScanActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/release/ReleaseScanActivity;)Lco/bird/android/feature/release/ReleaseScanActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/release/a$b;->d()LAv4;

    move-result-object v0

    invoke-static {p1, v0}, LUu4;->c(Lco/bird/android/feature/release/ReleaseScanActivity;LAv4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/release/a$b;->c()LWu4;

    move-result-object v0

    invoke-static {p1, v0}, LUu4;->a(Lco/bird/android/feature/release/ReleaseScanActivity;LWu4;)V

    return-object p1
.end method

.method public final c()LWu4;
    .locals 2

    new-instance v0, LWu4;

    iget-object v1, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LWu4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LAv4;
    .locals 9

    new-instance v8, LAv4;

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le13;

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ldr4;

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->v1()Ls43;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ls43;

    iget-object v4, p0, Lco/bird/android/feature/release/a$b;->b:LDQ3;

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->U2()Lef6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lef6;

    iget-object v0, p0, Lco/bird/android/feature/release/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    iget-object v7, p0, Lco/bird/android/feature/release/a$b;->c:Lco/bird/android/model/PhotoBannerViewModel;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LAv4;-><init>(Le13;Ldr4;Ls43;LDQ3;Lef6;LTq4;Lco/bird/android/model/PhotoBannerViewModel;)V

    return-object v8
.end method
