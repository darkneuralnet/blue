.class public final LhX3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0004\u001a\u0004\u0008\u000c\u0010\u0006\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0004\u001a\u0004\u0008\u000f\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "pointerIconType",
        "LdX3;",
        "a",
        "LdX3;",
        "getPointerIconDefault",
        "()LdX3;",
        "pointerIconDefault",
        "b",
        "getPointerIconCrosshair",
        "pointerIconCrosshair",
        "c",
        "getPointerIconText",
        "pointerIconText",
        "d",
        "getPointerIconHand",
        "pointerIconHand",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LdX3;

.field public static final b:LdX3;

.field public static final c:LdX3;

.field public static final d:LdX3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwd;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Lwd;-><init>(I)V

    sput-object v0, LhX3;->a:LdX3;

    new-instance v0, Lwd;

    const/16 v1, 0x3ef

    invoke-direct {v0, v1}, Lwd;-><init>(I)V

    sput-object v0, LhX3;->b:LdX3;

    new-instance v0, Lwd;

    const/16 v1, 0x3f0

    invoke-direct {v0, v1}, Lwd;-><init>(I)V

    sput-object v0, LhX3;->c:LdX3;

    new-instance v0, Lwd;

    const/16 v1, 0x3ea

    invoke-direct {v0, v1}, Lwd;-><init>(I)V

    sput-object v0, LhX3;->d:LdX3;

    return-void
.end method

.method public static final a(I)LdX3;
    .locals 1

    new-instance v0, Lwd;

    invoke-direct {v0, p0}, Lwd;-><init>(I)V

    return-object v0
.end method
