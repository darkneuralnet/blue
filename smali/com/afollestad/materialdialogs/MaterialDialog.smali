.class public final Lcom/afollestad/materialdialogs/MaterialDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/afollestad/materialdialogs/MaterialDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 q2\u00020\u0001:\u0001qB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0008J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0008J\u0006\u0010H\u001a\u00020\u0000J\u0008\u0010I\u001a\u00020\u0000H\u0007J\u0006\u0010J\u001a\u00020\u0000J\u0019\u0010$\u001a\u0002HK\"\u0004\u0008\u0000\u0010K2\u0006\u0010L\u001a\u00020&\u00a2\u0006\u0002\u0010MJ#\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010*2\n\u0008\u0003\u0010O\u001a\u0004\u0018\u000106\u00a2\u0006\u0002\u0010PJ\u0012\u0010Q\u001a\u00020\u00002\u0008\u0008\u0002\u0010Q\u001a\u00020\u0008H\u0007J\u0008\u0010R\u001a\u00020\u001aH\u0016J#\u0010S\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010U\u00a2\u0006\u0002\u0010VJ\u0008\u0010W\u001a\u00020\u001aH\u0002J#\u00105\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0003\u0010X\u001a\u0004\u0018\u000106\u00a2\u0006\u0002\u0010YJ@\u0010Z\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001b\u0008\u0002\u0010]\u001a\u0015\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u00a2\u0006\u0002\u0008_\u00a2\u0006\u0002\u0010`JA\u0010a\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\u0008\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b\u00a2\u0006\u0002\u0010`JC\u0010c\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\u0008\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001bH\u0007\u00a2\u0006\u0002\u0010`J\u0008\u0010d\u001a\u00020\u0000H\u0007J\u0015\u0010e\u001a\u00020\u001a2\u0006\u0010f\u001a\u00020gH\u0000\u00a2\u0006\u0002\u0008hJA\u0010i\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\\2\u001c\u0008\u0002\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b\u00a2\u0006\u0002\u0010`J\u0010\u0010j\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0008H\u0017J\u0010\u0010k\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0008H\u0017J\u0008\u0010l\u001a\u00020\u001aH\u0002J\u0008\u0010m\u001a\u00020\u001aH\u0016J\"\u0010m\u001a\u00020\u00002\u0017\u0010n\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008_H\u0086\u0008J#\u0010o\u001a\u00020\u00002\n\u0008\u0003\u0010O\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u0010pR$\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011\"\u0004\u0008\u0016\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u000b\"\u0004\u0008 \u0010\rR$\u0010!\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u000b\"\u0004\u0008#\u0010\rR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'0%\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R*\u0010+\u001a\u0004\u0018\u00010*2\u0008\u0010\u0007\u001a\u0004\u0018\u00010*@@X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R*\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001dR\u0016\u00105\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u00107R$\u00108\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00109\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010\u001dR*\u0010=\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u0018X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\u001dR(\u0010?\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010\u0011\"\u0004\u0008A\u0010\u0013R\u0011\u0010B\u001a\u00020C\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010G\u00a8\u0006r"
    }
    d2 = {
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Landroid/app/Dialog;",
        "windowContext",
        "Landroid/content/Context;",
        "dialogBehavior",
        "Lcom/afollestad/materialdialogs/DialogBehavior;",
        "(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)V",
        "<set-?>",
        "",
        "autoDismissEnabled",
        "getAutoDismissEnabled",
        "()Z",
        "setAutoDismissEnabled$core",
        "(Z)V",
        "Landroid/graphics/Typeface;",
        "bodyFont",
        "getBodyFont",
        "()Landroid/graphics/Typeface;",
        "setBodyFont$core",
        "(Landroid/graphics/Typeface;)V",
        "buttonFont",
        "getButtonFont",
        "setButtonFont$core",
        "cancelListeners",
        "",
        "Lkotlin/Function1;",
        "",
        "Lcom/afollestad/materialdialogs/DialogCallback;",
        "getCancelListeners$core",
        "()Ljava/util/List;",
        "cancelOnTouchOutside",
        "getCancelOnTouchOutside",
        "setCancelOnTouchOutside$core",
        "cancelable",
        "getCancelable",
        "setCancelable$core",
        "config",
        "",
        "",
        "",
        "getConfig",
        "()Ljava/util/Map;",
        "",
        "cornerRadius",
        "getCornerRadius",
        "()Ljava/lang/Float;",
        "setCornerRadius$core",
        "(Ljava/lang/Float;)V",
        "Ljava/lang/Float;",
        "getDialogBehavior",
        "()Lcom/afollestad/materialdialogs/DialogBehavior;",
        "dismissListeners",
        "getDismissListeners$core",
        "maxWidth",
        "",
        "Ljava/lang/Integer;",
        "negativeListeners",
        "neutralListeners",
        "positiveListeners",
        "preShowListeners",
        "getPreShowListeners$core",
        "showListeners",
        "getShowListeners$core",
        "titleFont",
        "getTitleFont",
        "setTitleFont$core",
        "view",
        "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;",
        "getView",
        "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;",
        "getWindowContext",
        "()Landroid/content/Context;",
        "clearNegativeListeners",
        "clearNeutralListeners",
        "clearPositiveListeners",
        "T",
        "key",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "literalDp",
        "res",
        "(Ljava/lang/Float;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;",
        "debugMode",
        "dismiss",
        "icon",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lcom/afollestad/materialdialogs/MaterialDialog;",
        "invalidateBackgroundColorAndRadius",
        "literal",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;",
        "message",
        "text",
        "",
        "applySettings",
        "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;",
        "Lkotlin/ExtensionFunctionType;",
        "(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;",
        "negativeButton",
        "click",
        "neutralButton",
        "noAutoDismiss",
        "onActionButtonClicked",
        "which",
        "Lcom/afollestad/materialdialogs/WhichButton;",
        "onActionButtonClicked$core",
        "positiveButton",
        "setCancelable",
        "setCanceledOnTouchOutside",
        "setWindowConstraints",
        "show",
        "func",
        "title",
        "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog;",
        "Companion",
        "core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# static fields
.field public static final Companion:Lcom/afollestad/materialdialogs/MaterialDialog$Companion;

.field private static DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;


# instance fields
.field private autoDismissEnabled:Z

.field private bodyFont:Landroid/graphics/Typeface;

.field private buttonFont:Landroid/graphics/Typeface;

.field private final cancelListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private cancelOnTouchOutside:Z

.field private cancelable:Z

.field private final config:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private cornerRadius:Ljava/lang/Float;

.field private final dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

.field private final dismissListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private maxWidth:Ljava/lang/Integer;

.field private final negativeListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final neutralListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final positiveListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final preShowListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final showListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private titleFont:Landroid/graphics/Typeface;

.field private final view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

.field private final windowContext:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/afollestad/materialdialogs/MaterialDialog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/afollestad/materialdialogs/MaterialDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/afollestad/materialdialogs/MaterialDialog;->Companion:Lcom/afollestad/materialdialogs/MaterialDialog$Companion;

    sget-object v0, Lcom/afollestad/materialdialogs/ModalDialog;->INSTANCE:Lcom/afollestad/materialdialogs/ModalDialog;

    sput-object v0, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)V
    .locals 4

    invoke-static {p1, p2}, Lcom/afollestad/materialdialogs/ThemeKt;->inferTheme(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->config:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->autoDismissEnabled:Z

    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelOnTouchOutside:Z

    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->preShowListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->showListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dismissListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeListeners:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->neutralListeners:Ljava/util/List;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v3, "window!!"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "layoutInflater"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, v2, v1, p0}, Lcom/afollestad/materialdialogs/DialogBehavior;->createView(Landroid/content/Context;Landroid/view/Window;Landroid/view/LayoutInflater;Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-interface {p2, p1}, Lcom/afollestad/materialdialogs/DialogBehavior;->getDialogLayout(Landroid/view/ViewGroup;)Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/afollestad/materialdialogs/internal/main/DialogLayout;->attachDialog(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    sget p1, Lcom/afollestad/materialdialogs/R$attr;->md_font_title:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p0, p2, p1, v0, p2}, Lcom/afollestad/materialdialogs/utils/FontsKt;->font$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->titleFont:Landroid/graphics/Typeface;

    sget p1, Lcom/afollestad/materialdialogs/R$attr;->md_font_body:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p2, p1, v0, p2}, Lcom/afollestad/materialdialogs/utils/FontsKt;->font$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->bodyFont:Landroid/graphics/Typeface;

    sget p1, Lcom/afollestad/materialdialogs/R$attr;->md_font_button:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p2, p1, v0, p2}, Lcom/afollestad/materialdialogs/utils/FontsKt;->font$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    invoke-direct {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->invalidateBackgroundColorAndRadius()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/afollestad/materialdialogs/MaterialDialog;-><init>(Landroid/content/Context;Lcom/afollestad/materialdialogs/DialogBehavior;)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_BEHAVIOR$cp()Lcom/afollestad/materialdialogs/DialogBehavior;
    .locals 1

    sget-object v0, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-object v0
.end method

.method public static final synthetic access$setDEFAULT_BEHAVIOR$cp(Lcom/afollestad/materialdialogs/DialogBehavior;)V
    .locals 0

    sput-object p0, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-void
.end method

.method public static synthetic cornerRadius$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Float;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->cornerRadius(Ljava/lang/Float;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic debugMode$default(Lcom/afollestad/materialdialogs/MaterialDialog;ZILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->debugMode(Z)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static final getDEFAULT_BEHAVIOR()Lcom/afollestad/materialdialogs/DialogBehavior;
    .locals 1

    sget-object v0, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-object v0
.end method

.method public static synthetic icon$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->icon(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method private final invalidateBackgroundColorAndRadius()V
    .locals 7

    const/4 v1, 0x0

    sget v0, Lcom/afollestad/materialdialogs/R$attr;->md_background_color:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lcom/afollestad/materialdialogs/MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1;

    invoke-direct {v3, p0}, Lcom/afollestad/materialdialogs/MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1;-><init>(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/afollestad/materialdialogs/utils/ColorsKt;->resolveColor$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    iget-object v2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    iget-object v3, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cornerRadius:Ljava/lang/Float;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    iget-object v4, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    sget v5, Lcom/afollestad/materialdialogs/R$attr;->md_corner_radius:I

    new-instance v6, Lcom/afollestad/materialdialogs/MaterialDialog$invalidateBackgroundColorAndRadius$1;

    invoke-direct {v6, p0}, Lcom/afollestad/materialdialogs/MaterialDialog$invalidateBackgroundColorAndRadius$1;-><init>(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-virtual {v3, v4, v5, v6}, Lcom/afollestad/materialdialogs/utils/MDUtil;->resolveDimen(Landroid/content/Context;ILkotlin/jvm/functions/Function0;)F

    move-result v3

    :goto_0
    invoke-interface {v1, v2, v0, v3}, Lcom/afollestad/materialdialogs/DialogBehavior;->setBackgroundColor(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;IF)V

    return-void
.end method

.method public static synthetic maxWidth$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->maxWidth(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic message$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/MaterialDialog;->message(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic negativeButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic neutralButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/MaterialDialog;->neutralButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic positiveButton$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static final setDEFAULT_BEHAVIOR(Lcom/afollestad/materialdialogs/DialogBehavior;)V
    .locals 0

    sput-object p0, Lcom/afollestad/materialdialogs/MaterialDialog;->DEFAULT_BEHAVIOR:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-void
.end method

.method private final setWindowConstraints()V
    .locals 5

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    iget-object v1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->maxWidth:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v4, "window!!"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    invoke-interface {v0, v1, v3, v4, v2}, Lcom/afollestad/materialdialogs/DialogBehavior;->setWindowConstraints(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic title$default(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/MaterialDialog;->title(Ljava/lang/Integer;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cancelOnTouchOutside(Z)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->setCanceledOnTouchOutside(Z)V

    return-object p0
.end method

.method public final cancelable(Z)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/afollestad/materialdialogs/MaterialDialog;->setCancelable(Z)V

    return-object p0
.end method

.method public final clearNegativeListeners()Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p0
.end method

.method public final clearNeutralListeners()Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions."
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->neutralListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p0
.end method

.method public final clearPositiveListeners()Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p0
.end method

.method public final config(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->config:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cornerRadius(Ljava/lang/Float;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 2

    sget-object v0, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    const-string v1, "cornerRadius"

    invoke-virtual {v0, v1, p1, p2}, Lcom/afollestad/materialdialogs/utils/MDUtil;->assertOneSet(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const-string v0, "windowContext.resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    if-nez p1, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v0, 0x1

    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cornerRadius:Ljava/lang/Float;

    invoke-direct {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->invalidateBackgroundColorAndRadius()V

    return-object p0
.end method

.method public final debugMode(Z)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    invoke-virtual {v0, p1}, Lcom/afollestad/materialdialogs/internal/main/DialogLayout;->setDebugMode(Z)V

    return-object p0
.end method

.method public dismiss()V
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    invoke-interface {v0}, Lcom/afollestad/materialdialogs/DialogBehavior;->onDismiss()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->hideKeyboard(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public final getAutoDismissEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->autoDismissEnabled:Z

    return v0
.end method

.method public final getBodyFont()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->bodyFont:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final getButtonFont()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final getCancelListeners$core()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelListeners:Ljava/util/List;

    return-object v0
.end method

.method public final getCancelOnTouchOutside()Z
    .locals 1

    iget-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelOnTouchOutside:Z

    return v0
.end method

.method public final getCancelable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable:Z

    return v0
.end method

.method public final getConfig()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->config:Ljava/util/Map;

    return-object v0
.end method

.method public final getCornerRadius()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cornerRadius:Ljava/lang/Float;

    return-object v0
.end method

.method public final getDialogBehavior()Lcom/afollestad/materialdialogs/DialogBehavior;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    return-object v0
.end method

.method public final getDismissListeners$core()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dismissListeners:Ljava/util/List;

    return-object v0
.end method

.method public final getPreShowListeners$core()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->preShowListeners:Ljava/util/List;

    return-object v0
.end method

.method public final getShowListeners$core()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->showListeners:Ljava/util/List;

    return-object v0
.end method

.method public final getTitleFont()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->titleFont:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final getView()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    return-object v0
.end method

.method public final getWindowContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    return-object v0
.end method

.method public final icon(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 2

    sget-object v0, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    const-string v1, "icon"

    invoke-virtual {v0, v1, p2, p1}, Lcom/afollestad/materialdialogs/utils/MDUtil;->assertOneSet(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/internal/main/DialogLayout;->getTitleLayout()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;->getIconView$core()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->populateIcon(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public final maxWidth(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 2

    sget-object v0, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    const-string v1, "maxWidth"

    invoke-virtual {v0, v1, p1, p2}, Lcom/afollestad/materialdialogs/utils/MDUtil;->assertOneSet(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->maxWidth:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->windowContext:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_2

    :cond_2
    if-nez p2, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    :goto_2
    iput-object p2, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->maxWidth:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->setWindowConstraints()V

    :cond_4
    return-object p0
.end method

.method public final message(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/CharSequence;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/afollestad/materialdialogs/MaterialDialog;"
        }
    .end annotation

    sget-object v0, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    const-string v1, "message"

    invoke-virtual {v0, v1, p2, p1}, Lcom/afollestad/materialdialogs/utils/MDUtil;->assertOneSet(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/internal/main/DialogLayout;->getContentLayout()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;

    move-result-object v1

    iget-object v5, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->bodyFont:Landroid/graphics/Typeface;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;->setMessage(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;)V

    return-object p0
.end method

.method public final negativeButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/CharSequence;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/afollestad/materialdialogs/MaterialDialog;"
        }
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeListeners:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p3, Lcom/afollestad/materialdialogs/WhichButton;->NEGATIVE:Lcom/afollestad/materialdialogs/WhichButton;

    invoke-static {p0, p3}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->getActionButton(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;)Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;

    move-result-object v1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    invoke-static {v1}, Lcom/afollestad/materialdialogs/utils/ViewsKt;->isVisible(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/high16 v4, 0x1040000

    iget-object v5, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->populateText$default(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;ILjava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method public final neutralButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/CharSequence;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/afollestad/materialdialogs/MaterialDialog;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions."
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->neutralListeners:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p3, Lcom/afollestad/materialdialogs/WhichButton;->NEUTRAL:Lcom/afollestad/materialdialogs/WhichButton;

    invoke-static {p0, p3}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->getActionButton(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;)Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;

    move-result-object v1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    invoke-static {v1}, Lcom/afollestad/materialdialogs/utils/ViewsKt;->isVisible(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    iget-object v5, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    const/4 v6, 0x0

    const/16 v7, 0x28

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->populateText$default(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;ILjava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method public final noAutoDismiss()Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->autoDismissEnabled:Z

    return-object p0
.end method

.method public final onActionButtonClicked$core(Lcom/afollestad/materialdialogs/WhichButton;)V
    .locals 1

    sget-object v0, Lcom/afollestad/materialdialogs/MaterialDialog$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->neutralListeners:Ljava/util/List;

    invoke-static {p1, p0}, Lcom/afollestad/materialdialogs/callbacks/DialogCallbackExtKt;->invokeAll(Ljava/util/List;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->negativeListeners:Ljava/util/List;

    invoke-static {p1, p0}, Lcom/afollestad/materialdialogs/callbacks/DialogCallbackExtKt;->invokeAll(Ljava/util/List;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveListeners:Ljava/util/List;

    invoke-static {p1, p0}, Lcom/afollestad/materialdialogs/callbacks/DialogCallbackExtKt;->invokeAll(Ljava/util/List;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-static {p0}, Lcom/afollestad/materialdialogs/list/DialogListExtKt;->getListAdapter(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    instance-of v0, p1, Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;

    if-nez v0, :cond_3

    const/4 p1, 0x0

    :cond_3
    check-cast p1, Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;->positiveButtonClicked()V

    :cond_4
    :goto_0
    iget-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->autoDismissEnabled:Z

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    :cond_5
    return-void
.end method

.method public final positiveButton(Ljava/lang/Integer;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/CharSequence;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/afollestad/materialdialogs/MaterialDialog;"
        }
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->positiveListeners:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p3, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    invoke-static {p0, p3}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->getActionButton(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;)Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;

    move-result-object v1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    invoke-static {v1}, Lcom/afollestad/materialdialogs/utils/ViewsKt;->isVisible(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-object p0

    :cond_1
    const v4, 0x104000a

    iget-object v5, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v8}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->populateText$default(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;ILjava/lang/Object;)V

    return-object p0
.end method

.method public final setAutoDismissEnabled$core(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->autoDismissEnabled:Z

    return-void
.end method

.method public final setBodyFont$core(Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->bodyFont:Landroid/graphics/Typeface;

    return-void
.end method

.method public final setButtonFont$core(Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->buttonFont:Landroid/graphics/Typeface;

    return-void
.end method

.method public final setCancelOnTouchOutside$core(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelOnTouchOutside:Z

    return-void
.end method

.method public setCancelable(Z)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use fluent cancelable(Boolean) instead."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "cancelable(cancelable)"
            imports = {}
        .end subannotation
    .end annotation

    iput-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable:Z

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method public final setCancelable$core(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelable:Z

    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use fluent cancelOnTouchOutside(Boolean) instead."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "cancelOnTouchOutside(cancelOnTouchOutside)"
            imports = {}
        .end subannotation
    .end annotation

    iput-boolean p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cancelOnTouchOutside:Z

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method

.method public final setCornerRadius$core(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->cornerRadius:Ljava/lang/Float;

    return-void
.end method

.method public final setTitleFont$core(Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->titleFont:Landroid/graphics/Typeface;

    return-void
.end method

.method public final show(Lkotlin/jvm/functions/Function1;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/afollestad/materialdialogs/MaterialDialog;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/afollestad/materialdialogs/MaterialDialog;"
        }
    .end annotation

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    return-object p0
.end method

.method public show()V
    .locals 1

    invoke-direct {p0}, Lcom/afollestad/materialdialogs/MaterialDialog;->setWindowConstraints()V

    invoke-static {p0}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->preShow(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    invoke-interface {v0, p0}, Lcom/afollestad/materialdialogs/DialogBehavior;->onPreShow(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-super {p0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->dialogBehavior:Lcom/afollestad/materialdialogs/DialogBehavior;

    invoke-interface {v0, p0}, Lcom/afollestad/materialdialogs/DialogBehavior;->onPostShow(Lcom/afollestad/materialdialogs/MaterialDialog;)V

    return-void
.end method

.method public final title(Ljava/lang/Integer;Ljava/lang/String;)Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 10

    sget-object v0, Lcom/afollestad/materialdialogs/utils/MDUtil;->INSTANCE:Lcom/afollestad/materialdialogs/utils/MDUtil;

    const-string v1, "title"

    invoke-virtual {v0, v1, p2, p1}, Lcom/afollestad/materialdialogs/utils/MDUtil;->assertOneSet(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->view:Lcom/afollestad/materialdialogs/internal/main/DialogLayout;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/internal/main/DialogLayout;->getTitleLayout()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;->getTitleView$core()Landroid/widget/TextView;

    move-result-object v2

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/afollestad/materialdialogs/MaterialDialog;->titleFont:Landroid/graphics/Typeface;

    sget v0, Lcom/afollestad/materialdialogs/R$attr;->md_color_title:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v9}, Lcom/afollestad/materialdialogs/utils/DialogsKt;->populateText$default(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;ILjava/lang/Object;)V

    return-object p0
.end method
