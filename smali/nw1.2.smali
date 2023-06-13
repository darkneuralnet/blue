.class public final Lnw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0001\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "LBc6;",
        "a",
        "LBc6;",
        "b",
        "()LBc6;",
        "GlobalTypefaceRequestCache",
        "Lmp;",
        "Lmp;",
        "()Lmp;",
        "GlobalAsyncTypefaceCache",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LBc6;

.field public static final b:Lmp;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc6;

    invoke-direct {v0}, LBc6;-><init>()V

    sput-object v0, Lnw1;->a:LBc6;

    new-instance v0, Lmp;

    invoke-direct {v0}, Lmp;-><init>()V

    sput-object v0, Lnw1;->b:Lmp;

    return-void
.end method

.method public static final a()Lmp;
    .locals 1

    sget-object v0, Lnw1;->b:Lmp;

    return-object v0
.end method

.method public static final b()LBc6;
    .locals 1

    sget-object v0, Lnw1;->a:LBc6;

    return-object v0
.end method
