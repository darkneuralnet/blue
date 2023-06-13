.class public final Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/repair/v3/overview/nonrepair/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/repair/v3/overview/nonrepair/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->b:Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;

    iput-object p1, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LDM0;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->b(Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;)Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;)Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->c()LD93;

    move-result-object v0

    invoke-static {p1, v0}, Lt93;->b(Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;LD93;)V

    return-object p1
.end method

.method public final c()LD93;
    .locals 3

    new-instance v0, LD93;

    iget-object v1, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->e3()Lrn6;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrn6;

    iget-object v2, p0, Lco/bird/android/feature/repair/v3/overview/nonrepair/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-direct {v0, v1, v2}, LD93;-><init>(Lrn6;Le13;)V

    return-object v0
.end method
