.class public final Lcom/chuckerteam/chucker/internal/support/a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/chuckerteam/chucker/internal/support/a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/app/PendingIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroid/app/PendingIntent;",
        "kotlin.jvm.PlatformType",
        "b",
        "()Landroid/app/PendingIntent;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/chuckerteam/chucker/internal/support/a;


# direct methods
.method public constructor <init>(Lcom/chuckerteam/chucker/internal/support/a;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/support/a$b;->g:Lcom/chuckerteam/chucker/internal/support/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a$b;->g:Lcom/chuckerteam/chucker/internal/support/a;

    invoke-virtual {v0}, Lcom/chuckerteam/chucker/internal/support/a;->h()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/support/a$b;->g:Lcom/chuckerteam/chucker/internal/support/a;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/a;->h()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ljj0;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/support/a$b;->g:Lcom/chuckerteam/chucker/internal/support/a;

    invoke-static {v2}, Lcom/chuckerteam/chucker/internal/support/a;->c(Lcom/chuckerteam/chucker/internal/support/a;)I

    move-result v2

    const/high16 v3, 0x8000000

    or-int/2addr v2, v3

    const/16 v3, 0x472

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a$b;->b()Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method
