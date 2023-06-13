.class public final LAm2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LMB5<",
        "LBt0;",
        ">;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LMB5;",
        "LBt0;",
        "",
        "a",
        "(LEt0;LEt0;I)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n*L\n1#1,316:1\n4216#2,4:317\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n192#1:317,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgV2;


# direct methods
.method public constructor <init>(LgV2;)V
    .locals 0

    iput-object p1, p0, LAm2$a;->g:LgV2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LEt0;LEt0;I)V
    .locals 3

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)"

    const v2, -0x5e8c5df4

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LAm2$a;->g:LgV2;

    invoke-static {p2, p3}, LDt0;->c(LEt0;LgV2;)LgV2;

    move-result-object p2

    const p3, 0x1e65194f

    invoke-interface {p1, p3}, LEt0;->F(I)V

    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object p3

    sget-object v0, LBt0;->M:LBt0$a;

    invoke-virtual {v0}, LBt0$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {p3, p2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMB5;

    invoke-virtual {p1}, LMB5;->f()LEt0;

    move-result-object p1

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LAm2$a;->a(LEt0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
