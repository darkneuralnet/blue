.class public final enum Lzg1$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzg1$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lzg1$b;

.field public static final enum c:Lzg1$b;

.field public static final synthetic d:[Lzg1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lzg1$b;

    const-string v1, "MANUAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzg1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzg1$b;->b:Lzg1$b;

    new-instance v1, Lzg1$b;

    const-string v3, "INFERENCE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lzg1$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lzg1$b;->c:Lzg1$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lzg1$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lzg1$b;->d:[Lzg1$b;

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

.method public static valueOf(Ljava/lang/String;)Lzg1$b;
    .locals 1

    const-class v0, Lzg1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzg1$b;

    return-object p0
.end method

.method public static values()[Lzg1$b;
    .locals 1

    sget-object v0, Lzg1$b;->d:[Lzg1$b;

    invoke-virtual {v0}, [Lzg1$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzg1$b;

    return-object v0
.end method
