.class public final Lza1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "LOY1;",
        "a",
        "LOY1;",
        "Falsey",
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
.field public static final a:LOY1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOY1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOY1;-><init>(Z)V

    sput-object v0, Lza1;->a:LOY1;

    return-void
.end method

.method public static final synthetic a()LOY1;
    .locals 1

    sget-object v0, Lza1;->a:LOY1;

    return-object v0
.end method
