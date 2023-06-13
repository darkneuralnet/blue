.class public final LjQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDn5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/Button;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/content/DialogInterface;

.field public final f:Lcom/uber/autodispose/ScopeProvider;

.field public final g:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LjQ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Landroid/widget/TextView;",
            "Landroid/widget/Button;",
            "Landroid/widget/Button;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LjQ0$b;->h:LjQ0$b;

    iput-object p2, p0, LjQ0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LjQ0$b;->b:Landroid/widget/TextView;

    iput-object p5, p0, LjQ0$b;->c:Landroid/widget/Button;

    iput-object p6, p0, LjQ0$b;->d:Landroid/widget/Button;

    iput-object p7, p0, LjQ0$b;->e:Landroid/content/DialogInterface;

    iput-object p3, p0, LjQ0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    iput-object p8, p0, LjQ0$b;->g:Lio/reactivex/subjects/h;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;LkQ0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LjQ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(LDn5;)V
    .locals 0

    invoke-virtual {p0, p1}, LjQ0$b;->b(LDn5;)LDn5;

    return-void
.end method

.method public final b(LDn5;)LDn5;
    .locals 1

    invoke-virtual {p0}, LjQ0$b;->c()LIn5;

    move-result-object v0

    invoke-static {p1, v0}, LEn5;->b(LDn5;LFn5;)V

    return-object p1
.end method

.method public final c()LIn5;
    .locals 4

    new-instance v0, LIn5;

    invoke-virtual {p0}, LjQ0$b;->d()LMn5;

    move-result-object v1

    iget-object v2, p0, LjQ0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LjQ0$b;->g:Lio/reactivex/subjects/h;

    invoke-direct {v0, v1, v2, v3}, LIn5;-><init>(LJn5;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;)V

    return-object v0
.end method

.method public final d()LMn5;
    .locals 7

    new-instance v6, LMn5;

    iget-object v1, p0, LjQ0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LjQ0$b;->b:Landroid/widget/TextView;

    iget-object v3, p0, LjQ0$b;->c:Landroid/widget/Button;

    iget-object v4, p0, LjQ0$b;->d:Landroid/widget/Button;

    iget-object v5, p0, LjQ0$b;->e:Landroid/content/DialogInterface;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LMn5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v6
.end method
