.class public final Ly84;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly84;->a:LY94;

    iput-object p2, p0, Ly84;->b:LY94;

    iput-object p3, p0, Ly84;->c:LY94;

    iput-object p4, p0, Ly84;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Ly84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "Ly84;"
        }
    .end annotation

    new-instance v0, Ly84;

    invoke-direct {v0, p0, p1, p2, p3}, Ly84;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)Lv84;
    .locals 7

    new-instance v6, Lv84;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lv84;-><init>(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)V

    return-object v6
.end method


# virtual methods
.method public b(Landroid/view/View;)Lv84;
    .locals 4

    iget-object v0, p0, Ly84;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, Ly84;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    iget-object v2, p0, Ly84;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV74;

    iget-object v3, p0, Ly84;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEa;

    invoke-static {v0, v1, v2, v3, p1}, Ly84;->c(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)Lv84;

    move-result-object p1

    return-object p1
.end method
