.class public final enum LFm;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LFm;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LFm;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "c",
        "d",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:LFm;

.field public static final enum d:LFm;

.field public static final synthetic e:[LFm;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LFm;

    const/4 v1, 0x0

    const-string v2, "partner-reports-motmot-app"

    const-string v3, "PARTNER_REPORTS"

    invoke-direct {v0, v3, v1, v2}, LFm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LFm;->c:LFm;

    new-instance v0, LFm;

    const/4 v1, 0x1

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, LFm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LFm;->d:LFm;

    invoke-static {}, LFm;->a()[LFm;

    move-result-object v0

    sput-object v0, LFm;->e:[LFm;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LFm;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[LFm;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LFm;

    const/4 v1, 0x0

    sget-object v2, LFm;->c:LFm;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LFm;->d:LFm;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LFm;
    .locals 1

    const-class v0, LFm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LFm;

    return-object p0
.end method

.method public static values()[LFm;
    .locals 1

    sget-object v0, LFm;->e:[LFm;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFm;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFm;->b:Ljava/lang/String;

    return-object v0
.end method
