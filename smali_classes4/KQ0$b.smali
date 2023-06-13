.class public final LKQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnQ5$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKQ0$b$a;
    }
.end annotation


# instance fields
.field public final a:LKQ0$b;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;>;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LG31;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAQ5;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LxQ5;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LvQ5;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoQ5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "LnQ5;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;",
            "Landroid/content/DialogInterface;",
            "LG31;",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LKQ0$b;->a:LKQ0$b;

    invoke-virtual/range {p0 .. p8}, LKQ0$b;->b(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;LLQ0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LKQ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(LnQ5;)V
    .locals 0

    invoke-virtual {p0, p1}, LKQ0$b;->c(LnQ5;)LnQ5;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "LnQ5;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;",
            "Landroid/content/DialogInterface;",
            "LG31;",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;)V"
        }
    .end annotation

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, LKQ0$b;->b:LY94;

    new-instance p3, LKQ0$b$a;

    invoke-direct {p3, p1}, LKQ0$b$a;-><init>(LlG2;)V

    iput-object p3, p0, LKQ0$b;->c:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->d:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->e:LY94;

    invoke-static {p7}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->f:LY94;

    invoke-static {p6}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->g:LY94;

    iget-object p2, p0, LKQ0$b;->d:LY94;

    iget-object p3, p0, LKQ0$b;->e:LY94;

    iget-object p4, p0, LKQ0$b;->f:LY94;

    invoke-static {p2, p3, p4, p1}, LBQ5;->a(LY94;LY94;LY94;LY94;)LBQ5;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->h:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->i:LY94;

    invoke-static {p8}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->j:LY94;

    iget-object p2, p0, LKQ0$b;->b:LY94;

    iget-object p3, p0, LKQ0$b;->c:LY94;

    iget-object p4, p0, LKQ0$b;->i:LY94;

    invoke-static {p2, p3, p4, p1}, LwQ5;->a(LY94;LY94;LY94;LY94;)LwQ5;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->k:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LKQ0$b;->l:LY94;

    return-void
.end method

.method public final c(LnQ5;)LnQ5;
    .locals 1

    iget-object v0, p0, LKQ0$b;->l:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoQ5;

    invoke-static {p1, v0}, LCQ5;->b(LnQ5;LoQ5;)V

    iget-object v0, p0, LKQ0$b;->i:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxQ5;

    invoke-static {p1, v0}, LCQ5;->c(LnQ5;LxQ5;)V

    return-object p1
.end method
