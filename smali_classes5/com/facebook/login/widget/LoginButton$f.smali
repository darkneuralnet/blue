.class public final enum Lcom/facebook/login/widget/LoginButton$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/widget/LoginButton$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lcom/facebook/login/widget/LoginButton$f;

.field public static final enum e:Lcom/facebook/login/widget/LoginButton$f;

.field public static final enum f:Lcom/facebook/login/widget/LoginButton$f;

.field public static g:Lcom/facebook/login/widget/LoginButton$f;

.field public static final synthetic h:[Lcom/facebook/login/widget/LoginButton$f;


# instance fields
.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/facebook/login/widget/LoginButton$f;

    const-string v1, "automatic"

    const-string v2, "AUTOMATIC"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v3}, Lcom/facebook/login/widget/LoginButton$f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/facebook/login/widget/LoginButton$f;->d:Lcom/facebook/login/widget/LoginButton$f;

    new-instance v1, Lcom/facebook/login/widget/LoginButton$f;

    const-string v2, "display_always"

    const-string v4, "DISPLAY_ALWAYS"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v5}, Lcom/facebook/login/widget/LoginButton$f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v1, Lcom/facebook/login/widget/LoginButton$f;->e:Lcom/facebook/login/widget/LoginButton$f;

    new-instance v2, Lcom/facebook/login/widget/LoginButton$f;

    const-string v4, "never_display"

    const-string v6, "NEVER_DISPLAY"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4, v7}, Lcom/facebook/login/widget/LoginButton$f;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v2, Lcom/facebook/login/widget/LoginButton$f;->f:Lcom/facebook/login/widget/LoginButton$f;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/facebook/login/widget/LoginButton$f;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, Lcom/facebook/login/widget/LoginButton$f;->h:[Lcom/facebook/login/widget/LoginButton$f;

    sput-object v0, Lcom/facebook/login/widget/LoginButton$f;->g:Lcom/facebook/login/widget/LoginButton$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/facebook/login/widget/LoginButton$f;->b:Ljava/lang/String;

    iput p4, p0, Lcom/facebook/login/widget/LoginButton$f;->c:I

    return-void
.end method

.method public static a(I)Lcom/facebook/login/widget/LoginButton$f;
    .locals 5

    invoke-static {}, Lcom/facebook/login/widget/LoginButton$f;->values()[Lcom/facebook/login/widget/LoginButton$f;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/facebook/login/widget/LoginButton$f;->b()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/widget/LoginButton$f;
    .locals 1

    const-class v0, Lcom/facebook/login/widget/LoginButton$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/widget/LoginButton$f;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/widget/LoginButton$f;
    .locals 1

    sget-object v0, Lcom/facebook/login/widget/LoginButton$f;->h:[Lcom/facebook/login/widget/LoginButton$f;

    invoke-virtual {v0}, [Lcom/facebook/login/widget/LoginButton$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/widget/LoginButton$f;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/facebook/login/widget/LoginButton$f;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton$f;->b:Ljava/lang/String;

    return-object v0
.end method
