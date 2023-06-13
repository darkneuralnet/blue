.class public final LXP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXP0;
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

.field public final e:LXP0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LXP0$b;->e:LXP0$b;

    iput-object p2, p0, LXP0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LXP0$b;->b:Landroid/widget/Button;

    iput-object p5, p0, LXP0$b;->c:Landroid/content/DialogInterface;

    iput-object p3, p0, LXP0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;LYP0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LXP0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(Lhn5;)V
    .locals 0

    invoke-virtual {p0, p1}, LXP0$b;->b(Lhn5;)Lhn5;

    return-void
.end method

.method public final b(Lhn5;)Lhn5;
    .locals 1

    invoke-virtual {p0}, LXP0$b;->c()Lln5;

    move-result-object v0

    invoke-static {p1, v0}, Lin5;->b(Lhn5;Ljn5;)V

    return-object p1
.end method

.method public final c()Lln5;
    .locals 3

    new-instance v0, Lln5;

    invoke-virtual {p0}, LXP0$b;->d()Lnn5;

    move-result-object v1

    iget-object v2, p0, LXP0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2}, Lln5;-><init>(Lmn5;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final d()Lnn5;
    .locals 4

    new-instance v0, Lnn5;

    iget-object v1, p0, LXP0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LXP0$b;->b:Landroid/widget/Button;

    iget-object v3, p0, LXP0$b;->c:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, Lnn5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v0
.end method
