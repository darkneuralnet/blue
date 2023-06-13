.class public final LKR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljz6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/widget/Button;

.field public final f:Landroid/content/DialogInterface;

.field public final g:Lcom/uber/autodispose/ScopeProvider;

.field public final h:LKR0$b;


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

    iput-object p0, p0, LKR0$b;->h:LKR0$b;

    iput-object p8, p0, LKR0$b;->a:Lio/reactivex/subjects/h;

    iput-object p2, p0, LKR0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LKR0$b;->c:Landroid/widget/TextView;

    iput-object p5, p0, LKR0$b;->d:Landroid/widget/Button;

    iput-object p6, p0, LKR0$b;->e:Landroid/widget/Button;

    iput-object p7, p0, LKR0$b;->f:Landroid/content/DialogInterface;

    iput-object p3, p0, LKR0$b;->g:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;LLR0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LKR0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(Ljz6;)V
    .locals 0

    invoke-virtual {p0, p1}, LKR0$b;->b(Ljz6;)Ljz6;

    return-void
.end method

.method public final b(Ljz6;)Ljz6;
    .locals 1

    invoke-virtual {p0}, LKR0$b;->c()Loz6;

    move-result-object v0

    invoke-static {p1, v0}, Lkz6;->b(Ljz6;Llz6;)V

    return-object p1
.end method

.method public final c()Loz6;
    .locals 4

    new-instance v0, Loz6;

    iget-object v1, p0, LKR0$b;->a:Lio/reactivex/subjects/h;

    invoke-virtual {p0}, LKR0$b;->d()Lsz6;

    move-result-object v2

    iget-object v3, p0, LKR0$b;->g:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3}, Loz6;-><init>(Lio/reactivex/subjects/h;Lpz6;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final d()Lsz6;
    .locals 7

    new-instance v6, Lsz6;

    iget-object v1, p0, LKR0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LKR0$b;->c:Landroid/widget/TextView;

    iget-object v3, p0, LKR0$b;->d:Landroid/widget/Button;

    iget-object v4, p0, LKR0$b;->e:Landroid/widget/Button;

    iget-object v5, p0, LKR0$b;->f:Landroid/content/DialogInterface;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lsz6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v6
.end method
