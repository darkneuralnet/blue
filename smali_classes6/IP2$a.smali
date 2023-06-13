.class public final enum LIP2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIP2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LIP2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:LIP2$a;

.field public static final enum f:LIP2$a;

.field public static final enum g:LIP2$a;

.field public static final synthetic h:[LIP2$a;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 19

    new-instance v6, LIP2$a;

    const-string v1, "MICRO"

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/16 v4, 0x60

    const/16 v5, 0x60

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LIP2$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, LIP2$a;->e:LIP2$a;

    new-instance v0, LIP2$a;

    const-string v8, "MINI"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/16 v11, 0x200

    const/16 v12, 0x180

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LIP2$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, LIP2$a;->f:LIP2$a;

    new-instance v1, LIP2$a;

    const-string v14, "FULL"

    const/4 v15, 0x2

    const/16 v16, 0x2

    const/16 v17, -0x1

    const/16 v18, -0x1

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, LIP2$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v1, LIP2$a;->g:LIP2$a;

    const/4 v2, 0x3

    new-array v2, v2, [LIP2$a;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, LIP2$a;->h:[LIP2$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LIP2$a;->b:I

    iput p4, p0, LIP2$a;->c:I

    iput p5, p0, LIP2$a;->d:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LIP2$a;
    .locals 1

    const-class v0, LIP2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIP2$a;

    return-object p0
.end method

.method public static values()[LIP2$a;
    .locals 1

    sget-object v0, LIP2$a;->h:[LIP2$a;

    invoke-virtual {v0}, [LIP2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIP2$a;

    return-object v0
.end method
