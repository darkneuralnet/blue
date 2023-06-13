.class public final LGL5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$d;->g:LGL5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGL5$d;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, LGL5$d;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getPrivateBird$p(LGL5;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide v0, 0x53d3561d1cL

    goto :goto_0

    :cond_0
    iget-object p1, p0, LGL5$d;->g:LGL5;

    invoke-static {p1}, LGL5;->access$isHelmetLock$p(LGL5;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide v0, 0x40123b4f814L

    goto :goto_0

    :cond_1
    const-wide v0, 0x53d3800604L

    :goto_0
    iget-object p1, p0, LGL5$d;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getNavigator$p(LGL5;)Le13;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Le13;->w3(J)V

    return-void
.end method
