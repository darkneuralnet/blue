.class public final synthetic LOV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LWV0;


# direct methods
.method public synthetic constructor <init>(LWV0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOV0;->b:LWV0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LOV0;->b:LWV0;

    invoke-static {v0}, LWV0;->g(LWV0;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
