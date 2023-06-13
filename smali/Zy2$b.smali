.class public final enum LZy2$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZy2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LZy2$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LZy2$b;",
        "",
        "",
        "toString",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "components-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final enum b:LZy2$b;

.field public static final enum c:LZy2$b;

.field public static final enum d:LZy2$b;

.field public static final synthetic e:[LZy2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LZy2$b;

    const-string v1, "SMALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZy2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZy2$b;->b:LZy2$b;

    new-instance v0, LZy2$b;

    const-string v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LZy2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZy2$b;->c:LZy2$b;

    new-instance v0, LZy2$b;

    const-string v1, "LARGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LZy2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZy2$b;->d:LZy2$b;

    invoke-static {}, LZy2$b;->a()[LZy2$b;

    move-result-object v0

    sput-object v0, LZy2$b;->e:[LZy2$b;

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

.method public static final synthetic a()[LZy2$b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LZy2$b;

    const/4 v1, 0x0

    sget-object v2, LZy2$b;->b:LZy2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LZy2$b;->c:LZy2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LZy2$b;->d:LZy2$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LZy2$b;
    .locals 1

    const-class v0, LZy2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZy2$b;

    return-object p0
.end method

.method public static values()[LZy2$b;
    .locals 1

    sget-object v0, LZy2$b;->e:[LZy2$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZy2$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "ROOT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
