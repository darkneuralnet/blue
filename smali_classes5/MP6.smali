.class public final LMP6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcQ6;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:LjZ0;


# direct methods
.method public constructor <init>(LjZ0;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LMP6;->b:LjZ0;

    iput-object p2, p0, LMP6;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LAq2;)V
    .locals 1

    iget-object p1, p0, LMP6;->b:LjZ0;

    invoke-static {p1}, LjZ0;->l(LjZ0;)LAq2;

    move-result-object p1

    iget-object v0, p0, LMP6;->a:Landroid/os/Bundle;

    invoke-interface {p1, v0}, LAq2;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public final zaa()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
