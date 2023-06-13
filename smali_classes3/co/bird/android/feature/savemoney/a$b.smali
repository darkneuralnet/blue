.class public final Lco/bird/android/feature/savemoney/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/savemoney/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/savemoney/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/savemoney/a$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/savemoney/a$b;->b:Lco/bird/android/feature/savemoney/a$b;

    iput-object p1, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LOP0;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/feature/savemoney/a$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/savemoney/SaveMoneyActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/savemoney/a$b;->b(Lco/bird/android/feature/savemoney/SaveMoneyActivity;)Lco/bird/android/feature/savemoney/SaveMoneyActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/savemoney/SaveMoneyActivity;)Lco/bird/android/feature/savemoney/SaveMoneyActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/savemoney/a$b;->c()Lzi5;

    move-result-object v0

    invoke-static {p1, v0}, Ldi5;->b(Lco/bird/android/feature/savemoney/SaveMoneyActivity;Lzi5;)V

    return-object p1
.end method

.method public final c()Lzi5;
    .locals 10

    new-instance v9, Lzi5;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le13;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->L()LJQ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LJQ;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->u0()Lgd3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgd3;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->F()LVM3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LVM3;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y1()LWU4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LWU4;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lgl;

    iget-object v0, p0, Lco/bird/android/feature/savemoney/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LTq4;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lzi5;-><init>(Le13;LEa;LJQ;Lgd3;LVM3;LWU4;Lgl;LTq4;)V

    return-object v9
.end method
