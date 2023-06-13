.class public final LIK0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/servicecenter/idtools/identify/associate/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIK0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:LIK0$b;


# direct methods
.method public constructor <init>(LIK0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIK0$c;->a:LIK0$b;

    return-void
.end method

.method public synthetic constructor <init>(LIK0$b;LKK0;)V
    .locals 0

    invoke-direct {p0, p1}, LIK0$c;-><init>(LIK0$b;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)Lco/bird/android/feature/servicecenter/idtools/identify/associate/a;
    .locals 8

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, LIK0$d;

    iget-object v1, p0, LIK0$c;->a:LIK0$b;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, LIK0$d;-><init>(LIK0$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;LLK0;)V

    return-object v7
.end method
