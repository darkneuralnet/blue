.class public final Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;
.super LrV2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/focus/FocusTargetModifierNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FocusTargetModifierElement"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LrV2<",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0096\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;",
        "LrV2;",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "h",
        "node",
        "j",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;->b:Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LrV2;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LgV2$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;->h()Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g(LgV2$c;)LgV2$c;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;->j(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;-><init>()V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x67a7b089

    return v0
.end method

.method public j(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
