.class public final synthetic LLZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LPZ0;

.field public final synthetic c:Ljava/lang/Runnable;

.field public final synthetic d:LQZ0$b;


# direct methods
.method public synthetic constructor <init>(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLZ0;->b:LPZ0;

    iput-object p2, p0, LLZ0;->c:Ljava/lang/Runnable;

    iput-object p3, p0, LLZ0;->d:LQZ0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LLZ0;->b:LPZ0;

    iget-object v1, p0, LLZ0;->c:Ljava/lang/Runnable;

    iget-object v2, p0, LLZ0;->d:LQZ0$b;

    invoke-static {v0, v1, v2}, LPZ0;->c(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method
