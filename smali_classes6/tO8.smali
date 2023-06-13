.class public final synthetic LtO8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LaP8;

.field public final synthetic c:I

.field public final synthetic d:LFc8;

.field public final synthetic e:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(LaP8;ILFc8;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtO8;->b:LaP8;

    iput p2, p0, LtO8;->c:I

    iput-object p3, p0, LtO8;->d:LFc8;

    iput-object p4, p0, LtO8;->e:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LtO8;->b:LaP8;

    iget v1, p0, LtO8;->c:I

    iget-object v2, p0, LtO8;->d:LFc8;

    iget-object v3, p0, LtO8;->e:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, LaP8;->c(ILFc8;Landroid/content/Intent;)V

    return-void
.end method
