.class public final synthetic LXa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:LVa6;


# direct methods
.method public synthetic constructor <init>(LVa6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXa6;->b:LVa6;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LXa6;->b:LVa6;

    invoke-static {v0, p1}, LVa6$d$b;->a(LVa6;Landroid/content/DialogInterface;)V

    return-void
.end method
