.class final Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LUY2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LUY2;",
        "",
        "invoke",
        "(LUY2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $clearBackStack:Z

.field final synthetic $navController:LOY2;


# direct methods
.method public constructor <init>(ZLOY2;)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;->$clearBackStack:Z

    iput-object p2, p0, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;->$navController:LOY2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUY2;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;->invoke(LUY2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LUY2;)V
    .locals 2

    const-string v0, "$this$navigate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;->$clearBackStack:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1;->$navController:LOY2;

    invoke-virtual {v0}, LDY2;->v()Lkotlin/collections/ArrayDeque;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAY2;

    invoke-virtual {v0}, LAY2;->f()LHY2;

    move-result-object v0

    invoke-virtual {v0}, LHY2;->s()I

    move-result v0

    sget-object v1, Lcom/stripe/android/link/model/Navigator$navigateTo$1$1$1;->INSTANCE:Lcom/stripe/android/link/model/Navigator$navigateTo$1$1$1;

    invoke-virtual {p1, v0, v1}, LUY2;->c(ILkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
