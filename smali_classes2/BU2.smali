.class public final synthetic LBU2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:LDU2;


# direct methods
.method public synthetic constructor <init>(LDU2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBU2;->b:LDU2;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LBU2;->b:LDU2;

    invoke-static {v0, p1}, LDU2;->a(LDU2;Landroid/content/DialogInterface;)V

    return-void
.end method
