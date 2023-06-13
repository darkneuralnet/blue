.class public final Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/transferorder/operatorallocationdetails/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/transferorder/operatorallocationdetails/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mrp/BaseActivityLite$a;

.field public final c:Ljava/lang/String;

.field public final d:Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->d:Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->b:Lco/bird/android/core/mrp/BaseActivityLite$a;

    iput-object p3, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Ljava/lang/String;LMM0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;-><init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->b(Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;)Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;)Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->d()LYi3;

    move-result-object v0

    invoke-static {p1, v0}, Lui3;->c(Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;LYi3;)V

    new-instance v0, Lvi3;

    invoke-direct {v0}, Lvi3;-><init>()V

    invoke-static {p1, v0}, Lui3;->a(Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;Lvi3;)V

    return-object p1
.end method

.method public final c()Lxi3;
    .locals 2

    new-instance v0, Lxi3;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lxi3;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LYi3;
    .locals 7

    new-instance v6, LYi3;

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->p()LO86;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LO86;

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->b:Lco/bird/android/core/mrp/BaseActivityLite$a;

    invoke-interface {v0}, Lco/bird/android/core/mrp/BaseActivityLite$a;->a()LDQ3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LDQ3;

    iget-object v3, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->c()Lxi3;

    move-result-object v4

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operatorallocationdetails/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LYi3;-><init>(LO86;LDQ3;Ljava/lang/String;Lxi3;Le13;)V

    return-object v6
.end method
