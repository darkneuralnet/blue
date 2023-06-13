.class public final Lie1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1;->M(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "permissionResponse",
        "",
        "a",
        "(LFQ3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;


# direct methods
.method public constructor <init>(Lie1;)V
    .locals 0

    iput-object p1, p0, Lie1$l;->g:Lie1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)V
    .locals 1

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lie1$l;->g:Lie1;

    invoke-static {p1}, Lie1;->access$getNavigator$p(Lie1;)Le13;

    move-result-object p1

    iget-object v0, p0, Lie1$l;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getScanRequestCode$p(Lie1;)I

    move-result v0

    invoke-interface {p1, v0}, Le13;->y3(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "User deny camera to scan card"

    invoke-static {v0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, Lie1$l;->a(LFQ3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
