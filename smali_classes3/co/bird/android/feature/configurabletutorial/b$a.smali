.class public final Lco/bird/android/feature/configurabletutorial/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/configurabletutorial/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/configurabletutorial/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lqw0;

.field public final c:Ljava/lang/Boolean;

.field public final d:Lco/bird/android/feature/configurabletutorial/b$a;


# direct methods
.method public constructor <init>(LlG2;Lqw0;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->d:Lco/bird/android/feature/configurabletutorial/b$a;

    iput-object p1, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/configurabletutorial/b$a;->b:Lqw0;

    iput-object p3, p0, Lco/bird/android/feature/configurabletutorial/b$a;->c:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lqw0;Ljava/lang/Boolean;LhI0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/configurabletutorial/b$a;-><init>(LlG2;Lqw0;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public a(LXv0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/configurabletutorial/b$a;->j(LXv0;)LXv0;

    return-void
.end method

.method public b(LTv0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/configurabletutorial/b$a;->i(LTv0;)LTv0;

    return-void
.end method

.method public c(Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/configurabletutorial/b$a;->k(Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;)Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;

    return-void
.end method

.method public final d()LKv0;
    .locals 1

    invoke-static {}, LMv0;->b()LKv0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/feature/configurabletutorial/b$a;->h(LKv0;)LKv0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lhw0;
    .locals 4

    new-instance v0, Lhw0;

    iget-object v1, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->o2()Llw0;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llw0;

    iget-object v2, p0, Lco/bird/android/feature/configurabletutorial/b$a;->b:Lqw0;

    iget-object v3, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v3}, LlG2;->w2()Le13;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le13;

    invoke-direct {v0, v1, v2, v3}, Lhw0;-><init>(Llw0;Lqw0;Le13;)V

    return-object v0
.end method

.method public final f()LDw0;
    .locals 8

    new-instance v7, LDw0;

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->o2()Llw0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llw0;

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le13;

    iget-object v4, p0, Lco/bird/android/feature/configurabletutorial/b$a;->b:Lqw0;

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->F1()LXc1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LXc1;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LDw0;-><init>(Llw0;LEa;Le13;Lqw0;ZLXc1;)V

    return-object v7
.end method

.method public final g()Lbx0;
    .locals 3

    new-instance v0, Lbx0;

    iget-object v1, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->o2()Llw0;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llw0;

    iget-object v2, p0, Lco/bird/android/feature/configurabletutorial/b$a;->b:Lqw0;

    invoke-direct {v0, v1, v2}, Lbx0;-><init>(Llw0;Lqw0;)V

    return-object v0
.end method

.method public final h(LKv0;)LKv0;
    .locals 1

    new-instance v0, LPv0;

    invoke-direct {v0}, LPv0;-><init>()V

    invoke-static {p1, v0}, LNv0;->a(LKv0;LPv0;)V

    return-object p1
.end method

.method public final i(LTv0;)LTv0;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/b$a;->f()LDw0;

    move-result-object v0

    invoke-static {p1, v0}, LVv0;->d(LTv0;LDw0;)V

    new-instance v0, LPv0;

    invoke-direct {v0}, LPv0;-><init>()V

    invoke-static {p1, v0}, LVv0;->b(LTv0;LPv0;)V

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/b$a;->d()LKv0;

    move-result-object v0

    invoke-static {p1, v0}, LVv0;->a(LTv0;LKv0;)V

    return-object p1
.end method

.method public final j(LXv0;)LXv0;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/b$a;->e()Lhw0;

    move-result-object v0

    invoke-static {p1, v0}, LYv0;->d(LXv0;Lhw0;)V

    new-instance v0, LWv0;

    invoke-direct {v0}, LWv0;-><init>()V

    invoke-static {p1, v0}, LYv0;->a(LXv0;LWv0;)V

    new-instance v0, LPv0;

    invoke-direct {v0}, LPv0;-><init>()V

    invoke-static {p1, v0}, LYv0;->b(LXv0;LPv0;)V

    return-object p1
.end method

.method public final k(Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;)Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/b$a;->g()Lbx0;

    move-result-object v0

    invoke-static {p1, v0}, LXw0;->b(Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;Lbx0;)V

    return-object p1
.end method
