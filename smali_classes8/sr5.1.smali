.class public final Lsr5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0002\u0012\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\t\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0002\u0012\u0004\u0008\r\u0010\u0006\"\u001a\u0010\u0010\u001a\u00020\u00008\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u0012\u0004\u0008\u000f\u0010\u0006\"\u001a\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0012\u0012\u0004\u0008\u0013\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "a",
        "Ljava/lang/Object;",
        "e",
        "()Ljava/lang/Object;",
        "getNOT_SELECTED$annotations",
        "()V",
        "NOT_SELECTED",
        "b",
        "d",
        "getALREADY_SELECTED$annotations",
        "ALREADY_SELECTED",
        "c",
        "getUNDECIDED$annotations",
        "UNDECIDED",
        "getRESUMED$annotations",
        "RESUMED",
        "LJs5;",
        "LJs5;",
        "getSelectOpSequenceNumber$annotations",
        "selectOpSequenceNumber",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/lang/Object;

.field public static final e:LJs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuX5;

    const-string v1, "NOT_SELECTED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lsr5;->a:Ljava/lang/Object;

    new-instance v0, LuX5;

    const-string v1, "ALREADY_SELECTED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lsr5;->b:Ljava/lang/Object;

    new-instance v0, LuX5;

    const-string v1, "UNDECIDED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lsr5;->c:Ljava/lang/Object;

    new-instance v0, LuX5;

    const-string v1, "RESUMED"

    invoke-direct {v0, v1}, LuX5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lsr5;->d:Ljava/lang/Object;

    new-instance v0, LJs5;

    invoke-direct {v0}, LJs5;-><init>()V

    sput-object v0, Lsr5;->e:LJs5;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lsr5;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic b()LJs5;
    .locals 1

    sget-object v0, Lsr5;->e:LJs5;

    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lsr5;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public static final d()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lsr5;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public static final e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lsr5;->a:Ljava/lang/Object;

    return-object v0
.end method
