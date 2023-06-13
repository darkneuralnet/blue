.class public final enum LGf;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LGf;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LGf;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LGf;

.field public static final enum c:LGf;

.field public static final enum d:LGf;

.field public static final enum e:LGf;

.field public static final enum f:LGf;

.field public static final synthetic g:[LGf;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LGf;

    const-string v1, "Paragraph"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LGf;-><init>(Ljava/lang/String;I)V

    sput-object v0, LGf;->b:LGf;

    new-instance v0, LGf;

    const-string v1, "Span"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LGf;-><init>(Ljava/lang/String;I)V

    sput-object v0, LGf;->c:LGf;

    new-instance v0, LGf;

    const-string v1, "VerbatimTts"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LGf;-><init>(Ljava/lang/String;I)V

    sput-object v0, LGf;->d:LGf;

    new-instance v0, LGf;

    const-string v1, "Url"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LGf;-><init>(Ljava/lang/String;I)V

    sput-object v0, LGf;->e:LGf;

    new-instance v0, LGf;

    const-string v1, "String"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LGf;-><init>(Ljava/lang/String;I)V

    sput-object v0, LGf;->f:LGf;

    invoke-static {}, LGf;->a()[LGf;

    move-result-object v0

    sput-object v0, LGf;->g:[LGf;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[LGf;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LGf;

    const/4 v1, 0x0

    sget-object v2, LGf;->b:LGf;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LGf;->c:LGf;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LGf;->d:LGf;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LGf;->e:LGf;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LGf;->f:LGf;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LGf;
    .locals 1

    const-class v0, LGf;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LGf;

    return-object p0
.end method

.method public static values()[LGf;
    .locals 1

    sget-object v0, LGf;->g:[LGf;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LGf;

    return-object v0
.end method
