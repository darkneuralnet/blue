.class public final LnQ5$e;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnQ5;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
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
        "nQ5$e",
        "Landroid/app/Dialog;",
        "",
        "onBackPressed",
        "status-dialog_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LnQ5;


# direct methods
.method public constructor <init>(LnQ5;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, LnQ5$e;->b:LnQ5;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, LnQ5$e;->b:LnQ5;

    invoke-virtual {v0}, LnQ5;->N6()LoQ5;

    move-result-object v0

    invoke-interface {v0}, LoQ5;->onBackPressed()V

    return-void
.end method
