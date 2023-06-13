.class public final Lxd$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
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
        "SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,824:1\n62#2,5:825\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n290#1:825,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Landroidx/compose/ui/window/PopupLayout;

.field public final synthetic h:LzY3;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/PopupLayout;LzY3;)V
    .locals 0

    iput-object p1, p0, Lxd$d;->g:Landroidx/compose/ui/window/PopupLayout;

    iput-object p2, p0, Lxd$d;->h:LzY3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Lxd$d;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxd$d;->g:Landroidx/compose/ui/window/PopupLayout;

    iget-object v0, p0, Lxd$d;->h:LzY3;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/window/PopupLayout;->setPositionProvider(LzY3;)V

    iget-object p1, p0, Lxd$d;->g:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {p1}, Landroidx/compose/ui/window/PopupLayout;->u()V

    new-instance p1, Lxd$d$a;

    invoke-direct {p1}, Lxd$d$a;-><init>()V

    return-object p1
.end method
