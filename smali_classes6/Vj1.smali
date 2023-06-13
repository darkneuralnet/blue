.class public final synthetic LVj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LWj1;

.field public final synthetic c:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(LWj1;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVj1;->b:LWj1;

    iput-object p2, p0, LVj1;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVj1;->b:LWj1;

    iget-object v1, p0, LVj1;->c:Landroid/content/Intent;

    invoke-static {v0, v1}, LWj1;->a(LWj1;Landroid/content/Intent;)V

    return-void
.end method
