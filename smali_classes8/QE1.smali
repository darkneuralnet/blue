.class public final synthetic LQE1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo51;


# instance fields
.field public final synthetic b:LRE1;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LRE1;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQE1;->b:LRE1;

    iput-object p2, p0, LQE1;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, LQE1;->b:LRE1;

    iget-object v1, p0, LQE1;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, LRE1;->T(LRE1;Ljava/lang/Runnable;)V

    return-void
.end method
