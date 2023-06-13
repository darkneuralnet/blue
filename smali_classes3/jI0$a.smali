.class public final LjI0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHx0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjI0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjI0$a$c;,
        LjI0$a$a;,
        LjI0$a$b;
    }
.end annotation


# instance fields
.field public final a:LjI0$a;

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
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLZ;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRx0;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LzN3;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNx0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LLZ;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LjI0$a;->a:LjI0$a;

    invoke-virtual/range {p0 .. p5}, LjI0$a;->b(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LLZ;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LLZ;Landroid/content/DialogInterface;LkI0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LjI0$a;-><init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LLZ;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(LHx0;)V
    .locals 0

    invoke-virtual {p0, p1}, LjI0$a;->c(LHx0;)LHx0;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;LLZ;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, LjI0$a;->b:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LjI0$a;->c:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LjI0$a;->d:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LjI0$a;->e:LY94;

    iget-object p3, p0, LjI0$a;->c:LY94;

    iget-object p4, p0, LjI0$a;->d:LY94;

    invoke-static {p3, p4, p2}, LSx0;->a(LY94;LY94;LY94;)LSx0;

    move-result-object p2

    iput-object p2, p0, LjI0$a;->f:LY94;

    new-instance p2, LjI0$a$c;

    invoke-direct {p2, p1}, LjI0$a$c;-><init>(LlG2;)V

    iput-object p2, p0, LjI0$a;->g:LY94;

    new-instance p2, LjI0$a$a;

    invoke-direct {p2, p1}, LjI0$a$a;-><init>(LlG2;)V

    iput-object p2, p0, LjI0$a;->h:LY94;

    new-instance p2, LjI0$a$b;

    invoke-direct {p2, p1}, LjI0$a$b;-><init>(LlG2;)V

    iput-object p2, p0, LjI0$a;->i:LY94;

    iget-object p1, p0, LjI0$a;->b:LY94;

    iget-object p3, p0, LjI0$a;->f:LY94;

    iget-object p4, p0, LjI0$a;->g:LY94;

    iget-object p5, p0, LjI0$a;->h:LY94;

    invoke-static {p1, p3, p4, p5, p2}, LQx0;->a(LY94;LY94;LY94;LY94;LY94;)LQx0;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LjI0$a;->j:LY94;

    return-void
.end method

.method public final c(LHx0;)LHx0;
    .locals 1

    iget-object v0, p0, LjI0$a;->j:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNx0;

    invoke-static {p1, v0}, LIx0;->b(LHx0;LNx0;)V

    return-object p1
.end method
