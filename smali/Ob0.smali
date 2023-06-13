.class public final synthetic LOb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRb0$a;


# direct methods
.method public synthetic constructor <init>(LRb0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOb0;->b:LRb0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LOb0;->b:LRb0$a;

    invoke-static {v0}, LRb0$a;->a(LRb0$a;)V

    return-void
.end method
