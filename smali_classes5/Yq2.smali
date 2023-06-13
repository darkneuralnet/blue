.class public final enum LYq2;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYq2;",
        ">;",
        "Lp31;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final enum c:LYq2;

.field public static final synthetic d:[LYq2;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LYq2;

    const v1, 0x133529d

    const-string v2, "LIKE_DIALOG"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LYq2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LYq2;->c:LYq2;

    const/4 v1, 0x1

    new-array v1, v1, [LYq2;

    aput-object v0, v1, v3

    sput-object v1, LYq2;->d:[LYq2;

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

    iput p3, p0, LYq2;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LYq2;
    .locals 1

    const-class v0, LYq2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYq2;

    return-object p0
.end method

.method public static values()[LYq2;
    .locals 1

    sget-object v0, LYq2;->d:[LYq2;

    invoke-virtual {v0}, [LYq2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYq2;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LYq2;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.LIKE_DIALOG"

    return-object v0
.end method
