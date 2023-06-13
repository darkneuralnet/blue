.class public final Lcom/stripe/android/link/ui/LinkButtonView;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0008\u0002\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028\u0014@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R7\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00142\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u000c\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkButtonView;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "",
        "enabled",
        "",
        "setEnabled",
        "Content",
        "(LEt0;I)V",
        "<set-?>",
        "shouldCreateCompositionOnAttachedToWindow",
        "Z",
        "getShouldCreateCompositionOnAttachedToWindow",
        "()Z",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkPaymentLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "getLinkPaymentLauncher",
        "()Lcom/stripe/android/link/LinkPaymentLauncher;",
        "setLinkPaymentLauncher",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;)V",
        "Lkotlin/Function0;",
        "onClick$delegate",
        "LEX2;",
        "getOnClick",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnClick",
        "(Lkotlin/jvm/functions/Function0;)V",
        "onClick",
        "isEnabledState$delegate",
        "isEnabledState",
        "setEnabledState",
        "(Z)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonView\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n76#2:167\n102#2,2:168\n76#2:170\n102#2,2:171\n76#2:173\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonView\n*L\n146#1:167\n146#1:168,2\n147#1:170\n147#1:171,2\n157#1:173\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final isEnabledState$delegate:LEX2;

.field private linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final onClick$delegate:LEX2;

.field private shouldCreateCompositionOnAttachedToWindow:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/LinkButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/LinkButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Lcom/stripe/android/link/ui/LinkButtonView$onClick$2;->INSTANCE:Lcom/stripe/android/link/ui/LinkButtonView$onClick$2;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonView;->onClick$delegate:LEX2;

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p2, p3, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonView;->isEnabledState$delegate:LEX2;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final Content$lambda$1$lambda$0(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private final isEnabledState()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->isEnabledState$delegate:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final setEnabledState(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->isEnabledState$delegate:LEX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public Content(LEt0;I)V
    .locals 8

    const v0, 0xdb59f24

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.LinkButtonView.Content (LinkButtonView.kt:154)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/link/LinkPaymentLauncher;->getEmailFlow()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, p1

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/link/ui/LinkButtonView;->Content$lambda$1$lambda$0(LsP5;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/link/ui/LinkButtonView;->isEnabledState()Z

    move-result v2

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/LinkButtonView;->getOnClick()Lkotlin/jvm/functions/Function0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x8

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/link/ui/LinkButtonView$Content$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/LinkButtonView$Content$2;-><init>(Lcom/stripe/android/link/ui/LinkButtonView;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public final getLinkPaymentLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    return-object v0
.end method

.method public final getOnClick()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->onClick$delegate:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->shouldCreateCompositionOnAttachedToWindow:Z

    return v0
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/LinkButtonView;->setEnabledState(Z)V

    return-void
.end method

.method public final setLinkPaymentLauncher(Lcom/stripe/android/link/LinkPaymentLauncher;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonView;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    return-void
.end method

.method public final setOnClick(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonView;->onClick$delegate:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
