.class public final LdU5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/feature/suggestanest/SuggestNestActivity;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLU5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiU5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LIL2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LiU5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->k:LiU5;

    return-void
.end method

.method public static b(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LIL2;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->l:LIL2;

    return-void
.end method

.method public static d(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LLU5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->j:LLU5;

    return-void
.end method


# virtual methods
.method public c(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 1

    iget-object v0, p0, LdU5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LdU5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LdU5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LdU5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLU5;

    invoke-static {p1, v0}, LdU5;->d(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LLU5;)V

    iget-object v0, p0, LdU5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiU5;

    invoke-static {p1, v0}, LdU5;->a(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LiU5;)V

    iget-object v0, p0, LdU5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIL2;

    invoke-static {p1, v0}, LdU5;->b(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LIL2;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-virtual {p0, p1}, LdU5;->c(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method
