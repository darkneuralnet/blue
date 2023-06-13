.class public final enum LTh3;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LTh3;",
        ">;",
        "Lp31;"
    }
.end annotation


# static fields
.field public static final enum c:LTh3;

.field public static final synthetic d:[LTh3;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LTh3;

    const v1, 0x1332b3a

    const-string v2, "OG_ACTION_DIALOG"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LTh3;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTh3;->c:LTh3;

    const/4 v1, 0x1

    new-array v1, v1, [LTh3;

    aput-object v0, v1, v3

    sput-object v1, LTh3;->d:[LTh3;

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

    iput p3, p0, LTh3;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LTh3;
    .locals 1

    const-class v0, LTh3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTh3;

    return-object p0
.end method

.method public static values()[LTh3;
    .locals 1

    sget-object v0, LTh3;->d:[LTh3;

    invoke-virtual {v0}, [LTh3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTh3;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LTh3;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"

    return-object v0
.end method
