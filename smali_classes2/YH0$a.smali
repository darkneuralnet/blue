.class public final LYH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lon0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/uber/autodispose/ScopeProvider;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Ln31;

.field public final d:Landroid/content/DialogInterface;

.field public final e:LYH0$a;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ln31;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LYH0$a;->e:LYH0$a;

    iput-object p3, p0, LYH0$a;->a:Lcom/uber/autodispose/ScopeProvider;

    iput-object p2, p0, LYH0$a;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LYH0$a;->c:Ln31;

    iput-object p5, p0, LYH0$a;->d:Landroid/content/DialogInterface;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ln31;Landroid/content/DialogInterface;LXH0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LYH0$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ln31;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(Lon0;)V
    .locals 0

    invoke-virtual {p0, p1}, LYH0$a;->d(Lon0;)Lon0;

    return-void
.end method

.method public final b()Lrn0;
    .locals 3

    new-instance v0, Lrn0;

    iget-object v1, p0, LYH0$a;->a:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LYH0$a;->c()Lsn0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lrn0;-><init>(Lcom/uber/autodispose/ScopeProvider;Lsn0;)V

    return-object v0
.end method

.method public final c()Lsn0;
    .locals 4

    new-instance v0, Lsn0;

    iget-object v1, p0, LYH0$a;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LYH0$a;->c:Ln31;

    iget-object v3, p0, LYH0$a;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, Lsn0;-><init>(Lco/bird/android/core/mvp/BaseActivity;Ln31;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final d(Lon0;)Lon0;
    .locals 1

    invoke-virtual {p0}, LYH0$a;->b()Lrn0;

    move-result-object v0

    invoke-static {p1, v0}, Lpn0;->b(Lon0;Lrn0;)V

    return-object p1
.end method
