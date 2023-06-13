.class public final synthetic LFZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:LQZ0$b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFZ0;->b:Ljava/lang/Runnable;

    iput-object p2, p0, LFZ0;->c:LQZ0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LFZ0;->b:Ljava/lang/Runnable;

    iget-object v1, p0, LFZ0;->c:LQZ0$b;

    invoke-static {v0, v1}, LPZ0;->j(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method
