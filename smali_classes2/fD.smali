.class public final synthetic LfD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfD;->b:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LfD;->b:Lio/reactivex/H;

    invoke-static {v0, p1}, LXC$g;->a(Lio/reactivex/H;Landroid/content/DialogInterface;)V

    return-void
.end method
