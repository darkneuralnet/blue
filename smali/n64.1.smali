.class public final synthetic Ln64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxA1;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln64;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln64;->a:Landroid/content/Context;

    check-cast p1, Lyc0;

    invoke-static {v0, p1}, Landroidx/camera/lifecycle/b;->c(Landroid/content/Context;Lyc0;)Landroidx/camera/lifecycle/b;

    move-result-object p1

    return-object p1
.end method
