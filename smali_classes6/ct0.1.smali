.class public final synthetic Lct0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lqy3;

.field public final synthetic c:LX94;


# direct methods
.method public synthetic constructor <init>(Lqy3;LX94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lct0;->b:Lqy3;

    iput-object p2, p0, Lct0;->c:LX94;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lct0;->b:Lqy3;

    iget-object v1, p0, Lct0;->c:LX94;

    invoke-static {v0, v1}, Let0;->k(Lqy3;LX94;)V

    return-void
.end method
