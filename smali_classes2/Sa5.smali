.class public final synthetic LSa5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:LUa5;


# direct methods
.method public synthetic constructor <init>(LUa5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSa5;->b:LUa5;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LSa5;->b:LUa5;

    invoke-static {v0, p1}, LUa5;->b(LUa5;Landroid/content/DialogInterface;)V

    return-void
.end method
