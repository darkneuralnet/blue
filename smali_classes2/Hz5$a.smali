.class public final LHz5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHz5;->o(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/Token;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/stripe/android/model/Token;",
        "kotlin.jvm.PlatformType",
        "token",
        "",
        "a",
        "(Lcom/stripe/android/model/Token;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHz5;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LHz5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LHz5$a;->g:LHz5;

    iput-object p2, p0, LHz5$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/stripe/android/model/Token;)V
    .locals 3

    iget-object v0, p0, LHz5$a;->g:LHz5;

    iget-object v1, p0, LHz5$a;->h:Ljava/lang/String;

    new-instance v2, LnM3;

    invoke-virtual {p1}, Lcom/stripe/android/model/Token;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, LnM3;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, LHz5;->access$execute(LHz5;Ljava/lang/String;LN80;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/Token;

    invoke-virtual {p0, p1}, LHz5$a;->a(Lcom/stripe/android/model/Token;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method