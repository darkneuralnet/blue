.class public final Lxd$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd;->a(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V
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
.field public final synthetic g:Landroidx/compose/ui/window/PopupLayout;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LAY3;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lpm2;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/PopupLayout;Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Lpm2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/window/PopupLayout;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LAY3;",
            "Ljava/lang/String;",
            "Lpm2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lxd$c;->g:Landroidx/compose/ui/window/PopupLayout;

    iput-object p2, p0, Lxd$c;->h:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lxd$c;->i:LAY3;

    iput-object p4, p0, Lxd$c;->j:Ljava/lang/String;

    iput-object p5, p0, Lxd$c;->k:Lpm2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd$c;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    iget-object v0, p0, Lxd$c;->g:Landroidx/compose/ui/window/PopupLayout;

    iget-object v1, p0, Lxd$c;->h:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lxd$c;->i:LAY3;

    iget-object v3, p0, Lxd$c;->j:Ljava/lang/String;

    iget-object v4, p0, Lxd$c;->k:Lpm2;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/compose/ui/window/PopupLayout;->r(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Lpm2;)V

    return-void
.end method
