.class public final enum LjH6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LjH6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000c\n\u0002\u0008\u000c\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0004j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LjH6;",
        "",
        "",
        "b",
        "C",
        "begin",
        "c",
        "end",
        "<init>",
        "(Ljava/lang/String;ICC)V",
        "d",
        "e",
        "f",
        "g",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum d:LjH6;

.field public static final enum e:LjH6;

.field public static final enum f:LjH6;

.field public static final enum g:LjH6;

.field public static final synthetic h:[LjH6;


# instance fields
.field public final b:C
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final c:C
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LjH6;

    const-string v1, "OBJ"

    const/4 v2, 0x0

    const/16 v3, 0x7b

    const/16 v4, 0x7d

    invoke-direct {v0, v1, v2, v3, v4}, LjH6;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, LjH6;->d:LjH6;

    new-instance v0, LjH6;

    const-string v1, "LIST"

    const/4 v2, 0x1

    const/16 v5, 0x5b

    const/16 v6, 0x5d

    invoke-direct {v0, v1, v2, v5, v6}, LjH6;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, LjH6;->e:LjH6;

    new-instance v0, LjH6;

    const-string v1, "MAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, LjH6;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, LjH6;->f:LjH6;

    new-instance v0, LjH6;

    const-string v1, "POLY_OBJ"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v5, v6}, LjH6;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, LjH6;->g:LjH6;

    invoke-static {}, LjH6;->a()[LjH6;

    move-result-object v0

    sput-object v0, LjH6;->h:[LjH6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ICC)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(CC)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, LjH6;->b:C

    iput-char p4, p0, LjH6;->c:C

    return-void
.end method

.method public static final synthetic a()[LjH6;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LjH6;

    const/4 v1, 0x0

    sget-object v2, LjH6;->d:LjH6;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LjH6;->e:LjH6;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LjH6;->f:LjH6;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LjH6;->g:LjH6;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LjH6;
    .locals 1

    const-class v0, LjH6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LjH6;

    return-object p0
.end method

.method public static values()[LjH6;
    .locals 1

    sget-object v0, LjH6;->h:[LjH6;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LjH6;

    return-object v0
.end method
