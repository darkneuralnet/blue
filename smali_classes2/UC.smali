.class public final synthetic LUC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:LXC;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lio/reactivex/subjects/b;


# direct methods
.method public synthetic constructor <init>(LXC;Lkotlin/jvm/functions/Function0;Lio/reactivex/subjects/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUC;->b:LXC;

    iput-object p2, p0, LUC;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, LUC;->d:Lio/reactivex/subjects/b;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    iget-object v0, p0, LUC;->b:LXC;

    iget-object v1, p0, LUC;->c:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, LUC;->d:Lio/reactivex/subjects/b;

    invoke-static {v0, v1, v2, p1}, LXC;->Ml(LXC;Lkotlin/jvm/functions/Function0;Lio/reactivex/subjects/b;Landroid/content/DialogInterface;)V

    return-void
.end method
