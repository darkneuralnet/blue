.class public final synthetic LPy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQy0;

.field public final synthetic c:LZd3$a;


# direct methods
.method public synthetic constructor <init>(LQy0;LZd3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPy0;->b:LQy0;

    iput-object p2, p0, LPy0;->c:LZd3$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LPy0;->b:LQy0;

    iget-object v1, p0, LPy0;->c:LZd3$a;

    invoke-static {v0, v1}, LQy0;->a(LQy0;LZd3$a;)V

    return-void
.end method
