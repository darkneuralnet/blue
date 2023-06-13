.class public final LNF6$d;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNF6;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "NF6$d",
        "Landroid/app/Dialog;",
        "",
        "onBackPressed",
        "workorders_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LNF6;


# direct methods
.method public constructor <init>(LNF6;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, LNF6$d;->b:LNF6;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    iget-object v0, p0, LNF6$d;->b:LNF6;

    invoke-virtual {v0}, LNF6;->N6()LQF6;

    move-result-object v0

    iget-object v1, p0, LNF6$d;->b:LNF6;

    invoke-static {v1}, LNF6;->access$getClickSubject$p(LNF6;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-interface {v0, v1}, LQF6;->a(Lio/reactivex/subjects/a;)V

    return-void
.end method
