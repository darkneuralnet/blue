.class public final Lco/bird/android/foregroundservice/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/foregroundservice/ForegroundService$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/foregroundservice/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/foregroundservice/a$b;


# direct methods
.method public constructor <init>(LlG2;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/foregroundservice/a$b;->b:Lco/bird/android/foregroundservice/a$b;

    iput-object p1, p0, Lco/bird/android/foregroundservice/a$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lcom/uber/autodispose/ScopeProvider;LWJ0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/foregroundservice/a$b;-><init>(LlG2;Lcom/uber/autodispose/ScopeProvider;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/foregroundservice/ForegroundService;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/foregroundservice/a$b;->b(Lco/bird/android/foregroundservice/ForegroundService;)Lco/bird/android/foregroundservice/ForegroundService;

    return-void
.end method

.method public final b(Lco/bird/android/foregroundservice/ForegroundService;)Lco/bird/android/foregroundservice/ForegroundService;
    .locals 1

    iget-object v0, p0, Lco/bird/android/foregroundservice/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X0()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {p1, v0}, Lrx1;->c(Lco/bird/android/foregroundservice/ForegroundService;Ljava/util/Set;)V

    iget-object v0, p0, Lco/bird/android/foregroundservice/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->t0()LOh;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOh;

    invoke-static {p1, v0}, Lrx1;->a(Lco/bird/android/foregroundservice/ForegroundService;LOh;)V

    return-object p1
.end method
