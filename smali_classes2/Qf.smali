.class public final synthetic LQf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LPf;

.field public final synthetic c:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(LPf;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQf;->b:LPf;

    iput-object p2, p0, LQf;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LQf;->b:LPf;

    iget-object v1, p0, LQf;->c:Landroid/content/Intent;

    invoke-static {v0, v1}, LPf$c;->b(LPf;Landroid/content/Intent;)V

    return-void
.end method
