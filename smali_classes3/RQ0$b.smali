.class public final LRQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhU5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/model/PhotoBannerViewModel;

.field public final c:LRQ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LRQ0$b;->c:LRQ0$b;

    iput-object p1, p0, LRQ0$b;->a:LlG2;

    iput-object p2, p0, LRQ0$b;->b:Lco/bird/android/model/PhotoBannerViewModel;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;LSQ0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRQ0$b;-><init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LRQ0$b;->b(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Lco/bird/android/feature/suggestanest/SuggestNestActivity;
    .locals 1

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LRQ0$b;->d()LLU5;

    move-result-object v0

    invoke-static {p1, v0}, LdU5;->d(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LLU5;)V

    invoke-virtual {p0}, LRQ0$b;->c()LiU5;

    move-result-object v0

    invoke-static {p1, v0}, LdU5;->a(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LiU5;)V

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r0()LIL2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIL2;

    invoke-static {p1, v0}, LdU5;->b(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LIL2;)V

    return-object p1
.end method

.method public final c()LiU5;
    .locals 2

    new-instance v0, LiU5;

    iget-object v1, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LiU5;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LLU5;
    .locals 8

    new-instance v7, LLU5;

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ldr4;

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->v1()Ls43;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ls43;

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->s2()LFs5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LFs5;

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LRQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    iget-object v6, p0, LRQ0$b;->b:Lco/bird/android/model/PhotoBannerViewModel;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LLU5;-><init>(Ldr4;Ls43;LFs5;LTq4;Le13;Lco/bird/android/model/PhotoBannerViewModel;)V

    return-object v7
.end method
