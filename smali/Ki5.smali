.class public final synthetic LKi5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKi5;->a:Landroidx/lifecycle/p;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LKi5;->a:Landroidx/lifecycle/p;

    invoke-static {v0}, Landroidx/lifecycle/p;->a(Landroidx/lifecycle/p;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
