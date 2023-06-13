.class public abstract enum LJZ3$h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LIZ3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJZ3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LJZ3$h;",
        ">;",
        "LIZ3<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LJZ3$h;

.field public static final enum c:LJZ3$h;

.field public static final enum d:LJZ3$h;

.field public static final enum e:LJZ3$h;

.field public static final synthetic f:[LJZ3$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LJZ3$h$a;

    const-string v1, "ALWAYS_TRUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJZ3$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJZ3$h;->b:LJZ3$h;

    new-instance v0, LJZ3$h$b;

    const-string v1, "ALWAYS_FALSE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJZ3$h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJZ3$h;->c:LJZ3$h;

    new-instance v0, LJZ3$h$c;

    const-string v1, "IS_NULL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LJZ3$h$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJZ3$h;->d:LJZ3$h;

    new-instance v0, LJZ3$h$d;

    const-string v1, "NOT_NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LJZ3$h$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJZ3$h;->e:LJZ3$h;

    invoke-static {}, LJZ3$h;->a()[LJZ3$h;

    move-result-object v0

    sput-object v0, LJZ3$h;->f:[LJZ3$h;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILJZ3$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LJZ3$h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[LJZ3$h;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LJZ3$h;

    const/4 v1, 0x0

    sget-object v2, LJZ3$h;->b:LJZ3$h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LJZ3$h;->c:LJZ3$h;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LJZ3$h;->d:LJZ3$h;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LJZ3$h;->e:LJZ3$h;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LJZ3$h;
    .locals 1

    const-class v0, LJZ3$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJZ3$h;

    return-object p0
.end method

.method public static values()[LJZ3$h;
    .locals 1

    sget-object v0, LJZ3$h;->f:[LJZ3$h;

    invoke-virtual {v0}, [LJZ3$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJZ3$h;

    return-object v0
.end method


# virtual methods
.method public b()LIZ3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method
