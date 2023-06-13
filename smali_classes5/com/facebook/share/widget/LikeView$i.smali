.class public final enum Lcom/facebook/share/widget/LikeView$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/widget/LikeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/share/widget/LikeView$i;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final enum d:Lcom/facebook/share/widget/LikeView$i;

.field public static final enum e:Lcom/facebook/share/widget/LikeView$i;

.field public static final enum f:Lcom/facebook/share/widget/LikeView$i;

.field public static g:Lcom/facebook/share/widget/LikeView$i;

.field public static final synthetic h:[Lcom/facebook/share/widget/LikeView$i;


# instance fields
.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/facebook/share/widget/LikeView$i;

    const-string v1, "standard"

    const-string v2, "STANDARD"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v3}, Lcom/facebook/share/widget/LikeView$i;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/facebook/share/widget/LikeView$i;->d:Lcom/facebook/share/widget/LikeView$i;

    new-instance v1, Lcom/facebook/share/widget/LikeView$i;

    const-string v2, "button"

    const-string v4, "BUTTON"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v5}, Lcom/facebook/share/widget/LikeView$i;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v1, Lcom/facebook/share/widget/LikeView$i;->e:Lcom/facebook/share/widget/LikeView$i;

    new-instance v2, Lcom/facebook/share/widget/LikeView$i;

    const-string v4, "box_count"

    const-string v6, "BOX_COUNT"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4, v7}, Lcom/facebook/share/widget/LikeView$i;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v2, Lcom/facebook/share/widget/LikeView$i;->f:Lcom/facebook/share/widget/LikeView$i;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/facebook/share/widget/LikeView$i;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, Lcom/facebook/share/widget/LikeView$i;->h:[Lcom/facebook/share/widget/LikeView$i;

    sput-object v0, Lcom/facebook/share/widget/LikeView$i;->g:Lcom/facebook/share/widget/LikeView$i;

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

    iput-object p3, p0, Lcom/facebook/share/widget/LikeView$i;->b:Ljava/lang/String;

    iput p4, p0, Lcom/facebook/share/widget/LikeView$i;->c:I

    return-void
.end method

.method public static synthetic a(Lcom/facebook/share/widget/LikeView$i;)I
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView$i;->c()I

    move-result p0

    return p0
.end method

.method public static b(I)Lcom/facebook/share/widget/LikeView$i;
    .locals 5

    invoke-static {}, Lcom/facebook/share/widget/LikeView$i;->values()[Lcom/facebook/share/widget/LikeView$i;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/facebook/share/widget/LikeView$i;->c()I

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/widget/LikeView$i;
    .locals 1

    const-class v0, Lcom/facebook/share/widget/LikeView$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/share/widget/LikeView$i;

    return-object p0
.end method

.method public static values()[Lcom/facebook/share/widget/LikeView$i;
    .locals 1

    sget-object v0, Lcom/facebook/share/widget/LikeView$i;->h:[Lcom/facebook/share/widget/LikeView$i;

    invoke-virtual {v0}, [Lcom/facebook/share/widget/LikeView$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/share/widget/LikeView$i;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Lcom/facebook/share/widget/LikeView$i;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$i;->b:Ljava/lang/String;

    return-object v0
.end method
