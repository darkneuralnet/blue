.class public final synthetic Lg13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Lh13;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Lh13;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg13;->b:Landroid/content/Intent;

    iput-object p2, p0, Lg13;->c:Lh13;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg13;->b:Landroid/content/Intent;

    iget-object v1, p0, Lg13;->c:Lh13;

    invoke-static {v0, v1}, Lh13;->D4(Landroid/content/Intent;Lh13;)V

    return-void
.end method
