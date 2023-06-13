.class public final synthetic LPo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUo6;

.field public final synthetic c:LMV5;

.field public final synthetic d:LLb0;

.field public final synthetic e:LYo6;

.field public final synthetic f:Lr46;


# direct methods
.method public synthetic constructor <init>(LUo6;LMV5;LLb0;LYo6;Lr46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPo6;->b:LUo6;

    iput-object p2, p0, LPo6;->c:LMV5;

    iput-object p3, p0, LPo6;->d:LLb0;

    iput-object p4, p0, LPo6;->e:LYo6;

    iput-object p5, p0, LPo6;->f:Lr46;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LPo6;->b:LUo6;

    iget-object v1, p0, LPo6;->c:LMV5;

    iget-object v2, p0, LPo6;->d:LLb0;

    iget-object v3, p0, LPo6;->e:LYo6;

    iget-object v4, p0, LPo6;->f:Lr46;

    invoke-static {v0, v1, v2, v3, v4}, LUo6;->X(LUo6;LMV5;LLb0;LYo6;Lr46;)V

    return-void
.end method
