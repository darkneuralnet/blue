.class public final synthetic LvP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LwP2;

.field public final synthetic c:LwP2$a;


# direct methods
.method public synthetic constructor <init>(LwP2;LwP2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvP2;->b:LwP2;

    iput-object p2, p0, LvP2;->c:LwP2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LvP2;->b:LwP2;

    iget-object v1, p0, LvP2;->c:LwP2$a;

    invoke-static {v0, v1}, LwP2$a;->c(LwP2;LwP2$a;)V

    return-void
.end method
