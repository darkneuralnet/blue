.class public final Ljn6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn6;->a()V
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
.field public final synthetic g:Ljn6;


# direct methods
.method public constructor <init>(Ljn6;)V
    .locals 0

    iput-object p1, p0, Ljn6$f;->g:Ljn6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Ljn6$f;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 0

    iget-object p1, p0, Ljn6$f;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getLocationManager$p(Ljn6;)Ldr4;

    move-result-object p1

    invoke-interface {p1}, Ldr4;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljn6$f;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getNavigator$p(Ljn6;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->C()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ljn6$f;->g:Ljn6;

    invoke-static {p1}, Ljn6;->access$getNavigator$p(Ljn6;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->v1()V

    :goto_0
    return-void
.end method
