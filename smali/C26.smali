.class public final LC26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u0017\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u0012\u0004\u0008\u000c\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "LU94;",
        "LB26;",
        "a",
        "LU94;",
        "b",
        "()LU94;",
        "LocalTextSelectionColors",
        "Lpm0;",
        "J",
        "DefaultSelectionColor",
        "c",
        "LB26;",
        "getDefaultTextSelectionColors$annotations",
        "()V",
        "DefaultTextSelectionColors",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LB26;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:J

.field public static final c:LB26;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    sget-object v0, LC26$a;->g:LC26$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, LC26;->a:LU94;

    const-wide v0, 0xff4286f4L

    invoke-static {v0, v1}, Lvm0;->c(J)J

    move-result-wide v0

    sput-wide v0, LC26;->b:J

    new-instance v10, LB26;

    const v4, 0x3ecccccd    # 0.4f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    move-wide v2, v0

    invoke-static/range {v2 .. v9}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v10

    move-wide v3, v0

    invoke-direct/range {v2 .. v7}, LB26;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, LC26;->c:LB26;

    return-void
.end method

.method public static final synthetic a()LB26;
    .locals 1

    sget-object v0, LC26;->c:LB26;

    return-object v0
.end method

.method public static final b()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "LB26;",
            ">;"
        }
    .end annotation

    sget-object v0, LC26;->a:LU94;

    return-object v0
.end method
