.class final Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/menus/LinkMenuKt;->LinkMenu(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $item:Lcom/stripe/android/link/ui/menus/LinkMenuItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic $onItemPress:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/ui/menus/LinkMenuItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;->$onItemPress:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;->$item:Lcom/stripe/android/link/ui/menus/LinkMenuItem;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;->$onItemPress:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;->$item:Lcom/stripe/android/link/ui/menus/LinkMenuItem;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method