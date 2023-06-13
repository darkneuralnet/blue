.class final Lcom/stripe/android/link/LinkActivity$onCreate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,276:1\n1057#2,6:277\n1057#2,3:288\n1060#2,3:294\n474#3,4:283\n478#3,2:291\n482#3:297\n25#4:287\n474#5:293\n76#6:298\n102#6,2:299\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1\n*L\n80#1:277,6\n82#1:288,3\n82#1:294,3\n82#1:283,4\n82#1:291,2\n82#1:297\n82#1:287\n82#1:293\n80#1:298\n80#1:299,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/link/LinkActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$invoke$lambda$2(LEX2;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke$lambda$2(LEX2;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method private static final invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function3;

    return-object p0
.end method

.method private static final invoke$lambda$2(LEX2;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.stripe.android.link.LinkActivity.onCreate.<anonymous> (LinkActivity.kt:78)"

    const v3, 0x5a46c849

    invoke-static {v3, p2, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne p2, v2, :cond_3

    const/4 p2, 0x0

    invoke-static {p2, p2, v1, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, LEX2;

    sget-object v1, LHU2;->b:LHU2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x6

    move-object v4, p1

    invoke-static/range {v1 .. v6}, LFU2;->n(LHU2;Llf;Lkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object v1

    const v2, 0x2e20b340

    invoke-interface {p1, v2}, LEt0;->F(I)V

    const v2, -0x1d58f75c

    invoke-interface {p1, v2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v0, p1}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v0

    new-instance v2, Liu0;

    invoke-direct {v2, v0}, Liu0;-><init>(LZC0;)V

    invoke-interface {p1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v2, Liu0;

    invoke-virtual {v2}, Liu0;->a()LZC0;

    move-result-object v0

    invoke-interface {p1}, LEt0;->Q()V

    const v2, -0x56b9b13e

    invoke-interface {p1, v2}, LEt0;->F(I)V

    invoke-static {p2}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    invoke-static {p2}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    new-instance v4, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;

    invoke-direct {v4, v0, v1}, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;-><init>(LZC0;LGU2;)V

    invoke-static {v2, v4, p1, v3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    :cond_5
    invoke-interface {p1}, LEt0;->Q()V

    new-instance v2, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;

    iget-object v4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v2, v1, p2, v4, v0}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;-><init>(LGU2;LEX2;Lcom/stripe/android/link/LinkActivity;LZC0;)V

    const p2, -0x5403c9b3

    const/4 v0, 0x1

    invoke-static {p1, p2, v0, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p2

    const/16 v1, 0x30

    invoke-static {v3, p2, p1, v1, v0}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_1
    return-void
.end method
