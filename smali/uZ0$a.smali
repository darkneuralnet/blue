.class public LuZ0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuZ0;->a(LHG6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LHG6;

.field public final synthetic c:LuZ0;


# direct methods
.method public constructor <init>(LuZ0;LHG6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LuZ0$a;->c:LuZ0;

    iput-object p2, p0, LuZ0$a;->b:LHG6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LuZ0;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scheduling work "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LuZ0$a;->b:LHG6;

    iget-object v3, v3, LHG6;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LuZ0$a;->c:LuZ0;

    iget-object v0, v0, LuZ0;->a:LbE1;

    const/4 v1, 0x1

    new-array v1, v1, [LHG6;

    const/4 v2, 0x0

    iget-object v3, p0, LuZ0$a;->b:LHG6;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, LbE1;->b([LHG6;)V

    return-void
.end method
