.class public final enum Lcom/facebook/login/widget/a$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/widget/a$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/login/widget/a$e;

.field public static final enum c:Lcom/facebook/login/widget/a$e;

.field public static final synthetic d:[Lcom/facebook/login/widget/a$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/facebook/login/widget/a$e;

    const-string v1, "BLUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/login/widget/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    new-instance v1, Lcom/facebook/login/widget/a$e;

    const-string v3, "BLACK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/facebook/login/widget/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/login/widget/a$e;->c:Lcom/facebook/login/widget/a$e;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/facebook/login/widget/a$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/facebook/login/widget/a$e;->d:[Lcom/facebook/login/widget/a$e;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/widget/a$e;
    .locals 1

    const-class v0, Lcom/facebook/login/widget/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/widget/a$e;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/widget/a$e;
    .locals 1

    sget-object v0, Lcom/facebook/login/widget/a$e;->d:[Lcom/facebook/login/widget/a$e;

    invoke-virtual {v0}, [Lcom/facebook/login/widget/a$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/widget/a$e;

    return-object v0
.end method
