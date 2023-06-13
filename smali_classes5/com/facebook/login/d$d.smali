.class public Lcom/facebook/login/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGO5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:LIy1;


# direct methods
.method public constructor <init>(LIy1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lsj6;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/login/d$d;->a:LIy1;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/d$d;->a:LIy1;

    invoke-virtual {v0}, LIy1;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/d$d;->a:LIy1;

    invoke-virtual {v0, p1, p2}, LIy1;->d(Landroid/content/Intent;I)V

    return-void
.end method
