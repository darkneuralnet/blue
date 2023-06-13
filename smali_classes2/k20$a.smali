.class public final enum Lk20$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk20;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk20$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lk20$a;",
        "",
        "",
        "b",
        "I",
        "()I",
        "logLevel",
        "<init>",
        "(Ljava/lang/String;II)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lk20$a;

.field public static final enum d:Lk20$a;

.field public static final enum e:Lk20$a;

.field public static final enum f:Lk20$a;

.field public static final enum g:Lk20$a;

.field public static final synthetic h:[Lk20$a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lk20$a;

    const-string v1, "D"

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lk20$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk20$a;->c:Lk20$a;

    new-instance v0, Lk20$a;

    const-string v1, "I"

    const/4 v2, 0x1

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v4}, Lk20$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk20$a;->d:Lk20$a;

    new-instance v0, Lk20$a;

    const/4 v1, 0x6

    const-string v2, "E"

    const/4 v5, 0x2

    invoke-direct {v0, v2, v5, v1}, Lk20$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk20$a;->e:Lk20$a;

    new-instance v0, Lk20$a;

    const-string v1, "V"

    invoke-direct {v0, v1, v3, v5}, Lk20$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk20$a;->f:Lk20$a;

    new-instance v0, Lk20$a;

    const-string v1, "W"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v4, v2}, Lk20$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk20$a;->g:Lk20$a;

    invoke-static {}, Lk20$a;->a()[Lk20$a;

    move-result-object v0

    sput-object v0, Lk20$a;->h:[Lk20$a;

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

    iput p3, p0, Lk20$a;->b:I

    return-void
.end method

.method public static final synthetic a()[Lk20$a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lk20$a;

    sget-object v1, Lk20$a;->c:Lk20$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lk20$a;->d:Lk20$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lk20$a;->e:Lk20$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lk20$a;->f:Lk20$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lk20$a;->g:Lk20$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk20$a;
    .locals 1

    const-class v0, Lk20$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk20$a;

    return-object p0
.end method

.method public static values()[Lk20$a;
    .locals 1

    sget-object v0, Lk20$a;->h:[Lk20$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk20$a;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lk20$a;->b:I

    return v0
.end method
