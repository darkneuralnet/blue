.class public final synthetic LL86;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic b:Lio/reactivex/r;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL86;->b:Lio/reactivex/r;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LL86;->b:Lio/reactivex/r;

    invoke-static {v0, p1}, LK86$b;->a(Lio/reactivex/r;Landroid/content/DialogInterface;)V

    return-void
.end method
