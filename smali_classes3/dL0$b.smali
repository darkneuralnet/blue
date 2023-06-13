.class public final LdL0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt72$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:LV3;

.field public final e:Lzm2;

.field public final f:LSm2;

.field public final g:LTm2;

.field public final h:LdL0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LV3;Lzm2;LSm2;LTm2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LdL0$b;->h:LdL0$b;

    iput-object p1, p0, LdL0$b;->a:LlG2;

    iput-object p3, p0, LdL0$b;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p2, p0, LdL0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LdL0$b;->d:LV3;

    iput-object p5, p0, LdL0$b;->e:Lzm2;

    iput-object p6, p0, LdL0$b;->f:LSm2;

    iput-object p7, p0, LdL0$b;->g:LTm2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LV3;Lzm2;LSm2;LTm2;LeL0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LdL0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LV3;Lzm2;LSm2;LTm2;)V

    return-void
.end method


# virtual methods
.method public a(Lt72;)V
    .locals 0

    invoke-virtual {p0, p1}, LdL0$b;->b(Lt72;)Lt72;

    return-void
.end method

.method public final b(Lt72;)Lt72;
    .locals 1

    invoke-virtual {p0}, LdL0$b;->c()LP72;

    move-result-object v0

    invoke-static {p1, v0}, Lu72;->b(Lt72;LP72;)V

    return-object p1
.end method

.method public final c()LP72;
    .locals 9

    new-instance v8, LP72;

    iget-object v0, p0, LdL0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->V2()LXl3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LXl3;

    iget-object v0, p0, LdL0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Llh6;

    iget-object v3, p0, LdL0$b;->b:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LdL0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le13;

    invoke-virtual {p0}, LdL0$b;->d()LS72;

    move-result-object v5

    new-instance v6, Ls72;

    invoke-direct {v6}, Ls72;-><init>()V

    new-instance v7, LL82;

    invoke-direct {v7}, LL82;-><init>()V

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LP72;-><init>(LXl3;Llh6;Lcom/uber/autodispose/ScopeProvider;Le13;LS72;Ls72;LL82;)V

    return-object v8
.end method

.method public final d()LS72;
    .locals 7

    new-instance v6, LS72;

    iget-object v1, p0, LdL0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LdL0$b;->d:LV3;

    iget-object v3, p0, LdL0$b;->e:Lzm2;

    iget-object v4, p0, LdL0$b;->f:LSm2;

    iget-object v5, p0, LdL0$b;->g:LTm2;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LS72;-><init>(Lco/bird/android/core/mvp/BaseActivity;LV3;Lzm2;LSm2;LTm2;)V

    return-object v6
.end method
