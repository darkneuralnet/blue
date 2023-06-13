.class public final LzO0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LzO0$b$b;,
        LzO0$b$a;
    }
.end annotation


# instance fields
.field public final a:LzO0$b;

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
            "Lc00;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lyd4;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LZg3;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiD1;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwd4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LzO0$b;->a:LzO0$b;

    invoke-virtual/range {p0 .. p5}, LzO0$b;->b(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;LAO0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LzO0$b;-><init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)V

    return-void
.end method


# virtual methods
.method public a(Lrd4;)V
    .locals 0

    invoke-virtual {p0, p1}, LzO0$b;->c(Lrd4;)Lrd4;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)V
    .locals 0

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LzO0$b;->b:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LzO0$b;->c:LY94;

    invoke-static {p2}, Lzd4;->a(LY94;)Lzd4;

    move-result-object p2

    iput-object p2, p0, LzO0$b;->d:LY94;

    new-instance p2, LzO0$b$b;

    invoke-direct {p2, p1}, LzO0$b$b;-><init>(LlG2;)V

    iput-object p2, p0, LzO0$b;->e:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, LzO0$b;->f:LY94;

    new-instance p2, LzO0$b$a;

    invoke-direct {p2, p1}, LzO0$b$a;-><init>(LlG2;)V

    iput-object p2, p0, LzO0$b;->g:LY94;

    iget-object p1, p0, LzO0$b;->b:LY94;

    iget-object p3, p0, LzO0$b;->d:LY94;

    iget-object p4, p0, LzO0$b;->e:LY94;

    iget-object p5, p0, LzO0$b;->f:LY94;

    invoke-static {p1, p3, p4, p5, p2}, Lxd4;->a(LY94;LY94;LY94;LY94;LY94;)Lxd4;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LzO0$b;->h:LY94;

    return-void
.end method

.method public final c(Lrd4;)Lrd4;
    .locals 1

    iget-object v0, p0, LzO0$b;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwd4;

    invoke-static {p1, v0}, Lsd4;->b(Lrd4;Lwd4;)V

    return-object p1
.end method
