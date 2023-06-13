.class public final synthetic LAK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LBK6;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(LBK6;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAK6;->b:LBK6;

    iput-object p2, p0, LAK6;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LAK6;->b:LBK6;

    iget-object v1, p0, LAK6;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, LBK6;->g(Landroid/os/Bundle;)V

    return-void
.end method
