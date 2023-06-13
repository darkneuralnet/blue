.class public final LZ75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LY75;",
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
            "LTo2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LF5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDt6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJf;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "LF5;",
            ">;",
            "LY94<",
            "LDt6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ75;->a:LY94;

    iput-object p2, p0, LZ75;->b:LY94;

    iput-object p3, p0, LZ75;->c:LY94;

    iput-object p4, p0, LZ75;->d:LY94;

    iput-object p5, p0, LZ75;->e:LY94;

    iput-object p6, p0, LZ75;->f:LY94;

    iput-object p7, p0, LZ75;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LZ75;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "LF5;",
            ">;",
            "LY94<",
            "LDt6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;)",
            "LZ75;"
        }
    .end annotation

    new-instance v8, LZ75;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LZ75;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LTo2;LF5;LDt6;LTq4;LJf;Lbg;)LY75;
    .locals 9

    new-instance v8, LY75;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LY75;-><init>(Lco/bird/android/core/mvp/BaseActivity;LTo2;LF5;LDt6;LTq4;LJf;Lbg;)V

    return-object v8
.end method


# virtual methods
.method public b()LY75;
    .locals 8

    iget-object v0, p0, LZ75;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v0, p0, LZ75;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTo2;

    iget-object v0, p0, LZ75;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LF5;

    iget-object v0, p0, LZ75;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LDt6;

    iget-object v0, p0, LZ75;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LTq4;

    iget-object v0, p0, LZ75;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LJf;

    iget-object v0, p0, LZ75;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lbg;

    invoke-static/range {v1 .. v7}, LZ75;->c(Lco/bird/android/core/mvp/BaseActivity;LTo2;LF5;LDt6;LTq4;LJf;Lbg;)LY75;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ75;->b()LY75;

    move-result-object v0

    return-object v0
.end method
