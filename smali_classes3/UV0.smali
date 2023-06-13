.class public final synthetic LUV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LWV0;

.field public final synthetic d:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(ZLWV0;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LUV0;->b:Z

    iput-object p2, p0, LUV0;->c:LWV0;

    iput-object p3, p0, LUV0;->d:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-boolean v0, p0, LUV0;->b:Z

    iget-object v1, p0, LUV0;->c:LWV0;

    iget-object v2, p0, LUV0;->d:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, LWV0;->l(ZLWV0;Landroid/content/Intent;)V

    return-void
.end method
