.class public final synthetic Lqx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lxy8;

.field public final synthetic c:LMd9;

.field public final synthetic d:LZx8;


# direct methods
.method public synthetic constructor <init>(Lxy8;LMd9;LZx8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqx8;->b:Lxy8;

    iput-object p2, p0, Lqx8;->c:LMd9;

    iput-object p3, p0, Lqx8;->d:LZx8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lqx8;->b:Lxy8;

    iget-object v1, p0, Lqx8;->c:LMd9;

    iget-object v2, p0, Lqx8;->d:LZx8;

    invoke-virtual {v0, v1, v2}, Lxy8;->f(LMd9;LZx8;)V

    return-void
.end method
