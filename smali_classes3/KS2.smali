.class public final LKS2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LJS2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/drawerlayout/widget/DrawerLayout;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/appcompat/widget/Toolbar;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/guness/widget/NavigationView;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Landroidx/drawerlayout/widget/DrawerLayout;",
            ">;",
            "LY94<",
            "Landroidx/appcompat/widget/Toolbar;",
            ">;",
            "LY94<",
            "Lcom/guness/widget/NavigationView;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKS2;->a:LY94;

    iput-object p2, p0, LKS2;->b:LY94;

    iput-object p3, p0, LKS2;->c:LY94;

    iput-object p4, p0, LKS2;->d:LY94;

    iput-object p5, p0, LKS2;->e:LY94;

    iput-object p6, p0, LKS2;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LKS2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Landroidx/drawerlayout/widget/DrawerLayout;",
            ">;",
            "LY94<",
            "Landroidx/appcompat/widget/Toolbar;",
            ">;",
            "LY94<",
            "Lcom/guness/widget/NavigationView;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LKS2;"
        }
    .end annotation

    new-instance v7, LKS2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LKS2;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;Lcom/guness/widget/NavigationView;Lgl;LTq4;)LJS2;
    .locals 8

    new-instance v7, LJS2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LJS2;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;Lcom/guness/widget/NavigationView;Lgl;LTq4;)V

    return-object v7
.end method


# virtual methods
.method public b()LJS2;
    .locals 7

    iget-object v0, p0, LKS2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v0, p0, LKS2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object v0, p0, LKS2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p0, LKS2;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/guness/widget/NavigationView;

    iget-object v0, p0, LKS2;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lgl;

    iget-object v0, p0, LKS2;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    invoke-static/range {v1 .. v6}, LKS2;->c(Lco/bird/android/core/mvp/BaseActivity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;Lcom/guness/widget/NavigationView;Lgl;LTq4;)LJS2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKS2;->b()LJS2;

    move-result-object v0

    return-object v0
.end method
