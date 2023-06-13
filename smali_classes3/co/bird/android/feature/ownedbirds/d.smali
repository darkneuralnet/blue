.class public final Lco/bird/android/feature/ownedbirds/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LRA3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LtC3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LF34;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lf44;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LB44;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)LRA3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;",
            "Ldagger/Lazy<",
            "LtC3;",
            ">;",
            "Ldagger/Lazy<",
            "LF34;",
            ">;",
            "Ldagger/Lazy<",
            "Lf44;",
            ">;",
            "Ldagger/Lazy<",
            "LB44;",
            ">;)",
            "LRA3;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;->a(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)LRA3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LRA3;

    return-object p0
.end method


# virtual methods
.method public a()LRA3;
    .locals 5

    iget-object v0, p0, Lco/bird/android/feature/ownedbirds/d;->a:Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;

    iget-object v1, p0, Lco/bird/android/feature/ownedbirds/d;->b:LY94;

    invoke-static {v1}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/ownedbirds/d;->c:LY94;

    invoke-static {v2}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/feature/ownedbirds/d;->d:LY94;

    invoke-static {v3}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/feature/ownedbirds/d;->e:LY94;

    invoke-static {v4}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lco/bird/android/feature/ownedbirds/d;->b(Lco/bird/android/feature/ownedbirds/OwnedBirdDetailsActivity$b;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)LRA3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ownedbirds/d;->a()LRA3;

    move-result-object v0

    return-object v0
.end method
