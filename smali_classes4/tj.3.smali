.class public final Ltj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lgl;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/config/tweaks/dsl/Tweaks;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "Lco/bird/android/config/tweaks/dsl/Tweaks;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj;->a:Lhj;

    iput-object p2, p0, Ltj;->b:LY94;

    iput-object p3, p0, Ltj;->c:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;LY94;)Ltj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "Lco/bird/android/config/tweaks/dsl/Tweaks;",
            ">;)",
            "Ltj;"
        }
    .end annotation

    new-instance v0, Ltj;

    invoke-direct {v0, p0, p1, p2}, Ltj;-><init>(Lhj;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lwi2;Lco/bird/android/config/tweaks/dsl/Tweaks;)Lgl;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lhj;->l(Lwi2;Lco/bird/android/config/tweaks/dsl/Tweaks;)Lgl;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgl;

    return-object p0
.end method


# virtual methods
.method public b()Lgl;
    .locals 3

    iget-object v0, p0, Ltj;->a:Lhj;

    iget-object v1, p0, Ltj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi2;

    iget-object v2, p0, Ltj;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/config/tweaks/dsl/Tweaks;

    invoke-static {v0, v1, v2}, Ltj;->c(Lhj;Lwi2;Lco/bird/android/config/tweaks/dsl/Tweaks;)Lgl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltj;->b()Lgl;

    move-result-object v0

    return-object v0
.end method
