.class public final Lco/bird/android/feature/sober/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/sober/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/sober/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/sober/a$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/sober/a$b;->b:Lco/bird/android/feature/sober/a$b;

    iput-object p1, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LIQ0;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/feature/sober/a$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/sober/SoberStartActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/sober/a$b;->b(Lco/bird/android/feature/sober/SoberStartActivity;)Lco/bird/android/feature/sober/SoberStartActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/sober/SoberStartActivity;)Lco/bird/android/feature/sober/SoberStartActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/sober/a$b;->c()LeN5;

    move-result-object v0

    invoke-static {p1, v0}, LUM5;->b(Lco/bird/android/feature/sober/SoberStartActivity;LeN5;)V

    return-object p1
.end method

.method public final c()LeN5;
    .locals 4

    new-instance v0, LeN5;

    iget-object v1, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->b0()LYR4;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYR4;

    iget-object v2, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->d0()LEa;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEa;

    iget-object v3, p0, Lco/bird/android/feature/sober/a$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->w2()Le13;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le13;

    invoke-direct {v0, v1, v2, v3}, LeN5;-><init>(LYR4;LEa;Le13;)V

    return-object v0
.end method
