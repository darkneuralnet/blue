.class public final enum LRy5;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LRy5;",
        ">;",
        "Lp31;"
    }
.end annotation


# static fields
.field public static final enum c:LRy5;

.field public static final synthetic d:[LRy5;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LRy5;

    const v1, 0x133c6b1

    const-string v2, "SHARE_STORY_ASSET"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LRy5;-><init>(Ljava/lang/String;II)V

    sput-object v0, LRy5;->c:LRy5;

    const/4 v1, 0x1

    new-array v1, v1, [LRy5;

    aput-object v0, v1, v3

    sput-object v1, LRy5;->d:[LRy5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LRy5;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LRy5;
    .locals 1

    const-class v0, LRy5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRy5;

    return-object p0
.end method

.method public static values()[LRy5;
    .locals 1

    sget-object v0, LRy5;->d:[LRy5;

    invoke-virtual {v0}, [LRy5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRy5;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LRy5;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.SHARE_STORY"

    return-object v0
.end method
