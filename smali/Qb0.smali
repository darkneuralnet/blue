.class public final synthetic LQb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRb0$a;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LRb0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQb0;->b:LRb0$a;

    iput-object p2, p0, LQb0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LQb0;->b:LRb0$a;

    iget-object v1, p0, LQb0;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LRb0$a;->b(LRb0$a;Ljava/lang/String;)V

    return-void
.end method
