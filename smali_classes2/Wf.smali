.class public final LWf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVf;


# instance fields
.field public final a:LXf;


# direct methods
.method public constructor <init>(LXf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWf;->a:LXf;

    return-void
.end method

.method public static b(LXf;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXf;",
            ")",
            "LY94<",
            "LVf;",
            ">;"
        }
    .end annotation

    new-instance v0, LWf;

    invoke-direct {v0, p0}, LWf;-><init>(LXf;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LYf;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;)LPf;
    .locals 1

    iget-object v0, p0, LWf;->a:LXf;

    invoke-virtual {v0, p1, p2, p3}, LXf;->b(LYf;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;)LPf;

    move-result-object p1

    return-object p1
.end method
