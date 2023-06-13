.class public final synthetic Lhw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC8;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LRC8;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw8;->b:LRC8;

    iput-object p2, p0, Lhw8;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lhw8;->b:LRC8;

    iget-object v1, p0, Lhw8;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, LRC8;->n(Landroid/os/Bundle;)V

    return-void
.end method
