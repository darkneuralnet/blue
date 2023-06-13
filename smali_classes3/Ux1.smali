.class public abstract enum LUx1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUx1$a;,
        LUx1$b;,
        LUx1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUx1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&j\u0002\u0008\u0007j\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "LUx1;",
        "",
        "Ljava/math/BigDecimal;",
        "price",
        "Ljava/util/Currency;",
        "currency",
        "",
        "b",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
        "d",
        "localization_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LUx1;

.field public static final enum c:LUx1;

.field public static final enum d:LUx1;

.field public static final synthetic e:[LUx1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LUx1$c;

    const-string v1, "SHOW_NEVER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LUx1$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUx1;->b:LUx1;

    new-instance v0, LUx1$a;

    const-string v1, "SHOW_ALWAYS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LUx1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUx1;->c:LUx1;

    new-instance v0, LUx1$b;

    const-string v1, "SHOW_IF_NON_ZERO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LUx1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LUx1;->d:LUx1;

    invoke-static {}, LUx1;->a()[LUx1;

    move-result-object v0

    sput-object v0, LUx1;->e:[LUx1;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LUx1;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[LUx1;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LUx1;

    const/4 v1, 0x0

    sget-object v2, LUx1;->b:LUx1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LUx1;->c:LUx1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LUx1;->d:LUx1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUx1;
    .locals 1

    const-class v0, LUx1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUx1;

    return-object p0
.end method

.method public static values()[LUx1;
    .locals 1

    sget-object v0, LUx1;->e:[LUx1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUx1;

    return-object v0
.end method


# virtual methods
.method public abstract b(Ljava/math/BigDecimal;Ljava/util/Currency;)Z
.end method
