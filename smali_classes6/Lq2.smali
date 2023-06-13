.class public final enum LLq2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LLq2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LLq2;",
        "",
        "",
        "b",
        "F",
        "()F",
        "precision",
        "<init>",
        "(Ljava/lang/String;IF)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum c:LLq2;

.field public static final enum d:LLq2;

.field public static final enum e:LLq2;

.field public static final enum f:LLq2;

.field public static final enum g:LLq2;

.field public static final synthetic h:[LLq2;


# instance fields
.field public final b:F


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LLq2;

    const/4 v1, 0x0

    const/high16 v2, 0x3f000000    # 0.5f

    const-string v3, "ENVIRONMENTAL_HDR"

    invoke-direct {v0, v3, v1, v2}, LLq2;-><init>(Ljava/lang/String;IF)V

    sput-object v0, LLq2;->c:LLq2;

    new-instance v0, LLq2;

    const-string v5, "ENVIRONMENTAL_HDR_FAKE_REFLECTIONS"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, LLq2;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLq2;->d:LLq2;

    new-instance v0, LLq2;

    const-string v11, "ENVIRONMENTAL_HDR_NO_REFLECTIONS"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v15}, LLq2;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLq2;->e:LLq2;

    new-instance v0, LLq2;

    const-string v2, "AMBIENT_INTENSITY"

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LLq2;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLq2;->f:LLq2;

    new-instance v0, LLq2;

    const-string v8, "DISABLED"

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LLq2;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLq2;->g:LLq2;

    invoke-static {}, LLq2;->a()[LLq2;

    move-result-object v0

    sput-object v0, LLq2;->h:[LLq2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LLq2;->b:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LLq2;-><init>(Ljava/lang/String;IF)V

    return-void
.end method

.method public static final synthetic a()[LLq2;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [LLq2;

    const/4 v1, 0x0

    sget-object v2, LLq2;->c:LLq2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LLq2;->d:LLq2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LLq2;->e:LLq2;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LLq2;->f:LLq2;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LLq2;->g:LLq2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLq2;
    .locals 1

    const-class v0, LLq2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLq2;

    return-object p0
.end method

.method public static values()[LLq2;
    .locals 1

    sget-object v0, LLq2;->h:[LLq2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLq2;

    return-object v0
.end method


# virtual methods
.method public final b()F
    .locals 1

    iget v0, p0, LLq2;->b:F

    return v0
.end method
