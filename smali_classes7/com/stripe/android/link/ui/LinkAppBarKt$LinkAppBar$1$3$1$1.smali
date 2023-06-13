.class final Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
        "LEt0;",
        "Ljava/lang/Integer;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,208:1\n50#2:209\n49#2:210\n36#2:217\n1057#3,6:211\n1057#3,6:218\n*S KotlinDebug\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1\n*L\n101#1:209\n101#1:210\n105#1:217\n101#1:211,6\n105#1:218,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $onLogout:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$onLogout:Lkotlin/jvm/functions/Function0;

    iput p3, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 2

    const-string v0, "$this$invoke"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ui.LinkAppBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkAppBar.kt:98)"

    const v1, -0xcf427a3

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$onLogout:Lkotlin/jvm/functions/Function0;

    const v0, 0x1e7b2b64

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    :cond_3
    new-instance v1, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1$1$1;

    invoke-direct {v1, p1, p3}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object p1, p0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_5

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_6

    :cond_5
    new-instance v0, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1$2$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-static {v1, v0, p2, p1}, Lcom/stripe/android/link/ui/LinkLogoutSheetKt;->LinkLogoutSheet(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_1
    return-void
.end method
