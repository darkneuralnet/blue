.class final Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1;->invoke(LKY2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LAY2;",
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
        "SMAP\nVerificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,124:1\n1057#2,6:125\n76#3:131\n102#3,2:132\n76#3:134\n*S KotlinDebug\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1\n*L\n58#1:125,6\n58#1:131\n58#1:132,2\n70#1:134\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field final synthetic $navController:LOY2;

.field final synthetic $onResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher;LOY2;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "LOY2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$navController:LOY2;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$onResult:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$2(LEX2;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->invoke$lambda$2(LEX2;Z)V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$3(LsP5;)LAY2;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->invoke$lambda$3(LsP5;)LAY2;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$1(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final invoke$lambda$2(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final invoke$lambda$3(LsP5;)LAY2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "LAY2;",
            ">;)",
            "LAY2;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAY2;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAY2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->invoke(LAY2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LAY2;LEt0;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous> (VerificationDialog.kt:56)"

    const v3, -0x4b573e5e

    move/from16 v5, p3

    invoke-static {v3, v5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-static {v1, v3, v2, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v1

    invoke-interface {v4, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    move-object v9, v1

    check-cast v9, LEX2;

    iget-object v1, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getComponent$link_release()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccount()LtP5;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v13, 0x1

    invoke-static {v1, v3, v4, v2, v13}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-virtual {v8}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkEventsReporter()Lcom/stripe/android/link/analytics/LinkEventsReporter;

    move-result-object v3

    new-instance v14, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1;

    iget-object v5, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$onResult:Lkotlin/jvm/functions/Function1;

    invoke-direct {v14, v3, v5, v9}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$onDismiss$1;-><init>(Lcom/stripe/android/link/analytics/LinkEventsReporter;Lkotlin/jvm/functions/Function1;LEX2;)V

    iget-object v3, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$navController:LOY2;

    invoke-static {v3, v4, v2}, LPY2;->d(LDY2;LEt0;I)LsP5;

    move-result-object v12

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/link/model/LinkAccount;

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    iget-object v10, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$onResult:Lkotlin/jvm/functions/Function1;

    iget v11, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->$$dirty:I

    invoke-static {v9}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1;->invoke$lambda$1(LEX2;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v2, LD31;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x17

    const/16 v22, 0x0

    move-object v15, v2

    invoke-direct/range {v15 .. v22}, LD31;-><init>(ZZLOq5;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1;

    move-object v5, v1

    move-object v7, v14

    invoke-direct/range {v5 .. v12}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;LEX2;Lkotlin/jvm/functions/Function1;ILsP5;)V

    const v3, -0x115387be

    invoke-static {v4, v3, v13, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    const/16 v5, 0x1b0

    const/4 v6, 0x0

    move-object v1, v14

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LDc;->a(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V

    :cond_3
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    return-void

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
