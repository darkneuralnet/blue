.class public final enum LpQ2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpQ2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LpQ2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0007\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005j\u0002\u0008\tj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "LpQ2;",
        "",
        "",
        "b",
        "I",
        "()I",
        "id",
        "c",
        "order",
        "d",
        "titleResource",
        "<init>",
        "(Ljava/lang/String;II)V",
        "e",
        "f",
        "g",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum d:LpQ2;

.field public static final enum e:LpQ2;

.field public static final enum f:LpQ2;

.field public static final enum g:LpQ2;

.field public static final synthetic h:[LpQ2;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LpQ2;

    const-string v1, "Copy"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LpQ2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LpQ2;->d:LpQ2;

    new-instance v0, LpQ2;

    const-string v1, "Paste"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LpQ2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LpQ2;->e:LpQ2;

    new-instance v0, LpQ2;

    const-string v1, "Cut"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LpQ2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LpQ2;->f:LpQ2;

    new-instance v0, LpQ2;

    const-string v1, "SelectAll"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LpQ2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LpQ2;->g:LpQ2;

    invoke-static {}, LpQ2;->a()[LpQ2;

    move-result-object v0

    sput-object v0, LpQ2;->h:[LpQ2;

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

    iput p3, p0, LpQ2;->b:I

    iput p3, p0, LpQ2;->c:I

    return-void
.end method

.method public static final synthetic a()[LpQ2;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LpQ2;

    const/4 v1, 0x0

    sget-object v2, LpQ2;->d:LpQ2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LpQ2;->e:LpQ2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LpQ2;->f:LpQ2;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LpQ2;->g:LpQ2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LpQ2;
    .locals 1

    const-class v0, LpQ2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LpQ2;

    return-object p0
.end method

.method public static values()[LpQ2;
    .locals 1

    sget-object v0, LpQ2;->h:[LpQ2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LpQ2;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LpQ2;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LpQ2;->c:I

    return v0
.end method

.method public final d()I
    .locals 2

    sget-object v0, LpQ2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const v0, 0x104000d

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const v0, 0x1040003

    goto :goto_0

    :cond_2
    const v0, 0x104000b

    goto :goto_0

    :cond_3
    const v0, 0x1040001

    :goto_0
    return v0
.end method
