.class public Lkj1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXz6$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj1;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkj1;


# direct methods
.method public constructor <init>(Lkj1;)V
    .locals 0

    iput-object p1, p0, Lkj1$a;->a:Lkj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 1

    iget-object v0, p0, Lkj1$a;->a:Lkj1;

    invoke-static {v0, p1, p2}, Lkj1;->a5(Lkj1;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V

    return-void
.end method
