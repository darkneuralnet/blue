.class public final synthetic LwK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LBK6;

.field public final c:LSo;


# direct methods
.method public constructor <init>(LBK6;LSo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwK6;->b:LBK6;

    iput-object p2, p0, LwK6;->c:LSo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LwK6;->b:LBK6;

    iget-object v1, p0, LwK6;->c:LSo;

    invoke-virtual {v0, v1}, LVK6;->d(Ljava/lang/Object;)V

    return-void
.end method
