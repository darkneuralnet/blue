.class public final LFK0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbQ1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFK0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/content/DialogInterface;

.field public final f:Lcom/uber/autodispose/ScopeProvider;

.field public final g:LFK0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LFK0$b;->g:LFK0$b;

    iput-object p2, p0, LFK0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LFK0$b;->b:Landroid/widget/TextView;

    iput-object p5, p0, LFK0$b;->c:Landroid/widget/TextView;

    iput-object p6, p0, LFK0$b;->d:Landroid/widget/Button;

    iput-object p7, p0, LFK0$b;->e:Landroid/content/DialogInterface;

    iput-object p3, p0, LFK0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/content/DialogInterface;LGK0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LFK0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(LbQ1;)V
    .locals 0

    invoke-virtual {p0, p1}, LFK0$b;->d(LbQ1;)LbQ1;

    return-void
.end method

.method public final b()LfQ1;
    .locals 3

    new-instance v0, LfQ1;

    invoke-virtual {p0}, LFK0$b;->c()LhQ1;

    move-result-object v1

    iget-object v2, p0, LFK0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2}, LfQ1;-><init>(LgQ1;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final c()LhQ1;
    .locals 7

    new-instance v6, LhQ1;

    iget-object v1, p0, LFK0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LFK0$b;->b:Landroid/widget/TextView;

    iget-object v3, p0, LFK0$b;->c:Landroid/widget/TextView;

    iget-object v4, p0, LFK0$b;->d:Landroid/widget/Button;

    iget-object v5, p0, LFK0$b;->e:Landroid/content/DialogInterface;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LhQ1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v6
.end method

.method public final d(LbQ1;)LbQ1;
    .locals 1

    invoke-virtual {p0}, LFK0$b;->b()LfQ1;

    move-result-object v0

    invoke-static {p1, v0}, LcQ1;->b(LbQ1;LdQ1;)V

    return-object p1
.end method
