.class public final synthetic LyK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LBK6;

.field public final c:Landroid/os/Bundle;

.field public final d:LSo;


# direct methods
.method public constructor <init>(LBK6;Landroid/os/Bundle;LSo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyK6;->b:LBK6;

    iput-object p2, p0, LyK6;->c:Landroid/os/Bundle;

    iput-object p3, p0, LyK6;->d:LSo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LyK6;->b:LBK6;

    iget-object v1, p0, LyK6;->c:Landroid/os/Bundle;

    iget-object v2, p0, LyK6;->d:LSo;

    invoke-virtual {v0, v1, v2}, LBK6;->h(Landroid/os/Bundle;LSo;)V

    return-void
.end method
