.class public final Lco/bird/android/feature/birdratinghistory/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/birdratinghistory/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/birdratinghistory/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Ljava/lang/String;

.field public final c:Lco/bird/android/feature/birdratinghistory/b$a;


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/birdratinghistory/b$a;->c:Lco/bird/android/feature/birdratinghistory/b$a;

    iput-object p1, p0, Lco/bird/android/feature/birdratinghistory/b$a;->a:LlG2;

    iput-object p3, p0, Lco/bird/android/feature/birdratinghistory/b$a;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;Ljava/lang/String;LdH0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/birdratinghistory/b$a;-><init>(LlG2;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdratinghistory/b$a;->c(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;)Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;

    return-void
.end method

.method public final b()LJR;
    .locals 4

    new-instance v0, LJR;

    iget-object v1, p0, Lco/bird/android/feature/birdratinghistory/b$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->F0()Lom3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom3;

    new-instance v2, LAR;

    invoke-direct {v2}, LAR;-><init>()V

    iget-object v3, p0, Lco/bird/android/feature/birdratinghistory/b$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, LJR;-><init>(Lom3;LAR;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;)Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdratinghistory/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/birdratinghistory/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/birdratinghistory/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/birdratinghistory/b$a;->b()LJR;

    move-result-object v0

    invoke-static {p1, v0}, LwR;->c(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;LJR;)V

    new-instance v0, LxR;

    invoke-direct {v0}, LxR;-><init>()V

    invoke-static {p1, v0}, LwR;->a(Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;LxR;)V

    return-object p1
.end method
