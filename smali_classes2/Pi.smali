.class public final synthetic LPi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQi;

.field public final synthetic c:LNi;


# direct methods
.method public synthetic constructor <init>(LQi;LNi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPi;->b:LQi;

    iput-object p2, p0, LPi;->c:LNi;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LPi;->b:LQi;

    iget-object v1, p0, LPi;->c:LNi;

    invoke-static {v0, v1}, LQi;->c(LQi;LNi;)V

    return-void
.end method
