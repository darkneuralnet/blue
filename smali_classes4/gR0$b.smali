.class public final LgR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX86$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Lf00;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Ldm5;

.field public final f:Lcom/uber/autodispose/ScopeProvider;

.field public final g:LgR0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lf00;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/c<",
            "Ljava/lang/String;",
            ">;",
            "Ldm5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LgR0$b;->g:LgR0$b;

    iput-object p6, p0, LgR0$b;->a:Lio/reactivex/subjects/c;

    iput-object p2, p0, LgR0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LgR0$b;->c:Lf00;

    iput-object p5, p0, LgR0$b;->d:Landroid/content/DialogInterface;

    iput-object p7, p0, LgR0$b;->e:Ldm5;

    iput-object p3, p0, LgR0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;LhR0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LgR0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;)V

    return-void
.end method


# virtual methods
.method public a(LX86;)V
    .locals 0

    invoke-virtual {p0, p1}, LgR0$b;->c(LX86;)LX86;

    return-void
.end method

.method public final b()LjE;
    .locals 4

    new-instance v0, LjE;

    iget-object v1, p0, LgR0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LgR0$b;->c:Lf00;

    iget-object v3, p0, LgR0$b;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LjE;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final c(LX86;)LX86;
    .locals 1

    invoke-virtual {p0}, LgR0$b;->d()Lf96;

    move-result-object v0

    invoke-static {p1, v0}, LY86;->b(LX86;Lf96;)V

    return-object p1
.end method

.method public final d()Lf96;
    .locals 5

    new-instance v0, Lf96;

    iget-object v1, p0, LgR0$b;->a:Lio/reactivex/subjects/c;

    invoke-virtual {p0}, LgR0$b;->b()LjE;

    move-result-object v2

    iget-object v3, p0, LgR0$b;->e:Ldm5;

    iget-object v4, p0, LgR0$b;->f:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3, v4}, Lf96;-><init>(Lio/reactivex/subjects/c;LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method
