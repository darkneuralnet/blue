.class public final synthetic LCm3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:LDm3;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;LDm3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCm3;->b:Landroid/content/Intent;

    iput-object p2, p0, LCm3;->c:LDm3;

    iput-boolean p3, p0, LCm3;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LCm3;->b:Landroid/content/Intent;

    iget-object v1, p0, LCm3;->c:LDm3;

    iget-boolean v2, p0, LCm3;->d:Z

    invoke-static {v0, v1, v2}, LDm3;->e(Landroid/content/Intent;LDm3;Z)V

    return-void
.end method
