.class public final synthetic LhD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:Lio/reactivex/r;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhD;->b:Lio/reactivex/r;

    iput-object p2, p0, LhD;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, LhD;->b:Lio/reactivex/r;

    iget-object v1, p0, LhD;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {v0, v1, p1}, LXC$h;->b(Lio/reactivex/r;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/DialogInterface;)V

    return-void
.end method
