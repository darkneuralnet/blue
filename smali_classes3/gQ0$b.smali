.class public final LgQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvn5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/widget/Button;

.field public final c:Landroid/content/DialogInterface;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:LlG2;

.field public final f:LgQ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LgQ0$b;->f:LgQ0$b;

    iput-object p2, p0, LgQ0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LgQ0$b;->b:Landroid/widget/Button;

    iput-object p5, p0, LgQ0$b;->c:Landroid/content/DialogInterface;

    iput-object p3, p0, LgQ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iput-object p1, p0, LgQ0$b;->e:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;LhQ0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LgQ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(Lvn5;)V
    .locals 0

    invoke-virtual {p0, p1}, LgQ0$b;->b(Lvn5;)Lvn5;

    return-void
.end method

.method public final b(Lvn5;)Lvn5;
    .locals 1

    invoke-virtual {p0}, LgQ0$b;->c()Lzn5;

    move-result-object v0

    invoke-static {p1, v0}, Lwn5;->b(Lvn5;Lxn5;)V

    return-object p1
.end method

.method public final c()Lzn5;
    .locals 4

    new-instance v0, Lzn5;

    invoke-virtual {p0}, LgQ0$b;->d()LBn5;

    move-result-object v1

    iget-object v2, p0, LgQ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LgQ0$b;->e:LlG2;

    invoke-interface {v3}, LlG2;->w2()Le13;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le13;

    invoke-direct {v0, v1, v2, v3}, Lzn5;-><init>(LAn5;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v0
.end method

.method public final d()LBn5;
    .locals 4

    new-instance v0, LBn5;

    iget-object v1, p0, LgQ0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LgQ0$b;->b:Landroid/widget/Button;

    iget-object v3, p0, LgQ0$b;->c:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LBn5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v0
.end method
