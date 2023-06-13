.class public final Lco/bird/android/feature/localssurvey/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/localssurvey/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/localssurvey/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

.field public final c:Lco/bird/android/feature/localssurvey/a$b;


# direct methods
.method public constructor <init>(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/localssurvey/a$b;->c:Lco/bird/android/feature/localssurvey/a$b;

    iput-object p1, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/localssurvey/a$b;->b:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;LUL0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/localssurvey/a$b;-><init>(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/localssurvey/a$b;->b(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;)Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/localssurvey/a$b;->c()LRv2;

    move-result-object v0

    invoke-static {p1, v0}, LLv2;->b(Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;LRv2;)V

    return-object p1
.end method

.method public final c()LRv2;
    .locals 5

    new-instance v0, LRv2;

    iget-object v1, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->d0()LEa;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, Lco/bird/android/feature/localssurvey/a$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->r()Lgl;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    iget-object v4, p0, Lco/bird/android/feature/localssurvey/a$b;->b:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    invoke-direct {v0, v1, v2, v3, v4}, LRv2;-><init>(LEa;Le13;Lgl;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V

    return-object v0
.end method
