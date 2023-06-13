.class public final LPd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhW3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPd$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LhW3<",
        "LPd$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "LPd;",
        "LhW3;",
        "LPd$a;",
        "LfW3;",
        "platformTextInput",
        "Landroid/view/View;",
        "view",
        "b",
        "<init>",
        "()V",
        "a",
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
.field public static final a:LPd;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LPd;

    invoke-direct {v0}, LPd;-><init>()V

    sput-object v0, LPd;->a:LPd;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LfW3;Landroid/view/View;)LgW3;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPd;->b(LfW3;Landroid/view/View;)LPd$a;

    move-result-object p1

    return-object p1
.end method

.method public b(LfW3;Landroid/view/View;)LPd$a;
    .locals 1

    const-string v0, "platformTextInput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW16;

    invoke-direct {v0, p2, p1}, LW16;-><init>(Landroid/view/View;LfW3;)V

    invoke-static {}, Lxc;->e()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LU16;

    new-instance p2, LPd$a;

    invoke-direct {p2, p1, v0}, LPd$a;-><init>(LU16;LW16;)V

    return-object p2
.end method
